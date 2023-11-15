import java.time.LocalDate;
import java.util.Arrays;

public class Frequencia {

	private int[] presencas;
	private LocalDate data;
	private Professor professor;
	private Disciplina disciplina;
	
	public Frequencia(int[] presencas, LocalDate data, Professor professor, Disciplina disciplina) {
		setPresencas(presencas, disciplina);
		setData(data);
		setProfessor(professor);
		setDisciplina(disciplina);
	}

	public int[] getPresencas() {
		return presencas;
	}

	public void setPresencas(int[] presencas, Disciplina disciplina) {
		if(presencas.length == disciplina.getAlunos().size())
			this.presencas = presencas;
		else
			System.out.println("Erro: Quantidade de frequências diferente da quantidade de alunos.");
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public Disciplina getDisciplina() {
		return disciplina;
	}
	
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Frequencia [presencas=");
		builder.append(Arrays.toString(presencas));
		builder.append(", data=");
		builder.append(data);
		builder.append(", professor=");
		builder.append(professor);
		builder.append(", disciplina=");
		builder.append(disciplina);
		builder.append("]");
		return builder.toString();
	}
}