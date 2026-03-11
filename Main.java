import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Academia academia = new Academia(
                "Academia FitLife",
                "Rua das Flores, 123",
                "(11) 98765-4321",
                "contato@academiafitlife.com"
        );

        Plano planoStandart = new PlanoStandart(1, "Plano Standart");
        Plano planoVip = new PlanoVip(2, "Plano Vip");
        Plano planoBlack = new PlanoBlack(3, "Plano Black");

        academia.adicionarPlano(planoStandart);
        academia.adicionarPlano(planoVip);
        academia.adicionarPlano(planoBlack);

        boolean executando = true;

        while (executando) {

            System.out.println("\n===== Academia FitLife =====");
            System.out.println("1. Matricular Aluno");
            System.out.println("2. Adicionar Instrutor");
            System.out.println("3. Criar Aula");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:

                    System.out.println("Digite o nome do aluno:");
                    String nomeAluno = scanner.nextLine();

                    System.out.println("Digite a idade do aluno:");
                    int idadeAluno = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Digite o sexo do aluno (M/F):");
                    String sexoAluno = scanner.nextLine();

                    System.out.println("Digite o CPF do aluno:");
                    String cpfAluno = scanner.nextLine();

                    System.out.println("Digite o email do aluno:");
                    String emailAluno = scanner.nextLine();

                    System.out.println("Escolha um plano:");

                    for (Plano plano : academia.getPlanos()) {
                        System.out.println(plano.getIdPlano() + " - " + plano.getNomePlano());
                    }

                    int idPlanoEscolhido = scanner.nextInt();
                    scanner.nextLine();

                    Plano planoEscolhido = escolhaPlano(idPlanoEscolhido, academia);

                    if (planoEscolhido != null) {

                        Aluno aluno = new Aluno(
                                academia.getAlunos().size() + 1,
                                nomeAluno,
                                idadeAluno,
                                sexoAluno,
                                cpfAluno,
                                emailAluno,
                                gerarNumeroMatricula(),
                                planoEscolhido,
                                0
                        );

                        academia.adicionarAluno(aluno);

                    } else {
                        System.out.println("Plano inválido.");
                    }

                    break;

                case 2:

                    System.out.println("Digite o nome do instrutor:");
                    String nomeInstrutor = scanner.nextLine();

                    System.out.println("Digite a idade do instrutor:");
                    int idadeInstrutor = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Digite o sexo do instrutor (M/F):");
                    String sexoInstrutor = scanner.nextLine();

                    System.out.println("Digite o CPF do instrutor:");
                    String cpfInstrutor = scanner.nextLine();

                    System.out.println("Digite o email do instrutor:");
                    String emailInstrutor = scanner.nextLine();

                    System.out.println("Digite a especialidade do instrutor:");
                    String especialidadeInstrutor = scanner.nextLine();

                    Instrutor instrutor = new Instrutor(
                            academia.getInstrutores().size() + 1,
                            nomeInstrutor,
                            idadeInstrutor,
                            sexoInstrutor,
                            cpfInstrutor,
                            emailInstrutor,
                            especialidadeInstrutor,
                            2000.0,
                            0
                    );

                    academia.adicionarInstrutor(instrutor);

                    break;

                case 3:

                    if (academia.getInstrutores().isEmpty()) {
                        System.out.println("Não há instrutores cadastrados.");
                        break;
                    }

                    System.out.println("Digite seu email para verificar que é instrutor:");
                    String emailInstrutorVerificacao = scanner.nextLine();

                    Instrutor instrutorEncontrado = verificarInstrutor(emailInstrutorVerificacao, academia);

                    if (instrutorEncontrado == null) {
                        System.out.println("Instrutor não encontrado.");
                        break;
                    }

                    if (academia.getAlunos().isEmpty()) {
                        System.out.println("Não há alunos cadastrados.");
                        break;
                    }

                    System.out.println("Escolha o aluno:");

                    for (Aluno aluno : academia.getAlunos()) {
                        System.out.println(aluno.getIdAluno() + " - " + aluno.getNome());
                    }

                    int idAluno = scanner.nextInt();
                    scanner.nextLine();

                    Aluno alunoSelecionado = null;

                    for (Aluno aluno : academia.getAlunos()) {
                        if (aluno.getIdAluno() == idAluno) {
                            alunoSelecionado = aluno;
                            break;
                        }
                    }

                    if (alunoSelecionado == null) {
                        System.out.println("Aluno não encontrado.");
                        break;
                    }

                    System.out.println("Digite o horário da aula:");
                    String horario = scanner.nextLine();

                    ArrayList<Aluno> alunosDaAula = new ArrayList<>();
                    alunosDaAula.add(alunoSelecionado);

                    Aula aula = new Aula(instrutorEncontrado, alunosDaAula, horario);

                    academia.adicionarAula(aula);

                    System.out.println("Aula criada com sucesso!");
                    academia.adicionarAula(aula);

                    System.out.println("Aula criada com sucesso!");

                    break;

                case 4:

                    System.out.println("Saindo do sistema...");
                    executando = false;

                    break;

                default:

                    System.out.println("Opção inválida.");

            }
        }

        scanner.close();
    }


    public static Plano escolhaPlano(int idPlano, Academia academia) {
        for (Plano plano : academia.getPlanos()) {
            if (plano.getIdPlano() == idPlano) {
                return plano;
            }
        }

        return null;
    }


    public static String gerarNumeroMatricula() {
        return String.valueOf((int) (Math.random() * 10000));
    }


    public static Instrutor verificarInstrutor(String email, Academia academia) {
        for (Instrutor instrutor : academia.getInstrutores()) {
            if (instrutor.getEmail().equals(email)) {
                return instrutor;
            }
        }

        return null;
    }
}