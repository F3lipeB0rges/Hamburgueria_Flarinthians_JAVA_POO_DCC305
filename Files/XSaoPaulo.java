public class XSaoPaulo extends Estocavel{
     //Metodo construtor
    public XSaoPaulo(){
        super("X-São Paulo", 22.00);
    }
    //Checar se há insumos o suficiente para o preparo do hamburguer
    @Override
    public void checarEstoque() throws EstoqueInsuficienteException{
        super.checarEstoque(super.getNome(), super.getPao(), super.getQueijo(), super.getCebola(), super.getTomate(), super.getAlface());
    }
    //Decremento dos insumos utilizados no hamburguer
    @Override
    public void retirar(){
        try {
            
            this.checarEstoque();

            super.setPao(super.getPao()-1);
            super.setQueijo(super.getQueijo()-1);
            super.setCebola(super.getCebola()-1);
            super.setTomate(super.getTomate()-1);
            super.setAlface(super.getAlface()-1);

        } catch (EstoqueInsuficienteException e) {



        }
    }
}
