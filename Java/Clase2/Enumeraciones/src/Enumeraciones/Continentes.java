package Enumeraciones;
public enum Continentes {
    AFRICA(54,"15 habitantes"),EUROPA(50,"50 habitantes"),ASIA(48,"32 habitantes"),AMERICA(35,"20 habitantes"),OCEANIA(14,"3 habitantes");
    
    private final int paises; //definimos un atributo
    private String habitantes;
    
    Continentes(int paises,String habitantes){
        this.paises = paises;
        this.habitantes = habitantes;
    }
    //Cremos metodos gett
    public int getPaises() {
        return this.paises;
    }
    public String getHabitantes() {
        return habitantes;
    }
}
