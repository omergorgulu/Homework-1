package interfaces;

public class MySqlCustomerDal implements CustomerDal,Repository{
    @Override
    public void add() {
        System.out.println("Added to The MySql");
    }
}
