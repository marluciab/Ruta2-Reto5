package modelo.vo;

public class Requerimiento_3Vo {
    // Su código
    private Integer ID_Proyecto;
    private String Ciudad;
    private String Nombre;
    
    public Requerimiento_3Vo() {
    }
    
    public Integer getIdProyecto(){
        return ID_Proyecto;
    }
    public void setIdProyecto(Integer ID_Proyecto){
        this.ID_Proyecto=ID_Proyecto;
    }
    public String getCiudad(){
        return Ciudad;
    }
    public void setCiudad(String Ciudad){
        this.Ciudad = Ciudad;
    }
    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    @Override
    public String toString() {
        return ID_Proyecto + " " + Ciudad + " " + Nombre;
    }
}
