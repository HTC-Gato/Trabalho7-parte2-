package app;

import java.util.ArrayList;
import modelo.Pessoa;
import modelo.Sexo;
import modelo.Telefone;

public class Principal {
   
	public static void main(String[] args) {
		
		 ArrayList<Pessoa> pessoas = new ArrayList<>();
	        ArrayList<Telefone> telefones = new ArrayList<>();
		

    	
        Pessoa p1 = new Pessoa();
        p1.setNome("João");
        p1.setIdade(23);
        p1.setSexo(Sexo.MASCULINO);
        Telefone t1 = new Telefone();
        t1.setCodigoArea("1a3456");
        t1.setNumero("63 98414-2760");

        Pessoa p2 = new Pessoa();
        p2.setNome("Ana");
        p2.setIdade(42);
        p2.setSexo(Sexo.FEMININO);
        Telefone t2 = new Telefone();
        t2.setCodigoArea("1a385b");
        t2.setNumero("63 984124-7160");
        
        Pessoa p3 = new Pessoa();
        p3.setNome("Amanda");
        p3.setIdade(33);
        p3.setSexo(Sexo.FEMININO);
        Telefone t3 = new Telefone();
        t3.setCodigoArea("2k3h66");
        t3.setNumero("63 98471-5112");
        
        Pessoa p4 = new Pessoa();
        p4.setNome("Maria");
        p4.setIdade(27);
        p4.setSexo(Sexo.FEMININO);
        Telefone t4 = new Telefone();
        t4.setCodigoArea("9ab480");
        t4.setNumero("63 98115-9735");
        
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        pessoas.add(p4);

        telefones.add(t1);
        telefones.add(t2);
        telefones.add(t3);
        telefones.add(t4);

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
 
        
        
        impressao(p1);
        impressao(t1);
        System.out.println();
        impressao(p2);
        impressao(t2);
        System.out.println();
        impressao(p3);
        impressao(t3);
        System.out.println();
        impressao(p4);
        impressao(t4);
        System.out.println();
        
        imprimirLista(pessoas, telefones, Sexo.MASCULINO);
        
        }
     

    private static void imprimirLista(ArrayList<Pessoa> pessoas, ArrayList<Telefone> telefones, Sexo masculino) {
		// TODO Auto-generated method stub
		
	}


	public static void impressao(Pessoa pessoa) {
        pessoa.imprimir();
    }
    public static void impressao(Telefone telefone) {
        telefone.imprimir();
    }
}

// Nota: não consegui colocar o filtro de sexo, simplismente não funcionava e não sei porque, na proxima aula por favor mostre em sala como se faz
