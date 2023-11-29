package temps;

import java.util.Random;

public class Temperaturas extends Thread {

    public static int [] weather = new int [3650];

    @Override
    public void run()
    {
        int max = weather[weather.length - 1];

        for (int i = 0; i < weather.length; i++)
        {
            if (max > weather[i])
                max = weather[i];
        }
        System.out.println("Max: " + max);
    }

    
    public static void main(String[] args) {

        // Generado el array de valores aleatorios
        Random rand = new Random();
        for (int i = 0; i < weather.length; i++) {
            weather[i] = rand.nextInt(80) - 30;
        }

        // Creo 10 hilos y los guardo en un array
        Temperaturas [] t = new Temperaturas[10];
        
        for (int i = 0; i < t.length; i++) {
            t[i] = new Temperaturas();
        }
    }
}