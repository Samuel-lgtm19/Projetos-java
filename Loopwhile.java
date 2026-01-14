import java.util.Scanner;

public class Loopwhile {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double MediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota !=-1) {
            System.out.println("Diga sua avaliação do filme ou -1 para encerrar! ");
            nota = leitura.nextDouble();

            if (nota != -1){
                MediaAvaliacao += nota;
                totalDeNotas++;
            }
        }

        System.out.println("Media de Avaliações " + MediaAvaliacao / totalDeNotas);
    }
}
