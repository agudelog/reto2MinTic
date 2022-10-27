package reto2;

public class CuerpoDeAgua {
	
    private String nombre;
    private int nId;
    private String municipio;
    private double nivelIRCA;

    public CuerpoDeAgua(String nombre, int nId, String municipio, double nivelIRCA) {
        this.nombre = nombre;
        this.nId = nId;
        this.municipio = municipio;
        this.nivelIRCA = nivelIRCA;
    }
    
    public String nivel(){
        String nivel = "";
    if(nivelIRCA >= 0 & nivelIRCA <= 5){
        nivel = "SIN RIESGO";        
    }else if(nivelIRCA > 5 & nivelIRCA <= 14){
        nivel = "BAJO";
    }else if(nivelIRCA > 14 & nivelIRCA <= 35){
        nivel = "MEDIO";
    }else if(nivelIRCA > 35 & nivelIRCA <= 80){
        nivel = "ALTO";
    }else if(nivelIRCA > 80 & nivelIRCA <= 100){
        nivel = "INVIABLE SANITARIAMENTE";
    }
    return nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getnId() {
        return nId;
    }

    public void setnId(int nId) {
        this.nId = nId;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public double getNivelIRCA() {
        return nivelIRCA;
    }

    public void setNivelIRCA(double nivelIRCA) {
        this.nivelIRCA = nivelIRCA;
    }
    
}

