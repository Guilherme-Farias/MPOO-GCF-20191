
public class Aluno extends Pessoa {
	private int anoEntrada;
	private int periodoEntrada;

	public int getAnoEntrada() {
		return anoEntrada;
	}

	public void setAnoEntrada(int anoEntrada) {
		this.anoEntrada = anoEntrada;
	}

	public int getPeriodoEntrada() {
		return periodoEntrada;
	}

	public void setPeriodoEntrada(int periodoEntrada) {
		this.periodoEntrada = periodoEntrada;
	}

	public String imprimir() {
		String infoAluno = super.imprimir() + "\nAno de Entrada:" + this.getAnoEntrada() + "\nPeríodo de Entrada:"
				+ this.getPeriodoEntrada() + super.getInformacaoEndereco();
		return infoAluno;
	}
	
	public Professor change() {
		Professor professor = new Professor();
		professor.setNome(this.getNome());
		professor.setCpf(this.getCpf());
		professor.setEndereco(this.getEndereco());
		return professor;
	}
	
	public ProfessorAluno evolve() {
		ProfessorAluno professorAluno = new ProfessorAluno();
		professorAluno.setNome(this.getNome());
		professorAluno.setCpf(this.getCpf());
		professorAluno.setAnoEntrada(this.getAnoEntrada());
		professorAluno.setPeriodoEntrada(this.getPeriodoEntrada());
		return professorAluno;
	}
}
