package myPlayGround;

public class LengthofLastWord {
	public static void main(String[] args) {
		
		String str1="luffy is still joyboy";	
		String[] split1 = str1.split(" ");	
		int length1 = split1[split1.length-1].length();
		System.out.println("Length of last word is "+length1);
		
		String str2="Hello World";
		String[] split2 = str2.split(" ");
		int length2 = split2[split2.length-1].length();
		System.out.println("Length of last word is "+length2);
		
		String str3="fly me   to   the moon  ";
		String[] split3 = str3.split(" ");
		int length3= split3[split3.length-1].length();
		System.out.println("Length of last word is "+length3);
		
		}

}
