# HelloToastApp

**HelloToastApp** est une application mobile Android simple qui permet d'afficher un message "Hello Toast" en appuyant sur un bouton et de gérer un compteur via des boutons d'incrémentation, décrémentation et de réinitialisation. Le compteur est affiché dans un `TextView` au centre de l'interface.

## Fonctionnalités

- **Afficher "Hello Toast"** : Un bouton permet d'afficher un message de type toast avec le texte "Hello Toast".
- **Incrémenter le compteur** : Un bouton permet d'augmenter la valeur du compteur affichée au centre de l'écran.
- **Décrémenter le compteur** : Un bouton permet de diminuer la valeur du compteur.
- **Réinitialiser le compteur** : Un bouton permet de remettre le compteur à zéro.

## Structure du projet

- **MainActivity.java** : Gère la logique de l'application, y compris les actions des boutons pour afficher le toast et gérer le compteur.
- **activity_main.xml** : Contient la mise en page de l'application, y compris les boutons et le `TextView` pour le compteur.

## Layout

- **ConstraintLayout** : Utilisé pour organiser et contraindre les éléments de l'interface. Le `ConstraintLayout` permet de positionner les éléments de manière flexible et maintient l'alignement du `TextView` au centre, tout en permettant de placer les boutons d'incrémentation, de décrémentation, et de réinitialisation en fonction des contraintes définies.
- **TextView au centre** : Le compteur est affiché au centre de l'écran via un `TextView`, en utilisant des contraintes pour l'aligner précisément au centre.
- **Trois boutons** : Incrémenter, décrémenter et réinitialiser le compteur sont placés en bas, également positionnés à l'aide de contraintes dans le `ConstraintLayout`.
- **Bouton "Hello Toast"** : Affiche un toast lorsque l'utilisateur appuie dessus, également positionné via des contraintes pour un placement harmonieux dans l'interface.

## Fonctionnement

1. **Afficher "Hello Toast"** : En appuyant sur le bouton "Toast", un message toast avec le texte "Hello Toast" apparaît en bas de l'écran.
2. **Gérer le compteur** :
   - **Incrémenter** : Augmente la valeur du compteur affiché dans le `TextView`.
   - **Décrémenter** : Diminue la valeur du compteur.
   - **Réinitialiser** : Remet le compteur à zéro.
     
## Auteur

- **Nom** : Miskar Amina
- **Email** : miskaraminaa@gmail.com

## Installation

1. Clonez le dépôt Git :

   ```bash
   git clone https://github.com/votre-utilisateur/HelloToastApp.git


https://github.com/user-attachments/assets/9e03c326-3ad3-4bf1-b67a-ce7138403eb8

