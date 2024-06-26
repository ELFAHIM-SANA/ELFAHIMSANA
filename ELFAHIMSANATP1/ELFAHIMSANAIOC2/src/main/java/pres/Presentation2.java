package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner= new Scanner(new File("Configue.txt"));
        String daoClasseName= scanner.nextLine();
        Class cDao= Class.forName(daoClasseName);
        IDao dao = (IDao) cDao.newInstance();
        System.out.println(dao.getData());

        String metierClassName = scanner.nextLine();
        Class cMetier =Class.forName(metierClassName);
        IMetier metier= (IMetier) cMetier.newInstance();

        Method method= cMetier.getMethod("setDao", IDao.class);
        //metier.setIDao(dao)
        method.invoke(metier,dao);
        System.out.println("Résultat" + metier.calcul());
    }
}
