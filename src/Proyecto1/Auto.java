package Proyecto1;

/**
 *
 * @author AlfonsoRE
 */
public class Auto {

    private String color;
    private Marca marca;
    private String chasis;
    private Propietario propietario;
    private int vel_max;
    private int vel_act;
    private int n_puertas;
    private boolean techo;
    private int marchas;
    private boolean automatico;
    private int combustible;

    public Auto(Propietario propietario) {
        this.propietario = propietario;
    }

    public void acelerar() {
        setVel_act(getVel_act() + 1);
    }

    public void frenar() {
        setVel_act(0);
    }

    public void cambiar_marcha(int m) {
        marchas = m;
    }

    public void reducir_marcha() {
        marchas--;
    }

    public void reversa() {
        if (getVel_act() == 0) {
            System.out.println("Reversa Activada");
        } else {
            System.out.println("No se puede activar reversa frenar");
        }
    }

    //consumo KM por litros
    public void autonomia(int consumo) {
        //Autonomia KM que aun puede recorrer
        System.out.println("Autonomia: " + (getCombustible() * consumo) + " KM.");
    }

    public void volumenCombustible() {
        System.out.println(getCombustible() + " litros.");
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the marca
     */
    public Marca getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    /**
     * @return the chasis
     */
    public String getChasis() {
        return chasis;
    }

    /**
     * @param chasis the chasis to set
     */
    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    /**
     * @return the propietario
     */
    public Propietario getPropietario() {
        return propietario;
    }

    /**
     * @param propietario the propietario to set
     */
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    /**
     * @return the vel_max
     */
    public int getVel_max() {
        return vel_max;
    }

    /**
     * @param vel_max the vel_max to set
     */
    public void setVel_max(int vel_max) {
        this.vel_max = vel_max;
    }

    /**
     * @return the vel_act
     */
    public int getVel_act() {
        return vel_act;
    }

    /**
     * @param vel_act the vel_act to set
     */
    public void setVel_act(int vel_act) {
        this.vel_act = vel_act;
    }

    /**
     * @return the n_puertas
     */
    public int getN_puertas() {
        return n_puertas;
    }

    /**
     * @param n_puertas the n_puertas to set
     */
    public void setN_puertas(int n_puertas) {
        this.n_puertas = n_puertas;
    }

    /**
     * @return the techo
     */
    public boolean isTecho() {
        return techo;
    }

    /**
     * @param techo the techo to set
     */
    public void setTecho(boolean techo) {
        this.techo = techo;
    }

    /**
     * @return the marchas
     */
    public int getMarchas() {
        return marchas;
    }

    /**
     * @param marchas the marchas to set
     */
    public void setMarchas(int marchas) {
        this.marchas = marchas;
    }

    /**
     * @return the automatico
     */
    public boolean isAutomatico() {
        return automatico;
    }

    /**
     * @param automatico the automatico to set
     */
    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }

    /**
     * @return the combustible
     */
    public int getCombustible() {
        return combustible;
    }

    /**
     * @param combustible the combustible to set
     */
    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

}
