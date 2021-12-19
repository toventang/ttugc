package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.in */
final class C26044in implements Iterator<Map.Entry<K, V>> {

    /* renamed from: a */
    private int f61349a;

    /* renamed from: b */
    private Iterator<Map.Entry<K, V>> f61350b;

    /* renamed from: c */
    private final /* synthetic */ C26042il f61351c;

    static {
        Covode.recordClassIndex(31459);
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    private final Iterator<Map.Entry<K, V>> m50889a() {
        if (this.f61350b == null) {
            this.f61350b = this.f61351c.f61341d.entrySet().iterator();
        }
        return this.f61350b;
    }

    public final boolean hasNext() {
        int i = this.f61349a;
        if ((i <= 0 || i > this.f61351c.f61338a.size()) && !m50889a().hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (m50889a().hasNext()) {
            return m50889a().next();
        }
        List<C26051iu> list = this.f61351c.f61338a;
        int i = this.f61349a - 1;
        this.f61349a = i;
        return list.get(i);
    }

    private C26044in(C26042il ilVar) {
        this.f61351c = ilVar;
        this.f61349a = ilVar.f61338a.size();
    }

    /* synthetic */ C26044in(C26042il ilVar, byte b) {
        this(ilVar);
    }
}
