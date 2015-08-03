package test;

import comporator.SercviceCostsComparator;
import pojo.FixedHourlyCostPaidService;
import pojo.FixedMonthlyCostPaidService;
import pojo.PaidService;

import java.util.ArrayList;
import java.util.Collections;


/**
 * Created by Still on 02.08.2015.
 */
public class Test {

    public static void main(String[] args){

        ArrayList<PaidService> list = new ArrayList<PaidService>();

        list.add(new FixedHourlyCostPaidService("service1","Google Orkut", 11));
        list.add(new FixedHourlyCostPaidService("service2","Google voice", 9.4));
        list.add(new FixedMonthlyCostPaidService("service5","YouTube", 8064));
        list.add(new FixedHourlyCostPaidService("service3","Mandrill", 11.2));
        list.add(new FixedHourlyCostPaidService("service4","Google Finance", 7.8));
        list.add(new FixedMonthlyCostPaidService("service7","Google Building Maker", 5347));
        list.add(new FixedMonthlyCostPaidService("service6","LinkedIn",6863));

        Collections.sort(list, new SercviceCostsComparator());

        for (PaidService i: list)

            System.out.println(i.getId()+"/"+i.getName()+"/"+ i.getCosts());
            //System.out.println(i.getId());
    }

}

