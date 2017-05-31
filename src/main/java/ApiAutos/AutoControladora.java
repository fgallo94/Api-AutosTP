package ApiAutos;

import ApiAutos.Model.Auto;
import ApiAutos.Model.Marca;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.ArrayList;

@RestController
public class AutoControladora {

    private ArrayList<Auto> lista;

    public AutoControladora(){
        Auto a1=new Auto(new Marca("Peugeot"),"504", 150000,"ABC123",1994);
        Auto a2=new Auto(new Marca("Peugeot"),"207", 20000,"JHS143",2007);
        Auto a3=new Auto(new Marca("Volkswagen"),"Voyage", 10000,"UYH323",2014);
        Auto a4=new Auto(new Marca("Mini"),"Cooper ss", 1000,"ZKS999",2012);
        ArrayList<Auto> lista=new ArrayList<Auto>();
        lista.add(a1);
        lista.add(a2);
        lista.add(a3);
        lista.add(a4);
    }
    @RequestMapping(value= "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<Auto> getAutos(){
        return lista;
    }
    @RequestMapping(value = "/id",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public Auto getById(@RequestParam("id") int id){
        Auto aux=new Auto();
        for (Auto a:lista) {
            if(a.getId()==id){
                aux=a;
            }
        }
        return aux;
    }

    @RequestMapping(value = "/byMarca",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<Auto> getByMarca(@RequestParam("marca") String mark){
        ArrayList<Auto> listaEncontrados= new ArrayList<Auto>();
        for(Auto a:lista){
            if(a.getMarca().getDescripcion() == mark){
                listaEncontrados.add(a);
            }
        }
        return listaEncontrados;
    }

    @RequestMapping(value = "/Auto",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public void setAuto(@RequestBody Auto a){
        lista.add(a);
    }
}
