package desafio_poo;

import java.time.LocalDate;

/**
 *
 * @author LucasEPO
 */
public class main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("Descicao curso de java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("Descicao curso de js");
        curso2.setCargaHoraria(4);
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("Descicao mentroia de java");
        mentoria.setData(LocalDate.now());
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Dev");
        bootcamp.setDescricao("Descricao bootcamp java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        
        Dev dev1 = new Dev();
        dev1.setNome("Lucas");
        dev1.inscreverBootcamp(bootcamp);
        dev1.progredir();
        System.out.println("Conteúdos Inscritos Lucas " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Lucas " + dev1.getConteudosConcluidos());
        System.out.println("XP Lucas: " + dev1.calcularTotalXP());
        
        Dev dev2 = new Dev();
        dev1.setNome("Eduardo");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Eduardo " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Eduardo " + dev2.getConteudosConcluidos());
        System.out.println("XP Eduardo: " + dev2.calcularTotalXP());
        
   }

}
