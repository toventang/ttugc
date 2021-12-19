package kotlinx.coroutines.scheduling;

import com.bytedance.covode.number.Covode;
import kotlinx.coroutines.AbstractC89507ah;
import kotlinx.coroutines.internal.C89660w;
import kotlinx.coroutines.internal.C89661x;
import p4600h.p4619j.C89271h;

/* renamed from: kotlinx.coroutines.scheduling.b */
public final class C89682b extends C89683c {

    /* renamed from: a */
    public static final AbstractC89507ah f203438a;

    /* renamed from: d */
    public static final C89682b f203439d;

    @Override // kotlinx.coroutines.scheduling.C89683c, kotlinx.coroutines.AbstractC89507ah
    public final String toString() {
        return "DefaultDispatcher";
    }

    private C89682b() {
    }

    @Override // kotlinx.coroutines.scheduling.C89683c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("DefaultDispatcher cannot be closed");
    }

    static {
        Covode.recordClassIndex(105776);
        C89682b bVar = new C89682b();
        f203439d = bVar;
        int a = C89660w.m155635a("kotlinx.coroutines.io.parallelism", C89271h.m154769b(64, C89661x.f203410a), 0, 0, 12);
        if (a > 0) {
            f203438a = new ExecutorC89685e(bVar, a);
            return;
        }
        throw new IllegalArgumentException("Expected positive parallelism level, but have ".concat(String.valueOf(a)).toString());
    }
}
