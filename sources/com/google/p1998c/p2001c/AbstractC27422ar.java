package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.c.c.ar */
public interface AbstractC27422ar<K, V> {
    static {
        Covode.recordClassIndex(33002);
    }

    Map<K, Collection<V>> asMap();

    void clear();

    boolean containsEntry(Object obj, Object obj2);

    boolean containsKey(Object obj);

    Collection<Map.Entry<K, V>> entries();

    Collection<V> get(K k);

    boolean isEmpty();

    Set<K> keySet();

    boolean put(K k, V v);

    boolean remove(Object obj, Object obj2);

    Collection<V> removeAll(Object obj);

    int size();
}
