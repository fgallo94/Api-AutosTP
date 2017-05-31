package ApiAutos;


import ApiAutos.Model.Auto;
import ApiAutos.Model.Marca;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

public class Persistencia {
    ArrayList<Auto> lista = new ArrayList<Auto>();

    public Persistencia(){
        Auto a1=new Auto(new Marca("Peugeot"),"504", 150000,"ABC123",1994);
        Auto a2=new Auto(new Marca("Peugeot"),"207", 20000,"JHS143",2007);
        Auto a3=new Auto(new Marca("Volkswagen"),"Voyage", 10000,"UYH323",2014);
        Auto a4=new Auto(new Marca("Mini"),"Cooper ss", 1000,"ZKS999",2012);
        lista.add(a1);
        lista.add(a2);
        lista.add(a3);
        lista.add(a4);
    }

    public ArrayList<Auto> getAutos(){
        return lista;
    }
    public Auto getById(int id){
        Auto aux=new Auto();
        for (Auto a:lista) {
            if(a.getId()==id){
                aux=a;
            }
        }
        return aux;
    }

    public ArrayList<Auto> getByMarca(String mark){
        ArrayList<Auto> listaEncontrados= new ArrayList<Auto>();
        for(Auto a:lista){
            if(a.getMarca().getDescripcion().equals(mark)){
                listaEncontrados.add(a);
            }
        }
        return listaEncontrados;
    }

    public void setAuto( Auto a){
        lista.add(a);
    }
}
