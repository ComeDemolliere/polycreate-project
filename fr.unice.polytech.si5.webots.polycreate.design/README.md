## Polycreate - Design 

### Affichage global
Nous avons mis en place un projet Design pour notre système afin de pouvoir avoir une visualisation des différents concepts via Sirius du côté du Modeling Workbench.

Vous trouverez des captures d'écran de notre design dans le dossier /examples à la source du répertoire global.

Nous avons défini un grand bloc correspondant à notre contexte global, représenté par un rectangle jaune. Il contient tous les états définis. On peut retrouver l'état initial en rouge pour commencer. <br>
Chaque état est représenté sous forme d'un rectangle et contient ses différentes actions. 
A partir d'un état, on peut visualiser les différentes transitions possibles représentées par une flèche vers un autre état. Les différentes conditions à respecter pour chaque transition sont également affichées au dessus des flèches ; dans le cas où il n'y a pas de conditions pour une transition, il est affiché "No conditions".

Le bloc global a une flèche rouge qui sort de celui-ci et se dirige vers un bloc nommé "Global transitions" dans le cas où notre programme a des transitions globales. Sur cette flèche, on peut retrouver les différentes conditions qui permettent de sortir de ce contexte global. Depuis le bloc "Global transitions", on peut retrouver plus particulièrement chacune des transitions globales représentée par une flèche bleue. Ces transitions ont une description des conditions à respecter au dessus de leur flèche.

### Affichage en mode debug
Lorsque le programme est écrit par l'utilisateur via notre syntaxe et que celui-ci est exécuté en mode "Debug", notre design s'anime.