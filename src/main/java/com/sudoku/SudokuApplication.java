package com.sudoku;

import java.util.Arrays;

public class SudokuApplication {

    public static void main(String[] args) {
        int[][] board = {
                {0, 7, 2, 9, 3, 1, 5, 6, 8},
                {0, 5, 0, 6, 0, 0, 0, 0, 0},
                {0, 3, 0, 2, 4, 5, 0, 0, 7},
                {1, 0, 3, 0, 0, 0, 6, 0, 5},
                {0, 4, 0, 0, 8, 0, 2, 0, 9},
                {0, 0, 0, 0, 0, 6, 0, 3, 4},
                {0, 9, 4, 0, 0, 2, 0, 5, 1},
                {0, 0, 0, 8, 0, 9, 4, 0, 3},
                {8, 1, 7, 3, 5, 4, 9, 0, 6}
        };

        int[][][] possible = new int[9][9][9];
        for (int c = 0; c < 9; c++) {
            for (int l = 0; l < 9; l++) {
                possible[c][l] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
            }
        }

        int sum = 0;

        while (sum != 405) {

            // ogranicza możliwości oraz wstawianie
            for (int c = 0; c < 9; c++) {
                for (int l = 0; l < 9; l++) {
                    int s = board[c][l];
                    if (board[c][l] != 0) {
                        for (int k = 0; k < 9; k++) {
                            possible[c][l][k] = 0;
                            possible[c][l][board[c][l] - 1] = board[c][l];
                            possible[k][l][board[c][l] - 1] = 0;
                            possible[c][k][board[c][l] - 1] = 0;
                        }
                        if (c < 3 && l < 3) {
                            for (int m = 0; m < 3; m++) {
                                for (int n = 0; n < 3; n++) {
                                    possible[m][n][board[c][l] - 1] = 0;
                                }
                            }
                        }
                        if (c < 3 && l > 2 && l < 6) {
                            for (int m = 0; m < 3; m++) {
                                for (int n = 3; n < 6; n++) {
                                    possible[m][n][board[c][l] - 1] = 0;
                                }
                            }
                        }
                        if (c < 3 && l > 5) {
                            for (int m = 0; m < 3; m++) {
                                for (int n = 6; n < 9; n++) {
                                    possible[m][n][board[c][l] - 1] = 0;
                                }
                            }
                        }
                        if (c > 2 && c < 6 && l < 3) {
                            for (int m = 3; m < 6; m++) {
                                for (int n = 0; n < 3; n++) {
                                    possible[m][n][board[c][l] - 1] = 0;
                                }
                            }
                        }
                        if (c > 2 && c < 6 && l > 2 && l < 6) {
                            for (int m = 3; m < 6; m++) {
                                for (int n = 3; n < 6; n++) {
                                    possible[m][n][board[c][l] - 1] = 0;
                                }
                            }
                        }
                        if (c > 2 && c < 6 && l > 5) {
                            for (int m = 3; m < 6; m++) {
                                for (int n = 6; n < 9; n++) {
                                    possible[m][n][board[c][l] - 1] = 0;
                                }
                            }
                        }
                        if (c > 5 && l < 3) {
                            for (int m = 6; m < 9; m++) {
                                for (int n = 0; n < 3; n++) {
                                    possible[m][n][board[c][l] - 1] = 0;
                                }
                            }
                        }
                        if (c > 5 && l > 2 && l < 6) {
                            for (int m = 6; m < 9; m++) {
                                for (int n = 3; n < 6; n++) {
                                    possible[m][n][board[c][l] - 1] = 0;
                                }
                            }
                        }
                        if (c > 5 && l > 5) {
                            for (int m = 6; m < 9; m++) {
                                for (int n = 6; n < 9; n++) {
                                    possible[m][n][board[c][l] - 1] = 0;
                                }
                            }
                        }
                        possible[c][l][board[c][l] - 1] = s;
                    }
                    if (board[c][l] == 0) {
                        if (Arrays.stream(possible[c][l]).filter(e -> e != 0).count() == 1) {
                            board[c][l] = Arrays.stream(possible[c][l]).sum();
                        }
                    }
                }
            }

            String bracket = " ___________________________________________________________\n " +
                    "|     |     |     | |     |     |     | |     |     |     |\n " +
                    "|  " + board[0][0] + "  |  " + board[1][0] + "  |  " + board[2][0] + "  | |  " + board[3][0] + "  |  " + board[4][0] + "  |  " + board[5][0] + "  | |  " + board[6][0] + "  |  " + board[7][0] + "  |  " + board[8][0] + "  |\n " +
                    "|_____|_____|_____| |_____|_____|_____| |_____|_____|_____|\n " +
                    "|     |     |     | |     |     |     | |     |     |     |\n " +
                    "|  " + board[0][1] + "  |  " + board[1][1] + "  |  " + board[2][1] + "  | |  " + board[3][1] + "  |  " + board[4][1] + "  |  " + board[5][1] + "  | |  " + board[6][1] + "  |  " + board[7][1] + "  |  " + board[8][1] + "  |\n " +
                    "|_____|_____|_____| |_____|_____|_____| |_____|_____|_____|\n " +
                    "|     |     |     | |     |     |     | |     |     |     |\n " +
                    "|  " + board[0][2] + "  |  " + board[1][2] + "  |  " + board[2][2] + "  | |  " + board[3][2] + "  |  " + board[4][2] + "  |  " + board[5][2] + "  | |  " + board[6][2] + "  |  " + board[7][2] + "  |  " + board[8][2] + "  |\n " +
                    "|_____|_____|_____| |_____|_____|_____| |_____|_____|_____|\n " +
                    "___________________________________________________________\n " +
                    "|     |     |     | |     |     |     | |     |     |     |\n " +
                    "|  " + board[0][3] + "  |  " + board[1][3] + "  |  " + board[2][3] + "  | |  " + board[3][3] + "  |  " + board[4][3] + "  |  " + board[5][3] + "  | |  " + board[6][3] + "  |  " + board[7][3] + "  |  " + board[8][3] + "  |\n " +
                    "|_____|_____|_____| |_____|_____|_____| |_____|_____|_____|\n " +
                    "|     |     |     | |     |     |     | |     |     |     |\n " +
                    "|  " + board[0][4] + "  |  " + board[1][4] + "  |  " + board[2][4] + "  | |  " + board[3][4] + "  |  " + board[4][4] + "  |  " + board[5][4] + "  | |  " + board[6][4] + "  |  " + board[7][4] + "  |  " + board[8][4] + "  |\n " +
                    "|_____|_____|_____| |_____|_____|_____| |_____|_____|_____|\n " +
                    "|     |     |     | |     |     |     | |     |     |     |\n " +
                    "|  " + board[0][5] + "  |  " + board[1][5] + "  |  " + board[2][5] + "  | |  " + board[3][5] + "  |  " + board[4][5] + "  |  " + board[5][5] + "  | |  " + board[6][5] + "  |  " + board[7][5] + "  |  " + board[8][5] + "  |\n " +
                    "|_____|_____|_____| |_____|_____|_____| |_____|_____|_____|\n " +
                    "___________________________________________________________\n " +
                    "|     |     |     | |     |     |     | |     |     |     |\n " +
                    "|  " + board[0][6] + "  |  " + board[1][6] + "  |  " + board[2][6] + "  | |  " + board[3][6] + "  |  " + board[4][6] + "  |  " + board[5][6] + "  | |  " + board[6][6] + "  |  " + board[7][6] + "  |  " + board[8][6] + "  |\n " +
                    "|_____|_____|_____| |_____|_____|_____| |_____|_____|_____|\n " +
                    "|     |     |     | |     |     |     | |     |     |     |\n " +
                    "|  " + board[0][7] + "  |  " + board[1][7] + "  |  " + board[2][7] + "  | |  " + board[3][7] + "  |  " + board[4][7] + "  |  " + board[5][7] + "  | |  " + board[6][7] + "  |  " + board[7][7] + "  |  " + board[8][7] + "  |\n " +
                    "|_____|_____|_____| |_____|_____|_____| |_____|_____|_____|\n " +
                    "|     |     |     | |     |     |     | |     |     |     |\n " +
                    "|  " + board[0][8] + "  |  " + board[1][8] + "  |  " + board[2][8] + "  | |  " + board[3][8] + "  |  " + board[4][8] + "  |  " + board[5][8] + "  | |  " + board[6][8] + "  |  " + board[7][8] + "  |  " + board[8][8] + "  |\n " +
                    "|_____|_____|_____| |_____|_____|_____| |_____|_____|_____| ";

            // poprawka dla sumy
            for (int i = 0; i < 9; i++) {
                sum += Arrays.stream(board[i]).sum();
            }
            System.out.println(sum);
            System.out.println(bracket);
            if (sum != 405) {
                sum = 0;
            } else {
                System.out.println("Sudoku !!!!");
            }
        }
    }
}