
public class Java_String2 {

	public static void main(String[] args) {
		//string is an object 
				//String s="Jinto Jose";
				//String s1="Jinto Puthukary";
				
				//NEW 
				//String s2 =new String("Welcome");
				String  s="Jinto  Jose Learning";
				//to spliting the string
				
				String[] splittedString=s.split("Jose");
				System.out.println(splittedString[0]);
				
				/*System.out.println(splittedString[1]);
				System.out.println(splittedString[2]);
				System.out.println(splittedString[3]);
				to  remove  the white space*/
				
				// trim is using for removing the white space
				System.out.println(splittedString[1].trim());
				
				
				//the characters which counting from back
				//to reverse the string
				for(int i=s.length()-1;i>=0;--i) {
					
					
					/*to  count the characters in the string in the array we  use the keyword
					charAT by using this we get each characters in this string */
					System.out.println(s.charAt(i));
				
				}
	}
	
}

				 

			





