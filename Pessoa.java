package modelo;

public class Pessoa {

	    private String nome;
	    private int idade;
	    private Sexo sexo;

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public void setIdade(int idade) {
	        this.idade = idade;
	    }

	    public void setSexo(Sexo sexo) {
	        this.sexo = sexo;
	    }

	    public void imprimir() {
	        System.out.println("Nome: " + nome);
	        System.out.println("idade: " + idade);
	        System.out.println("Sexo: " + sexo);
	    }

		public Sexo getSexo() {
			// TODO Auto-generated method stub
			return null;
			
			
		}

	
		}
	
