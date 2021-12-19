package com.google.android.gms.internal.p1948g;

import com.bytedance.covode.number.Covode;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.g.j */
public final class C25750j {

    /* renamed from: a */
    private final ConcurrentHashMap<C25753m, List<Throwable>> f60870a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f60871b = new ReferenceQueue<>();

    static {
        Covode.recordClassIndex(31165);
    }

    C25750j() {
    }

    /* renamed from: a */
    public final List<Throwable> mo41981a(Throwable th) {
        Reference<? extends Throwable> poll = this.f60871b.poll();
        while (poll != null) {
            this.f60870a.remove(poll);
            poll = this.f60871b.poll();
        }
        List<Throwable> list = this.f60870a.get(new C25753m(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f60870a.putIfAbsent(new C25753m(th, this.f60871b), vector);
        if (putIfAbsent == null) {
            return vector;
        }
        return putIfAbsent;
    }
}
