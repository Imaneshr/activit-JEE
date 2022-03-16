package dao;

public class DaoImpl  implements IDao{
    @Override
     public double getData(){
        System.out.println("resultat Version donnée");
        double data=100;
        return data;
    }

}
