public class filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    privatedouble SomaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void ExibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de estreia: " + anoDeLancamento);
    }
    void Avalia(double nota){
        SomaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
    double Pegamedia(){
        return SomaDasAvaliacoes / totalDeAvaliacoes;

    }
}
