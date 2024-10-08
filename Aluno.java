import java.util.ArrayList;

public class Aluno {

    int id;
    String nome;
    String dtNascimento;
    String CPF;
    int idProfessor;
    int idCurso;
    

    static ArrayList<Aluno> alunos = new ArrayList<Aluno>();  //declarando arraylist estática

    public Aluno(
    int id,
    String nome,
    String dtNascimento,
    String CPF,
    int idProfessor,
    int idCurso
    ){
    this.id=id;
    this.nome=nome;
    this.dtNascimento=dtNascimento;
    this.CPF=CPF;
    this.idProfessor=idProfessor;
    this.idCurso=idCurso;

    alunos.add(this);

    }
    static int contarAlunosPorProfessor(int idProfessor) { //método para contar os alunos por professor
        int cont = 0;
        for (Aluno aluno : alunos) {
            if (aluno.idProfessor == idProfessor) {
                cont++;
            }
        }
        return cont;
    
    }
    
   

}
