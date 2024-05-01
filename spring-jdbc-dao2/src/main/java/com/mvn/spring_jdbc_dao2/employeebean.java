   import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.JdbcTemplate;

public class employeebean {
    private int empId;
    private String empName;
    private double empSalary;
    private int deptNo;
    private JdbcTemplate jt;

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getEmpId() {
        return this.empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpName() {
        return this.empName;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public double getEmpSalary() {
        return this.empSalary;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    public int getDeptNo() {
        return this.deptNo;
    }

    public void setJt(JdbcTemplate jt) {
        this.jt = jt;
    }

    public JdbcTemplate getJt() {
        return this.jt;
    }

    public void createTable() {
        jt.execute("create table Employee(empId int, empName varchar(20), empSalary int, deptNo int)");
        System.out.println("Table created");
    }

    public void updateRecord() {
        int updatedRows = jt.update("update Employee set empName = 'divya' where empId = 101");
        System.out.println(updatedRows + " record(s) updated");
    }

    public void deleteRecord() {
        int deletedRows = jt.update("delete from Employee where empId = 101");
        System.out.println(deletedRows + " record(s) deleted");
    }

    public void getOneRecord() {
        List<Map<String, Object>> oneRecord = jt.queryForList("select * from Employee where empId = 101");
        Iterator<Map<String, Object>> it = oneRecord.iterator();
        while (it.hasNext()) {
            Map<String, Object> row = it.next();
            System.out.println(row);
        }
    }
}
