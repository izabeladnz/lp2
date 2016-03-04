public class Aluno {

	String nome;
	String numeroMatricula;
	int idade;

	public void imprimirDadosCadastrais(){
	
		System.out.println("Nome: " +this.nome);
		System.out.println("Idade: " +this.idade);
		System.out.println("Numero Matricula: " +this.numeroMatricula);
			
	}
	public static void main (String [] args){
	Aluno estudante1 = new Aluno();
	Aluno estudante2 = new Aluno();
	Aluno estudante3 = new Aluno();
	Aluno estudante4 = new Aluno();	


	estudante1.nome = "Izabela";
	estudante1.idade = 16;
	estudante1.numeroMatricula = "201418110116";
	
	estudante1.imprimirDadosCadastrais();


	estudante2.nome = "Larissa R.";
	estudante2.idade = 18;
	estudante2.numeroMatricula = "201418110140";
	
	estudante2.imprimirDadosCadastrais();

	
	estudante3.nome = "Bruna";
	estudante3.idade = 17;
	estudante3.numeroMatricula = "201418110035";
	
	estudante3.imprimirDadosCadastrais();
	
	
	estudante4.nome = "Mario";
	estudante4.idade = 17;
	estudante4.numeroMatricula = "201418110175";
	
	estudante4.imprimirDadosCadastrais();


	}

}
