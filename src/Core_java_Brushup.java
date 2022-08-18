import java.util.ArrayList;

public class Core_java_Brushup {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		// print multiples  of  two
		//for(int i =0;i<arr.length;i++)
		for(int i :arr) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]+" is multiple of 2");
				
			}
			else {
				System.out.println(arr[i]+ " "+"is  not a multiple of 2");
			}
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("jinto");
		a.add("Jose");
		a.add("Puthukary");
		System.out.println(a.get(2));
	}	
	}
}

			
			

	


