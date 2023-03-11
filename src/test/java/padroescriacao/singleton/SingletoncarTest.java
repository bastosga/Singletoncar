package padroescriacao.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletoncarTest {

    @Test
    public void deveRetornarNomeOficina() {
        Singletoncar.getInstance().setNomeOficina("Oficina 1");
        assertEquals("Oficina 1", Singletoncar.getInstance().getNomeOficina());
    }

    @Test
    public void deveRetornarUsuarioLogado() {
        Singletoncar.getInstance().setUsuarioLogado("Usuario 1");
        assertEquals("Usuario 1", Singletoncar.getInstance().getUsuarioLogado());
    }

}