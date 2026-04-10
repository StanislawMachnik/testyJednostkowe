import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SzyfryTest {

    @Test
    void DanePodstawowe() {
        Assertions.assertEquals("def", Szyfry.szyfrujPrzestawieniowo("abc", 3));
    }
    @Test
    void Zawijanie() {
        Assertions.assertEquals("abc", Szyfry.szyfrujPrzestawieniowo("xyz", 3));
    }
    @Test
    void Odszyfrowanie() {
        Assertions.assertEquals("abc", Szyfry.szyfrujPrzestawieniowo("def" , -3));
    }
    @Test
    void KluczWiekszyNizDlugoscAlfabetu() {
        Assertions.assertEquals("def", Szyfry.szyfrujPrzestawieniowo("abc", 29));
    }
    @Test
    void SpacjaWTekscie() {
        Assertions.assertEquals("cd ef", Szyfry.szyfrujPrzestawieniowo("ab cd", 2));
    }
}
