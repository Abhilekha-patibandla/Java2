package Assignment_3;

public class Swap2Arrays {

	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {6,7,8,9,10};
        for(int i=0;i<arr1.length;i++) {
        	int temp=arr1[i];
        	arr1[i]=arr2[i];
        	arr2[i]=temp;
        	
        }
        System.out.println("Arrays after swapping:");
        for(int i=0;i<arr1.length;i++) {
        	System.out.print(arr1[i]+" ");
        }
        for(int i=0;i<arr2.length;i++) {
        	System.out.print(arr1[i]+" ");
        }
	}

}
