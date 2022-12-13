public class Cozinheiro extends Funcionario {
    //Meotodo para criação dos objetos 
    public XBotaFogo xBotaFogo = new XBotaFogo();
    public XBrasileirao xBrasileirao = new XBrasileirao();
    public XCorinthians xCorinthians = new XCorinthians();
    public XFlamengo xFlamengo = new XFlamengo();
    public XPalmeiras xPalmeiras = new XPalmeiras();
    public XSaoPaulo xSaoPaulo = new XSaoPaulo();
    public XVasco xVasco = new XVasco(); 
    //Metodo construtor
    public Cozinheiro(String nome, double salario){
        super(nome, salario, "Cozinheiro(a)");
    }

}
