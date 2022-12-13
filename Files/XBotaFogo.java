public class XBotaFogo extends Estocavel{
     //Metodo construtor
    public XBotaFogo(){
        super("X-Bota Fogo", 15.00);
    }
    //Checar se há insumos o suficiente para o preparo do hamburguer
    @Override
    public void checarEstoque() throws EstoqueInsuficienteException{
        super.checarEstoque(super.getNome(), super.getPao(), super.getQueijo(), super.getCarne());
    }
    //Decremento dos insumos utilizados no hamburguer
    @Override
    public void retirar(){
        try {
            
            this.checarEstoque();

            super.setPao(super.getPao()-1);
            super.setQueijo(super.getQueijo()-1);
            super.setCarne(super.getCarne()-1);

        } catch (EstoqueInsuficienteException e) {



        }
    }
}
