package Controller;

import Model.Tarefa;
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
public class TarefaControle {

    public void salvar(Tarefa tarefa) {
        String sql = "INSERT INTO TAREFA ("
                + "IDPROJETO, "
                + "NOME, "
                + "DESCRICAO, "
                + "SITUACAO, "
                + "OBSERVACAO, "
                + "PRAZO,"
                + "DATACRIACAO, "
                + "ATUALIZACAO) "
                + "VALUES (?,?,?,?,?,?,?,?)";

        Connection connectionInserir = null;
        PreparedStatement statement = null;

        try {
            connectionInserir = ConnectionFactory.getConnection();
            statement = connectionInserir.prepareStatement(sql);

            statement.setInt(1, tarefa.getIdProject());
            statement.setString(2, tarefa.getNome());
            statement.setString(3, tarefa.getDescricao());
            statement.setBoolean(4, tarefa.getSituacao());
            statement.setString(5, tarefa.getObservacao());
            statement.setDate(6, new Date(tarefa.getPrazo().getTime()));
            statement.setDate(7, new Date(tarefa.getDataCriacao().getTime()));
            statement.setDate(8, new Date(tarefa.getDataAtualizacao().getTime()));

            statement.execute();

        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao adicinar informações no banco de dados." + ex.getMessage(), ex);
        } finally {
            ConnectionFactory.closeConnection(connectionInserir, statement);

        }

    }

    public void atualizar(Tarefa tarefa) {

        String sql = "UPDATE TAREFA SET "
                + "IDPROJETO = ?, "
                + "NOME = ?, "
                + "DESCRICAO = ?, "
                + "SITUACAO = ?, "
                + "OBSERVACAO = ?, "
                + "PRAZO = ?, "
                + "DATACRIACAO = ?, "
                + "ATUALIZACAO = ?"
                + "WHERE ID = ?";

        Connection connectionAtualiza = null;
        PreparedStatement statement = null;

        try {
            connectionAtualiza = ConnectionFactory.getConnection();
            statement = connectionAtualiza.prepareStatement(sql);

            statement.setInt(1, tarefa.getIdProject());
            statement.setString(2, tarefa.getNome());
            statement.setString(3, tarefa.getDescricao());
            statement.setBoolean(4, tarefa.getSituacao());
            statement.setString(5, tarefa.getObservacao());
            statement.setDate(6, new Date(tarefa.getPrazo().getTime()));
            statement.setDate(7, new Date(tarefa.getDataCriacao().getTime()));
            statement.setDate(8, new Date(tarefa.getDataAtualizacao().getTime()));
            statement.setInt(9, tarefa.getId());

            statement.execute();

        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao atualizar o banco de dados." + ex.getMessage(), ex);
        } finally {
            ConnectionFactory.closeConnection(connectionAtualiza, statement);
        }
    }

    public void removerId(int tarefaId) {
        String sql = "DELETE FROM TAREFA WHERE ID = ?";

        Connection connectionDelete = null;
        PreparedStatement statement = null;

        try {

            connectionDelete = ConnectionFactory.getConnection();
            statement = connectionDelete.prepareStatement(sql);

            statement.setInt(1, tarefaId);

            statement.execute();
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao deletar a tarefa no banco de dados." + ex.getMessage(), ex);
        } finally {
            ConnectionFactory.closeConnection(connectionDelete, statement);
        }

    }

    public List<Tarefa> getAll(int idProjeto) {
        String sql = "SELECT * FROM TAREFA WHERE IDPROJETO = ?";

        Connection connectionAll = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        List<Tarefa> tarefas = new ArrayList<>();

        try {
            connectionAll = ConnectionFactory.getConnection();
            statement = connectionAll.prepareStatement(sql);

            statement.setInt(1, idProjeto);

            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Tarefa tarefa = new Tarefa();

                tarefa.setId(resultSet.getInt("ID"));
                tarefa.setIdProject(resultSet.getInt("IDPROJETO"));
                tarefa.setNome(resultSet.getString("NOME"));
                tarefa.setDescricao(resultSet.getString("DESCRICAO"));
                tarefa.setSituacao(resultSet.getBoolean("SITUACAO"));
                tarefa.setObservacao(resultSet.getString("OBSERVACAO"));
                tarefa.setPrazo(resultSet.getDate("PRAZO"));
                tarefa.setDataCriacao(resultSet.getDate("DATACRIACAO"));
                tarefa.setDataAtualizacao(resultSet.getDate("ATUALIZACAO"));

                tarefas.add(tarefa);
            }

        } catch (SQLException ex) {
            throw new RuntimeException("Erro fazer busca no bando de dados." + ex.getMessage(), ex);
        } finally {
            ConnectionFactory.closeConnection(connectionAll, statement, resultSet);
        }

        return tarefas;
    }
}
