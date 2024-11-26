public class FactureManager {

   
    public double calculTotal(int quantite, double prixUnitaire)
    {
        return quantite * prixUnitaire;
    }
     /**
     * @return double total
     * @param quantite
     * @param prixUnitaire
     */

    
    public double tauxReductionType(String typeProduit)
    {   
        switch (typeProduit)
        {
            case "Alimentaire" :
                return 0.05;
                break;
                
            case "Electronique" :
                return 0.1;
                break;
            
            case "Luxe" :
                return 0.15;
                break;
            
            default :
            return 0; // Pas de réduction pour ce type de produit
        }
       
    }
    /**
     * @return double taux
     */

    public double reductionType()
    {     
        double total = total(int quantite, double prixUnitaire);
        return   total -= total * tauxReductionType(String typeProduit);
    }
    /**
     * @return double totalType
     */

    public double reductionQuantite()
    {
        double total = total(int quantite, double prixUnitaire);
        
        if (total > 1000) {
            total -= total * 0.05; // Réduction supplémentaire de 5% pour les gros montants
        }

        return total;

    }
    /**
     * @return double reductionTotal
     */

