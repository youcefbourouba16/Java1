import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        System.out.println(reverse(a));
    }
    public static int reverse(int x) {


        String s= String.valueOf(x);
        StringBuilder s1= new StringBuilder(s);
        String output="";

        if (s.charAt(0)=='-') {
            s1.deleteCharAt(0);
            for (int i = s1.length()-1; i >= 0; i--) {
                output+=s1.charAt(i);
            }
            if (output.length()>9) return 0;
            output="-"+output;
        }else{
            for (int i = s1.length()-1; i >= 0; i--) {
                output+=s1.charAt(i);
            }
        }

        try {
            x=Integer.parseInt(output);
            return x;
        }
        catch (Exception e) {
            return 0;
        }


    }
}