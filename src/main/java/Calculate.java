import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        System.out.println("select calculate type:");
        System.out.println("1. plus");
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        if(input.equals("1")){
            System.out.println("enter two number:");
            input=scanner.nextLine();
            System.out.println(plus(Float.valueOf(input.split("\\+")[0]),Float.valueOf(input.split("\\+")[1])));

        }


    }
    public static Float plus(float a, float b){
        return a+b;
    }
}
