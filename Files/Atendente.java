public class Atendente extends Funcionario {
    //Criação dos objetos
    public MolhoCariocao molhoCariocao =  new MolhoCariocao();
    public MolhoLibertadores molhoLibertadores = new MolhoLibertadores();
    public MolhoMundial molhoMundial = new MolhoMundial();

    public SucoDeLaranja sucoDeLaranja = new SucoDeLaranja();
    public CocaCola cocaCola = new CocaCola();
    public GuaranaAntartica guaranaAntartica = new GuaranaAntartica();

    //  Metodo construtor
    public Atendente(String nome, double salario){
        super(nome, salario, "Atendente");
    }

}