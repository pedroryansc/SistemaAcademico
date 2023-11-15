import java.util.ArrayList;

public class Disciplina {

	private String nome;
	private String cargaHoraria;
	private ArrayList<Professor> professores;
	private ArrayList<Aluno> alunos;
	private ArrayList<Avaliacao> avaliacoes;
	
	public Disciplina(String nome, String cargaHoraria, ArrayList<Professor> professores, ArrayList<Aluno> alunos, ArrayList<Avaliacao> avaliacoes) {
		setNome(nome);
		setCargaHoraria(cargaHoraria);
		setProfessores(professores);
		setAlunos(alunos);
		setAvaliacoes(avaliacoes);
	}
	
	public Disciplina(String nome, String cargaHoraria) {
		setNome(nome);
		setCargaHoraria(cargaHoraria);
	}
	
	public Disciplina(String nome, String cargaHoraria, ArrayList<Professor> professores, ArrayList<Aluno> alunos) {
		setNome(nome);
		setCargaHoraria(cargaHoraria);
		setProfessores(professores);
		setAlunos(alunos);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public ArrayList<Professor> getProfessores() {
		return professores;
	}
	
	public void setProfessores(ArrayList<Professor> professores) {
		this.professores = professores;
	}
	
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}
	
	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	public ArrayList<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}
	
	public void setAvaliacoes(ArrayList<Avaliacao> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Disciplina [nome=");
		builder.append(nome);
		builder.append(", cargaHoraria=");
		builder.append(cargaHoraria);
		builder.append(", professores=");
		builder.append(professores);
		builder.append(", alunos=");
		builder.append(alunos);
		builder.append(", avaliacoes=");
		builder.append(avaliacoes);
		builder.append("]");
		return builder.toString();
	}
}