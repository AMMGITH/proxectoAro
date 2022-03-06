package circulo;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 * @author Alberto Mourullo Miguez
 */
public class Aro {

    /**
     *Constante MINIMO
     */
    public static final double MINIMO = 0.0;
    
    /**
     *Constante LIMITERADIO
     */
    
    public static final double LIMITERADIO = 0.0;

    private int coordenadaX;
    private int coordenadaY;
    private double radio;
    
    
    /**
     *Constructor por defecto
     */
    public Aro() {
    }
    
    /**
     * Construe obxecto aro a partir de 3 parametros
     * @param valorX de tipo enteiro
     * @param valorY de tipo enteiro
     * @param valorRadio de tipo double
     */

    public Aro(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        setRadio(valorRadio);
    }
    
    /**
     * @return the coordenadaX
     * tipo enteiro
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * establece coordenadaX
     * tipo enteiro
     * @param coordenadaX
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     * @return coordenadaY
     * tipo enteiro
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * establece coordenadaY
     * tipo enteiro
     * @param coordenadaY
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
     * @return the radio
     * tipo double
     */
    public double getRadio() {
        return radio;
    }

    /**
     * establece o radio 
     * tipo double
     * @param radio 
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    /**
     * @return o valor da constante LIMITERADIO
     */
    public static double getLIMITERADIO() {
        return LIMITERADIO;
    }    
    
    /**
     * @return o valor do radio 
     * tipo double
     */

    public double obterDiametro() {
        return getRadio() * 2;
    }
    
    /**
     * @return o valor da circunferencia
     * tipo double
     */

    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }
    
    /**
     * @return o valor da superficie
     * tipo double
     */

    public double obterSuperficie() {
        return Math.PI * getRadio() * getRadio();
    }

    /**
     * Imprime o valor do obxecto da clase Aro
     * tipo String
     */

    @Override
    public String toString() {
        return "Centro = [" + getCoordenadaX() + "," + getCoordenadaY() + "]; Radio = " + getRadio();
    }

    /**
     * Cambia o centro dun obxecto aro
     * @param trasladarX de tipo enteiro
     * @param trasladarY de tipo enteiro
     */

    public void trasladarCentro(int trasladarX, int trasladarY){
        setCoordenadaX(getCoordenadaX() + trasladarX);
        setCoordenadaY(getCoordenadaY() + trasladarY);
    }
}