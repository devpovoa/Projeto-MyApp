
package MyApp;

import Util.ConnectionFactory;
import java.sql.Connection;

    class App {
        public static void main(String[] args) {
            Connection conexao = ConnectionFactory.getConnection();
            
            ConnectionFactory.closeConnection(conexao);
        }
    
}
