
public class Pessoa {
	private String nome;
	private String cpf;
	private Endereco endereco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public String getInformacaoEndereco(){
		String infoEndereco = "\nRua:" + this.getEndereco().getRua() + "\nCidade:" + this.getEndereco().getCidade() + "\nNúmero:" + this.getEndereco().getNumero() + "\nComplemento:" + this.getEndereco().getComplemento();
		return infoEndereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public String imprimir(){
		String infoPessoal = "Nome:" + this.getNome() + "\nCPF:" +  this.getCpf();
		return infoPessoal;
	}
	
	
}
