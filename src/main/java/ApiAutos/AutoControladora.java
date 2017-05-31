package ApiAutos;

import ApiAutos.Model.Auto;
import ApiAutos.Model.Marca;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.ArrayList;

@RestController
public class AutoControladora {

    private ArrayList<Auto> lista=new ArrayList<Auto>();
    private Persistencia persistencia=new Persistencia();

    @RequestMapping(value= "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<Auto> getAllAutos(){
        return persistencia.getAutos();
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public Auto getById(@PathVariable("id") int id){
        return persistencia.getById(id);
    }

    @RequestMapping(value = "/byMarca",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<Auto> getByMarca(@RequestParam("marca") String mark){
        return persistencia.getByMarca(mark);
    }

    @RequestMapping(value = "/Auto",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public void setAuto(@RequestBody Auto a){
        persistencia.setAuto(a);
    }
}
