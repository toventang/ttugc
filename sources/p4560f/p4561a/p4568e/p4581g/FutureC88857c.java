package p4560f.p4561a.p4568e.p4581g;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.p4565b.AbstractC88412b;

/* renamed from: f.a.e.g.c */
final class FutureC88857c implements Future<Object> {

    /* renamed from: a */
    final AbstractC88412b f201788a;

    static {
        Covode.recordClassIndex(104899);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return null;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return null;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return false;
    }

    FutureC88857c(AbstractC88412b bVar) {
        this.f201788a = bVar;
    }

    public final boolean cancel(boolean z) {
        this.f201788a.dispose();
        return false;
    }
}
