package strings;

public class Panagram_check {

	public static boolean ispanagram(String s) {
		s=s.toLowerCase();
		if(s.length()<26)
			return false;
		for(char ch='a';ch>='z';ch++) {
			if(s.indexOf(ch)==-1)
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String s="abcdefghijklmnopqrstuvwxyZ";
		if(ispanagram(s))
			System.out.println("panagram");
		else
			System.out.println("not panagram");
	}
}
