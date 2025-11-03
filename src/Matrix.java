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
		System.out.println("Pairs: " + detectEquivalentAdjacentPairs());
		checkDuplicates();
	}
	public static int detectEquivalentAdjacentPairs() {
		int pairs = 0;
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 1; j < matrix[i].length; j++) {
				if(matrix[i][j] == matrix[i][j-1]) pairs++;
			}
		}
		return pairs;
	}
	public static void checkDuplicates() {
		for(int i = 1; i <= 15; i++) {
			int c = 0;
			for(int j = 0; j < matrix.length; j++) {
				for(int k = 0; k < matrix[j].length; k++) {
					if(matrix[j][k] == i) c++;
				}
			}
			System.out.println(i + ": " + c);
		}
	}
	public static void shiftRight(int shift, int row) {
		
	}
}