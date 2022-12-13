public class EstoqueInsuficienteException extends Exception{
    //exceção
    public EstoqueInsuficienteException(String produto){
        super(": Infelizmente não temos " + produto + " no estoque");
    }
}
