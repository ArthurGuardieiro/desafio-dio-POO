import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
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
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);
//        System.out.println(curso1.calcularXp());
//        System.out.println(curso2.calcularXp());
//        System.out.println(mentoria.calcularXp());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devArthur = new Dev();
        devArthur.setNome("Arthur");
        devArthur.inscreverBootcamp(bootcamp);
        System.out.println("Contéudos inscritos " + devArthur.getNome() + ": " + devArthur.getConteudoInscritos());
        devArthur.progredir();
        devArthur.progredir();
        devArthur.progredir();
        System.out.println("-");
        System.out.println("Contéudos inscritos " + devArthur.getNome() + ": " + devArthur.getConteudoInscritos());
        System.out.println("Contéudos concluidos " + devArthur.getNome() + ": " +  devArthur.getConteudosConcluidos());
        System.out.println("Xp de " + devArthur.getNome() + ": " + devArthur.calcularTotalXP());

        System.out.println("--------------------------------");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Contéudos inscritos " + devMaria.getNome() + ": " + devMaria.getConteudoInscritos());
        devMaria.progredir();
        System.out.println("-");
        System.out.println("Contéudos inscritos " + devMaria.getNome() + ": " + devMaria.getConteudoInscritos());
        System.out.println("Contéudos concluidos " + devMaria.getNome() + ": " + devMaria.getConteudosConcluidos());
        System.out.println("Xp de " + devMaria.getNome() + ": " + devMaria.calcularTotalXP());



    }

}
