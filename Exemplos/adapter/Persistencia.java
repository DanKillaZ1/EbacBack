package back.EbacBack.Exemplos.adapter;

import java.io.File;

public interface Persistencia {

    public void gravar(File file);

    public void ler(String caminho);

    void excluir(String id);

    void alterar(String id, File file);
}
