package ApiAutos.Response;

import ApiAutos.Model.Marca;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.web.bind.annotation.RequestParam;


public class AutoWrapper {
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

    //TODO GET: / todos los vehiculos /id por id univoco /byMarca implementar
    //TODO POST: /auto agrega Auto

    

}
