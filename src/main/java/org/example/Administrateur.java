package org.example;
public class Administrateur extends Moderateur {

    public Administrateur(String nomUtilisateur, String email) {
        super(nomUtilisateur, email);
    }
    public void supprimerUtilisateur(Utilisateur utilisateur, Groupe groupe) {
        if (!utilisateur.equals(this) && groupe.getMembres().contains(utilisateur)) {
            groupe.getMembres().remove(utilisateur);
        }
    }
}

