public class SucoDeLaranja extends Estocavel{
     //Metodo construtor
    public SucoDeLaranja(){
        super("Suco de Laranja", 4.00);
    }
    //Checar se há insumos o suficiente para o preparo do suco
    @Override
    public void checarEstoque() throws EstoqueInsuficienteException{
        super.checarEstoque(super.getNome(), super.getSucoDeLaranja());
    }
    //Decremento dos insumos utilizados no suco
    @Override
    public void retirar(){
        try {
            
            this.checarEstoque();

            super.setSucoDeLaranja(super.getSucoDeLaranja()-1);

        } catch (EstoqueInsuficienteException e) {



        }
    }

}
