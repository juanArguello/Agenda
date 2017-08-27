/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ws.dataBase.Hijos;

/**
 *
 * @author user
 */
@Stateless
public class HijosFacade extends AbstractFacade<Hijos> {
    @PersistenceContext(unitName = "AgendaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public HijosFacade() {
        super(Hijos.class);
    }
    
}
