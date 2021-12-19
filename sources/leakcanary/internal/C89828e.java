package leakcanary.internal;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: leakcanary.internal.e */
public final class C89828e<T> {

    /* renamed from: a */
    final AtomicReference<T> f203688a = new AtomicReference<>();

    /* renamed from: b */
    final CountDownLatch f203689b = new CountDownLatch(1);

    static {
        Covode.recordClassIndex(105925);
    }

    /* renamed from: a */
    public final void mo144415a(T t) {
        this.f203688a.set(t);
        this.f203689b.countDown();
    }

    /* renamed from: a */
    public final boolean mo144416a(TimeUnit timeUnit) {
        C89219l.m154719c(timeUnit, "");
        try {
            return this.f203689b.await(5, timeUnit);
        } catch (InterruptedException e) {
            throw new RuntimeException("Did not expect thread to be interrupted", e);
        }
    }
}
