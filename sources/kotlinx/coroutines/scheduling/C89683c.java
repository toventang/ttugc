package kotlinx.coroutines.scheduling;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlinx.coroutines.AbstractC89556bp;
import kotlinx.coroutines.RunnableC89529at;
import p4600h.p4603c.AbstractC89127f;

/* renamed from: kotlinx.coroutines.scheduling.c */
public class C89683c extends AbstractC89556bp {

    /* renamed from: a */
    private CoroutineScheduler f203440a;

    /* renamed from: d */
    private final int f203441d;

    /* renamed from: e */
    private final int f203442e;

    /* renamed from: f */
    private final long f203443f;

    /* renamed from: g */
    private final String f203444g;

    static {
        Covode.recordClassIndex(105777);
    }

    @Override // kotlinx.coroutines.AbstractC89556bp
    /* renamed from: a */
    public final Executor mo144131a() {
        return this.f203440a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f203440a.close();
    }

    public /* synthetic */ C89683c() {
        this(C89691k.f203458c, C89691k.f203459d, "DefaultDispatcher");
    }

    @Override // kotlinx.coroutines.AbstractC89507ah
    public String toString() {
        return super.toString() + "[scheduler = " + this.f203440a + ']';
    }

    @Override // kotlinx.coroutines.AbstractC89507ah
    public void dispatch(AbstractC89127f fVar, Runnable runnable) {
        try {
            CoroutineScheduler.dispatch$default(this.f203440a, runnable, null, false, 6, null);
        } catch (RejectedExecutionException unused) {
            RunnableC89529at.f203247a.dispatch(fVar, runnable);
        }
    }

    @Override // kotlinx.coroutines.AbstractC89507ah
    public void dispatchYield(AbstractC89127f fVar, Runnable runnable) {
        try {
            CoroutineScheduler.dispatch$default(this.f203440a, runnable, null, true, 2, null);
        } catch (RejectedExecutionException unused) {
            RunnableC89529at.f203247a.dispatchYield(fVar, runnable);
        }
    }

    /* renamed from: a */
    public final void mo144245a(Runnable runnable, AbstractC89689i iVar, boolean z) {
        try {
            this.f203440a.dispatch(runnable, iVar, z);
        } catch (RejectedExecutionException unused) {
            RunnableC89529at.f203247a.enqueue(this.f203440a.createTask$kotlinx_coroutines_core(runnable, iVar));
        }
    }

    private C89683c(int i, int i2, String str) {
        this(i, i2, C89691k.f203460e, str);
    }

    private C89683c(int i, int i2, long j, String str) {
        this.f203441d = i;
        this.f203442e = i2;
        this.f203443f = j;
        this.f203444g = str;
        this.f203440a = new CoroutineScheduler(i, i2, j, str);
    }
}
