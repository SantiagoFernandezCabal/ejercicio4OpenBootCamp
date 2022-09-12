public class main {
    public  static void main(String[] args) {
        int numerolf = 3;
        int numeroWhile = 0;
        String estacion = "otoño";


        if (numerolf>0){
            System.out.println("Es positivo");
        }else if (numerolf==0) {
        System.out.println("Es igual a 0");
        }else {
            System.out.println("Es negativo");
        }
        while (numeroWhile<3) {
            numeroWhile = numeroWhile + 1;
            System.out.println("se sumo 1,  numeroWhile = " + numeroWhile);
        }
        do {
            numeroWhile = numeroWhile + 1;
            System.out.println("numero while del do " + numeroWhile);
        }while (numeroWhile<1);

        for (int numeroFor = 0;  numeroFor <= 3; numeroFor = numeroFor + 1 ){
            System.out.println(numeroFor);
        }
        switch (estacion) {
            case ("verano"):
                System.out.print("Es verano");
                break;
            case ("invierno"):
                System.out.println("Es invierno");
                break;
            case ("otoño"):
                System.out.println("Es otoño");
                break;
            case ("primavera"):
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("Parametro invalido");






        }





    }






















}
