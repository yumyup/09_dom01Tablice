import java.util.Scanner;

public class Tab {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("ile liczb chcesz wprowadzić?");
        int number = scanner.nextInt();
        Double tab[] = new Double[number];
        for (int i = 0; i < tab.length; i++) {
            System.out.println("wprowadz liczbę");
            double a = scanner.nextDouble();
            scanner.nextLine();
            tab[i] = a;
            double sum = a + a;
        }
        scanner.close();
        System.out.println(sum);
    }
}




