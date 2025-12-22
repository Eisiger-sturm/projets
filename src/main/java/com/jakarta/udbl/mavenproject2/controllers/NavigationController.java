package com.jakarta.udbl.mavenproject2.controllers;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named("navigationController")
@RequestScoped
public class NavigationController {

    public String lieux() {
        return "lieu";   // renvoie vers ajouter.xhtml
    }

    public String home() {
        return "home";   // renvoie vers visiter.xhtml
    }

    public String voirApropos() {
        return "a_propos";  // renvoie vers a_propos.xhtml
    }
    
}
