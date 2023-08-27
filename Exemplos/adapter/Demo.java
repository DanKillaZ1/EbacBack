package back.EbacBack.Exemplos.adapter;

import java.io.File;

public class Demo{

    public static void main(String[] args) {
        String file = "C:\\Users\\gabri\\Desktop\\teste.txt";
        DropBox dropBox = new DropBox();
        Persistencia persistencia = new DropBoxAdapter(drop);
        arquivo = persistencia.ler(file);

    }
}