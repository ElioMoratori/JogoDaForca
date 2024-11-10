package Dominio;

import java.util.ArrayList;

public class Categoria {
    ArrayList<String> meiosDeTransporte;
    ArrayList<String> animais;
    ArrayList<String> comidas;
    ArrayList<String> sentimentos;
    ArrayList<String> paises;
    ArrayList<String> objetos;

    // Getters and Setters
    public ArrayList<String> getAnimais() {
        return animais;
    }

    public void setAnimais(ArrayList<String> animais) {
        this.animais = animais;
    }

    public ArrayList<String> getComidas() {
        return comidas;
    }

    public void setComidas(ArrayList<String> comidas) {
        this.comidas = comidas;
    }

    public ArrayList<String> getMeiosDeTransporte() {
        return meiosDeTransporte;
    }

    public void setMeiosDeTransporte(ArrayList<String> meiosDeTransporte) {
        this.meiosDeTransporte = meiosDeTransporte;
    }

    public ArrayList<String> getSentimentos() {
        return sentimentos;
    }

    public void setSentimentos(ArrayList<String> sentimentos) {
        this.sentimentos = sentimentos;
    }

    public ArrayList<String> getObjetos() {
        return objetos;
    }

    public void setObjetos(ArrayList<String> objetos) {
        this.objetos = objetos;
    }

    public ArrayList<String> getPaises() {
        return paises;
    }

    public void setPaises(ArrayList<String> paises) {
        this.paises = paises;
    }
}
