//Importar pacotes para usar as classes "FileReader" e "BufferReader" e criação de listas
import java.io.*;  
import java.util.ArrayList;

public class LerTxt {

  public ArrayList<String> ler(String txt) {
    //Transforma o arquivo txt em um objeto
    File file = new File("D:/Workspace/Main/Doc/Faculdade/Semestres/5° Semestre - 2022.2/Programação Orientada a Objeto/Trabalhos/Projeto Final - Hamburgueria Flarinthians/db/" + txt + ".txt");

    try {

      // Cria um FileReader para ler o arquivo
      FileReader reader = new FileReader(file);
      BufferedReader buffer = new BufferedReader(reader);

      String str;
      ArrayList<String> values =  new ArrayList<String>();

      while ((str = buffer.readLine()) != null) { values.add(str); }
      
      // Fecha o reader
      reader.close();

      return values;

    } catch (IOException e) {

      // Imprime a mensagem de erro se houver algum problema ao ler o arquivo
      System.out.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());

    }

    return new ArrayList<String>();
  }

  public void lerInsumos(Flarinthians empresaFlarinthians){
    //Cria lista com os insumos do estoque
    ArrayList<String> insumos = this.ler("insumos");

    empresaFlarinthians.guardador.setPao(Integer.parseInt(insumos.get(0)));
    empresaFlarinthians.guardador.setBacon(Integer.parseInt(insumos.get(1)));
    empresaFlarinthians.guardador.setCarne(Integer.parseInt(insumos.get(2)));
    empresaFlarinthians.guardador.setOvo(Integer.parseInt(insumos.get(3)));
    empresaFlarinthians.guardador.setQueijo(Integer.parseInt(insumos.get(4)));
    empresaFlarinthians.guardador.setAlface(Integer.parseInt(insumos.get(5)));
    empresaFlarinthians.guardador.setCebola(Integer.parseInt(insumos.get(6)));
    empresaFlarinthians.guardador.setTomate(Integer.parseInt(insumos.get(7)));
    empresaFlarinthians.guardador.setAlho(Integer.parseInt(insumos.get(8)));
    empresaFlarinthians.guardador.setBarbecue(Integer.parseInt(insumos.get(9)));
    empresaFlarinthians.guardador.setCheddar(Integer.parseInt(insumos.get(10)));
    empresaFlarinthians.guardador.setCocaCola(Integer.parseInt(insumos.get(11)));
    empresaFlarinthians.guardador.setGuaranaAntartica(Integer.parseInt(insumos.get(12)));
    empresaFlarinthians.guardador.setSucoDeLaranja(Integer.parseInt(insumos.get(13)));
  
  }

  public void lerFuncionarios(Flarinthians empresaFlarinthians){
    //Criar lista com os funcionarios cadastrados na empresa
    ArrayList<String> funcionarios = this.ler("funcionarios");
    //Laço de criação da lista com atributos dos funcionarios 
    for(int i = 0; i<funcionarios.size()-2; i=i+3){

      if(funcionarios.get(i).equals("Gerente")){

        empresaFlarinthians.gerentes.add(new Gerente(funcionarios.get(i+1), Double.parseDouble(funcionarios.get(i+2)), empresaFlarinthians));
        
      }else if(funcionarios.get(i).equals("Cozinheiro(a)")){

        empresaFlarinthians.cozinheiros.add(new Cozinheiro(funcionarios.get(i+1), Double.parseDouble(funcionarios.get(i+2))));
        
      }else if(funcionarios.get(i).equals("Estoquista")){
        
        empresaFlarinthians.estoquistas.add(new Estoquista(funcionarios.get(i+1), Double.parseDouble(funcionarios.get(i+2))));
        
      }else if(funcionarios.get(i).equals("Atendente")){

        empresaFlarinthians.atendentes.add(new Atendente(funcionarios.get(i+1), Double.parseDouble(funcionarios.get(i+2))));
      
      }

    }
    
  }


  public void emitirRelatorio(){
    Flarinthians f = new Flarinthians();

    lerInsumos(f);
    lerFuncionarios(f);

    System.out.println("Quatidade de Pão: " + f.guardador.getPao());
    System.out.println("Quatidade de Bacon: " + f.guardador.getBacon());
    System.out.println("Quatidade de Carne: " + f.guardador.getCarne());
    System.out.println("Quatidade de Ovo: " + f.guardador.getOvo());
    System.out.println("Quatidade de Queijo: " + f.guardador.getQueijo());
    System.out.println("Quatidade de Alface: " + f.guardador.getAlface());
    System.out.println("Quatidade de Cebola: " + f.guardador.getCebola());
    System.out.println("Quatidade de Tomate: " + f.guardador.getTomate());
    System.out.println("Quatidade de Alho: " + f.guardador.getAlho());
    System.out.println("Quatidade de Barbecue: " + f.guardador.getBarbecue());
    System.out.println("Quatidade de Cheddar: " + f.guardador.getCheddar());
    System.out.println("Quatidade de CocaCola: " + f.guardador.getCocaCola());
    System.out.println("Quatidade de GuaranaAntartica: " + f.guardador.getGuaranaAntartica());
    System.out.println("Quatidade de SucoDeLaranja: " + f.guardador.getSucoDeLaranja());

    for(int i = 0; i < f.gerentes.size(); i++){
      System.out.println("Gerente: " + f.gerentes.get(i).getNome() + ", recebe R$" + f.gerentes.get(i).getSalario());
    }

    for(int i = 0; i < f.cozinheiros.size(); i++){
      System.out.println("Cozinheiro(a): " + f.cozinheiros.get(i).getNome() + ", recebe R$" + f.cozinheiros.get(i).getSalario());
    }

    for(int i = 0; i < f.estoquistas.size(); i++){
      System.out.println("Estoquista: " + f.estoquistas.get(i).getNome() + ", recebe R$" + f.estoquistas.get(i).getSalario());
    }

    for(int i = 0; i < f.atendentes.size(); i++){
      System.out.println("Atendente: " + f.atendentes.get(i).getNome() + ", recebe R$" + f.atendentes.get(i).getSalario());
    }
  }

}
