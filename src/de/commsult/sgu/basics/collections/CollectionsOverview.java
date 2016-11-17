package de.commsult.sgu.basics.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsOverview {

    public static void main(String[] args) {
        List<String> listA = new ArrayList<String>();

        listA.add("element 1");
        listA.add("element 2");
        listA.add("element 3");
        listA.add(0, "element 0");
        listA.add("element 3");
        /*
         * element 0
         * element 1
         * element 2
         * element 3
         * element 3
         */
        for (String s : listA) {
            System.out.println(s);
        }
        
        
        
        Set<String> set = new TreeSet<String>();
        set.add("setelement 1");
        set.add("setelement 2");
        set.add("setelement 3");
        set.add("setelement 1");
        /*
         * setelement 1
         * setelement 2
         * setelement 3
         */
        for (String s : set) {
            System.out.println(s);
        }
        
    }

}
