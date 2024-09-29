# Application de Calcul des Impôts Locaux de Voiture

Cette application mobile Android permet de calculer le prix des impôts locaux pour une voiture en fonction de certains critères. L'application prend en compte la surface du bien, le nombre de pièces et la présence éventuelle d'une piscine pour déterminer le montant total de l'impôt.

## Fonctionnalités

- L'utilisateur entre le nom.
- L'utilisateur entre l'adresse.
- L'utilisateur entre la surface (en m²).
- L'utilisateur entre le nombre de pièces de la propriété.
- L'utilisateur peut indiquer s'il y a une piscine.
- L'application calcule l'impôt local total en fonction des données fournies.
- Le montant de l'impôt total est affiché à l'utilisateur.

## Formules de calcul

Les impôts locaux sont calculés à l'aide des formules suivantes :

- **Impot de base** : `surface * 2`
- **Impot supplémentaire** : `nombre de pièces * 50` 
  - **Bonus piscine** : Si une piscine est présente, un supplément de 100 est ajouté.

### Exemple :
- Surface : 50 m²
- Nombre de pièces : 4
- Piscine : Oui

Le calcul se ferait ainsi :
- Impôt de base : `50 * 2 = 100`
- Impôt supplémentaire : `4 * 50 + 100 = 300`
- **Total Impôt** : `100 + 300 = 400`

## Structure du projet

- **MainActivity.java** : Gère la saisie des informations par l'utilisateur (surface, nombre de pièces, présence de piscine) et le calcul des impôts.
- **activity_main.xml** : Mise en page de l'interface utilisateur, avec des champs pour la saisie et un bouton pour lancer le calcul.

## Layout

- **TextView** : Affiche les instructions et les résultats.
- **EditText** : Champs pour entrer données demandées.
- **CheckBox** : Option pour indiquer la présence d'une piscine.
- **Button** : Bouton pour lancer le calcul et afficher le résultat.

## Fonctionnement

1. **Entrée des données** : L'utilisateur entre la surface et le nombre de pièces, et coche la case s'il y a une piscine.
2. **Calcul** : En appuyant sur le bouton de calcul, l'application calcule l'impôt local à l'aide des formules fournies.
3. **Affichage des résultats** : Le montant total de l'impôt est affiché à l'écran.



https://github.com/user-attachments/assets/9c0003ba-d2bc-4a7b-a7e1-c63083ce2e76

