package org.campitos.capitulo1;

/**
 *
 * @author campitos
 */
public class Circulo {
     private float radio;

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        if(radio<0)radio=-radio;
        this.radio = radio;
    }
    
    
    
}
