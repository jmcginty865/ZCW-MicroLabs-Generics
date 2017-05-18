package TableNested;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
class TableNested<K, V> {


    class Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }


    private ArrayList<Table.Entry<K, V>> entries = new ArrayList<>();


    public V get(K key) {
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getKey().equals(key)) {
                Table.Entry<K, V> match = entries.get(i);
                return match.getValue();
            }
        }
        return null;
    }

    public void put(K key, V value) {
        boolean keyIsThere = false;
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getKey().equals(key)) {
                entries.set(i, new Table.Entry<K, V>(key, value));
                keyIsThere = true;
            }
        }
        if (!keyIsThere) {
            Table.Entry<K, V> anotherEntry = new Table.Entry<K, V>(key, value);
            entries.add(anotherEntry);
        }
    }

    public void remove(K key) {
        for (int i = 0; i < entries.size(); i++) {
            Table.Entry<K, V> recentEntry = entries.get(i);
            if (recentEntry.getKey().equals(key)) {
                entries.remove(i);
            }
        }

    }
}

