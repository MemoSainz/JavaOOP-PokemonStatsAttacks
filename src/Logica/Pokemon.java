package Logica;

public abstract class Pokemon {
    protected int numPokedex;
    protected String nombre;
    protected double peso;
    protected String sexo;
    protected int temporada;
    protected String theType;


    public Pokemon() {
    }

    public Pokemon(int numPokedex, String nombre, double peso, String sexo, int temporada, String theType) {
        this.numPokedex = numPokedex;
        this.nombre = nombre;
        this.peso = peso;
        this.sexo = sexo;
        this.temporada = temporada;
        this.theType = theType;
    }

    protected abstract void stats();


    protected abstract void atacarPlacaje();

    protected abstract void atacarAraniazo();

    protected abstract void atacarMordizco();
}
