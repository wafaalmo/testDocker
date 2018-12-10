/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import static bean.Admin_.id;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author USER
 */
@Entity
public class Livraison implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String ref;
    private Date dateLiv;
    private Double totalAPaye;
    private Stock stock ;
   
    @ManyToOne
    private Commande commande;

    @OneToMany(mappedBy = "livraison")
    private List<LivraisonItem> LivraisonItems;

    public Livraison(String ref, Date dateLiv, Double totalAPaye, Stock stock, Commande commande) {
        this.ref = ref;
        this.dateLiv = dateLiv;
        this.totalAPaye = totalAPaye;
        this.stock = stock;
        this.commande = commande;
    }

    public Livraison() {
    }

    
    
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public Date getDateLiv() {
        return dateLiv;
    }

    public void setDateLiv(Date dateLiv) {
        this.dateLiv = dateLiv;
    }

    public Double getTotalAPaye() {
        return totalAPaye;
    }

    public void setTotalAPaye(Double totalAPaye) {
        this.totalAPaye = totalAPaye;
    }
  
    public List<LivraisonItem> getLivraisonItems() {
        return LivraisonItems;
    }

    public void setLivraisonItems(List<LivraisonItem> LivraisonItems) {
        this.LivraisonItems = LivraisonItems;
    }
    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }
   
    
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Livraison)) {
            return false;
        }
        Livraison other = (Livraison) object;
        if ((this.ref == null && other.ref != null) || (this.ref != null && !this.ref.equals(other.ref))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Livraison[ id=" + id + " ]";
    }
    
}
