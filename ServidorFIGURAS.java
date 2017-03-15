package figuras;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author kodashy
 */
@WebService(serviceName = "FigurasGeo")
public class FigurasGeo {

    /**
     * This is a sample web service operation
     */
     @WebMethod(operationName = "Volumen")
    public Double Volumen(@WebParam(name = "radio") Double radio) {
        return (4.0/3.0)*(Math.PI)*(Math.pow(radio, 3));
        
    }
    
     @WebMethod(operationName = "Saludo")
    public String Saludo(@WebParam(name = "nombre")String nombre  ) {
        return "Hola..."+nombre ;
        
    }
    
}
