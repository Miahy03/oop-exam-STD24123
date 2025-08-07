package org.example;
public class Moderateur extends Utilisateur {

    public Moderateur(String nomUtilisateur, String email) {
        super(nomUtilisateur, email);
    }

    public void supprimerPublication(Publication publication, Groupe groupe) {
        if (groupe.getPublications().contains(publication)) {
            groupe.getPublications().remove(publication);
        }
    }

    public void supprimerCommentaire(Publication publication, Commentaire commentaire) {
        if (publication.getCommentaires().contains(commentaire)) {
            publication.getCommentaires().remove(commentaire);
        }
    }
}

