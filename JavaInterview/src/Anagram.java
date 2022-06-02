
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st1="listen";
		String st2="silent";
		
		boolean value= false;
		
		if(st1.length()==st2.length()) {		
			for(int i=0;i<st1.length();i++) {
				char l =st1.charAt(i);			
				if(st2.contains(String.valueOf(l))) {
					value=true;			
				}
				else {
					value= false;
				break;
				}
				
			}
			if(value) {
				System.out.println("Anagram");
				
			}else {
				System.out.println("not an Anagram");
			}
			
			
			
		}else {
			
			System.out.println("Length not satfied");
		}
		
		
		

		

	}

}
