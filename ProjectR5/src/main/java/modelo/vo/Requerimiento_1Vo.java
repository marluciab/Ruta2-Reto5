package modelo.vo;

public class Requerimiento_1Vo {
    // Su código
    private Integer ID_Lider;
    private String Nombre;
    private String Primer_Apellido;
    private Integer Salario;
    
    public Requerimiento_1Vo() {
    }
    public Integer getIdLider() {
        return ID_Lider;
    }
    public void setIdLider(Integer ID_Lider) {
        this.ID_Lider = ID_Lider;
    }
    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    public String getPrimer_Apellido(){
        return Primer_Apellido;
    }
    public void setPrimer_Apellido(String Primer_Apellido){
        this.Primer_Apellido = Primer_Apellido;
    }
    public Integer getSalario() {
        return Salario;
    }
    public void setSalario(Integer Salario) {
        this.Salario = Salario;
    }
    @Override
    public String toString() {
        return ID_Lider + " " + Nombre + " " + Primer_Apellido+ " " + Salario;
    }
}
