package javaarrays;

public class MatrixTranspose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++) {
			System.out.println("array elements are: "+arr[i][j]);
		}
		}
		for(int i=0;i<3;i++){
		for(int j=0;j<3;j++)	{
		System.out.println("Transpose elements are: "+arr[j][i]);
		}
		}
	}

}
