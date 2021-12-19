package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.eo */
public final class C25927eo {

    /* renamed from: a */
    private final ConcurrentHashMap<C25926en, List<Throwable>> f61079a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f61080b = new ReferenceQueue<>();

    static {
        Covode.recordClassIndex(31342);
    }

    C25927eo() {
    }

    /* renamed from: a */
    public final List<Throwable> mo42352a(Throwable th) {
        Reference<? extends Throwable> poll = this.f61080b.poll();
        while (poll != null) {
            this.f61079a.remove(poll);
            poll = this.f61080b.poll();
        }
        List<Throwable> list = this.f61079a.get(new C25926en(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f61079a.putIfAbsent(new C25926en(th, this.f61080b), vector);
        if (putIfAbsent == null) {
            return vector;
        }
        return putIfAbsent;
    }
}
