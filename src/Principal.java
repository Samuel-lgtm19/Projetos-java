public class Principal {
    public static void main(String[] args) {
        filme meuFilme = new filme();
        meuFilme.nome = "No limide do amanhã";
        meuFilme.anoDeLancamento = 2014;
        meuFilme.incluidoNoPlano = true;



        meuFilme.ExibeFichaTecnica();
        meuFilme.Avalia(8);
        meuFilme.Avalia(9);
        meuFilme.Avalia(10);
        System.out.println();
        System.out.println(meuFilme.totalDeAvaliacoes);



    }
}
