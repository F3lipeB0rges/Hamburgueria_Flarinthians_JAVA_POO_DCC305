public class GuaranaAntartica extends Estocavel{
     //Metodo construtor
    public GuaranaAntartica(){
        super("Refrigerante Coca-Cola", 5.00);
    }
    //Checar se há insumos o suficiente para o preparo do refrigerante
    @Override
    public void checarEstoque() throws EstoqueInsuficienteException{
        super.checarEstoque(super.getNome(), super.getGuaranaAntartica());
    }
    //Decremento dos insumos utilizados no refrigerante
    @Override
    public void retirar(){
        try {
            
            this.checarEstoque();

            super.setGuaranaAntartica(super.getGuaranaAntartica()-1);

        } catch (EstoqueInsuficienteException e) {



        }
    }

}
