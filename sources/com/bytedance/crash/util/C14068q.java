package com.bytedance.crash.util;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.bytedance.crash.util.q */
public class C14068q<K, V> extends HashMap<K, List<V>> {
    private static final long serialVersionUID = -8278080958339137414L;

    static {
        Covode.recordClassIndex(16135);
    }

    public List<V> newList() {
        return new ArrayList();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.crash.util.q<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    public List<V> getList(K k) {
        List<V> list = (List) super.get(k);
        if (list != null) {
            return list;
        }
        List<V> newList = newList();
        put(k, newList);
        return newList;
    }

    public void removeAll(V v) {
        for (V v2 : values()) {
            v2.remove(v);
        }
    }

    public void add(K k, V v) {
        getList(k).add(v);
    }

    public void removeInList(K k, V v) {
        getList(k).remove(v);
    }

    public void addMulti(V v, K... kArr) {
        if (!(v == null || kArr == null || kArr.length <= 0)) {
            for (K k : kArr) {
                getList(k).add(v);
            }
        }
    }
}
