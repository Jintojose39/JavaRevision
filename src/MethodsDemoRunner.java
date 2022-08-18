
public class MethodsDemoRunner {

	public static void main(String[] args) {
	Method1 m1 =new Method1();
	Method2 m2 =new Method2();
	Method3 m3 =new Method3();
	m1.get1();
	m2.get2();
	m3.get3();
	getData();
	getN();
	m1.getS1();
	
	
			
		}
		public static String getData() {
			
			System.out.println("Welcome method Runner");
			return  null;
			
			
		}
		public static int getN() {
			System.out.println(45);
			return 12;
		}
		
	}


