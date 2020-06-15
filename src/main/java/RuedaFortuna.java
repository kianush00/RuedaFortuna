public class RuedaFortuna {

    private int[] casillas;

    public void inicializarRueda(int numeroCasillas){
        try {
            if(numeroCasillas < 4 || numeroCasillas > 100){
                throw new ArrayIndexOutOfBoundsException();
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: número de casillas fuera del rango.");
        }

        casillas = new int[numeroCasillas];     //inicializa casillas
        int random;     //variable entera que almacenará un número aleatorio que va desde 0 hasta 8

        for (int i = 0; i < casillas.length; i++){
            random = (int) Math.floor(Math.random()*9);
            switch (random){        //asignar puntaje aleatorio
                case 0:
                    casillas[i] = 100;
                break;
                case 1:
                    casillas[i] = 200;
                break;
                case 2:
                    casillas[i] = 300;
                break;
                case 3:
                    casillas[i] = 500;
                break;
                case 4:
                    casillas[i] = 1000;
                break;
                case 5:
                    casillas[i] = 2000;
                break;
                case 6:
                    casillas[i] = 3000;
                break;
                case 7:
                    casillas[i] = 5000;
                break;
                case 8:
                    casillas[i] = 10000;
                break;
            }
        }
    }

    public int lanzarRueda(){
        return casillas[(int) Math.floor(Math.random()*casillas.length)];   //retorna una casilla aleatoria
    }
}
