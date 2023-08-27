package back.EbacBack.Exemplos.adapter;
import java.io.File;


public class DropBoxAdapter implements Persistencia {

    private DropBox dropBox;

    public DropBoxAdapter (DropBox dropBox) {
        this.dropBox = dropBox;
    }

    @Override
    public void gravar(File file) {
        dropBox.download(file.getAbsolutePath());
    }

    @Override
    public File ler(String caminho) {
       DropBoxFile = dropBox.download(caminho);
       return new File(file.getLocalPatch());
    }

    @Override
    public void excluir(String id) {
        
    }

    @Override
    public void alterar(String id, File file) {
        
    }

  

    
    
}


