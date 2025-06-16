package day_free1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TestDB {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/scuola";
        String user = "root"; // cambia se hai un altro utente
        String password = ""; // metti la tua password
        
        List<Persona> lista = new ArrayList<>();

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM persone");

            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String cognome = rs.getString("cognome");
                int eta = rs.getInt("eta");
                
                //creazione oggetto persona e aggiunta alla lista
                Persona p = new Persona(id, nome, cognome, eta);
                lista.add(p);

                System.out.println(id + ": " + nome + " " + cognome + ", età " + eta);
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }//stampo oggetti
        for(Persona p : lista) {
        	System.out.println("persone oggetti ");  
        	System.out.println(p);}
    }
}
