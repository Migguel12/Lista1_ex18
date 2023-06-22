import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    Scanner ler = new Scanner(System.in);

    System.out.print("Informe o tamanho do arquivo em MB: ");
    int arquivo = ler.nextInt();
    System.out.println("");

    System.out.print("Informe a velocidade da sua conexão: ");
    int internet = ler.nextInt();
    System.out.println("");

    int tempo = arquivo/internet;
    int tempoMinutos = tempo / 60;
    int restoMinutos = tempo % 60;


    System.out.printf("O tempo aproximado para o dowload é de %d minutos e %d segundos",tempoMinutos,restoMinutos);
    }
}
