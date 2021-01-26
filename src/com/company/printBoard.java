package com.company;

public class printBoard {
    /**
     * La fonction permet d'afficher le tableau de jeu
     * @param board initialise un tableau à 2 dimensions
     * Impression du tableau
     */

    //fonction printBoard qui appelle le tableau de jeu à 2 dimensions
    static void printBoard (int[][] board){
        // pour (la ligne partant de 0, tant que le chiffre de la ligne est < à la longueur du tableau (9)
        // , on ajoute 1 à chaques tours)
        for (int i = 0; i < board.length; i++){
            //on ajoute la cette nouvelle boucle dans la boucle précédente
            // pour (la colonne partant de 0, tant que le chiffre testé de la colonne est < à la longueur du tableau (9),
            // on ajoute 1 à chaques tours)
            for (int y = 0;  y < board.length; y++){
                //imprime le tableau avec ligne et colonne ainsi qu'un espace
                System.out.print(board[i][y] + " ");
            }
            // imprime un retour à la ligne
            System.out.println();
        }
    }
}
