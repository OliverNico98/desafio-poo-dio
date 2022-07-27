import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javascript");
        curso2.setDescricao("descrição curso javascript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
*/
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcmap Java Developer");
        bootcamp.setDescricao("Descrição Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devNicolas = new Dev();
        devNicolas.setNome("Nicolas");
        devNicolas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Nicolas:" + devNicolas.getConteudosInscritos());

        devNicolas.progredir();
        devNicolas.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Nicolas:" + devNicolas.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Nicolas:" + devNicolas.getConteudosConcluidos());

        System.out.println("------");
        System.out.println("XP: " + devNicolas.calcularTotalXp());

        Dev devRodrigo = new Dev();
        devRodrigo.setNome("Rodrigo");
        devRodrigo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Rodrigo:" + devRodrigo.getConteudosInscritos());
        devNicolas.progredir();
        devNicolas.progredir();
        devRodrigo.progredir();
        System.out.println("-");
        System.out.println("XP: " + devRodrigo.calcularTotalXp());

        System.out.println("Conteúdos Inscritos Rodrigo:" + devNicolas.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Rodrigo:" + devRodrigo.getConteudosConcluidos());

    }
}
