public class GestionnaireNotes {


    public double calculNote(int []notes)
    {
        double somme = 0;
        for (int note : notes) {
            somme += note;
        }

        return somme;
    }
    /**
     * @return double
     * @param nomEtudiant
     * @param notes
     */

     public double calculMoyenne()
    { 
        return calculNote(notes) / notes.length;        
    }
    /**
     * @return double
     */

     public void afficherNotesEtMoyenne(String nomEtudiant, int[] notes)
    {
        // Affichage des notes
        System.out.println("Notes de " + nomEtudiant + ":");
        for (int note : notes) {
            System.out.println("- " + note);
        }

        Systen.out.println("------->"+nomEtudiant+" a obtenue une moyenne de "+calculMoyenne()+"/20");     
    }
    /**
     * @param nomEtudiant
     * @param notes
     * @return void
     */
}
