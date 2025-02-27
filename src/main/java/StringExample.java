import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        System.out.println("select from menu:");
        System.out.println("1.convert to sentence case");
        Scanner scanner=new Scanner(System.in);
        System.out.println(toSentenceCase(scanner.nextLine()));
    }
    public static String toSentenceCase(String inp){
        return inp.substring(0,1).toUpperCase()+inp.substring(1).toLowerCase();
    }
}
