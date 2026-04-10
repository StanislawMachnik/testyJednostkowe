import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SzyfryTest {

    @Test
    void szyfrujPrzestawieniowoJezeliPusteSlowo() {
        Assertions.assertEquals("", Szyfry.szyfrujPrzestawieniowo(""));
    }
    @Test
    void szyfrujPrzestawieniowoJezeliJednaLitera() {
        Assertions.assertEquals("z", Szyfry.szyfrujPrzestawieniowo("z"));
    }
    @Test
    void szyfrujPrzestawieniowoJezeliParzystaDlugoscSlowa() {
        Assertions.assertEquals("atam", Szyfry.szyfrujPrzestawieniowo("tama"));
    }
    @Test
    void szyfrujPrzestawieniowoJezeliNieParzystaDlugoscSlowa() {
        Assertions.assertEquals("odemk", Szyfry.szyfrujPrzestawieniowo("domek"));
    }
}