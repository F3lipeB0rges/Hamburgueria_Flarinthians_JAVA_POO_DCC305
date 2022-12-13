public class Gerente extends Funcionario {
    public Flarinthians flarinthians;
    //Metodo de demissão e admissão 
    public void demitirAtendente(int index){
        System.out.println("-- " + this.getNome() + " demitiu a(o) atendente.");
        flarinthians.atendentes.remove(index);
    }
    
    public void demitirCozinheiro(int index){
        System.out.println("-- " + this.getNome() + " demitiu a(o) cozinhero(a).");
        flarinthians.cozinheiros.remove(index);
    }
    
    public void demitirEstoquista(int index){
        System.out.println("-- " + this.getNome() + " demitiu a(o) estoquista.");
        flarinthians.estoquistas.remove(index);
    }
    //Metodo construtor
    public Gerente(String nome, double salario){
        super(nome, salario, "Gerente");
    }

    public Gerente(String nome, double salario, Flarinthians flarinthians){
        super(nome, salario, "Gerente");
        this.flarinthians = flarinthians;
    }

}
