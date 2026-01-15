public class Principal {
    public static void main(String[] args) {
        filme meuFilme = new filme();
        meuFilme.nome = "No limide do amanhã";
        meuFilme.anoDeLancamento = 2014;
        meuFilme.duracaoEmMinutos = 160;
        meuFilme.incluidoNoPlano = true;



        meuFilme.ExibeFichaTecnica();
        meuFilme.Avalia(8);
        meuFilme.Avalia(9);
        meuFilme.Avalia(10);
        System.out.println(meuFilme.SomaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.Pegamedia());



    }
}
