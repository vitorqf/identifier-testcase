package main;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IdentifierTest {
        @Test
        void testValidIdentifier() {
            Identifier id = new Identifier();

            assertTrue(id.validateIdentifier("a"), "Caso 1: Identificador 'a' deve ser válido.");
            assertTrue(id.validateIdentifier("abcdef"), "Caso 2: Identificador 'abcdef' deve ser válido.");
            assertTrue(id.validateIdentifier("a1b"), "Caso 3: Identificador 'a1b' deve ser válido.");
        }

        @Test
        void testInvalidIdentifier() {
            Identifier id = new Identifier();

            assertFalse(id.validateIdentifier(""), "Caso 4: Identificador vazio deve ser inválido.");
            assertFalse(id.validateIdentifier("abcdefg"), "Caso 5: Identificador 'abcdefg' deve ser inválido.");
            assertFalse(id.validateIdentifier("1abc"), "Caso 6: Identificador '1abc' deve ser inválido.");
            assertFalse(id.validateIdentifier("a b"), "Caso 7: Identificador 'a b' deve ser inválido.");
            assertFalse(id.validateIdentifier("abc@123"), "Caso 8: Identificador 'abc@123' deve ser inválido.");
            assertFalse(id.validateIdentifier("a@b"), "Caso 9: Identificador 'a@b' deve ser inválido.");
        }
}

