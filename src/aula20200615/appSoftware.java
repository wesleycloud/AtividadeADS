package aula20200615;

public class appSoftware {

	public static void main(String[] args) {

		Endereco end1Wesley = new Endereco("Avenida Mutirama", 548, "Apto", "Pedro Ludovico", "Goi�nia", "Goi�s", true);
		Endereco end2Wesley = new Endereco("Av Quarta Radial", 121, "casa", "Jardim America", "Goi�nia", "Goi�s", false);
		Alunos alunoWesley = new Alunos(1);
		alunoWesley.setNome("Wesley");
		alunoWesley.setSobrenome("Rezende");
		alunoWesley.setDataNacimento("30/01/1990");
		alunoWesley.addEndereco(end1Wesley);
		alunoWesley.addEndereco(end2Wesley);

		Endereco endJoao = new Endereco("R. Rosana", 398, "casa", "Sol nascente", "Goi�nia", "Goi�s", true);
		Avalistas AvalistaMarcelo = new Avalistas(1);
		AvalistaMarcelo.setNome("Lucas");
		AvalistaMarcelo.setSobrenome("Figone");
		AvalistaMarcelo.setDataNacimento("05/10/1989");
		AvalistaMarcelo.addEndereco(endJoao);

		ContratoEducacional c1 = new ContratoEducacional(1, AvalistaMarcelo, alunoWesley);
		alunoWesley.addContrato(c1);

		
		System.out.println("Esta matriculado? " + alunoWesley.statusAlunos());

		Endereco end1Luis = new Endereco("Av Maranh�o", 498, "Casa", "Bueno ", "Goi�nia", "Goi�s", true);
		Endereco end2Luis = new Endereco("R. Centro", 198, "casa", "Marista", "Goi�nia", "Goi�s", false);
		Coordenadores coordLuis = new Coordenadores(1);
		coordLuis.setNome("Matheus");
		coordLuis.setSobrenome("Nascimento");
		coordLuis.setDataNacimento("30/05/1988");
		coordLuis.addEndereco(end1Luis);
		coordLuis.addEndereco(end2Luis);

		Endereco endLucas = new Endereco("Av piaui", 654, "apto", "Centro", "Goi�nia", "Goi�s", true);
		Professor profLucas = new Professor(1);
		profLucas.setNome("Lucas");
		profLucas.setSobrenome("Bores");
		profLucas.setDataNacimento("10/05/1990");
		profLucas.addEndereco(endLucas);

		Cursos nutricao = new Cursos("Pedagogia", 1, coordLuis);
		Turma turmaA = new Turma("Turma Portugu�s", 1, nutricao);
		Disciplina anatomia = new Disciplina(1, "Letras");

	}

}
