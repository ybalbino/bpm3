package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TurmaTest {
    private Turma turma;

    @Before
    public void setUp() {
        turma = new Turma();
    }

    @Test
    public void testAdicionarPessoaValida() throws Exception {
        Pessoa pessoa = new Pessoa(1, "Ana");
        turma.adicionarPessoa(pessoa);

        assertEquals(1, turma.getPessoas().size());
        assertTrue(turma.getPessoas().contains(pessoa));
    }

    @Test(expected = Exception.class)
    public void testAdicionarPessoaInvalida() throws Exception {
        Pessoa pessoa = new Pessoa(-1, "Clara");
        turma.adicionarPessoa(pessoa);
    }

    @Test(expected = Exception.class)
    public void testAdicionarPessoaDuplicada() throws Exception {
        Pessoa pessoa1 = new Pessoa(1, "Ana");
        Pessoa pessoa2 = new Pessoa(1, "Clara");
        turma.adicionarPessoa(pessoa1);
        turma.adicionarPessoa(pessoa2);
    }

    @Test
    public void testRemoverTodasPessoas() throws Exception {
        Pessoa pessoa1 = new Pessoa(1, "Joao");
        Pessoa pessoa2 = new Pessoa(2, "Lucas");
        turma.adicionarPessoa(pessoa1);
        turma.adicionarPessoa(pessoa2);

        assertEquals(2, turma.getPessoas().size());

        turma.removerTodasPessoas();

        assertEquals(0, turma.getPessoas().size());

    }
}


