package org.juanitodread.designpatterns.strategypattern.comportamiento;

/**
 *
 * @author juan.sandoval
 */
public class VolarPlaneando implements IVolar{

    public void volar() {
        System.out.println("Yo solo planeo por corto tiempo.");
    }

}