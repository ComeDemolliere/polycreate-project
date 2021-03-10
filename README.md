# Polycreate Project

## Lancement de GMOC
Pour tout notre projet, nous avons utilisé JAVA-8 accompagné de la version GEMOC correspondante.
Avant de lancer l'éditeur, il est important de réaliser la commande suivante dans un terminal : 
```
export LD_LIBRARY_PATH=YOUR_PATH/webots/lib/controller
```
**YOUR_PATH** correspond au chemin vers l'installation de Webots. <br>
Cette commande peut être suivie du lancement de GEMOC.

## Lancement de notre projet
Il est nécessaire d'importer tous les dossiers de notre projet dans GEMOC. Cependant il est également nécessaire d'importer également le projet [PolytechWebotsController](https://github.com/jdeantoni/polytechWebotsController).
Dans le dossier **fr.unice.polytech.si5.webots.polycreate.rewritingrules**, il est nécessaire d'ajouter une dépendance avec notre syntaxe abstraite mais également avec le projet PolytechWebotsController. <br>
Il est important également d'ajouter une variable d'environnement dans la configuration du run du Modeling workbench. Il est nécessaire d'ajouter la variable LD_LIBRARY_PATH avec pour valeur : 
```
YOUR_PATH/webots/lib/controller/:PATH_TO_WEBOTSCONTROLLER/fr.univcotedazur.kairos.webots.polycreate.controler/webotsLibs/
```
**YOUR_PATH** correspond au chemin vers l'installation de Webots. <br>
**PATH_TO_WEBOTSCONTROLLER** correspond au chemin vers le dossier où est positionné le projet Polytech Webots Controller.

## Explication de nos choix
Pour réaliser ce projet nous nous somme basés sur le fonctionnement d'une machine à état, ceci permet aux utilisateurs de notre language de définir plusieurs états dans lesquels ils pourront réaliser diverses actions comme faire avancer le robot ou le faire tourner. <br>
Nous avons aussi pensé au concept de transitions pour passer d'un état à un autre si certaines conditions sont respectées. De plus, afin d'avoir des transitions qui pourraient être appelées depuis n'importe quel état nous avons mis en place le concept de transtitions globales. Pour en savoir plus sur ces différents concepts et la représentation UML de notre language, rendez-vous dans le dossier [abstractsyntax](fr.unice.polytech.si5.webots.polycreate.abstractsyntax/README.md).

Suite à la définition de notre syntaxe abstraite nous avons aussi défini notre syntaxe concrète. Nous avons souhaité créer une syntaxe littéraire pas trop verbeuse afin qu'elle soit plutôt simple d'accès et rapide à écrire. Vous pouvez retrouvez toutes les spécifications dans le dossier [concretesyntax](fr.unice.polytech.si5.webots.polycreate.concretesyntax/README.md).

Pour l'implémentation de la logique métier derrière notre language nous avons utilisé Kermeta3 permettant, grâce une sémantique opérationnelle, de définir des règles de réécriture sur les objets et méthodes de notre language en Java.
Globalement notre programme est basé sur une boucle infinie sur les états du système. On reste dans un même état tant qu'une transition vers un autre état n'a pas été appelée. Afin d'avoir un système de transition plus dynamique et cohérent nous avons mis en place un système de step qui permet de ne pas être bloqué temporellement dans une action mais l'action sera découpée en petits steps et à chaque step on va pouvoir appliquer des transitions.
Vous retrouverez plus d'informations à ce sujet dans le dossier [rewritingrules](fr.unice.polytech.si5.webots.polycreate.rewritingrules/README.md).

Nous avons également mis en place Sirius ce qui permet d'aider l'utilisateur lors du développement de son programme. Vous pouvez retrouver plus d'informations dans le dossier [design](fr.unice.polytech.si5.webots.polycreate.design/README.md).
