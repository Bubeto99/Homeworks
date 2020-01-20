import java.security.spec.DSAGenParameterSpec;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static BasePot pot;
    static int numberOfEggs;
    static List<Egg> eggs = new ArrayList<Egg>();

    public static void main() {



        while(true){
            System.out.println("Please enter the number of eggs to be cooked: ");

            numberOfEggs = scanner.nextInt();

            if (numberOfEggs > 10){
                System.out.println("It's going to take 25 minutes for your eggs to boil");
                pot = new HugePot();
            }
            if (numberOfEggs >= 3){
                System.out.println("It's going to take 15 minutes for your eggs to boil");
                pot = new BigPot();
            }
            if (numberOfEggs < 3){
                System.out.println("It's going to take 10 minutes for your eggs to boil");
                pot = new JazzPot();
            }


            getMenu();
        }
    }

    private static void startBoiling(){
        CompletableFuture.runAsync(() -> {pot.startBoiling(numberOfEggs);});
    }

    private static void getMenu() {


        while (true){
            System.out.println();
            System.out.println("1. Start Boiling Eggs");
            System.out.println("2. Check current status of boiling");
            System.out.println("3. Boil more eggs");
            System.out.println("4. Exit");
            var number = scanner.nextInt();

            switch (number){
                case 1:
                    CompletableFuture.runAsync(() -> startBoiling());
                    break;
                case 2:
                    System.out.println(pot.statusOfEggs);
                    break;
                 case 3:
                    main();
                    break;
                case 4:
                    return;
            }
        }
    }

}
