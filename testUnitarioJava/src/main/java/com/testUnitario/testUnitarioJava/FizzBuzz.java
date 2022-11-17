package com.testUnitario.testUnitarioJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FizzBuzz {
    Random r = new Random();

    public List<Integer> getMyArray(int cantidadNumeros) {

        List<Integer> myArray = new ArrayList<Integer>();

        while (myArray.size() < cantidadNumeros) {

            int numeroAleatorio = r.nextInt(1000 - 10) + 10; //Número aleatorio entre 10 y 1000

            if (!myArray.contains(numeroAleatorio)) {
                myArray.add(numeroAleatorio);
            }

        }

        return myArray;
    }


    public String tryNumbers(List<Integer> numbers) {

        StringBuilder sb = new StringBuilder();

        for (Integer number : numbers) {

            if (number % 5 == 0 && number % 3 == 0) {
                sb.append("FizzBuzz\n");
            } else if (number % 3 == 0) {
                sb.append("Fizz\n");
            } else if (number % 5 == 0) {
                sb.append("Buzz\n");
            }


            int n = number;
            int sum = 0;
            while (n / 10 > 0) {
                sum += n % 10;
                n /= 10;
            }
            sum += n % 10;

            if (sum % 3 == 0) {
                sb.append("SOLERA!\n");
            }
        }
        return sb.toString();
    }

}
