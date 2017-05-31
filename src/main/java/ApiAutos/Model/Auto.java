package ApiAutos.Model;


public class Auto {

    private  Marca marca;
    private  String modelo;
    private double kilometros;
    private String patente;
    private int anio;

    public Auto(){
        marca=new Marca();
        modelo="";
        kilometros=0;
        patente="";
        anio=0;
    }

    public Auto(Auto a){
        this.marca=a.marca;
        this.modelo=a.modelo;
        this.kilometros=a.kilometros;
        this.patente=a.patente;
        this.anio=a.anio;
    }

    public Auto(Marca marca, String modelo, double kilometros,String patente, int anio){
        this.marca=marca;
        this.modelo=modelo;
        this.kilometros=kilometros;
        this.patente=patente;
        this.anio=anio;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca.toString() + '\'' +
                ", modelo='" + modelo + '\'' +
                ", kilometros=" + kilometros +
                ", patente='" + patente + '\'' +
                ", anio=" + anio +
                '}';
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getKilometros() {
        return kilometros;
    }

    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
