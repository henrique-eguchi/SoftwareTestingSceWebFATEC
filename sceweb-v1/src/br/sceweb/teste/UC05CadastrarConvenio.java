package br.sceweb.teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.model.Convenio;
import br.sceweb.model.ConvenioDAO;

public class UC05CadastrarConvenio {
	static Convenio convenio;
	static ConvenioDAO convenioDAO;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		convenioDAO = new ConvenioDAO();
		convenio = new Convenio("a", "b", "c");
	}
	
	@Test
	public void CT01UC05FBCadastrar_convenio_com_sucesso() {
		//assertEquals(1, convenioDAO.adiciona(convenio));
		assertEquals(1, convenioDAO.adiciona(convenio));
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

}


