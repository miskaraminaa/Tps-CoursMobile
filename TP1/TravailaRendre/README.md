# Application d'Inscription à une Formation

Cette application Android permet aux utilisateurs de saisir leurs informations pour s'inscrire à une formation. Une fois les données saisies, un récapitulatif est affiché dans une nouvelle activité.

## Fonctionnalités

1. **Saisie des informations utilisateur** : L'utilisateur entre ses données personnelles via un formulaire. Les informations incluent :
   - Nom
   - Prénom
   - Adresse e-mail
   - Numéro de téléphone
   - Ville

2. **Envoi des données** : En appuyant sur le bouton « Envoyer », les informations saisies par l'utilisateur sont envoyées à une nouvelle activité qui affiche un récapitulatif.

3. **Récapitulatif** : Une fois redirigé vers la nouvelle activité, l'utilisateur voit toutes les informations qu'il a entrées sous forme de récapitulatif.

## Structure du projet

- **Naviagtion.java** : Contient le formulaire d'inscription où l'utilisateur saisit ses données.
- **Screen2.java** : Affiche un récapitulatif des informations saisies après l'envoi.
- **activity_main.xml** : Layout de l'interface de saisie avec les champs pour les données personnelles et le bouton « Envoyer ».
- **activity_screen2.xml** : Layout de l'interface qui affiche le récapitulatif des informations saisies.

## Navigation

- L'utilisateur commence sur l'écran principal (Navigation), où il remplit le formulaire d'inscription.
- En appuyant sur le bouton « Envoyer », un **Intent** est utilisé pour passer à l'activité suivante (Screen2) tout en transférant les données saisies.
- Dans la **Screen2**, l'utilisateur peut voir le récapitulatif des informations saisies.

## Fonctionnement

1. **Saisie des données** : L'utilisateur entre ses informations dans les champs appropriés (nom, prénom, e-mail, etc.).
2. **Envoi et redirection** : Au clic sur le bouton « Envoyer », un **Intent** est utilisé pour transférer les données à la nouvelle activité.
3. **Affichage du récapitulatif** : La nouvelle activité affiche toutes les informations saisies.




https://github.com/user-attachments/assets/933163ca-a07e-4a3f-aaff-062753fb619a


