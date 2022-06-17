import java.util.Scanner;

public class file {

    public static String swap(String mystring){
        if (mystring.length() < 2){
            return mystring;
        }
        char[] ch = mystring.toCharArray();
        char temp = ch[0];
        ch[0] = ch[ch.length - 1];
        ch[ch.length - 1] = temp;
        return String.valueOf(ch);
    }
    public static void main(String[] args) {
        String mystring;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string: ");
        mystring = in.nextLine();
        System.out.println(swap(mystring)); 
    }
}