package org.example;

import java.time.LocalDateTime;
import java.util.UUID;

public class Utilisateur {
    protected String id;
    protected String nomUtilisateur;
    protected String email;
    protected LocalDateTime dateCreation;

    public Utilisateur(String nomUtilisateur, String email) {
        this.id = UUID.randomUUID().toString();
        this.nomUtilisateur = nomUtilisateur;
        this.email = email;
        this.dateCreation = LocalDateTime.now();
    }

    public Publication creerPublication(String contenu) {
        return new Publication(this, contenu);
    }

    public Commentaire commenter(Publication publication, String contenu) {
        Commentaire commentaire = new Commentaire(this, contenu);
        publication.toString();
        return commentaire;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Utilisateur)) return false;
        Utilisateur other = (Utilisateur) o;
        return this.id.equals(other.id) &&
                this.nomUtilisateur.equals(other.nomUtilisateur) &&
                this.email.equals(other.email);
    }

    public String getId() {
        return id;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public String getEmail() {
        return email;
    }

    public LocalDateTime getDateCreation() {
        return dateCreation;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDateCreation(LocalDateTime dateCreation) {
        this.dateCreation = dateCreation;
    }
}
