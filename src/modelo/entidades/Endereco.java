package modelo.entidades;

public class Endereco {
	
	private String tipo;
	private String endereco;
	private String numero;
	private String complemento;
	private String bairro;
	private String cep;
	private Cidade cidade; 
	private Uf uf;
	
	
	public Endereco() {
	
	}
	
	
	public Endereco(String tipo, String endereco, String numero, String complemento, String bairro, String cep,
			Cidade cidade, Uf uf) {
		this.tipo = tipo;
		this.endereco = endereco;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.uf = uf;
	}
	
	
	
	
}
