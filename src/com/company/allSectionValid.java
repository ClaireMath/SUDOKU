package com.company;

public class allSectionValid {

    /**
     * La fonction permet de vérifier une section de 3par3 si un chiffre n'est pas en double dans une seule section
     * @param board initialise un tableau à 2 dimensions
     * @param raw initialiser l'index de la ligne de départ pour la vérification
     * @param col initialise l'index de la valeur de départ pour la vérification de la colonne
     * @return False si un chiffre est en double et True si rien n'est en double
     */

    //fonction isValidSection ayant comme param le tableau à 2 dimensions, l'index ligne, l'index colonne
    public static boolean isValidSection(int[][] board, int raw, int col) {
        //on ouvre la boucle for pour tester chaques nombre en partant de 1, tant que le nombre testé est <= 9 on ajoute +1
        for (int nb = 1; nb <= 9; nb++) {
            // on init la recurrence à 0
            int recurrence = 0;
            // on ouvre la boucle dans la boucle précédente en initialisant X étant égale à la ligne,
            // tant que la recherche du nombre n'a pas dépassé le périmètre de lignes de la section, on ajoute + 1
            for (int x = raw; x < raw+3; x++) {
                // on ajoute for dans les deux boucles précédentes,
                // on initialise y étant le point de départ de la colonne de la section
                // tant que le nombre cherché n'a pas dépassé le périmètre de colonne de la section, on ajoute +1
                for (int y = col; y < col+3; y++) {
                    //System.out.print(board[x][y]);
                    //System.out.println();
                    //System.out.println("NUM ----   " + nb);
                    // si le nb testé est = à la valeur du tableau ayant pour paramètres x et y
                    if (nb == board[x][y]) {
                        // on ajoute +1 au compteur pour continuer de jouer
                        recurrence++;
                    }
                    //si l'on trouve plus d'une fois le meme chiffre
                    if (recurrence > 1) {
                        // on retourne faux
                        return false;
                    }
                }
                //System.out.println();
            }
        }
        // retourne vrai
        return true;
    }

    /**
     * La fonction permet de se déplacer dans les bornes de la section à vérifier
     * On appel la fonction isValidSection plusieurs fois dans une boucle jusqu'a faire les 9 sections de la grille
     * @param board Grille de sudoku, tableau à 2 dimension
     * @return False si la fonction isValidSection trouve un doublon et True si aucun doublon n'est trouver
     */
    public static boolean travelAllSection(int[][] board){
        // on crée la boucle initialisant i (le nbr testé) avec comme départ 0, tant que i < 9 on ajoute +3 à chaques tours
        for (int i = 0; i < 9; i += 3){
            // on ajoute une nvl boucle dans la boucle précédente
            // en initialisant y à 0, tant que y est < 9 on ajoute + 3 à chaques tours
            for (int y = 0;  y < 9; y += 3){
                // si isValidSection est fausse
                if (!isValidSection(board,i, y)) {
                    // on retourne faux
                    return false;
                }
            }
        }
        // retourne vrai
        return true;
    }

}
