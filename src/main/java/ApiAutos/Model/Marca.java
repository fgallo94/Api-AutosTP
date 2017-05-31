package ApiAutos.Model;

public class Marca {
    private String descripcion;

    public Marca(){
        descripcion="";
    }
    public Marca(Marca m){
        this.descripcion=m.descripcion;
    }
    public Marca(String descripcion){
        this.descripcion=descripcion;
    }

    @Override
    public String toString() {
        return "Marca{" +
                "descripcion='" + descripcion + '\'' +
                '}';
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
