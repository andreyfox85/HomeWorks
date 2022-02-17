import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class HW5 {


    public static void main(String[] args) {
        List<Integer> sortList = new ArrayList<>();
        for (int i=0;i<1000000;i++){
            sortList.add(new Double(Math.random()*Integer.MAX_VALUE).intValue());
        }
        Date startDate = new Date();
        //Сортировка
        long duration = startDate.getTime() - new Date().getTime();
        System.out.println("My sort time = "+ duration);
        startDate = new Date();
        Collections.sort(sortList);
        duration = startDate.getTime() - new Date().getTime();
        System.out.println("My sort time = "+ duration);
    }

}
