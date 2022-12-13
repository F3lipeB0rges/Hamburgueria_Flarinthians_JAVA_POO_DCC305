public class CocaCola extends Estocavel{
     //Metodo construtor
    public CocaCola(){
        super("Refrigerante Coca-Cola", 5.00);
    }
    //Checar se há insumos o suficiente para o preparo do refrigente
    @Override
    public void checarEstoque() throws EstoqueInsuficienteException{
        super.checarEstoque(super.getNome(), super.getCocaCola());
    }
    //Decremento dos insumos utilizados no refrigerante
    @Override
    public void retirar(){
        try {
            
            this.checarEstoque();

            super.setCocaCola(super.getCocaCola()-1);

        } catch (EstoqueInsuficienteException e) {



        }
    }

}
