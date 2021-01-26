package com.company;

public class is_valid_column {
    /**
     * La fonction permet de vérifier si la colonne est valide
     * @param tab de type int à 2 dimensions
     * @param column de type int
     * @return False si un chiffre est en double et True si rien n'est en double
     */

    public static boolean is_valid_column(int[][] tab, int column) {
        // pour (num commencant à 1, tant que le num testé est < 10 alors on ajoute +1)
        for (int num = 1; num < 10; num++) {
            //initialisation du compteur à 0
            int counter = 0;
            // on teste un nbr dans chaques lignes en ajoutant 1 à chaques tours tant qu'il est < 9
            for (int line = 0; line < 9; line++) {
                // si le num testé est = au numéro de la case
                if (num == tab[line][column]) {
                    //alors on ajoute +1 pour continuer de jouer
                    counter = counter + 1;
                }
                //si l'on trouve 2 fois le même num alors
                if (counter == 2) {
                    //retourne faux on arrête
                    return false;
                }
            }
        }
        // retourne vrai
        return true;
    }

    /**
     * La fonction permet de vérifier si toutes les colonnes sont valides
     * @param tab de type int à 2 dimensions
     * @return False si un chiffre est en double et True si rien n'est en double
     */
    public static boolean is_valid_all_column(int[][] tab) {
        // on crée une boucle initialisant le nbr de la colonne à 0, à chaques tours on ajoute +1 tant que le nbr de le colonne est < 9
        for (int column = 0; column < 9; column++) {
            // si la fonction is_valid_column est fausse
            if (is_valid_column(tab, column) == false) {
                // alors on retourne faux
                return false;
            }
        }
        // retourne vrai
        return true;
    }
}



