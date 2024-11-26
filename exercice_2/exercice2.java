public class exercice2 {
    /**
     * simplification du code par kiss et dry
     * @return 
     * @param nomEtudiant
     * @param notes
     */
    // Affiche note et moyennes
    public void afficherNotesEtMoyenne(String nomEtudiant, int[] notes) {
        // Affichage des notes
        System.out.println("Notes de " + nomEtudiant + ":");
        afficherNotes(notes);

        // Calcul de la somme des notes
        calculersomme(notes);

        // Affichage de la moyenne
        afficherMoyenne(calculersomme(notes), notes);
    }
     
    // methode pour  l' Affichage des notes 
    public void afficherNotes (int[] notes){
        for (int note : notes) {
            System.out.println("- " + note);
        }
    }
    // methode de Calcul de la somme des notes
    public int calculersomme (int[] notes ) {
        int somme = 0;
        for (int note2 : notes) {
            somme += note2;
        }
        return somme ;
    }
    // methode pour l'Affichage de la moyenne
    public void afficherMoyenne (double somme , int[] notes){
        double moyenne = (double) somme / notes.length;
        System.out.println("Moyenne : " + moyenne);
    }
}
