import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        int numerButa;

        System.out.println("Podaj numer buta:");
        numerButa = klawiatura.nextInt();
        klawiatura.nextLine();

        System.out.println("Podaj średnią z programowania: ");
        double average = klawiatura.nextDouble();
        klawiatura.nextLine();

        System.out.println("Podaj imię: ");
        String name = klawiatura.nextLine();


        System.out.println("Twój numer buta: " + numerButa +
                ", średnia: " + average + ", imię: " + name);


    }
}
