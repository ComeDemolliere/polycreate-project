## Polycreate - Syntaxe concrète


Dans ce module on retrouve la définition de notre syntaxe concrète et plus particulièrement la grammaire de notre language. Cette grammaire est basée sur notre syntaxe abstraite que vous pouvez retrouver dans le module __abstractsyntax__.

Afin d'avoir une grammaire compréhensible par une majorité de personnes avec un minimum de notions en informatique nous avons voulu faire une syntaxe assez littéraire avec quand même une notion de liste sous forme de tableau [] afin d'éviter de la rendre trop verbeuse.

Voici un exemple d'utilisation de notre syntaxe concrète : 

```java
// Definition du programme
RobotProgram myProgram

// Etat initial représenté par une flèche : permet d'avancer
-> State goStraight :
actions = [move FORWARD during 1.0]
transitions = [
	detect object BACK with angle < 91.0 => littleRotateRight,
	detect object BACK with angle > 89.0 => littleRotateLeft]

// Etat goBack : permet de reculer
State goBack :
actions = [move BACKWARD during 1.0]
transitions = [
	detect object BACK with distance < 101.0 => grip,
	detect object BACK with angle < 100.0 => littleRotateRight,
	detect object BACK with angle > 80.0 => littleRotateLeft]

// Etat grip : recule un peu et ferme la pince
State grip :
actions = [
	move BACKWARD during 0.3,
	Closed gripper
]
transitions = [moveOut]

// Etat rotate : recule et fait une rotation de 90 degrés
State rotate :
actions = [
	move BACKWARD during 2.0,
	turn 90.0
]
transitions = [goStraight]

// Etat moveOut : avance, réouvre la pince et repart ailleurs
State moveOut :
actions = [
	move FORWARD during 1.0,
	Open gripper,
	move FORWARD during 1.0,
	turn 90.0
]
transitions = [goStraight]

// Etat littleRotateRight : legère correction en tournant de 3 degrés
State littleRotateRight :
actions = [turn 3.0]
transitions = [goBack]

// Etat littleRotateLeft : legère correction en tournant de -3 degrés
State littleRotateLeft :
actions = [turn -3.0]
transitions = [goBack]

// Transitions globales : transition appliquée depuis n'importe quel état
detect COLLISION_RIGHT => rotate
detect COLLISION_LEFT => rotate
```

Ce petit programme écrit avec notre syntaxe permet au robot aspirateur d'avancer et d'aspirer tout sur son passage, en cas de collision il va reculer pour se ré-axer ailleurs. Enfin s'il détecte un objet derrière lui, il va s'aligner avec l'objet puis reculer jusqu'à essayer de l'attraper avec sa pince. Une fois la pince fermée il va avancer un peu pour déplacer l'objet, réouvrir sa pince, se ré-axer ailleurs puis reprendre sa logique initiale de déplacement.