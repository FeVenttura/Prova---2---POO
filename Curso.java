import java.util.ArrayList;

public class Curso {

    int id;
    String nome;
    int cargaHoraria;
    int idProfessor;
   
     static ArrayList<Curso> cursos = new ArrayList<Curso>();

    public Curso(
    int id,
    String nome,
    int cargaHoraria,
    int idProfessor
    ){
    this.id=id;
    this.nome=nome;
    this.cargaHoraria=cargaHoraria;
    this.idProfessor=idProfessor;
   
    cursos.add(this);
    }
    
    static Curso buscarCurso(int id) {
        for (Curso curso : cursos ) {
            if (curso.id == id) {
                return curso;
            }
        }
        return null;
    }
    

}
