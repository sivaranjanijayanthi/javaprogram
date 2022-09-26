package Sivajay;

public class StingCharcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello world";
		int cnt=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch== 'a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u'|| ch=='A'||ch=='E'||ch=='I'|| ch=='O' || ch=='u' ) {
				cnt=cnt+1;
			}
		}
		System.out.println("no of vowels"+cnt);
//no of words
		int wc=0;
		for( int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch==' ') {
				wc++;
			}
		}
			System.out.println("no of words" +(wc+1));
		
			System.out.println("Reverse sentence");
			for(int i=s.length()-1;i>=0;i--) {
				System.out.print(s.charAt(i));
			}
	     }


	}


