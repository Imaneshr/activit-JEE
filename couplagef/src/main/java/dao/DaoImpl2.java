package dao;

public class DaoImpl2 implements IDao{
        @Override
        public double getData(){
            System.out.println("resultat La Version Capteur");
            double data=100;
            return data;
        }
}
