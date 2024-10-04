package application;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Program {

	public static void main(String[] args) {
		
		
		 Curso curso1 = new Curso();
	        curso1.setTitulo("curso java");
	        curso1.setDescricao("descrição curso java");
	        curso1.setCargaHoraria(8);

	        Curso curso2 = new Curso();
	        curso2.setTitulo("curso js");
	        curso2.setDescricao("descrição curso js");
	        curso2.setCargaHoraria(4);

	        Mentoria mentoria = new Mentoria();
	        mentoria.setTitulo("mentoria de java");
	        mentoria.setDescricao("descrição mentoria java");
	        mentoria.setData(LocalDate.now());
	        
	        Curso curso3 = new Curso();
	        curso3.setTitulo("curso Python");
	        curso3.setDescricao("descrição curso Py");
	        curso3.setCargaHoraria(6);

	        /*System.out.println(curso1);
	        System.out.println(curso2);
	        System.out.println(mentoria);*/

	        BootCamp bootcamp1 = new BootCamp();
	        bootcamp1.setNome("Bootcamp Java Developer");
	        bootcamp1.setDescricao("Descrição Bootcamp Java Developer");
	        bootcamp1.getConteudos().add(curso1);
	        bootcamp1.getConteudos().add(curso2);
	        bootcamp1.getConteudos().add(mentoria);
	        
	        BootCamp bootcamp2= new BootCamp();
	        bootcamp2.setNome("Bootcamp Python");
	        bootcamp2.setDescricao("Curso completo Py");
	        bootcamp2.getConteudos().add(curso3);
	        
	        Dev devCamila = new Dev();
	        devCamila.setNome("Camila");
	        devCamila.inscreverBootCamp(bootcamp1);
	        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
	        devCamila.progredir();
	        devCamila.progredir();
	        System.out.println("-");
	        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
	        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluido());
	        System.out.println("XP:" + devCamila.calcularTotalXP());
	        System.out.println();
	        devCamila.progredir();
	        devCamila.inscreverBootCamp(bootcamp2);
	        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
	        System.out.println("XP:" + devCamila.calcularTotalXP());
	        devCamila.cancelarInscricaoBootCamp(bootcamp2);
	        System.out.println("Camila cancelou a matricula do " + bootcamp2.getNome() + ". XP atual = " + devCamila.calcularTotalXP());
	        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());

	        System.out.println("-------");

	        Dev devJoao = new Dev();
	        devJoao.setNome("Joao");
	        devJoao.inscreverBootCamp(bootcamp1);
	        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
	        devJoao.progredir();
	        devJoao.progredir();
	        devJoao.progredir();
	        System.out.println("-");
	        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
	        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluido());
	        System.out.println("XP:" + devJoao.calcularTotalXP());


	}

}
