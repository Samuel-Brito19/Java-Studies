import Animais.cachorro;

public class Main {

    public static void main(String[] args) {

        cachorro cachorro1 = new cachorro();

        cachorro1.name = "Kratos";
        cachorro1.height = 30;
        cachorro1.weight = 50.5;

        System.out.println(cachorro1);
        cachorro1.latir();

    }
}
