package p4560f.p4561a.p4568e.p4581g;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* renamed from: f.a.e.g.l */
public final class CallableC88876l extends AbstractC88852a implements Callable<Void> {
    private static final long serialVersionUID = 1811839108042568751L;

    static {
        Covode.recordClassIndex(104918);
    }

    @Override // p4560f.p4561a.p4568e.p4581g.AbstractC88852a
    public final /* bridge */ /* synthetic */ Runnable getWrappedRunnable() {
        return super.getWrappedRunnable();
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        this.f201773b = Thread.currentThread();
        try {
            this.f201772a.run();
            return null;
        } finally {
            lazySet(f201770c);
            this.f201773b = null;
        }
    }

    public CallableC88876l(Runnable runnable) {
        super(runnable);
    }
}
