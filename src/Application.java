//Tentei  fazer por herança multipla, mas java não tem o mesmo, fui 
//estudar um pouco sobre interface, mas não entedi muito, então'
//fiz copiando tudo mesmo, mas acho que esse não seja a melhor forma
public class Application {
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		Endereco enderecoAluno = new Endereco();
		aluno.setNome("Guilherme");
		aluno.setCpf("086.057.484-94");
		aluno.setPeriodoEntrada(1);
		aluno.setAnoEntrada(2018);
		enderecoAluno.setRua("Rua Touro");
		enderecoAluno.setCidade("Olinda");
		enderecoAluno.setComplemento("Perto da praça do queijo");
		enderecoAluno.setNumero(20);
		aluno.setEndereco(enderecoAluno);
		System.out.println(aluno.imprimir());
		System.out.println("------------------------------");
		Professor professor = aluno.change();
		aluno = null;
		//professor.setAdmissao(01/03/2018);Como colocar?
		System.out.println(professor.imprimir());
		System.out.println("------------------------------");
		ProfessorAluno professorAluno = professor.evolve();
		professor = null;
		System.out.println(professorAluno.imprimir());
		System.out.println("------------------------------");
	}
}
