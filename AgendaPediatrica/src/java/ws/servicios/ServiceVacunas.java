/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.servicios;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import ws.DataBase.Vacunas_;
//import javax.ejb.Stateless;

/**
 *
 * @author user
 */
@WebService(serviceName = "ServiceVacunas")
//@Stateless()
public class ServiceVacunas {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "consultaVacunas")
    public String consultaVacunas(@WebParam(name = "p_id_hijo") int p_id_hijo) {
        if(Vacunas_.idHijo.equals(p_id_hijo))
            return "Nombre: " + Vacunas_.nombreVacuna + " Fecha: " 
                    + Vacunas_.fecha +
                    " aplicada:" + Vacunas_.aplicada + " Dosis:" 
                    + Vacunas_.dosis;
        else
            return "ID del hijo no existe";
    }
}
