import java.util.ArrayList;

public class Professor{

    int id;
    String nome;
    String departamento;

    static ArrayList<Professor> professores = new ArrayList<Professor>(); //declarando arraylist estática

    public Professor(
    int id,
    String nome,
    String departamento
    ){
    this.id=id;
    this.nome=nome;
    this.departamento=departamento;

    professores.add(this);
    }

    static Professor buscarProfessor(int id) { //método para adicionar professor ao curso
        for (Professor professor : professores) {
            if (professor.id == id) {
                return professor;
            }
        }
        return null;

    }
}