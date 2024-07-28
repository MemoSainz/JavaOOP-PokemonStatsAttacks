package Logica;

public class Pikachu extends Pokemon implements IElectrico {
    private int numPokedex = 25;
    private String nombre = "Pikachu";
    private double peso = 6.0;
    private String sexo = "male";
    private int temporada = 1;
    private String theType = "Electric";



    public Pikachu() {
    }

    public Pikachu(int numPokedex, String nombre, double peso, String sexo,
                   int temporada, String theType, int numPokedex1, String nombre1,
                   double peso1, String sexo1, int temporada1, String theType1) {
        super(numPokedex, nombre, peso, sexo, temporada, theType);
        this.numPokedex = numPokedex1;
        this.nombre = nombre1;
        this.peso = peso1;
        this.sexo = sexo1;
        this.temporada = temporada1;
        this.theType = theType1;
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
        System.out.println(nombre + " wants to use Bite");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("As a type " + theType + " " + nombre + " is able to use Thunder Shock");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("As a type " + theType + " " + nombre + " is able to use Thunder Punch");
    }
}
