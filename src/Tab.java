import java.util.Scanner;

public class Tab {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("ile liczb chcesz wprowadzić?");
        int number = scanner.nextInt();
        Tab tab[] = new Tab[number];
        for (int i = 0; i<tab.length; i++) {
            System.out.println("wprowadz liczbę");
            double a = scanner.nextDouble();
            scanner.nextLine();
            scanner.close();
        }
        for (int i=0; i<tab.length; i++){
            tab[i] = a;
        }

    }
}
