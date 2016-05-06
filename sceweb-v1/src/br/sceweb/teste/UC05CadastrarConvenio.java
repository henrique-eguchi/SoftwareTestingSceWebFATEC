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

	
//	ID		: CT01UC05FB
//	OBJETIVO	: Verificar o comportamento do sistema ao cadastrar um convênio com sucesso
//	Pré-condição	: O CNPJ 89.598.704/0001-11 esta cadastrado no sistema
//	__________________________________________________________________________________________________________________________
//	Procedimento									|resultados esperados
//	1-Selecionar a opção cadastrar convênio			|1-O sistema solicita as informações de cnpj, data inicio e data término
//	2-No campo CNPJ, digitar 89.598.704/0001-11,	|2-O sistema envia uma mensagem de convenio cadastrado com sucesso
//	No campo Data início, digitar 07/05/2016,		|
//	No campo Data término, digitar 30/05/2016 e		|
//	Confirmar a operação							|
//	¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		convenioDAO = new ConvenioDAO();
		convenio = new Convenio("89598704000111", "07/06/2017", "30/06/2016");
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


