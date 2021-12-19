package com.google.android.play.core.p1963b;

import com.bytedance.covode.number.Covode;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.play.core.b.bb */
final class C26911bb {

    /* renamed from: a */
    private final ConcurrentHashMap<C26910ba, List<Throwable>> f63797a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f63798b = new ReferenceQueue<>();

    static {
        Covode.recordClassIndex(32386);
    }

    C26911bb() {
    }

    /* renamed from: a */
    public final List<Throwable> mo44602a(Throwable th) {
        while (true) {
            Reference<? extends Throwable> poll = this.f63798b.poll();
            if (poll == null) {
                break;
            }
            this.f63797a.remove(poll);
        }
        List<Throwable> list = this.f63797a.get(new C26910ba(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f63797a.putIfAbsent(new C26910ba(th, this.f63798b), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
