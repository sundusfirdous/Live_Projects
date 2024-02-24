package javaPackage;

public class Array4 {

	public static void main(String[] args) {
		
		//Defining Multi Dimensional Array 
	int a[][] = {{0, 2, 3, 7}, {4, 5, 6, 8}, {7, 8, 8, 6}};
	
	//Total number of rows
	int row = a.length;//length is the property of an array
	System.out.println("Total rows : "  + row);
	//Total number of Columns
	int columns = a[0].length;
	System.out.println("Total columns : " + columns);
	
	//Print all data in matrix form
	//outer loop
	for(int i = 0; i < row; i++)
	{
		//inner loop
		for (int j = 0; j < columns; j++)
		{
			System.out.print(a[i][j] + " ");
		}
		System.out.println();
	}
	
	}

}
