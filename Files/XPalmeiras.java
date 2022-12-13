public class XPalmeiras extends Estocavel{
    //Metodo construtor
    public XPalmeiras(){
        super("X-Palmeiras", 35.00);
    }
    //Checar se há insumos o suficiente para o preparo do hamburguer
    @Override
    public void checarEstoque() throws EstoqueInsuficienteException{
        super.checarEstoque(super.getNome(), super.getPao(), super.getQueijo(), super.getBacon());
    }
    //Decremento dos insumos utilizados no hamburguer
    @Override
    public void retirar(){
        try {
            
            this.checarEstoque();

            super.setPao(super.getPao()-1);
            super.setQueijo(super.getQueijo()-1);
            super.setBacon(super.getBacon()-1);

        } catch (EstoqueInsuficienteException e) {



        }
    }
}