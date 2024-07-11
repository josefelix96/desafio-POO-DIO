import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria java ");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJose = new Dev();
        devJose.setNome("José Felix");
        devJose.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos José Felix " + devJose.getConteudosInscritos());

        devJose.progredir();
        devJose.progredir();
        devJose.progredir();
        System.out.println("-");
        System.out.println("Conteudos Concluidos José Felix " + devJose.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos José Felix " + devJose.getConteudosInscritos());
        System.out.println("XP: " + devJose.calcularTotalXP());


        System.out.println("------------------");


        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Maria " + devMaria.getConteudosInscritos());

        devMaria.progredir();
        System.out.println("-");


        System.out.println("Conteudos Concluidos Maria " + devMaria.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos Maria " + devMaria.getConteudosInscritos());
        System.out.println("XP: " + devMaria.calcularTotalXP());


    }
}
