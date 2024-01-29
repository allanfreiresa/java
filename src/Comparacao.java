import java.util.Scanner;

public class Comparacao {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Favor digitar primeiro numero ");
        int numero1 = leitura.nextInt();

        System.out.println("Favor digitar segundo numero ");
        int numero2 = leitura.nextInt();

        if (numero1 == numero2) {
            System.out.println("Numeros iguais");
        } else if (numero1 > numero2) {
            System.out.println("Primeiro numero é maior");
        } else {
            System.out.println("Segundo numero é maior");
        }
    }
}
