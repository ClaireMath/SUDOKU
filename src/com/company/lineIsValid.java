package com.company;

public class lineIsValid {


    /**
     * Vérifier les contraintes sur une ligne
     * @param tab un tableau d'entiers à deux dimensions
     * @param row une ligne précise
     * @return une valeur booléenne
     */
    public static boolean fIsLineValid(int[][] tab, int row) {
        boolean lineIsValid = true;
        //pour (le num à tester démarre de 1, à chaques tours on ajoute 1, tant que le num testé est <= à 9)
        for (int num = 1; num <= 9; num++) {
            // ATTENTION à où on instancie la variable counter,
            // si on l'instancie avant la boucle, le counter ne reviendra pas à zéro dans les autres tours de boucle,
            // s'il ne revient pas à zéro, on obtiendra false pour chaque nouveau num qu'on veut tester, ce qui signifie
            // que pour tous les autres on aura false.

            // On boucle D'ABORD dans les num et après dans les colones et pas l'inverse, car "pour chaque numero,
            // on va boucler dans les colones et pas pour chaque colone, on boucle dans les nums.

            // initialisation du compteur à 0
            int counter = 0;
            // on ajoute la nouvelle boucle à la boucle précédente
            // pour (le nbr de la colonne part de 0, tant que le nbr de la colonne est < 9, on ajoute +1 à chaques tours)
            for (int col = 0; col < 9; col++) {
                // si le num testé == la valeur comprise dans la case testé
                if (num == tab[row][col]) {
                    //on ajoute +1 pour jouer sur la case suivante
                    counter++;
                    //si le conteur trouve 2x le même numéro dans la ligne
                    if (counter == 2) {
                        // alors la ligne renvoit faux
                        lineIsValid = false;
                        // on s'arrete
                        break;
                    }
                }
            }
        }
        // dans le cas contraire : si le même nombre n'apparait qu'une fois, alors la ligne est considérée comme valide
        return lineIsValid;
    }

    /**
     * Vérifie que toutes les lignes sont valides
     * @param tab un tableau d'entiers à deux dimensions
     * @return une valeur booléenne
     */
    public static boolean areAllLinesValid (int[][] tab) {
        // si on considère que areAllLinesValid renvoit vrai
        boolean areAllLinesValid = true;
        // pour ( un nbr de ligne partant de 0, tant que le num de la ligne est < 9 on ajoute + 1)
        for (int line = 0; line < 9; line++) {
            //on affecte le resultat de la fonction fIsLineValid (ayant pour paramètres le tableau et les lignes) à la valeur areAllLinesValide
            areAllLinesValid = fIsLineValid(tab,line);
            // si on considère que areAllLinesValid est faux
            if (areAllLinesValid == false) {
                //imprime le retour de la fonction c-a-d vrai ou faux
                System.out.println(areAllLinesValid);
                // on retourne faux
                return false;
            }
        }
        // sinon on retourne vrai
        return true;

    }
}

