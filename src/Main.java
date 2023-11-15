import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		Curso c = new Curso("Bacharelado em Ciências da Computação", "Integral", "Presencial", "4200h");
		
		Aluno a1 = new Aluno("Gianluca Matos Klaumann", 2023428922, LocalDate.of(2004, 10, 19), c);
		Aluno a2 = new Aluno("Pedro Ryan Coelho Iplinski", 2023004505, LocalDate.of(2005, 01, 05), c);
		Aluno a3 = new Aluno("Pedro Henrique Damann", 2023000007, LocalDate.of(2005, 01, 14), c);
		Aluno a4 = new Aluno("Igor Kammer Grahl", 2023102600, LocalDate.of(2005, 02, 14), c);
		
		Professor prof1 = new Professor("Rodrigo Curvêllo", 19770525, LocalDate.of(1978, 04, 24));
		Professor prof2 = new Professor("Alan Felipe Bepler", 19990921, LocalDate.of(1997, 02, 14));
		
		Avaliacao av1 = new Avaliacao("Diagrama de Classes", "Prova", LocalDate.of(2023, 10, 26), prof1);
		Avaliacao av2 = new Avaliacao("Estruturas de Seleção e Repetição em Java", "Prova", LocalDate.of(2005, 03, 15), prof1);
		
		ArrayList<Professor> profs1 = new ArrayList<Professor>();
		profs1.add(prof1);
		
		ArrayList<Aluno> alunos1 = new ArrayList<Aluno>();
		alunos1.add(a1);
		alunos1.add(a2);
		alunos1.add(a3);
		
		ArrayList<Avaliacao> avaliacoes = new ArrayList<Avaliacao>();
		avaliacoes.add(av1);
		avaliacoes.add(av2);
		
		Disciplina d1 = new Disciplina("Programação Orientada a Objetos I", "60h", profs1, alunos1, avaliacoes);
		
		int[] presencas1 = new int[3];
		presencas1[0] = 4;
		presencas1[1] = 4;
		presencas1[2] = 4;
		
		Frequencia freq1 = new Frequencia(presencas1, LocalDate.of(2023, 10, 26), prof1, d1);
		
		int[] presencas2 = new int[3];
		presencas2[0] = 4;
		presencas2[1] = 3;
		presencas2[2] = 4;
		
		Frequencia freq2 = new Frequencia(presencas2, LocalDate.of(2005, 03, 15), prof1, d1);
		
		ArrayList<Professor> profs2 = new ArrayList<Professor>();
		profs2.add(prof1);
		profs2.add(prof2);
		
		ArrayList<Aluno> alunos2 = new ArrayList<Aluno>();
		alunos2.add(a1);
		alunos2.add(a2);
		alunos2.add(a3);
		alunos2.add(a4);
		
		Disciplina d2 = new Disciplina("História de Star Wars e Naruto", "120h", profs2, alunos2);
		
		Disciplina d3 = new Disciplina("Lógica da Programação", "120h");
		
		ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
		disciplinas.add(d1);
		disciplinas.add(d2);
		
		Fase fase = new Fase(2, "360h", c, disciplinas);
		
		System.out.println(fase);
		System.out.println(freq1);
		System.out.println(freq2);
	}
}