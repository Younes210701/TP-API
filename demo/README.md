## Dépendances

- **Web** : La dépendance Web est utilisée pour ajouter des fonctionnalités de développement web à votre application, comme la prise en charge des servlets et des pages web. Elle est généralement utilisée pour les applications web basées sur Spring MVC.

- **JPA** : La dépendance JPA (Java Persistence API) est utilisée pour gérer les accès à la base de données dans une application Java. Elle fournit une interface pour interagir avec une base de données en utilisant des objets Java standard, plutôt que des instructions SQL.

- **Hibernate** : Hibernate est un framework JPA populaire utilisé pour gérer les accès à la base de données dans les applications Java. Il fournit des fonctionnalités avancées telles que la gestion des transactions, la mise en cache et la génération de requêtes.

- **H2** : H2 est un moteur de base de données relationnelle léger écrit en Java. Il est utilisé pour stocker les données dans une application. Il est souvent utilisé pour les tests et le développement car il est facile à installer et à configurer.

- **DevTools** : La dépendance DevTools est utilisée pour améliorer le cycle de développement de l'application. Elle fournit des fonctionnalités telles que le rechargement automatique des ressources, la mise à jour automatique de la version de l'application et la journalisation des erreurs.

- **Thymeleaf** : Thymeleaf est un moteur de modèle pour les applications web. Il permet de créer des vues en utilisant des modèles HTML standard, tout en étant capable de générer du code HTML côté serveur en utilisant des expressions et des fonctions spécifiques à Thymeleaf. Il est souvent utilisé avec Spring pour créer des applications web.


## Etape 13

### Question 1 

Dans le fichier greeting.html, la partie du code où on peut paramétré l'url d'appel est < @GetMapping("/greeting") >

### Question 2 

Pour choisir le fichier HTML à afficher, on utilise return < "greeting"; >

### Question 3 

Pour envoyer le nom, on utilise : <  http://localhost:8080/greeting?nameGET=ENSIM

## Etape 17

La différence est qu'un nouveau tableau a été ajouté à la base de données, c'est la table Adress avec les attributs id, creation, et content.

## Etape 18

L'association @Entity crée un mapping dans la classe adresse pour créer automatiquement une nouvelle classe.

## Etape 19

Oui, je peux visualiser tout le contenu du fichier data.sql

## Etape 22

L'annotation @Autowired de Spring permet d'automatiser l'injection de dépendance des répositories. Cela signifie que lorsque vous utilisez cette annotation sur une variable de répository, Spring va automatiquement instancier cette variable avec une instance de la classe de répository appropriée.

## Etape 30

J'ai obtenu les liens CDN vers des feuilles de styles distantes ainsi que d'autres scripts depuis la page officielle de Bootstrap et je les ai inclu dans les pages où je veux appliquer Bootstrap


### Lien vers le Github :

https://github.com/Younes210701/TP-API