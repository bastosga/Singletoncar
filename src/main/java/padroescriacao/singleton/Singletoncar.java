
package padroescriacao.singleton;

public class Singletoncar {

    private Singletoncar() {};
    private static Singletoncar instance = new Singletoncar();
    public static Singletoncar getInstance() {
        return instance;
    }

    private String nomeOficina;
    private String usuarioLogado;

    public String getNomeOficina() {
        return nomeOficina;
    }

    public void setNomeOficina(String nomeOficina) {
        this.nomeOficina = nomeOficina;
    }

    public String getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(String usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }
}
