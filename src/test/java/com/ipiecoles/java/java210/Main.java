package com.ipiecoles.java.java210;

public class Main {
    public static void main (String[] args)
    {
        System.out.println(Sudoku.FIN_SAISIE) ;

        Sudoku s = new Sudoku ();

        System.out.println(s.getSudokuAResoudre()[0][2]) ;

        s.demandeCoordonneesSudoku();
    }
}
