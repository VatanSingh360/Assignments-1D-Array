import java.util.*;
public class LinkedHS_prac {

        public static void main(String[] args) {
            HashSet hs1 = new HashSet();
            hs1.add(50);
            hs1.add(20);
            hs1.add(30);
            hs1.add(60);
            LinkedHashSet lhs1 = new LinkedHashSet();
            lhs1.add(25);
            lhs1.add(55);
            lhs1.add(35);
            lhs1.add(65);
            System.out.println(hs1);
            System.out.println(lhs1);
        }
    }

