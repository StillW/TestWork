package test;

import comporator.SercviceCostsComparator;
import pojo.FixedHourlyCostPaidService;
import pojo.FixedMonthlyCostPaidService;
import pojo.PaidService;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Still on 02.08.2015.
 */
public class Test {

    public static void main(String[] args){

        Set<PaidService> list = new TreeSet<>(new SercviceCostsComparator());

        list.add(new FixedHourlyCostPaidService("service1","Google Orkut", 11));
        list.add(new FixedHourlyCostPaidService("service2","Google voice", 9.4));
        list.add(new FixedMonthlyCostPaidService("service5","YouTube", 8064));
        list.add(new FixedHourlyCostPaidService("service3","Mandrill", 11.2));
        list.add(new FixedHourlyCostPaidService("service4","Google Finance", 7.8));
        list.add(new FixedMonthlyCostPaidService("service7","Google Building Maker", 5347));
        list.add(new FixedMonthlyCostPaidService("service6","LinkedIn",6863));

        for (PaidService i: list)

            System.out.println(i.toString());
    }

}

