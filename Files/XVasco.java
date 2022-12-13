public class XVasco extends Estocavel{
     //Metodo construtor
    public XVasco(){
        super("X-Vasco", 20.00);
    }
    //Checar se há insumos o suficiente para o preparo do hamburguer
    @Override
    public void checarEstoque() throws EstoqueInsuficienteException{
        super.checarEstoque(super.getNome(), super.getPao(), super.getQueijo(), super.getCarne(), super.getTomate(), super.getOvo());
    }
    //Decremento dos insumos utilizados no hamburguer
    @Override
    public void retirar(){
        try {
            
            this.checarEstoque();

            super.setPao(super.getPao()-1);
            super.setQueijo(super.getQueijo()-1);
            super.setCarne(super.getCarne()-1);
            super.setTomate(super.getTomate()-1);
            super.setOvo(super.getOvo()-1);

        } catch (EstoqueInsuficienteException e) {



        }
    }
}
