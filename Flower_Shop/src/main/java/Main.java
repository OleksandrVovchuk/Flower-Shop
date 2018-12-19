import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Shop_Manager manager = new Shop_Manager();
        Scanner reader = new Scanner(System.in);
        System.out.println("Welcome to our flower Shop");
        System.out.println("If you to want to buy default bucket press - 1, if you want to make your own press - 2");
        int n = reader.nextInt();
        if (n == 1){
            manager.Choose_def_bucket();
        }
        if (n == 2){

        }

    }
}
