package kotlinx.coroutines.scheduling;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.AbstractC89556bp;
import p4600h.p4603c.AbstractC89127f;

/* renamed from: kotlinx.coroutines.scheduling.e */
final class ExecutorC89685e extends AbstractC89556bp implements Executor, AbstractC89689i {

    /* renamed from: f */
    private static final AtomicIntegerFieldUpdater f203445f = AtomicIntegerFieldUpdater.newUpdater(ExecutorC89685e.class, "inFlightTasks");

    /* renamed from: a */
    public final C89683c f203446a;

    /* renamed from: d */
    public final int f203447d;

    /* renamed from: e */
    private final ConcurrentLinkedQueue<Runnable> f203448e = new ConcurrentLinkedQueue<>();

    /* renamed from: g */
    private final int f203449g = 1;
    private volatile int inFlightTasks = 0;

    static {
        Covode.recordClassIndex(105779);
    }

    @Override // kotlinx.coroutines.AbstractC89556bp
    /* renamed from: a */
    public final Executor mo144131a() {
        return this;
    }

    @Override // kotlinx.coroutines.scheduling.AbstractC89689i
    /* renamed from: c */
    public final int mo144247c() {
        return this.f203449g;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    @Override // kotlinx.coroutines.scheduling.AbstractC89689i
    /* renamed from: b */
    public final void mo144246b() {
        Runnable poll = this.f203448e.poll();
        if (poll != null) {
            this.f203446a.mo144245a(poll, this, true);
            return;
        }
        f203445f.decrementAndGet(this);
        Runnable poll2 = this.f203448e.poll();
        if (poll2 != null) {
            m155698a(poll2, true);
        }
    }

    @Override // kotlinx.coroutines.AbstractC89507ah
    public final String toString() {
        return super.toString() + "[dispatcher = " + this.f203446a + ']';
    }

    public final void execute(Runnable runnable) {
        m155698a(runnable, false);
    }

    @Override // kotlinx.coroutines.AbstractC89507ah
    public final void dispatch(AbstractC89127f fVar, Runnable runnable) {
        m155698a(runnable, false);
    }

    @Override // kotlinx.coroutines.AbstractC89507ah
    public final void dispatchYield(AbstractC89127f fVar, Runnable runnable) {
        m155698a(runnable, true);
    }

    public ExecutorC89685e(C89683c cVar, int i) {
        this.f203446a = cVar;
        this.f203447d = i;
    }

    /* renamed from: a */
    private final void m155698a(Runnable runnable, boolean z) {
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f203445f;
            if (atomicIntegerFieldUpdater.incrementAndGet(this) <= this.f203447d) {
                this.f203446a.mo144245a(runnable, this, z);
                return;
            }
            this.f203448e.add(runnable);
            if (atomicIntegerFieldUpdater.decrementAndGet(this) < this.f203447d) {
                runnable = this.f203448e.poll();
            } else {
                return;
            }
        } while (runnable != null);
    }
}
