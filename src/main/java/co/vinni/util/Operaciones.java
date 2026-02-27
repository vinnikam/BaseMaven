package co.vinni.util;

public class Operaciones {

    public Long sumar(String a, String b) {

        if (a == null || b == null || a.isEmpty() || b.isEmpty()) {
            return null;
        }

        Long num1 = Long.parseLong(a);
        Long num2 = Long.parseLong(b);

        return num1 + num2;
    }


    public long multiplicar(int a, int b) {

        long resultado = 0;

        for (int i = 0; i < b; i++) {
            resultado += a;
        }

        return resultado;
    }

}
