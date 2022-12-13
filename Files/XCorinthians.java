public class XCorinthians extends Estocavel{
     //Metodo construtor
    public XCorinthians(){
        super("X-Corinthians", 25.00);
    }
    //Checar se há insumos o suficiente para o preparo do hamburguer
    @Override
    public void checarEstoque() throws EstoqueInsuficienteException{
        super.checarEstoque(super.getNome(), super.getPao(), super.getQueijo(), super.getCarne(), super.getBacon(), super.getCebola());
    }
    //Decremento dos insumos utilizados no hamburguer
    @Override
    public void retirar(){
        try {
            
            this.checarEstoque();

            super.setPao(super.getPao()-1);
            super.setQueijo(super.getQueijo()-1);
            super.setCarne(super.getCarne()-1);
            super.setBacon(super.getBacon()-1);
            super.setCebola(super.getCebola()-1);

        } catch (EstoqueInsuficienteException e) {



        }
    }
}
