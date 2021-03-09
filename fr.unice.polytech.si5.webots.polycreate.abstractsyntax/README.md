## Polycreate - Syntaxe abstraite 

Nous avons défini notre syntaxe abstraite à l'aide de l'éditeur UML compris dans GEMOC. Vous pourrez retrouver notre diagramme dans le dossier **fr.unice.polytech.si5.webots.polycreate.abstractsyntax/model/polycreate.ecore**.

Comme vous pouvez le voir, nous avons une classe principale qui est la classe _RobotProgram_. Cette classe mère contient une méthode "start()" qui nous permet de lancer notre programme.

Cette classe contient une liste de _State_, un état initial (_State_), un état courant (_State_) et une liste de _Transition_ qui sont des transitions globales à notre système. Nous avons représenté le système du robot sous forme d'une machine à états en reprenant les différents concepts comme les états, les transitions et même les conditions.

Un _State_ contient des _Action_. Cette classe est une classe abstraite et contient un attribut qui est la durée que prend cette action. <br> Une _Action_ peut être de trois types : _GripAction_, _MoveAction_ et _TurnAction_. <br/>
Une _MoveAction_ correspond au fait de faire avancer ou reculer, la direction doit être précisée à l'aide de l'énumération _DIRECTION_ (FORWARD, BACKWARD). <br/>
Une _GripAction_ permet d'indiquer au robot d'ouvrir ou fermer sa pince. Ceci est spécifié à l'aide de l'énumération _GRIPPER_STATE_ (OPEN, CLOSED). <br>
Pour finir _TurnAction_ permet d'indiquer au robot de pivoter, pour cela il faut indiquer un angle exprimé sous la forme d'un Double compris entre -180.0 et +180.0.

Un état (_State_) contient des actions qui sont effectuées lorsque le système est dans un état précis mais un état contient aussi des transitions (_Transition_) qui permettent de sortir de celui-ci.
La classe _Transition_ contient des conditions. Une _Condition_ est une classe abstraite et a deux classes filles qui sont _ObjectCondition_ et _SimpleCondition_. <br>
Une _SimpleCondition_ correspond au fait de détecter des obstacles simples, on peut avoir une collision à droite ou à gauche ou encore détecter un mur. La _SimpleCondition_ a un attribut qui correspond au type de détection exprimé par l'énumération _DETECTION_ (COLLISION_LEFT, COLLISION_RIGHT, VIRUTAL_WALL, CLIFF_LEFT, CLIFF_RIGHT, CLIFF_FRONT). <br>
La classe _ObjectCondition_ est une classe abstraite contenant un attribut cameraType qui permet de savoir quelle caméra utilisée pour détecter un objet (FRONT, BACK). Une condition concernant un objet a été séparée en deux types : _AngleCondition_ et _DistanceCondition_. <br>
Une _DistanceCondition_ permet de vérifier un objet à partir d'une certaine distance, la condition est donc vérifiée si un objet se trouve à la distance indiquée par l'attribut "distance" en fonction de l'operator choisi (INFERIOR, SUPERIOR).
Une _AngleCondition_ est très similaire à _DistanceCondition_, cependant on ne se préoccupe pas de la distance de l'objet mais plutôt de l'angle par rapport au robot auquel il se trouve.

Pour finir, une _Transition_ a un attribut de type _State_ qui correspond à l'état cible de cette transition.

Notre système est fortement inspiré d'une machine à états avec la notions d'états, de transitions pour chaque état mais aussi de transitions globales (cette notion est proche de celle d'exception). En effet, si notre système rencontre la condition d'une transition globale à n'importe quel moment, alors cette transition pourra se réaliser.

