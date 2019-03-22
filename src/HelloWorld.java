public class HelloWorld {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void imprimir() {
		Data data = new Data();
		System.out.println(data.pegaHorario() + " - Olá " + this.nome
				+ ". Você acabou de fazer seu primeiro Hello World em Java. Parabéns.");
	}
}