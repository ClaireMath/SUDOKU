package com.company;

public class isGridValid {
    /**
     * fonction ckecking if the whole grid is valid using the previous fonctions themselves checking if the lines, the colums and the sections are valid
     * returns a boolean
     */
    public static boolean isWholeGridValid(int[][] board) {
        if ((!lineIsValid.areAllLinesValid(board)) || (!is_valid_column.is_valid_all_column(board)) || (!allSectionValid.travelAllSection(board))) {
            return false;
        } else {
            return true;
        }
    }

}
