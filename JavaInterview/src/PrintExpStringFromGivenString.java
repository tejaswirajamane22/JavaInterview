
public class PrintExpStringFromGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String input="AHCECLWLXO";
		String output="HELLO";
		
		for(int i=0;i<input.length();i++) 	
			if(output.contains(String.valueOf(input.charAt(i)))) {
				
				System.out.print(input.charAt(i));
			}
			
		}
		
	
}
