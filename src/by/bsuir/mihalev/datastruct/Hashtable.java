package by.bsuir.mihalev.datastruct;

import java.util.ArrayList;

public class Hashtable {
    private class Pair{
        String key, value;

        public Pair(String key, String value){
            this.key=key;
            this.value=value;
        }
        public String getKey(){
            return key;
        }
        public String getValue(){
            return value;
        }
    }

    private int tableSize;
    private ArrayList<Pair>[]  table;

    public Hashtable(int tableSize){
        this.tableSize=tableSize;
        table = new ArrayList[tableSize];
        for (int i = 0; i < tableSize; i++){
            table[i] = new ArrayList<>();
        }
    }

    private int getHash(String key){

        int h = key.length() % tableSize;
        System.out.println("getHash(" + key + ") = " + h);
        return h;
    }

    public void add(String key,String value){
        int h = getHash(key);
        int n = table[h].size();
        for (int i = 0; i < n; i++){
            if (table[h].get(i).getKey() == key){
                System.out.println("This key already exist!");
                return;
            }
        }
        table[h].add(new Pair(key,value));
        System.out.println("Successfully added");
    }

    public String get(String key){
        int h = getHash(key);
        int n = table[h].size();

        for (int i = 0; i < n; i++){
            if (table[h].get(i).getKey() == key){
                return table[h].get(i).getValue();
            }
        }
        System.out.println("This key doesn't exist");
        return null;
    }

    public void delete(String key){
        int h = getHash(key);
        int n = table[h].size();
        for (int i = 0; i < n; i++){
            if (table[h].get(i).getKey() == key){
                table[h].remove(i);
                System.out.println("Successfully deleted");
                return;
            }
        }
        System.out.println("This key doesn't exist");
    }
}
