public class Estoquista extends Funcionario {
    //Criação de objeto para adicionar insumos ao estoque
    
    public Guardador guardador = new Guardador();
    //Metodo Construtor
    public Estoquista(String nome, double salario){
        super(nome, salario, "Estoquista");
    }
}
