package control;

import dao.RefundDAO;
import model.Refund;
import java.util.List;
import tabel.TableRefund;

public class RefundControl {
    private RefundDAO rDao = new RefundDAO();
    
    public void insertDataRefund(Refund r){
        rDao.insertRefund(r);
    }
    
    public TableRefund showdataRefund(String query){
        List<Refund> dataRefund = rDao.showRefund(query);
        TableRefund tr = new TableRefund(dataRefund);
        
        return tr;
    }
    
    public void deleteDataRefund(int id){
        rDao.deleteRefund(id);
    }
}
