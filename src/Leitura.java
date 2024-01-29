import java.sql.SQLOutput;
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();
        System.out.println("Qual o ano de lançamento?");
        int anoDelancamento = leitura.nextInt();
        System.out.println("Diga sua avaliação para o filme ");
        double avalicao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDelancamento);
        System.out.println(avalicao);

    }
}
