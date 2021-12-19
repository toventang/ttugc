package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;

/* renamed from: kotlinx.coroutines.f */
public final class C89614f extends EventLoopImplBase {

    /* renamed from: a */
    private final Thread f203340a;

    static {
        Covode.recordClassIndex(105705);
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.AbstractC89553bm
    public final Thread getThread() {
        return this.f203340a;
    }

    public C89614f(Thread thread) {
        this.f203340a = thread;
    }
}
