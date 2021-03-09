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
Temps mis en place (durée de l'action puis transitions si conditions ou non) + global transitions