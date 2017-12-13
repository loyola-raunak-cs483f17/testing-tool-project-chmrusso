//This class tests the ArrayIndexOutOfBounds Exception 


public class ArrayIndexOutOfBounds_Test 
{
	public static void main(String[] args) {
		int [] testArray = new int[2];
		fifthElement(testArray);
	}
	
	public static int fifthElement(int [] testing) {
		int num = 0; 
		for(int i = 0; i <= 5; i++) {
		    num = testing[4];
		}
		return num;
	}
}



