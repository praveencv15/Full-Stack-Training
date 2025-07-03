package practice;

public class Jagged_Array {

	public static void main(String[] args) {
		int[][] jd = new int[3][];
        jd[0] = new int[] {1, 2, 6, 9};
        jd[1] = new int[] {3, 4, 5};
        jd[2] = new int[] {6};
        for (int i = 0; i < jd.length; i++) {
            for (int j = 0; j < jd[i].length; j++) {
                System.out.print(jd[i][j] + " ");
            }
            System.out.println();
        }
	}
}
