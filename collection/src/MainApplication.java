import out.main.sample.SArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class MainApplication {
    public static void main(String[] args) {
        ArrayList<String> javaArrayList = new ArrayList<>();
        SArrayList<String> sArrayList = new SArrayList<>();

        // 1. size()
        // 2. isEmpty()
        System.out.println("1. size() , 2. isEmpty() ----------------------------------------------------------------");
        System.out.println("  - JAVA   : toString() = " + javaArrayList + ", size() = " + javaArrayList.size() + ", isEmpty() = " + javaArrayList.isEmpty());
        System.out.println("  - SArray : toString() = " + sArrayList + ", size() = " + sArrayList.size() + ", isEmpty() = " + sArrayList.isEmpty());

        // 3. add()
        javaArrayList.add("0");
        javaArrayList.add("1");
        javaArrayList.add("2");

        sArrayList.add("0");
        sArrayList.add("1");
        sArrayList.add("2");
        System.out.println("3. add() --------------------------------------------------------------------------------");
        System.out.println("  add(\"0\"), add(\"1\"), add(\"2\")");
        System.out.println("  - JAVA   : toString() = " + javaArrayList + ", size() = " + javaArrayList.size() + ", isEmpty() = " + javaArrayList.isEmpty());
        System.out.println("  - SArray : toString() = " + sArrayList + ", size() = " + sArrayList.size() + ", isEmpty() = " + sArrayList.isEmpty());

        // 4. add(index, element)
        javaArrayList.add(2,"element");
        sArrayList.add(2,"element");
        System.out.println("4. add(index, element) ------------------------------------------------------------------");
        System.out.println("   add(2, \"element\")");
        System.out.println("  - JAVA   : toString() = " + javaArrayList + ", size() = " + javaArrayList.size() + ", isEmpty() = " + javaArrayList.isEmpty());
        System.out.println("  - SArray : toString() = " + sArrayList + ", size() = " + sArrayList.size() + ", isEmpty() = " + sArrayList.isEmpty());

        // 5. get(), set()
        System.out.println("5. get(), set() -------------------------------------------------------------------------");
        System.out.println("  - java   : set(2, \"set\") = " + javaArrayList.set(2, "set"));
        System.out.println("             get(2) = " + javaArrayList.get(2));
        System.out.println("  - SArray : set(2, \"set\") = " + sArrayList.set(2, "set"));
        System.out.println("             get(2) = " + sArrayList.get(2));

        // 6. contains()
        System.out.println("6. contains() ---------------------------------------------------------------------------");
        System.out.println("  - java   : contains(\"0\") = " + javaArrayList.contains("0"));
        System.out.println("             contains(\"100\") = " + javaArrayList.contains("100"));
        System.out.println("  - SArray : contains(\"0\") = " + sArrayList.contains("0")) ;
        System.out.println("             contains(\"100\") = " + sArrayList.contains("100")) ;

        // 7. remove(index), remove(Object)
        System.out.println("7. remove() -----------------------------------------------------------------------------");
        System.out.println("  - java   : remove(2) = " + javaArrayList.remove(2));
        System.out.println("              => " + javaArrayList);
        System.out.println("             remove(\"0\") = " + javaArrayList.remove("0"));
        System.out.println("              => " + javaArrayList);
        System.out.println("  - SArray : remove(2) = " + sArrayList.remove(2)) ;
        System.out.println("              => " + sArrayList);
        System.out.println("             remove(\"0\") = " + sArrayList.remove("0"));
        System.out.println("              => " + sArrayList);

        // 8. clear()
        javaArrayList.clear();
        sArrayList.clear();
        System.out.println("8. clear() ------------------------------------------------------------------------------");
        System.out.println("  - java   : javaArrayList = " + javaArrayList + ", size() = " +  javaArrayList.size() + ", isEmpty() = " + javaArrayList.isEmpty());
        System.out.println("  - SArray : sArrayList = " + sArrayList  + ", size() = " +  sArrayList.size() + ", isEmpty() = " + sArrayList.isEmpty()) ;

        javaArrayList.add("0");     // 0
        javaArrayList.add("중복");   // 1
        javaArrayList.add("2");     // 2
        javaArrayList.add("3");     // 3
        javaArrayList.add("중복");   // 4
        sArrayList.add("0");
        sArrayList.add("중복");
        sArrayList.add("2");
        sArrayList.add("3");
        sArrayList.add("중복");

        // 9. indexOf(Object)
        System.out.println("9. indexOf() ----------------------------------------------------------------------------");
        System.out.println("  - java   : " + javaArrayList);
        System.out.println("             indexOf(\"0\") = " + javaArrayList.indexOf("0"));
        System.out.println("             indexOf(\"이건없지\") = " + javaArrayList.indexOf("이건없지"));
        System.out.println("  - SArray : " + sArrayList) ;
        System.out.println("             indexOf(\"0\") = " + sArrayList.indexOf("0")) ;
        System.out.println("             indexOf(\"이건없지\") = " + sArrayList.indexOf("이건없지"));

        // 10. lastIndexOf(Object)
        System.out.println("10. lastIndexOf() -----------------------------------------------------------------------");
        System.out.println("  - java   : " + javaArrayList);
        System.out.println("             lastIndexOf(\"0\") = " + javaArrayList.lastIndexOf("0"));
        System.out.println("             lastIndexOf(\"중복\") = " + javaArrayList.lastIndexOf("중복"));
        System.out.println("  - SArray : " + sArrayList) ;
        System.out.println("             lastIndexOf(\"0\") = " + sArrayList.lastIndexOf("0")) ;
        System.out.println("             lastIndexOf(\"중복\") = " + sArrayList.lastIndexOf("중복"));

        // 11. subList()
        System.out.println("11. subList() ---------------------------------------------------------------------------");
        System.out.println("  - java   : " + javaArrayList);
        System.out.println("             subList(1, 3) = " + javaArrayList.subList(1, 3));
        System.out.println("  - SArray : " + sArrayList);
        System.out.println("             subList(1, 3) = " + sArrayList.subList(1, 3)) ;

        // 12. toArray()
        System.out.println("12. toArray() ---------------------------------------------------------------------------");
        Object[] javaArray = javaArrayList.toArray();
        Object[] SArray = sArrayList.toArray();
        System.out.println("  - java   : javaArrayList = [" + javaArray[0] + ", " + javaArray[1] + ", " + javaArray[2] + ", " + javaArray[3] + ", " + javaArray[4] + "]" );
        System.out.println("  - SArray : sArrayList = [" + SArray[0] + ", " + SArray[1] + ", " + SArray[2] + ", " + SArray[3] + ", " + SArray[4] + "]" );

        // 13. Iterator()
        Iterator javaIter = javaArrayList.iterator();
        Iterator sIter = sArrayList.iterator();
        System.out.println("13. Iterator() --------------------------------------------------------------------------");
        System.out.println(" 1) Java Iterator 사용 전");
        System.out.println("  - javaArrayList = " + javaArrayList);
        System.out.println("  - hasNext() = " + javaIter.hasNext());

        int index = 0;
        while (javaIter.hasNext()){
            Object ob = javaIter.next();
            if(index == 1) javaIter.remove();
            index++;
        }

        System.out.println(" 2) Java Iterator 사용 후 - if(index == 1) javaIter.remove()");
        System.out.println("  - javaArrayList = " + javaArrayList);
        System.out.println("  - hasNext() = " + javaIter.hasNext());
        System.out.println("------------------------------------------");

        System.out.println(" 3) sArray Iterator 사용 전");
        System.out.println("  - sArrayList = " + sArrayList);
        System.out.println("  - hasNext() = " + sIter.hasNext());

        index = 0;
        while (sIter.hasNext()){
            Object ob = sIter.next();
            if(index == 1) sIter.remove();
            index++;
        }

        System.out.println(" 4) sArray Iterator 사용 후 - if(index == 1) sIter.remove()");
        System.out.println("  - sArrayList = " + sArrayList);
        System.out.println("  - hasNext() = " + sIter.hasNext());
        System.out.println("-- 끝 ! ----------------------------------------------------------------------------------");

    }

}
