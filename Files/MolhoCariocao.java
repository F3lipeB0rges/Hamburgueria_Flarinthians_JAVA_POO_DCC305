public class MolhoCariocao extends Estocavel{
    //Metodo construtor
    public MolhoCariocao(){
        super("Molho Libertadores", 0.00);
    }
    //Checar se há insumos o suficiente para o preparo do molho
    @Override
    public void checarEstoque() throws EstoqueInsuficienteException{
        super.checarEstoque(super.getNome(), super.getCheddar());
    }    
    //Decremento dos insumos utilizados no molho
    @Override
    public void retirar(){
        try {
            
            this.checarEstoque();

            super.setCheddar(super.getCheddar()-1);

        } catch (EstoqueInsuficienteException e) {



        }
    }
}
