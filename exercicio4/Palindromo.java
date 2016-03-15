//Aluna: Izabela Diniz Pagani
public class Palindromo {

  public static void main(String[] args){
    
    boolean bool = false;
    String texto = args[0];
    String teste = "";
		int i;
    int tam = 5;
    int size = texto.length();
    int qtdTeste = size-tam;
		String reverso;
		
    for(i=0; i<=qtdTeste; i++){

      teste = texto.substring(i,i + tam);
        
      StringBuffer txtrever = new StringBuffer(teste);
      txtrever.reverse();
			reverso = txtrever.toString();

      if (teste.equals(reverso)) {
        System.out.println("Palíndromo: " + teste);
				System.out.println("Posição: (" + (i+1) + "," + (i + tam) + ")");
        bool = true;
				System.exit(0);
      }
		}	

    if (bool == false) {
      System.out.println("Não há nenhum palíndromo!");
    }
    
  }
}
