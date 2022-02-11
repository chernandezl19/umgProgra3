package com.umg.progra3.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenCadena {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Carlos");
        lista.add("Anderson");
        lista.add("Isabel");
        //se invoca al metodo de ordenamiento
        // utilizando api Collection
        Collections.sort(lista);
        System.out.println("Ordenado "+lista);

        //Api Collection tambien provee metodo de
        //ordenamiento en revesa
        Collections.reverse(lista);
        System.out.println("reversa "+lista);
    }
}
