//This class tests the ArrayIndexOutOfBounds Exception 


public class ArrayIndexOutOfBounds_Test 
{
	public static void main(String[] args) {
		int [] testArray = new int[2];
		Element(testArray);
	}
	
	public static int Element(int [] testing) {
		int num = 0; 
		for(int i = 0; i <= testing.length; i++) {
		    num = testing[i];
		}
		return num;
	}
}



