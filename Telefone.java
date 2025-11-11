package modelo;

public class Telefone {
	
	private String codigoArea;
    private String numero;
	public String getCodigoArea() {
		return codigoArea;
	}
	public void setCodigoArea(String codigoArea) {
		this.codigoArea = codigoArea;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
    
	 public void imprimir() {
	        System.out.println("Codigo Area:" + codigoArea);
	        System.out.println("Numero:" + numero);
   }
}
