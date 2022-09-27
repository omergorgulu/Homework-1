package abstractclassdemo;

public class SqlServerDatabaseManager extends BaseDatabaseManager{
    @Override
    public void getData() {
        System.out.println("Veriler Sql Server'dan çekildi");
    }

}
