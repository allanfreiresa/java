import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Favor digitar um numero ");
        int numero = leitura.nextInt();

        if (numero < 0) {
            System.out.println("Numero " + numero + " é negativo");
        } else {
            System.out.println("Numero " + numero + " é positivo");
        }

    }
}
