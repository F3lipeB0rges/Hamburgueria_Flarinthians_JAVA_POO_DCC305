public class MolhoMundial extends Estocavel{
     //Metodo construtor
    public MolhoMundial(){
        super("Molho Libertadores", 0.00);
    }
    //Checar se há insumos o suficiente para o preparo do molho
    @Override
    public void checarEstoque() throws EstoqueInsuficienteException{
        super.checarEstoque(super.getNome(), super.getAlho());
    }
    //Decremento dos insumos utilizados no molho
    @Override
    public void retirar(){
        try {
            
            this.checarEstoque();

            super.setAlho(super.getAlho()-1);

        } catch (EstoqueInsuficienteException e) {



        }
    }
}
