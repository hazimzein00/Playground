import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class sudokuQuiz {
    int[][] A = new int[3][3];
    int[][] B = new int[3][3];
    int[][] C = new int[3][3];
    int[][] D = new int[3][3];
    int[][] E = new int[3][3];
    int[][] F = new int[3][3];
    int[][] G = new int[3][3];
    int[][] H = new int[3][3];
    int[][] I = new int[3][3];

    public void groupingCell(int[][] board) {
        int repeat = 1;
        int repeat2 = 1;
        int a=0;
        int b=0;
        int x=0;

        int l=0;
        int y=0;
        int p=0;

        while (repeat2 <=3) {
            while (repeat <= 3 && a <= 9) {
                for (int i = a; i < x + 3; i++) {
                    for (int j = l; j < y + 3; j++) {
                        puttingCell(a,b,p,i,j,board);
                        p++;
                    }
                    p=p-3;
                    b++;
                }
                a = a + 3;
                x = x + 3;
                b = 0;
                repeat++;
            }
            a=0;
            x=0;
            repeat=0;
            l = l+3;
            y = y+3;
            p=0;
            repeat2++;
        }
    }

    public void printingCell(int[][] board) {
        for (int i=0;i<board.length;i++) {
            for (int j=0;j<board.length;j++) {
                System.out.print((board[i][j]));
                System.out.print(",");
            }
            System.out.print("\n");
        }
        System.out.println();
    }

    public void puttingCell(int a, int b, int p, int i, int j, int[][] board) {
        if (a == 0 && j<=2) {
            A[b][p] = board[i][j];
        }
        if (a == 3 && j<=2) {
            B[b][p] = board[i][j];
        }
        if (a == 6 && j<=2) {
            C[b][p] = board[i][j];
        }
        if (a == 0 && j>2 && j< 6 ) {
            D[b][p] = board[i][j];
        }
        if (a == 3 && j>2 && j< 6) {
            E[b][p] = board[i][j];
        }
        if (a == 6 && j>2 && j< 6) {
            F[b][p] = board[i][j];
        }
        if (a == 0 && j>5  ) {
            G[b][p] = board[i][j];
        }
        if (a == 3 && j>5) {
            H[b][p] = board[i][j];
        }
        if (a == 6 && j>5) {
            I[b][p] = board[i][j];
        }
    }

    public int[] getRow (int index, int[][] board) {
        int[] row = new int[9];
        for (int i=0; i<9;i++) {
            row[i] = board[index][i];
        }
        return row;
    }

    public int[] getColumn(int index, int[][] board) {
        int[] column = new int[9];
        for (int i=0; i<9;i++) {
            column[i] = board[i][index];
        }
        return column;
    }

    public static <T> boolean checkForDuplicates(T... array)
    {
        Set<T> set = new HashSet<>(Arrays.asList(array));

        return array.length != set.size();
    }

    public static void main(String args[]) {
        sudokuQuiz sudokuQuiz = new sudokuQuiz();
        int[][] board = {
                { 8, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 3, 6, 0, 0, 0, 0, 0 },
                { 0, 7, 0, 0, 9, 0, 2, 0, 0 },
                { 0, 5, 0, 0, 0, 7, 0, 0, 0 },
                { 0, 0, 0, 0, 4, 5, 7, 0, 0 },
                { 0, 0, 0, 1, 0, 0, 0, 3, 0 },
                { 0, 0, 1, 0, 0, 0, 0, 6, 8 },
                { 0, 0, 8, 5, 0, 0, 0, 1, 0 },
                { 0, 9, 0, 0, 0, 0, 4, 0, 0 }
        };

        //System.out.println(Arrays.toString(sudokuQuiz.getColumn(1,board)));
        //System.out.println(Arrays.toString(sudokuQuiz.getRow(2,board)));

/*        for (int i=0;i<board.length;i++) {
            for (int j=0;j<board.length;j++) {
                }
            }
            //System.out.print(" "+checkForDuplicates(board[i]));
            //System.out.print(" "+checkForDuplicates(board[i]));
            System.out.print("\n");
        }*/

/*        sudokuQuiz.groupingCell(board);
        sudokuQuiz.printingCell(sudokuQuiz.A);
        sudokuQuiz.printingCell(sudokuQuiz.B);
        sudokuQuiz.printingCell(sudokuQuiz.C);
        sudokuQuiz.printingCell(sudokuQuiz.D);
        sudokuQuiz.printingCell(sudokuQuiz.E);
        sudokuQuiz.printingCell(sudokuQuiz.F);
        sudokuQuiz.printingCell(sudokuQuiz.G);
        sudokuQuiz.printingCell(sudokuQuiz.H);
        sudokuQuiz.printingCell(sudokuQuiz.I);*/


    }
}