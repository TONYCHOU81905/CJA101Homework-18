package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class HW8_1 {
	public static void main(String[] args) {
//		Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
//		Object物件、“Snoopy”、BigInteger(“1000”)
	
		HW8_1 hw = new HW8_1();
		Collection<Object> list = new ArrayList<Object>();
		list.add(new Integer(100));
		list.add(new Double(3.14));
		list.add(new Long(21L));
		list.add(new Short("100"));
		list.add(new Object());
		list.add(new Double(5.1));
		list.add("Kitty");
		list.add(new Integer(100));
		list.add("Snoopy");
		list.add(new BigInteger("1000"));
		hw.printIterator(list);
		hw.printTraFor(list);
		hw.printForEach(list);
		hw.remove(list);
		hw.printForEach(list);
		
	}
	
	public void printIterator(Collection<Object> list) {
		System.out.println("===========Iterator=============");
		Iterator<Object> objs = list.iterator();
		while (objs.hasNext())
			System.out.print(objs.next()+",");
	}
	
	public void printTraFor(Collection<Object> list) {
		System.out.println("===========Tradition=============");
		ArrayList<Object> newList = new ArrayList<Object>(list);
		for(int i = 0; i<list.size();i++) {
			System.out.print(newList.get(i)+",");
		}
	}
	
	public void printForEach(Collection<Object> list) {
		System.out.println("===========Tradition=============");
		for(Object obj:list) {
			System.out.print(obj+",");
		}
		
	}
	
    private void remove(Collection<Object> col) {
    	System.out.println("===========移除非Number物件=============");
        Iterator<Object> it = col.iterator();
        while(it.hasNext()) {
            Object obj = it.next();
            if(!(obj instanceof Number)) {
                it.remove();
            }
        }
    }

}
