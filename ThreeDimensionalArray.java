public class ThreeDimensionalArray{
	public static void main(String args[]){
		int [] [] [] val =
{{{3,8,5},{1,2,4}},{{3,4,5},{6,5,4}},{{3,5,6},{3,6,7}}};
		for(int i=0; i<val.length; ++i){
		for(int j=0; j<val[i].length; ++j){
		for(int k=0; k<val[i][j].length; ++k){

		
		System.out.print(val[i][j][k]+" ");
		
		}
		System.out.println();
		} 
		System.out.println();
		
		}
	}
}