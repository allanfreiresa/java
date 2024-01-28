import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Esse é o Screen Match");
        System.out.printf("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println(media);
        String sinopse;
        sinopse = "Filme de aventura com Galã dos anos 80";
        System.out.println(sinopse);

        String sinopse2;
        sinopse2 = """
                    Filme de aventura 
                    com Galã dos anos 80 
                    Ano de lancamento 
                    """ + anoDeLancamento;
        System.out.println(sinopse2);

        int classificacao;
        classificacao = (int) media/2;
        System.out.println(classificacao);



        String senha = "12345";
        if (senha.equals("12345")) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Senha incorreta.");
        }

        String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));


        String nome1 = "João";
        int aulas = 4;

        String mensagem = """
                  Olá, %s!
                  Boas vindas ao curso de Java.
                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                  """.formatted(nome1, aulas);

        System.out.println(mensagem);


//        int valor =  10;
  //      valor += 15;  //Equivalente a valor = valor + 15, atribui o valor 25 à variável valor

        /*int a = 10 + 5; // Atribui o valor 15 à variável a
        int b = 10 - 5; // Atribui o valor 5 à variável b
        int c = 10 * 5; // Atribui o valor 50 à variável c
        int d = 10 / 5; // Atribui o valor 2 à variável d
        int e = 10 % 3; // Atribui o valor 1 à variável e (o resto da divisão de 10 por 3 é 1)
*/
    /*    int a = 10; // Atribui o valor 10 à variável a
        int b = 5; // Atribui o valor 5 à variável b
        int c = 30; // Atribui o valor 30 à variável c



        boolean igual = (b == a); //Nesse caso a variável igual ficará com o valor *false*, pois o valor de b não é igual o valor de a.
        boolean diferente = (b != c); //A variável diferente ficará com o valor *true*, pois o valor de b é diferente do valor de c.
        boolean maior = (b > a); //A variável maior ficará com o valor *false*, pois o valor de b é menor que o valor de a.
        boolean menorIgual = (b <= c); //A variável menorIgual ficará com o valor *true*, pois o valor de b é menor que o valor de c.

        boolean ab = true;
        boolean bb = false;
        if (ab && bb) {
            // Este código não será executado, já que a é verdadeiro e b é falso.
        }

        boolean ac = true;
        boolean bc = false;
        if (ac || bc) {
            // Este código será executado, já que a é verdadeiro, mesmo que b seja falso.
        }

        boolean aii = true;
        if (!aii) {
            // Este código não será executado, já que a é verdadeiro.
        }

        int num = 5;
        int resultado1 = ++num; //num é incrementado para 6 e depois atribuído a resultado
        System.out.println(num); // imprime 6
        System.out.println(resultado1); // imprime 6

        int nume = 5;
        int resultado = nume++; //num é atribuído primeiramente à variável resultado e depois incrementado para 6
        System.out.println(nume); // imprime 5
        System.out.println(resultado); // imprime 6
*/


        /*for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }*/
    }
}

