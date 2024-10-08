import java.util.Scanner;

public class Menu {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opt=0;

        do{ //iniciando o do para o menu
            System.out.println("Opções: ");
            System.out.println("1 - Cadastrar Professor");
            System.out.println("2 - Cadastrar Curso");
            System.out.println("3 - Cadastrar Aluno");
            System.out.println("4 - Listar Professores");
            System.out.println("5 - Listar Cursos");
            System.out.println("6 - Listar Alunos");
            System.out.println("7 - Sair");
            try{ //try cacht para evitar erros
                opt = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Opção inválida!");
                scanner.nextLine();
                continue;
            }
            switch(opt) { //iniciando os switchs
                case 1:
                try {
                    System.out.println("Digite o ID do professor");
                    int idProfessor = scanner.nextInt();
                    System.out.println("Digite o nome do professor");
                    String nomeProfessor = scanner.next();
                    System.out.println("Digite o departamento do professor");
                    String departamento = scanner.next();
                    new Professor(idProfessor, nomeProfessor, departamento);
                } catch (Exception e) {
                    System.out.println("Erro ao cadastrar professor!");
                }
                break;
                case 2:
                try {
                    System.out.println("Digite o ID do curso");
                    int idCurso = scanner.nextInt();
                    System.out.println("Digite o nome do curso");
                    String nomeCurso = scanner.next();
                    System.out.println("Digite o carga horária do curso");
                    int cargaHoraria = scanner.nextInt();
                    System.out.println("Digite o ID do professor responsável");
                    int idProfessor = scanner.nextInt();
                    new Curso(idCurso, nomeCurso, cargaHoraria, idProfessor);
                } catch (Exception e) {
                    System.out.println("Erro ao cadastrar o curso");
                }
                break;
                case 3:
                try {
                    System.out.println("Digite o ID do aluno");
                    int idAluno = scanner.nextInt();
                    System.out.println("Digite o nome do aluno");
                    String nomeAluno = scanner.next();
                    System.out.println("Digite a data de nascimento do aluno");
                    String dtNascimento = scanner.next();
                    System.out.println("Digite o CPF do aluno");
                    String CPF = scanner.next();
                    System.out.println("Digite o ID do professor");
                    int idProfessor = scanner.nextInt();
                    System.out.println("Digite o ID do curso ");
                    int idCurso = scanner.nextInt();
                    new Aluno(idAluno,nomeAluno,dtNascimento,CPF, idProfessor, idCurso);
                }  catch (Exception e) {
                    System.out.println("Erro ao cadastrar aluno");
                }
                break;
                 // a partir daqui, usando for each para listar atributos
                case 4: 
                    System.out.println("Listar professores ");
                        for (Professor professor : Professor.professores) {
                        System.out.println(" Nome:" + professor.nome + " Departamento: " + professor.departamento + " Alunos: " + Aluno.contarAlunosPorProfessor(professor.id));
                        }
                        break;
                case 5:
                    System.out.println("Listar Cursos");
                        for (Curso curso : Curso.cursos) {
                        System.out.println(" Nome: " + curso.nome + " Carga horária: " + curso.cargaHoraria + " Nome professor: " + Professor.buscarProfessor(curso.idProfessor).nome);
                        }
                        break;
                case 6:
                    System.out.println("Listar Alunos");
                        for (Aluno aluno : Aluno.alunos) {
                        System.out.println(" Nome: " + aluno.nome + " Data de Nascimento " + aluno.dtNascimento + " CPF " + aluno.CPF + " Curso " + Curso.buscarCurso(aluno.idCurso).nome);
                        }
                        break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                
                    }

        }while (opt != 7);

        scanner.close();
    }
}
