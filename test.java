package midterm;



public class test {
	public static void main(String[] args) {
	
		int[] arr1 = {2,3,1,5,10};
		int[] arr2 = new int[5];
		arr2[2] =7;
		arr2=arr1;
		arr2[2]=9;
	System.out.println(arr1[2]);


	}
}
