package com.company;

public class findSolution {

    /**
     * Variable counter counter qui permet de stocker le nombre de tentative de résolution de la grille
     */
    public static int counter = 0;

    /**
     * La fonction permet de trouver une grille valide
     * la fonction parcours la grille et avance si la case est deja remplis,
     * sinon la focntion essaye un nombre si celui-ci est possible et met à jour la grille
     * @param board la grille de sudoku passer en parametre
     * @return true si la fonction à reussi a trouver une grille valide, sinon false tant que la grille n'est pas validé
     */
    public static boolean findTheSolution(int[][] board) {
        for (int ligne = 0; ligne < 9; ligne++) {
            for (int colonne = 0; colonne < 9; colonne++) {
                if (board[ligne][colonne] != 0) {
                    continue;
                } else {
                    for (int nb = 1; nb < 10; nb++) {
                        board[ligne][colonne] = nb;
                        counter++;
                        if (isGridValid.isWholeGridValid(board) && findTheSolution(board)) {
                            return true;
                        }
                        board[ligne][colonne] = 0;
                    }
                    return false;
                }
            }
        }
        return true;
    }
}
