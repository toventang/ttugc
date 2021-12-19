package com.p2082ss.android.ugc.effectmanager.common;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ss.android.ugc.effectmanager.common.Multimap */
public class Multimap<K, V> {
    private HashMap<K, Collection<V>> mInternalHashMap = new HashMap<>();

    static {
        Covode.recordClassIndex(95424);
    }

    /* renamed from: com.ss.android.ugc.effectmanager.common.Multimap$Entry */
    public static class Entry<K, V> {
        K mKey;
        V mValue;

        static {
            Covode.recordClassIndex(95425);
        }

        public K getKey() {
            return this.mKey;
        }

        public V getValue() {
            return this.mValue;
        }

        public int hashCode() {
            return (this.mKey.hashCode() * 31) + this.mValue.hashCode();
        }

        public void setKey(K k) {
            this.mKey = k;
        }

        public void setValue(V v) {
            this.mValue = v;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Entry entry = (Entry) obj;
            if (!this.mKey.equals(entry.mKey)) {
                return false;
            }
            return this.mValue.equals(entry.mValue);
        }

        Entry(K k, V v) {
            this.mKey = k;
            this.mValue = v;
        }
    }

    public Set<K> keySet() {
        return this.mInternalHashMap.keySet();
    }

    public Set<Entry<K, V>> entrySet() {
        HashSet hashSet = new HashSet();
        for (K k : keySet()) {
            for (V v : get(k)) {
                hashSet.add(new Entry(k, v));
            }
        }
        return hashSet;
    }

    public Collection<V> values() {
        Collection<Collection<V>> values = this.mInternalHashMap.values();
        ArrayList arrayList = new ArrayList();
        for (Collection<V> collection : values) {
            arrayList.addAll(collection);
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public boolean containsKey(K k) {
        return this.mInternalHashMap.containsKey(k);
    }

    public Collection<V> get(K k) {
        Collection<V> collection = this.mInternalHashMap.get(k);
        if (collection == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableCollection(collection);
    }

    public boolean containsEntry(K k, V v) {
        return get(k).contains(v);
    }

    public void put(K k, V v) {
        Collection<V> collection = this.mInternalHashMap.get(k);
        if (collection == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(v);
            this.mInternalHashMap.put(k, arrayList);
            return;
        }
        collection.add(v);
    }

    public boolean remove(K k, V v) {
        Collection<V> collection = this.mInternalHashMap.get(k);
        if (collection == null) {
            return false;
        }
        boolean remove = collection.remove(v);
        if (remove && collection.isEmpty()) {
            this.mInternalHashMap.remove(k);
        }
        return remove;
    }
}
