package trello;

public class StringBase {
	public static void main(String[] args) {
		String name="rahul";
		String revname="";
		int last = name.length()-1;
		for (int i = last; i >=0; i--) {
			revname+=name.charAt(i);
		}
		System.out.println(revname);
	}

}
