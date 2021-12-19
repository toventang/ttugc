package com.bytedance.common.utility.collection;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: com.bytedance.common.utility.collection.d */
public class C13605d<E> implements Iterable<E> {

    /* renamed from: a */
    public final WeakHashMap<E, Object> f33081a = new WeakHashMap<>();

    /* renamed from: b */
    private final Object f33082b = new Object();

    static {
        Covode.recordClassIndex(15632);
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        ArrayList arrayList = new ArrayList(this.f33081a.size());
        for (E e : this.f33081a.keySet()) {
            if (e != null) {
                arrayList.add(e);
            }
        }
        return arrayList.iterator();
    }

    /* renamed from: a */
    public final void mo21864a(E e) {
        if (e == null) {
            this.f33081a.size();
        } else {
            this.f33081a.put(e, this.f33082b);
        }
    }

    /* renamed from: b */
    public final void mo21865b(E e) {
        if (e == null) {
            this.f33081a.size();
        } else {
            this.f33081a.remove(e);
        }
    }
}
