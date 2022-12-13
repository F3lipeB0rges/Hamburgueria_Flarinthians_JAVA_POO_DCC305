public class MolhoLibertadores extends Estocavel{
     //Metodo construtor
    public MolhoLibertadores(){
        super("Molho Libertadores", 0.00);
    }
    //Checar se há insumos o suficiente para o preparo do molho
    @Override
    public void checarEstoque() throws EstoqueInsuficienteException{
        super.checarEstoque(super.getNome(), super.getBarbecue());
    }
    //Decremento dos insumos utilizados no molho
    @Override
    public void retirar(){
        try {
            
            this.checarEstoque();

            super.setBarbecue(super.getBarbecue()-1);

        } catch (EstoqueInsuficienteException e) {



        }
    }
}
