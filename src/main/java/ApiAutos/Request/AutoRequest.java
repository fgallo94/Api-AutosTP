package ApiAutos.Request;

import ApiAutos.Model.Marca;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.web.bind.annotation.RequestParam;

public class AutoRequest {
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

    @JsonProperty("marca")
    Marca marca;
    @JsonProperty("modelo")
    String modelo;
    @JsonProperty("kilometros")
    double kilometros;
    @JsonProperty("patente")
    String patente;
    @JsonProperty("anio")
    int anio;
}
