import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Desenvolvedor;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição mentoria");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Desenvolvedor devAngela = new Desenvolvedor();
        devAngela.setNome("Angela");
        devAngela.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos" + devAngela.getConteudosInscritos());
        devAngela.progredir();
        devAngela.progredir();
        System.out.println("Conteúdos inscritos" + devAngela.getConteudosInscritos());
        System.out.println("Conteúdos concluidos" + devAngela.getConteudosConcluidos());
        System.out.println("XP:" + devAngela.calcularTotalXp());

        Desenvolvedor devJoao = new Desenvolvedor();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteúdos inscritos" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluidos" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }
}
