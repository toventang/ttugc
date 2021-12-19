package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.it */
final class C26050it implements Iterator<Map.Entry<K, V>> {

    /* renamed from: a */
    private int f61355a;

    /* renamed from: b */
    private boolean f61356b;

    /* renamed from: c */
    private Iterator<Map.Entry<K, V>> f61357c;

    /* renamed from: d */
    private final /* synthetic */ C26042il f61358d;

    static {
        Covode.recordClassIndex(31465);
    }

    /* renamed from: a */
    private final Iterator<Map.Entry<K, V>> m50891a() {
        if (this.f61357c == null) {
            this.f61357c = this.f61358d.f61339b.entrySet().iterator();
        }
        return this.f61357c;
    }

    public final boolean hasNext() {
        if (this.f61355a + 1 < this.f61358d.f61338a.size() || (!this.f61358d.f61339b.isEmpty() && m50891a().hasNext())) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.f61356b = true;
        int i = this.f61355a + 1;
        this.f61355a = i;
        if (i < this.f61358d.f61338a.size()) {
            return this.f61358d.f61338a.get(this.f61355a);
        }
        return m50891a().next();
    }

    public final void remove() {
        if (this.f61356b) {
            this.f61356b = false;
            this.f61358d.mo42718e();
            if (this.f61355a < this.f61358d.f61338a.size()) {
                C26042il ilVar = this.f61358d;
                int i = this.f61355a;
                this.f61355a = i - 1;
                ilVar.mo42714c(i);
                return;
            }
            m50891a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    private C26050it(C26042il ilVar) {
        this.f61358d = ilVar;
        this.f61355a = -1;
    }

    /* synthetic */ C26050it(C26042il ilVar, byte b) {
        this(ilVar);
    }
}
