package dao;

// Nama : Vincentius Kenton
// NPM : 210711307

// Nama : Alfa Nada Yulaswara
// NPM : 210711378

import connection.DbConnection;
import model.Pustaka;
import model.Mahasiswa;
import model.Peminjaman;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PeminjamanDAO {
    private DbConnection dbcon = new DbConnection();
    private Connection con;
    
    public void insertPeminjaman(Peminjaman p){
        con = dbcon.makeConnection();
        
        String sql = "INSERT INTO peminjaman(id_pustaka, id_mahasiswa, lama_pinjam, tanggal_peminjaman, kondisi_cacat) VALUES ('"
                + p.getPustaka().getIdPustaka() + "',"
                + p.getMahasiswa().getId() + ",'"
                + p.getLama_pinjam() + "','"
                + p.getTanggal_peminjaman() + "','"
                + p.getKondisi_cacat() + "')";
        System.out.println("Adding data Peminjaman...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added " + result + "Peminjaman");
            statement.close();
        }catch(Exception e){
            System.out.println("Error Adding data Peminjaman...");
            System.out.println("e");
        }
        dbcon.closeConnection();
    }
    
    public List<Peminjaman> showPeminjaman(String query){
        con = dbcon.makeConnection();
        
        String sql = "SELECT pm.*, p.*, m.* FROM peminjaman as pm JOIN pustaka as p ON pm.id_pustaka = p.id_pustaka "
                + "JOIN mahasiswa as m ON pm.id_mahasiswa = m.id WHERE (pm.lama_pinjam LIKE '%" + query + "%'"
                + "OR pm.tanggal_peminjaman LIKE '%" + query + "%'"
                + "OR pm.kondisi_cacat LIKE '%" + query + "%'"
                + "OR p.judul LIKE '%" + query + "%'"
                + "OR p.jenis LIKE '%" + query + "%'"
                + "OR p.edisi LIKE '%" + query + "%'"
                + "OR p.volume LIKE '%" + query + "%'"
                + "OR m.nama LIKE '%" + query + "%')";
        System.out.println("Mengambil data Peminjaman...");
        List<Peminjaman> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    Pustaka p = new Pustaka(rs.getString("id_pustaka"),
                            rs.getString("judul"),
                            rs.getString("jenis"),
                            rs.getString("tahunTerbit"),
                            rs.getString("penerbit"),
                            rs.getInt("edisi"),
                            rs.getInt("volume"));
                
                    Mahasiswa m = new Mahasiswa(rs.getInt("id"),
                                rs.getString("nama"),
                                rs.getString("npm"),
                                rs.getString("no_telepon"));

                    Peminjaman pm = new Peminjaman(Integer.parseInt(rs.getString("id")),
                                rs.getString("lama_pinjam"),
                                rs.getString("tanggal_peminjaman"),
                                rs.getString("kondisi_cacat"),
                                p,m);
                    list.add(pm);
                } 
            }
            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error Reading Database...");
            System.out.println(e);
        }
        dbcon.closeConnection();
        return list;
    }
    
    public void updatePeminjaman (Peminjaman p){
        con = dbcon.makeConnection();
        
        String sql = "UPDATE peminjaman SET id_pustaka = '" + p.getPustaka().getIdPustaka()
                + "', id_mahasiswa = '" + p.getMahasiswa().getId()
                + "', lama_pinjam = '" + p.getLama_pinjam()
                + "', tanggal_peminjaman = '" + p.getTanggal_peminjaman()
                + "', kondisi_cacat = '" + p.getKondisi_cacat()
                + "' WHERE id = '" + p.getId() + "'";
        
        System.out.println("Editing Peminjaman...");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited " + result + " Peminjaman " + p.getId());
            statement.close();
        } catch (Exception e) {
            System.out.println("Error editing Peminjaman...");
            System.out.println(e);
        }
        dbcon.closeConnection();
    }
    
    public void deletePeminjaman(int id){
        con = dbcon.makeConnection();
        
        String sql = "DELETE FROM peminjaman WHERE id = " + id + "";
        System.out.println("Deleting Peminjaman...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Deleted " + result + " Peminjaman " + id);
            statement.close();
        }catch(Exception e){
            System.out.println("Errod Deleting Peminjaman...");
            System.out.println(e);
        }
        dbcon.closeConnection();
    }
    
}
