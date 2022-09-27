package abstractclassdemo;

public class OracleDatabaseManager extends BaseDatabaseManager{
    @Override
    public void getData() {
        System.out.println("Veriler Oracle Db'den çekildi");
    }
}
