import java.util.Date;

public class Professor extends Pessoa {
	private Date admissao;

	public Date getAdmissao() {
		return admissao;
	}

	public void setAdmissao(Date admissao) {
		this.admissao = admissao;
	}

	public String imprimir() {
		String infoProfessor = super.imprimir() + "\nAdmissão:" + this.getAdmissao() + super.getInformacaoEndereco();
		return infoProfessor;
	}
	public Aluno change() {
		Aluno aluno = new Aluno();
		aluno.setNome(this.getNome());
		aluno.setCpf(this.getCpf());
		aluno.setEndereco(this.getEndereco());
		return aluno;
	}
	public ProfessorAluno evolve() {
		ProfessorAluno professorAluno = new ProfessorAluno();
		professorAluno.setNome(this.getNome());
		professorAluno.setCpf(this.getCpf());
		professorAluno.setEndereco(this.getEndereco());
		//professorAluno.setAdmissao(null);
		return professorAluno;
	}
}
