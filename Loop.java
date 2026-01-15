import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double Mediaavaliacao = 0;
        double nota = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua avaliação do filme: ");
            nota = leitura.nextDouble();
            Mediaavaliacao += nota;
        }

        System.out.println("Media de Avaliações " + Mediaavaliacao /3);


        }
    }

