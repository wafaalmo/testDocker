/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Client;
import bean.Commande;
import bean.CommandeItem;
import static bean.Commande_.client;
import bean.Livraison;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author USER
 */
@Stateless
public class CommandeItemFacade extends AbstractFacade<CommandeItem> {

    @PersistenceContext(unitName = "ProjetEcomPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CommandeItemFacade() {
        super(CommandeItem.class);
    }
    
     public void ValiderCommande(CommandeItem items) {
    Client c=new Client(null,"adreeess","eamiiiiiiiiiil","0000000000000");
    
      Commande cmd=new Commande();
      cmd.setClient(c);
      cmd.setDateCommande(new Date());
      cmd.setRemise(BigDecimal.ZERO);
      cmd.setTotal(BigDecimal.ONE);
      cmd.setTotalPaye(BigDecimal.ONE);
      cmd.setTotalRestant(BigDecimal.TEN);
      foreach(CommandItem cmditem :items.get)
      cmd.setCommandeItems(items);
      
      cmd.setLivraisons(null);
       em.persist(items);
       em.persist(cmd);
    }
    
    
}
