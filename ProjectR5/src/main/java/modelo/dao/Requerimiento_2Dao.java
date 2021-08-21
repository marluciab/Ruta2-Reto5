package modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.vo.Requerimiento_2Vo;
import util.JDBCUtilities;

public class Requerimiento_2Dao {
    public ArrayList<Requerimiento_2Vo> requerimiento2() throws SQLException {
        // Su código
        Connection connection = JDBCUtilities.getConnection();
        ArrayList<Requerimiento_2Vo> listado_registros_rq1 = new ArrayList<Requerimiento_2Vo>();
        String sql = "SELECT c.ID_Proyecto, mc.Nombre_Material FROM Compra c, MaterialConstruccion mc " +
        "ON (c.ID_MaterialConstruccion=mc.ID_MaterialConstruccion) WHERE c.ID_Proyecto IN (12,15,18)" +
        "ORDER BY c.ID_Proyecto DESC;";
        try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Requerimiento_2Vo requerimiento2 = new Requerimiento_2Vo();
                requerimiento2.setIdProyecto(rs.getInt("ID_Proyecto"));
                requerimiento2.setNombreMaterial(rs.getString("Nombre_Material"));
                listado_registros_rq1.add(requerimiento2);
            }
        }
        return listado_registros_rq1;
    }
}