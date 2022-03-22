package Proyecto1;

/**
 *
 * @author AlfonsoRE
 */
public class Propietario {
    
    private String nombre;
    private String rfc;
    private String id;
    private String fec_nac;
    private Direccion direccion;
    private String complemento;
    
    
    
    public Propietario(String nombre, String rfc, String id, Direccion direcccion) {
        this.nombre = nombre;
        this.rfc = rfc;
        this.id = id;
        this.direccion=direccion;
    }

    /**
     * @return the direccion
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the rfc
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * @param rfc the rfc to set
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the fec_nac
     */
    public String getFec_nac() {
        return fec_nac;
    }

    /**
     * @param fec_nac the fec_nac to set
     */
    public void setFec_nac(String fec_nac) {
        this.fec_nac = fec_nac;
    }

    /**
     * @return the complemento
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * @param complemento the complemento to set
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

}
