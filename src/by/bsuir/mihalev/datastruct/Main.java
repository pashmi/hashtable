package by.bsuir.mihalev.datastruct;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String key1="Pasha", value1="coffee" ;
        String key2="Denis", value2="tea";
        String key3="Valera", value3="juce";;
        String key4="ZinaidaFedorovna", value4="cucumber brine";;

        Hashtable hashtbl = new Hashtable(10);

        //add
        hashtbl.add(key1,value1);
        hashtbl.add(key2,value2);
        hashtbl.add(key3,value3);
        hashtbl.add(key4,value4);

        //search
        System.out.println("Key 1 = " + key1 + " Value = " + hashtbl.get(key1));
        System.out.println("Key 2 = " + key2 + " Value = " + hashtbl.get(key2));
        System.out.println("Key 3 = " + key3 + " Value = " + hashtbl.get(key3));
        System.out.println("Key 4 = " + key4 + " Value = " + hashtbl.get(key4));

        //delete
        hashtbl.delete(key4);
        System.out.println("Key 4 = " + key4 + " Value = " + hashtbl.get(key4));
        
    }
}
