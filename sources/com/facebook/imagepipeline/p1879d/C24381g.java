package com.facebook.imagepipeline.p1879d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1832d.AbstractC24092j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.d.g */
public final class C24381g<K, V> {

    /* renamed from: a */
    private final AbstractC24405w<V> f57820a;

    /* renamed from: b */
    private final LinkedHashMap<K, V> f57821b = new LinkedHashMap<>();

    /* renamed from: c */
    private int f57822c = 0;

    static {
        Covode.recordClassIndex(28524);
    }

    /* renamed from: b */
    public final synchronized int mo40195b() {
        int i;
        MethodCollector.m26663i(3306);
        i = this.f57822c;
        MethodCollector.m26664o(3306);
        return i;
    }

    /* renamed from: a */
    public final synchronized int mo40191a() {
        int size;
        MethodCollector.m26663i(3305);
        size = this.f57821b.size();
        MethodCollector.m26664o(3305);
        return size;
    }

    /* renamed from: c */
    public final synchronized K mo40197c() {
        MethodCollector.m26663i(3308);
        if (this.f57821b.isEmpty()) {
            MethodCollector.m26664o(3308);
            return null;
        }
        K next = this.f57821b.keySet().iterator().next();
        MethodCollector.m26664o(3308);
        return next;
    }

    /* renamed from: d */
    public final synchronized ArrayList<V> mo40199d() {
        ArrayList<V> arrayList;
        MethodCollector.m26663i(3552);
        arrayList = new ArrayList<>(this.f57821b.values());
        this.f57821b.clear();
        this.f57822c = 0;
        MethodCollector.m26664o(3552);
        return arrayList;
    }

    public C24381g(AbstractC24405w<V> wVar) {
        this.f57820a = wVar;
    }

    /* renamed from: d */
    private int m46403d(V v) {
        if (v == null) {
            return 0;
        }
        return this.f57820a.mo34215a(v);
    }

    /* renamed from: b */
    public final synchronized V mo40196b(K k) {
        V v;
        MethodCollector.m26663i(3452);
        v = this.f57821b.get(k);
        MethodCollector.m26664o(3452);
        return v;
    }

    /* renamed from: c */
    public final synchronized V mo40198c(K k) {
        V remove;
        MethodCollector.m26663i(3533);
        remove = this.f57821b.remove(k);
        this.f57822c -= m46403d(remove);
        MethodCollector.m26664o(3533);
        return remove;
    }

    /* renamed from: a */
    public final synchronized ArrayList<V> mo40193a(AbstractC24092j<K> jVar) {
        ArrayList<V> arrayList;
        MethodCollector.m26663i(3544);
        arrayList = new ArrayList<>();
        Iterator<Map.Entry<K, V>> it = this.f57821b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (jVar == null || jVar.mo39650a(next.getKey())) {
                arrayList.add(next.getValue());
                this.f57822c -= m46403d(next.getValue());
                it.remove();
            }
        }
        MethodCollector.m26664o(3544);
        return arrayList;
    }

    /* renamed from: a */
    public final synchronized boolean mo40194a(K k) {
        boolean containsKey;
        MethodCollector.m26663i(3310);
        containsKey = this.f57821b.containsKey(k);
        MethodCollector.m26664o(3310);
        return containsKey;
    }

    /* renamed from: a */
    public final synchronized V mo40192a(K k, V v) {
        V remove;
        MethodCollector.m26663i(3530);
        remove = this.f57821b.remove(k);
        this.f57822c -= m46403d(remove);
        this.f57821b.put(k, v);
        this.f57822c += m46403d(v);
        MethodCollector.m26664o(3530);
        return remove;
    }
}
