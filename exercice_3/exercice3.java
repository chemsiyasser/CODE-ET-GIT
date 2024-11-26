public class exercice3 {

    /**
     * simplification de la methode en utulisant le kiss et dry
     * @param typeOperation
     * @param produit
     * @param quantite
     * @param stock
     */

    // gere le stock
    public void gererStock(String typeOperation, String produit, int quantite, int stock) {
        // Ajout au stock
        switch (typeOperation) {
            case "ajout" -> ajout_du_stock(produit, stock, quantite);
            // Retrait du stock
            case "retrait" -> Retrait_du_stock(produit, stock, quantite);
            // Si l'action est inconnu
            default -> System.out.println("Opération inconnue.");
        }
    }
    // methoce ajout du stock
    public void ajout_du_stock (String produit , int stock , int quantite) {
        stock += quantite;
            System.out.println("Produit : " + produit + ", Stock après ajout : " + stock);
    }
    // methode retrait du stock
    public void  Retrait_du_stock (String produit , int stock , int quantite){
        if (stock >= quantite) {
            stock -= quantite;
            System.out.println("Produit : " + produit + ", Stock après retrait : " + stock);
        } else {
            System.out.println("Stock insuffisant pour le produit : " + produit);
        }
    }
}
