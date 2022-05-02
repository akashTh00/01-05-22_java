// java program to Display the transpose of a matrix--

class Transpose{
	public static void main(String[] args) {
		
		int[][] a = new int[3][3];
		int k = 1;

		for(int i=0; i< a.length; i++)
		{
			for(int j=0; j< a[i].length; j++)
			{
				a[i][j] = k++;
			}
		}
		System.out.println("Matrix before transpose ");

		for(int i=0; i< a.length; i++)
		{
			for(int j=0; j< a[i].length; j++)
			{
				System.out.print(" " + a[i][j]);
			}
		System.out.println();
		}
		System.out.println("Matrix after transpose");

		for(int i=0; i< a.length; i++)
		{
			for(int j=0; j< a[i].length; j++)
			{
				System.out.print(" " + a[j][i]);
			}
		System.out.println();
		}
	}
}


// Hint: 
//Transpose of a matrix is obtained by changing rows to columns and columns to rows. 
// In other words, transpose of A[][] is obtained by changing A[i][j] to A[j][i].