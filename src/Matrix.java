import java.lang.Math;
public class Matrix {
	public static int[][] matrix = new int[5][5];
	public static void createMatrix() {
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int)(Math.random()*15)+1;
			}
		}
	}
	public static void main(String[] args) {
		createMatrix();
		for(int[] i : matrix) {
			for(int j : i) {
				System.out.print(j +", ");
			}
			System.out.print("\n");
		}
	}
	public static int detectEquivalentAdjacentPairs(int[][] arr) {
		int pairs = 0;
		return pairs;
	}
}