package org.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PessoaTest {
    private Pessoa pessoa;

    @Before
    public void setUp() {
        pessoa = new Pessoa();
    }

    @Test
    public void testConstrutorComParametros() {
        Pessoa pessoa = new Pessoa(1, "João");
        assertEquals(1, pessoa.getId());
        assertEquals("João", pessoa.getNome());
    }

    @Test
    public void testValido() {
        pessoa.setId(1);
        pessoa.setNome("Lucas");
        assertTrue(pessoa.valido());
    }

    @Test
    public void testIdNegativo() {
        pessoa.setId(-1);
        pessoa.setNome("Ana");
        assertFalse(pessoa.valido());
    }

    @Test
    public void testNomeVazio() {
        pessoa.setId(2);
        pessoa.setNome("");
        assertFalse(pessoa.valido());
    }
}


