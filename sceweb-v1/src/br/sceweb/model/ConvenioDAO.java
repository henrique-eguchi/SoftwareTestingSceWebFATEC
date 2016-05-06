package br.sceweb.model;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import br.sceweb.servico.FabricaDeConexoes;

public class ConvenioDAO {

//	public String adiciona(Convenio convenio) {
//		return "convenio cadastrado com sucesso";
//	}

	Logger logger = Logger.getLogger(ConvenioDAO.class);

	public int adiciona(Convenio convenio) {
		PreparedStatement ps;
		int codigoRetorno = 0;
		try (Connection conn = new FabricaDeConexoes().getConnection()) {
			
			ps = (PreparedStatement) conn
					.prepareStatement("insert into convenio (empresa_cnpj, dataInicio, dataFim) values(?,?,?)");
			ps.setString(1, convenio.getCnpj());
			logger.info("DATA = " + convenio.getDataInicio().toString("YYYY-MM-DD"));
			ps.setString(2, convenio.getDataInicio().toString("YYYY‐MM‐DD HH:MM:SS"));
			ps.setString(3, convenio.getDataTermino().toString("YYYY‐MM‐DD HH:MM:SS"));
			codigoRetorno = ps.executeUpdate();
			logger.info("codigo de retorno do metodo adiciona convenio = " + codigoRetorno);
			ps.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
		return codigoRetorno;
	}
}
