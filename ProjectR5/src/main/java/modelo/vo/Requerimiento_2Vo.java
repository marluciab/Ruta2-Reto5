package modelo.vo;

public class Requerimiento_2Vo {
    // Su código
    private Integer ID_Proyecto;
    private String Nombre_Material;
    
    public Requerimiento_2Vo() {
    }
    
    public Integer getIdProyecto() {
        return ID_Proyecto;
    }

    public void setIdProyecto(Integer ID_Proyecto) {
        this.ID_Proyecto = ID_Proyecto;
    }
    
    public String getNombreMaterial(){
        return Nombre_Material;
    }
    
    public void setNombreMaterial(String Nombre_Material){
        this.Nombre_Material = Nombre_Material;
    }
    
    @Override
    public String toString() {
        return ID_Proyecto + " " + Nombre_Material;
    }
    
}
