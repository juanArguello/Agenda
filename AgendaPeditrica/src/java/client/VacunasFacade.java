/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ws.dataBase.Vacunas;

/**
 *
 * @author user
 */
@Stateless
public class VacunasFacade extends AbstractFacade<Vacunas> {
    @PersistenceContext(unitName = "AgendaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VacunasFacade() {
        super(Vacunas.class);
    }
    
}
