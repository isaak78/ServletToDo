package net.form2.dao;


import java.sql.Connection;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import net.form2.entidade.Accao;

public class accaoDAO extends DAO {
	 
	public List<Accao> listar() {
		List<Accao> lista = new ArrayList<>();
		try {
			Connection conexao = getConexao();
			Statement stm = conexao.createStatement();
			ResultSet rs = stm.executeQuery("select aula.id_aula, aula.fk_accao, aula.data_h, "
					+ "aula.fk_ufcd, aula.sumario, faltaformando.fk_formando from aula inner join faltaformando on aula.id_aula = faltaformando.fk_aula");
			while (rs.next()) {
				Accao accao = new Accao();
				accao.setSessao(rs.getLong("id_aula"));
				accao.setInicio(rs.getString("fk_accao"));
				accao.setSumario(rs.getString("sumario"));
				accao.setFormador(rs.getString("fk_formando"));
				accao.setData(new java.util.Date(rs.getDate("data_h").getTime()));
				lista.add(accao);
			}
			stm.close();
			conexao.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
 
	
	

}
