package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.da */
abstract class AbstractC25885da<T> implements Iterator<T> {

    /* renamed from: a */
    private int f61019a;

    /* renamed from: b */
    private int f61020b;

    /* renamed from: c */
    private int f61021c;

    /* renamed from: d */
    private final /* synthetic */ C25881cx f61022d;

    static {
        Covode.recordClassIndex(31300);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract T mo42239a(int i);

    public boolean hasNext() {
        if (this.f61020b >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final void m50099a() {
        if (this.f61022d.f61012f != this.f61019a) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public T next() {
        m50099a();
        if (hasNext()) {
            int i = this.f61020b;
            this.f61021c = i;
            T a = mo42239a(i);
            this.f61020b = this.f61022d.mo42240a(this.f61020b);
            return a;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        boolean z;
        m50099a();
        if (this.f61021c >= 0) {
            z = true;
        } else {
            z = false;
        }
        C25866ci.m50071b(z, "no calls to next() since the last call to remove()");
        this.f61019a += 32;
        C25881cx cxVar = this.f61022d;
        cxVar.remove(cxVar.f61010d[this.f61021c]);
        this.f61020b--;
        this.f61021c = -1;
    }

    private AbstractC25885da(C25881cx cxVar) {
        this.f61022d = cxVar;
        this.f61019a = cxVar.f61012f;
        this.f61020b = cxVar.mo42251e();
        this.f61021c = -1;
    }

    /* synthetic */ AbstractC25885da(C25881cx cxVar, byte b) {
        this(cxVar);
    }
}
