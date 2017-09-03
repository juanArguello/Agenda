/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.servicios;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import ws.DataBase.Hijos_;
//import javax.ejb.Stateless;

/**
 *
 * @author user
 */
@WebService(serviceName = "ServiceHijo")
//@Stateless()
public class ServiceHijo {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "consultaHijo")
    public String consultaHijo(@WebParam(name = "p_id_padre") int p_id_padre) {
        if(Hijos_.idPadre.equals(p_id_padre) )
            return "Nombre: " + Hijos_.nombre + " Apellido: " + Hijos_.apellido +
                    " Edad:" + Hijos_.edad + " Fecha de : Nacimiento" 
                    + Hijos_.fechaNacimiento;
        else
            return "ID del padre no existe";
        
    }
}
