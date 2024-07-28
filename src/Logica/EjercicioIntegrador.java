package Logica;

import java.util.Scanner;

public class EjercicioIntegrador {
    public static void main(String[] args) {
        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();
        Pikachu pikachu = new Pikachu();

        System.out.println("Enter one these 4 pokemon to know stats and attacks:");
        System.out.println(" Pikachu \n Bulbasaur \n Charmander \n Squirtle");
        Scanner scan = new Scanner(System.in);
        String pokemon = scan.nextLine();

        while (!(pokemon.equalsIgnoreCase("exit"))) {
            switch (pokemon.toLowerCase()) {
                case "squirtle":
                    System.out.println("----------Data of Squirtle----------");
                    squirtle.stats();
                    System.out.println("----------Types of attack----------");
                    squirtle.atacarPlacaje();
                    squirtle.atacarAraniazo();
                    squirtle.atacarMordizco();
                    squirtle.atacarHidrobomba();
                    squirtle.atacarBurbuja();
                    squirtle.atacarPistolaAguar();
                    System.out.println("");
                    System.out.println("Do you desire to check another pokemon? (Pikachu, Bulbasur, Charmander, Squirtle).\n or enter 'exit'");
                    pokemon = scan.nextLine();
                    break;
                case "charmander":
                    System.out.println("----------Data of Charmander----------");
                    charmander.stats();
                    System.out.println("----------Types of attack----------");
                    charmander.atacarPlacaje();
                    charmander.atacarAraniazo();
                    charmander.atacarMordizco();
                    charmander.atacarPunioFuego();
                    charmander.atacarLanzaLlamas();
                    charmander.atacarAscuas();
                    System.out.println("");
                    System.out.println("Do you desire to check another pokemon? (Pikachu, Bulbasur, Charmander, Squirtle).\n or enter 'exit'");
                    pokemon = scan.nextLine();
                    break;
                case "bulbasaur":
                    System.out.println("----------Data of Bulbasaur----------");
                    bulbasaur.stats();
                    System.out.println("----------Types of attack----------");
                    bulbasaur.atacarPlacaje();
                    bulbasaur.atacarAraniazo();
                    bulbasaur.atacarMordizco();
                    bulbasaur.atacarDrenaje();
                    bulbasaur.atacarParalizar();
                    System.out.println("");
                    System.out.println("Do you desire to check another pokemon? (Pikachu, Bulbasur, Charmander, Squirtle).\n or enter 'exit'");
                    pokemon = scan.nextLine();
                    break;
                case "pikachu":
                    System.out.println("----------Data of Pikachu----------");
                    pikachu.stats();
                    System.out.println("----------Types of attack----------");
                    pikachu.atacarPlacaje();
                    pikachu.atacarAraniazo();
                    pikachu.atacarMordizco();
                    pikachu.atacarImpactrueno();
                    pikachu.atacarPunioTrueno();
                    System.out.println("");
                    System.out.println("Do you desire to check another pokemon? (Pikachu, Bulbasur, Charmander, Squirtle).\n or enter 'exit'");
                    pokemon = scan.nextLine();
                    break;
                default:
                    System.out.println("Please, insert a valid pokemon name.\n or write 'exit'");
                    pokemon = scan.nextLine();
                    break;
            }


        }

    }
}
