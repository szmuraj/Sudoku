package com.sudoku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SudokuApplication {


    public static void main(String[] args) {
        SpringApplication.run(SudokuApplication.class, args);
        System.out.println(startBracket());

    }

    public static String startBracket() {

        int[] c0 = {0, 7, 2, 9, 3, 1, 5, 6, 8};
        int[] c1 = {0, 5, 0, 6, 0, 0, 0, 0, 0};
        int[] c2 = {0, 3, 0, 2, 4, 5, 0, 0, 7};
        int[] c3 = {1, 0, 3, 0, 0, 0, 6, 0, 5};
        int[] c4 = {0, 4, 0, 0, 8, 0, 2, 0, 9};
        int[] c5 = {0, 0, 0, 0, 0, 6, 0, 3, 4};
        int[] c6 = {0, 9, 4, 0, 0, 2, 0, 5, 1};
        int[] c7 = {0, 0, 0, 8, 0, 9, 4, 0, 3};
        int[] c8 = {8, 1, 7, 3, 5, 4, 9, 0, 6};

        int[][] b = {c0, c1, c2, c3, c4, c5, c6, c7, c8};

        int[] num00 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num10 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num20 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num30 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num40 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num50 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num60 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num70 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num80 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] num01 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num11 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num21 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num31 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num41 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num51 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num61 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num71 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num81 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] num02 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num12 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num22 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num32 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num42 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num52 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num62 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num72 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num82 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] num03 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num13 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num23 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num33 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num43 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num53 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num63 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num73 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num83 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] num04 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num14 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num24 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num34 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num44 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num54 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num64 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num74 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num84 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] num05 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num15 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num25 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num35 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num45 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num55 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num65 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num75 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num85 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] num06 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num16 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num26 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num36 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num46 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num56 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num66 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num76 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num86 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] num07 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num17 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num27 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num37 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num47 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num57 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num67 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num77 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num87 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] num08 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num18 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num28 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num38 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num48 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num58 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num68 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num78 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num88 = {1, 2, 3, 4, 5, 6, 7, 8, 9};


        int[][] numX0 = {num00, num10, num20, num30, num40, num50, num60, num70, num80};
        int[][] numX1 = {num01, num11, num21, num31, num41, num51, num61, num71, num81};
        int[][] numX2 = {num02, num12, num22, num32, num42, num52, num62, num72, num82};
        int[][] numX3 = {num03, num13, num23, num33, num43, num53, num63, num73, num83};
        int[][] numX4 = {num04, num14, num24, num34, num44, num54, num64, num74, num84};
        int[][] numX5 = {num05, num15, num25, num35, num45, num55, num65, num75, num85};
        int[][] numX6 = {num06, num16, num26, num36, num46, num56, num66, num76, num86};
        int[][] numX7 = {num07, num17, num27, num37, num47, num57, num67, num77, num87};
        int[][] numX8 = {num08, num18, num28, num38, num48, num58, num68, num78, num88};

        int[][][] numX = {numX0, numX1, numX2, numX3, numX4, numX5, numX6, numX7, numX8};

        int sum = 0;
        while (sum != 405) {

            //nadawanie wartości obecnych
            for (int c = 0; c < 9; c++) {
                for (int l = 0; l < 9; l++) {
                    if (b[c][l] != 0) {
                        for (int i = 0; i < 9; i++) {
                            numX[c][l][i] = 0;
                            numX[c][l][b[c][l] - 1] = b[c][l];
                        }
                    }
                }
            }

            // ogranicza możliwości wg linijek
            for (int c = 0; c < 9; c++) {
                for (int l = 0; l < 9; l++) {
                    int s = b[c][l];
                    if (b[c][l] != 0) {
                        numX[0][l][b[c][l] - 1] = 0;
                        numX[1][l][b[c][l] - 1] = 0;
                        numX[2][l][b[c][l] - 1] = 0;
                        numX[3][l][b[c][l] - 1] = 0;
                        numX[4][l][b[c][l] - 1] = 0;
                        numX[5][l][b[c][l] - 1] = 0;
                        numX[6][l][b[c][l] - 1] = 0;
                        numX[7][l][b[c][l] - 1] = 0;
                        numX[8][l][b[c][l] - 1] = 0;
                        numX[c][l][b[c][l] - 1] = s;
                    }
                }
            }

            // ogranicza możliwości wg kolumn
            for (int c = 0; c < 9; c++) {
                for (int l = 0; l < 9; l++) {
                    int s = b[c][l];
                    if (b[c][l] != 0) {
                        numX[c][0][b[c][l] - 1] = 0;
                        numX[c][1][b[c][l] - 1] = 0;
                        numX[c][2][b[c][l] - 1] = 0;
                        numX[c][3][b[c][l] - 1] = 0;
                        numX[c][4][b[c][l] - 1] = 0;
                        numX[c][5][b[c][l] - 1] = 0;
                        numX[c][6][b[c][l] - 1] = 0;
                        numX[c][7][b[c][l] - 1] = 0;
                        numX[c][8][b[c][l] - 1] = 0;
                        numX[c][l][b[c][l] - 1] = s;
                    }
                }
            }

            //ograniczenie możliwości wg klatek
            for (int c = 0; c < 9; c++) {
                for (int l = 0; l < 9; l++) {
                    int s = b[c][l];
                    if(b[c][l] != 0) {
                        if (c < 3) {
                            if (l < 3) {
                                numX[0][0][b[c][l] - 1] = 0;
                                numX[1][0][b[c][l] - 1] = 0;
                                numX[2][0][b[c][l] - 1] = 0;
                                numX[0][1][b[c][l] - 1] = 0;
                                numX[1][1][b[c][l] - 1] = 0;
                                numX[2][1][b[c][l] - 1] = 0;
                                numX[0][2][b[c][l] - 1] = 0;
                                numX[1][2][b[c][l] - 1] = 0;
                                numX[2][2][b[c][l] - 1] = 0;
                                numX[c][l][b[c][l] - 1] = s;
                            }
                            if(l > 2 && l < 6) {
                                numX[0][3][b[c][l] - 1] = 0;
                                numX[1][3][b[c][l] - 1] = 0;
                                numX[2][3][b[c][l] - 1] = 0;
                                numX[0][4][b[c][l] - 1] = 0;
                                numX[1][4][b[c][l] - 1] = 0;
                                numX[2][4][b[c][l] - 1] = 0;
                                numX[0][5][b[c][l] - 1] = 0;
                                numX[1][5][b[c][l] - 1] = 0;
                                numX[2][5][b[c][l] - 1] = 0;
                                numX[c][l][b[c][l] - 1] = s;
                            }
                            if(l > 5) {
                                numX[0][6][b[c][l] - 1] = 0;
                                numX[1][6][b[c][l] - 1] = 0;
                                numX[2][6][b[c][l] - 1] = 0;
                                numX[0][7][b[c][l] - 1] = 0;
                                numX[1][7][b[c][l] - 1] = 0;
                                numX[2][7][b[c][l] - 1] = 0;
                                numX[0][8][b[c][l] - 1] = 0;
                                numX[1][8][b[c][l] - 1] = 0;
                                numX[2][8][b[c][l] - 1] = 0;
                                numX[c][l][b[c][l] - 1] = s;
                            }
                        }
                        if(c > 2 && c < 6) {
                            if (l < 3) {
                                numX[3][0][b[c][l] - 1] = 0;
                                numX[4][0][b[c][l] - 1] = 0;
                                numX[5][0][b[c][l] - 1] = 0;
                                numX[3][1][b[c][l] - 1] = 0;
                                numX[4][1][b[c][l] - 1] = 0;
                                numX[5][1][b[c][l] - 1] = 0;
                                numX[3][2][b[c][l] - 1] = 0;
                                numX[4][2][b[c][l] - 1] = 0;
                                numX[5][2][b[c][l] - 1] = 0;
                                numX[c][l][b[c][l] - 1] = s;
                            }
                            if(l > 2 && l < 6) {
                                numX[3][3][b[c][l] - 1] = 0;
                                numX[4][3][b[c][l] - 1] = 0;
                                numX[5][3][b[c][l] - 1] = 0;
                                numX[3][4][b[c][l] - 1] = 0;
                                numX[4][4][b[c][l] - 1] = 0;
                                numX[5][4][b[c][l] - 1] = 0;
                                numX[3][5][b[c][l] - 1] = 0;
                                numX[4][5][b[c][l] - 1] = 0;
                                numX[5][5][b[c][l] - 1] = 0;
                                numX[c][l][b[c][l] - 1] = s;
                            }
                            if(l > 5) {
                                numX[3][6][b[c][l] - 1] = 0;
                                numX[4][6][b[c][l] - 1] = 0;
                                numX[5][6][b[c][l] - 1] = 0;
                                numX[3][7][b[c][l] - 1] = 0;
                                numX[4][7][b[c][l] - 1] = 0;
                                numX[5][7][b[c][l] - 1] = 0;
                                numX[3][8][b[c][l] - 1] = 0;
                                numX[4][8][b[c][l] - 1] = 0;
                                numX[5][8][b[c][l] - 1] = 0;
                                numX[c][l][b[c][l] - 1] = s;
                            }
                        }
                        if(c > 5) {
                            if (l < 3) {
                                numX[6][0][b[c][l] - 1] = 0;
                                numX[7][0][b[c][l] - 1] = 0;
                                numX[8][0][b[c][l] - 1] = 0;
                                numX[6][1][b[c][l] - 1] = 0;
                                numX[7][1][b[c][l] - 1] = 0;
                                numX[8][1][b[c][l] - 1] = 0;
                                numX[6][2][b[c][l] - 1] = 0;
                                numX[7][2][b[c][l] - 1] = 0;
                                numX[8][2][b[c][l] - 1] = 0;
                                numX[c][l][b[c][l] - 1] = s;
                            }
                            if(l > 2 && l < 6) {
                                numX[6][3][b[c][l] - 1] = 0;
                                numX[7][3][b[c][l] - 1] = 0;
                                numX[8][3][b[c][l] - 1] = 0;
                                numX[6][4][b[c][l] - 1] = 0;
                                numX[7][4][b[c][l] - 1] = 0;
                                numX[8][4][b[c][l] - 1] = 0;
                                numX[6][5][b[c][l] - 1] = 0;
                                numX[7][5][b[c][l] - 1] = 0;
                                numX[8][5][b[c][l] - 1] = 0;
                                numX[c][l][b[c][l] - 1] = s;
                            }
                            if(l > 5) {
                                numX[6][6][b[c][l] - 1] = 0;
                                numX[7][6][b[c][l] - 1] = 0;
                                numX[8][6][b[c][l] - 1] = 0;
                                numX[6][7][b[c][l] - 1] = 0;
                                numX[7][7][b[c][l] - 1] = 0;
                                numX[8][7][b[c][l] - 1] = 0;
                                numX[6][8][b[c][l] - 1] = 0;
                                numX[7][8][b[c][l] - 1] = 0;
                                numX[8][8][b[c][l] - 1] = 0;
                                numX[c][l][b[c][l] - 1] = s;
                            }
                        }
                    }
                }
            }


            // gdy jest tylko 1 możliwość wstawia ją
            for (int c = 0; c < 9; c++) {
                for (int l = 0; l < 9; l++) {
                    if (b[c][l] == 0) {
                        if (Arrays.stream(numX[c][l]).filter(e -> e != 0).count() == 1) {
                            b[c][l] = Arrays.stream(numX[c][l]).sum();
                        }
                    }
                }
            }

            // poprawka dla sumy
            for (int i = 0; i < 9; i++) {
                sum += Arrays.stream(b[i]).sum();
            }
            if (sum != 405) System.out.println(sum);
            sum = 0;

            String bracket = " ___________________________________________________________\n " +
                    "|     |     |     | |     |     |     | |     |     |     |\n " +
                    "|  " + c0[0] + "  |  " + c1[0] + "  |  " + c2[0] + "  | |  " + c3[0] + "  |  " + c4[0] + "  |  " + c5[0] + "  | |  " + c6[0] + "  |  " + c7[0] + "  |  " + c8[0] + "  |\n " +
                    "|_____|_____|_____| |_____|_____|_____| |_____|_____|_____|\n " +
                    "|     |     |     | |     |     |     | |     |     |     |\n " +
                    "|  " + c0[1] + "  |  " + c1[1] + "  |  " + c2[1] + "  | |  " + c3[1] + "  |  " + c4[1] + "  |  " + c5[1] + "  | |  " + c6[1] + "  |  " + c7[1] + "  |  " + c8[1] + "  |\n " +
                    "|_____|_____|_____| |_____|_____|_____| |_____|_____|_____|\n " +
                    "|     |     |     | |     |     |     | |     |     |     |\n " +
                    "|  " + c0[2] + "  |  " + c1[2] + "  |  " + c2[2] + "  | |  " + c3[2] + "  |  " + c4[2] + "  |  " + c5[2] + "  | |  " + c6[2] + "  |  " + c7[2] + "  |  " + c8[2] + "  |\n " +
                    "|_____|_____|_____| |_____|_____|_____| |_____|_____|_____|\n " +
                    "___________________________________________________________\n " +
                    "|     |     |     | |     |     |     | |     |     |     |\n " +
                    "|  " + c0[3] + "  |  " + c1[3] + "  |  " + c2[3] + "  | |  " + c3[3] + "  |  " + c4[3] + "  |  " + c5[3] + "  | |  " + c6[3] + "  |  " + c7[3] + "  |  " + c8[3] + "  |\n " +
                    "|_____|_____|_____| |_____|_____|_____| |_____|_____|_____|\n " +
                    "|     |     |     | |     |     |     | |     |     |     |\n " +
                    "|  " + c0[4] + "  |  " + c1[4] + "  |  " + c2[4] + "  | |  " + c3[4] + "  |  " + c4[4] + "  |  " + c5[4] + "  | |  " + c6[4] + "  |  " + c7[4] + "  |  " + c8[4] + "  |\n " +
                    "|_____|_____|_____| |_____|_____|_____| |_____|_____|_____|\n " +
                    "|     |     |     | |     |     |     | |     |     |     |\n " +
                    "|  " + c0[5] + "  |  " + c1[5] + "  |  " + c2[5] + "  | |  " + c3[5] + "  |  " + c4[5] + "  |  " + c5[5] + "  | |  " + c6[5] + "  |  " + c7[5] + "  |  " + c8[5] + "  |\n " +
                    "|_____|_____|_____| |_____|_____|_____| |_____|_____|_____|\n " +
                    "___________________________________________________________\n " +
                    "|     |     |     | |     |     |     | |     |     |     |\n " +
                    "|  " + c0[6] + "  |  " + c1[6] + "  |  " + c2[6] + "  | |  " + c3[6] + "  |  " + c4[6] + "  |  " + c5[6] + "  | |  " + c6[6] + "  |  " + c7[6] + "  |  " + c8[6] + "  |\n " +
                    "|_____|_____|_____| |_____|_____|_____| |_____|_____|_____|\n " +
                    "|     |     |     | |     |     |     | |     |     |     |\n " +
                    "|  " + c0[7] + "  |  " + c1[7] + "  |  " + c2[7] + "  | |  " + c3[7] + "  |  " + c4[7] + "  |  " + c5[7] + "  | |  " + c6[7] + "  |  " + c7[7] + "  |  " + c8[7] + "  |\n " +
                    "|_____|_____|_____| |_____|_____|_____| |_____|_____|_____|\n " +
                    "|     |     |     | |     |     |     | |     |     |     |\n " +
                    "|  " + c0[8] + "  |  " + c1[8] + "  |  " + c2[8] + "  | |  " + c3[8] + "  |  " + c4[8] + "  |  " + c5[8] + "  | |  " + c6[8] + "  |  " + c7[8] + "  |  " + c8[8] + "  |\n " +
                    "|_____|_____|_____| |_____|_____|_____| |_____|_____|_____| ";

            System.out.println(bracket);
        }
        return " ";
    }

    // todo: sprawdzanie pokoleji od od rzędów 1-9 potem kolumny 1-9 i zbiory 1-9
    // todo: zabezpieczenie na wypadek nieskończonej pętli
    // todo: sprawdzanie wyniku dodania liczby


    // todo: gdy wszystkie liczby zostaną zapisane wyświetla się "Sudoku!"

}
