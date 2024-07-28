package Logica;

public class Bulbasaur extends Pokemon implements IPlanta {
    private int numPokedex = 1;
    private String nombre = "Bulbasaur";
    private double peso = 6.9;
    private String sexo = "male";
    private int temporada = 1;
    private String theType = "Grass";

    public Bulbasaur() {
    }

    public Bulbasaur(int numPokedex, String nombre, double peso, String sexo,
                     int temporada, String type, int numPokedex1, String nombre1,
                     double peso1, String sexo1, int temporada1, String theType) {
        super(numPokedex, nombre, peso, sexo, temporada, type);
        this.numPokedex = numPokedex1;
        this.nombre = nombre1;
        this.peso = peso1;
        this.sexo = sexo1;
        this.temporada = temporada1;
        this.theType = theType;
    }

    @Override
    protected void stats() {
        System.out.println("Number in Pokedex: " + numPokedex + ",\n" +
                " Name: " + nombre + ",\n" +
                " Weight: " + peso + "kg,\n" +
                " Gender: " + sexo + ",\n" +
                " Season: " + temporada);
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println(nombre + " wants to use Tackle");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println(nombre + " wants to use Scratch");
    }

    @Override
    protected void atacarMordizco() {
        System.out.println(nombre + " wants to Bite");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("As a type " + theType + " " + nombre + " is able to use Giga Drain");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("As a type " + theType + " " + nombre + " is able to use Paralyze");

    }
}
