// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int numerolf = 0;
        if(numerolf > 0){
            System.out.println(numerolf + " es positivo");
        } else if (numerolf<0) {
            System.out.println(numerolf + " es negativo");
        }
        else {
            System.out.println("Es cero");
        }
        int numeroWhile = 0;
        while(numeroWhile <3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        do {
            System.out.println(numeroWhile);

        }
        while (false);

        for (int numeroFor = 0;numeroFor<=3; numeroFor++){
            System.out.println(numeroFor);
        }
        String estacion = "PRIMAVERA";
        switch (estacion){
            case "PRIMAVERA":
                System.out.println("Es " + estacion);
                break;
            case "VERANO":
                System.out.println("Es " + estacion);
                break;
            case "OTOÑO":
                System.out.println("Es " + estacion);
                break;
            case "INVIERNO":
                System.out.println("Es " + estacion);
                break;
            default:
                System.out.println("No es una estación");
        }
    }
}