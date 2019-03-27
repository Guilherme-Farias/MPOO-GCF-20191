import java.util.Date;

public class ProfessorAluno extends Pessoa {
	private Date admissao;
	private int anoEntrada;
	private int periodoEntrada;

	public Date getAdmissao() {
		return admissao;
	}

	public void setAdmissao(Date admissao) {
		this.admissao = admissao;
	}

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
		String infoProfessorAluno = super.imprimir() + "\nAno de Entrada:" + this.getAnoEntrada() + "\nPeríodo de Entrada:"
				+ this.getPeriodoEntrada() + "\nAdmissão:" + this.getAdmissao() + super.getInformacaoEndereco();
		return infoProfessorAluno;
	}
}
