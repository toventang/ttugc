package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.iv */
public class C26052iv extends AbstractSet<Map.Entry<K, V>> {

    /* renamed from: a */
    private final /* synthetic */ C26042il f61362a;

    static {
        Covode.recordClassIndex(31467);
    }

    public void clear() {
        this.f61362a.clear();
    }

    public int size() {
        return this.f61362a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return new C26050it(this.f61362a, (byte) 0);
    }

    private C26052iv(C26042il ilVar) {
        this.f61362a = ilVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f61362a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f61362a.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 == value) {
            return true;
        }
        if (obj2 == null || !obj2.equals(value)) {
            return false;
        }
        return true;
    }

    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f61362a.remove(entry.getKey());
        return true;
    }

    /* synthetic */ C26052iv(C26042il ilVar, byte b) {
        this(ilVar);
    }
}
