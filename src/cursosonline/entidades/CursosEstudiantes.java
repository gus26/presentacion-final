/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursosonline.entidades;

/**
 *
 * @author SafeComputer
 */
public class CursosEstudiantes {
    int id;
    int cursoId;
    int estudianteid;

    public CursosEstudiantes(int id, int cursoId, int estudianteid) {
        this.id = id;
        this.cursoId = cursoId;
        this.estudianteid = estudianteid;
    }

    public CursosEstudiantes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCursoId() {
        return cursoId;
    }

    public void setCursoId(int cursoId) {
        this.cursoId = cursoId;
    }

    public int getEstudianteid() {
        return estudianteid;
    }

    public void setEstudianteid(int estudianteid) {
        this.estudianteid = estudianteid;
    }
    
    
}
