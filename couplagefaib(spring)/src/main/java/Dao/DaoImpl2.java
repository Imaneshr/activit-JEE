package Dao;

import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoImpl2 implements Dao{
    @Override
    public double getData(){
        System.out.println("resultat version données");
        double data=25;
        return data;
    }

}