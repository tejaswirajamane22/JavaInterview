
public class HelloWorldFromString {
	
	public static void main(String[] args) {
		//2: Print HELLO in CAPITAL letters for the given string "ahceclwlxo"
		     String s="ahceclwlxo";
		     String[] str=s.split("");
		     System.out.println(str.toString());
		     for(int i=1;i<str.length;i=i+2)
		       System.out.print(str[i].toUpperCase());   
	}

}
