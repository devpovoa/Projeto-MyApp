package Controller;

import Model.Projeto;
import Util.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author devpovoa
 */
public class ProjetoControle {

    public void salvar(Projeto projeto) {
        String sql = "INSERT INTO PROJETO ("
                + "NOME,"
                + "DESCRICAO,"
                + "DATACRIACAO,"
                + "ATUALIZACAO) "
                + "VALUES (?,?,?,?)";

        Connection connectionInsert = null;
        PreparedStatement statement = null;

        try {
            connectionInsert = ConnectionFactory.getConnection();
            statement = connectionInsert.prepareStatement(sql);

            statement.setString(1, projeto.getNome());
            statement.setString(2, projeto.getDescricao());
            statement.setDate(3, new Date(projeto.getDataCriacao().getTime()));
            statement.setDate(4, new Date(projeto.getDataAtualizacao().getTime()));

            statement.execute();

        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao tentar preencher o bando de dados." + ex.getMessage(), ex);
        } finally {
            ConnectionFactory.closeConnection(connectionInsert, statement);
        }
    }

    public void atualizar(Projeto projeto) {
        String sql = "UPDATE PROJETO SET "
                + "NOME = ?, "
                + "DESCRICAO = ?, "
                + "DATACRIACAO = ?, "
                + "ATUALIZACAO = ? "
                + "WHERE ID = ? ";

        Connection connectionAtualiza = null;
        PreparedStatement statement = null;

        try {
            connectionAtualiza = ConnectionFactory.getConnection();
            statement = connectionAtualiza.prepareStatement(sql);

            statement.setString(1, projeto.getNome());
            statement.setString(2, projeto.getDescricao());
            statement.setDate(3, new Date(projeto.getDataCriacao().getTime()));
            statement.setDate(4, new Date(projeto.getDataAtualizacao().getTime()));
            statement.setInt(5, projeto.getId());

            statement.execute();
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao tentar atualizar as informações no bando de dados." + ex.getMessage(), ex);
        } finally {
            ConnectionFactory.closeConnection(connectionAtualiza, statement);
        }
    }

    public void removerId(int projetoId) {
        String sql = "DELETE FROM PROJETO WHERE ID = ?";

        Connection connectionRemove = null;
        PreparedStatement statement = null;

        try {
            connectionRemove = ConnectionFactory.getConnection();
            statement = connectionRemove.prepareStatement(sql);

            statement.setInt(1, projetoId);

            statement.execute();
        } catch (SQLException ex) {
            throw new RuntimeException("Erro no ato de remover informações do bando de dados." + ex.getMessage(), ex);
        } finally {
            ConnectionFactory.closeConnection(connectionRemove, statement);
        }
    }

    public List<Projeto> getAll() {
        String sql = "SELECT * FROM PROJETO";

        Connection connectionId = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        List<Projeto> projetos = new ArrayList<>();

        try {
            connectionId = ConnectionFactory.getConnection();
            statement = connectionId.prepareStatement(sql);

            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Projeto projeto = new Projeto();

                projeto.setId(resultSet.getInt("ID"));
                projeto.setNome(resultSet.getString("NOME"));
                projeto.setDescricao(resultSet.getString("DESCRICAO"));
                projeto.setDataCriacao(resultSet.getDate("DATACRIACAO"));
                projeto.setDataAtualizacao(resultSet.getDate("ATUALIZACAO"));

                projetos.add(projeto);
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao tentar fazer busca no bando de dados." + ex.getMessage(), ex);
        } finally {
            ConnectionFactory.closeConnection(connectionId, statement, resultSet);
        }
        return projetos;
    }
}
