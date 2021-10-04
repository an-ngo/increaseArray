import java.util.Scanner;

public class increaseString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder s1 = new StringBuilder("" + s.charAt(0));
        for (int i = 0; i < s.length()-1; i++) {
            if(s.codePointAt(i)<s.codePointAt(i+1)){
                s1.append(s.charAt(i+1));
            }
        }
        System.out.println(s1);
    }
}
