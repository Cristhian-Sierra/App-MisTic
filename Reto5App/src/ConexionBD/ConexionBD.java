/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionBD;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



import javax.swing.JOptionPane;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Cristhian Sierra
 */
public class ConexionBD {
    //Variable privada de tipo Connection que almacenará el atributo conexion
    private Connection conexion;
    //Variable privada de tipo String que almacenará el atributo bd
    private String bd;
    //Variable privada de tipo String que almacenará el atributo ususario
    private String usuario; 
   //Variable privada de tipo String que almacenará el atributo clave
    private String clave;
    //Variable privada de tipo String que almacenará el atributo mensaje
    private String mensaje;

    /**
     *Constructor parametrico de la clase ConexionBD que se encargará de instanciar las variables  
     * @param conexion
     * @param bd
     * @param usuario
     * @param clave
     * @param mensaje
     */
    public ConexionBD(Connection conexion, String bd, String usuario, String clave, String mensaje) {
        this.conexion = conexion;
        this.bd = bd;
        this.usuario = usuario;
        this.clave = clave;
        this.mensaje = mensaje;
    }
    
    /**
     *Constructor basico de la clase ConexionBD que se encarga de inicializar las variables
     */
    public ConexionBD() {
        this.conexion = null;
        this.mensaje = "";
    }
     
     JSONParser parser = new JSONParser();
        Connection conn = null;
    
    public void Conectar() {
       try {
           // String url = String.format("jdbc:mysql://%s:%d/%s?useSSL=false", "localhost", username, "pruebamvc");
           String credentials_path = System.getProperty("user.dir") + "/src/ConexionBD/credenciales.json";
            JSONObject jsonObject;
            jsonObject = (JSONObject)parser.parse(new FileReader(credentials_path));
            String host     = (String)jsonObject.get("db_ip");
            String port     = (String)jsonObject.get("dp_port");
            String username = (String)jsonObject.get("db_user");
            String password = (String)jsonObject.get("db_pssword");
            String dbURL = "jdbc:mysql://"+host+":"+port+"/pruebamvc?autoReconnect=true&useSSL=false" ; 
          
            conexion=DriverManager.getConnection(dbURL,username,password);//Crea la conexion con la ruta 
            mensaje= "Conexión exitosa a Base de datos " + bd;
       }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al intentar conectar BD: "+ bd +"\n"+ex);
       } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Error en tipo de datos");
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error en archivo de credenciales");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al mostrar información");
        }
    }   
    
    
   
     /**
     *Retorna el valor de parametro conexion
     * en la clase ConexionBD
     * @return Connection
     */
    public Connection getConexion() {
        return conexion;
    }

    /**
      *Modifica el valor de parametro conexion
     * en la clase ConexionBD
     * @param conexion
     */
    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    /**
      *Retorna el valor de parametro mensaje
     * en la clase ConexionBD
     * @return String
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     *Modifica el valor de parametro mensaje
     * @param mensaje
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }    
    
    
}
