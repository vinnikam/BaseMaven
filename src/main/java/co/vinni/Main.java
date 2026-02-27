package co.vinni;

import co.vinni.util.Operaciones;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(" Proyecto base tipo Maven-Java");

        Operaciones op = new Operaciones();
        long resultado = op.sumar("2","2");
        System.out.println(resultado);

        long r = op.multiplicar(2, 5);
        System.out.println(r);

    }
}
