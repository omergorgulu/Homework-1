package abstractclassdemo;

public class MySqlDatabaseManager extends BaseDatabaseManager{
    @Override
    public void getData() {
        System.out.println("Veriler MySql'den çekildi");
    }

}
