package p4560f.p4561a.p4568e.p4581g;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.g.k */
public final class RunnableC88875k extends AbstractC88852a implements Runnable {
    private static final long serialVersionUID = 1811839108042568751L;

    static {
        Covode.recordClassIndex(104917);
    }

    @Override // p4560f.p4561a.p4568e.p4581g.AbstractC88852a
    public final /* bridge */ /* synthetic */ Runnable getWrappedRunnable() {
        return super.getWrappedRunnable();
    }

    public final void run() {
        this.f201773b = Thread.currentThread();
        try {
            this.f201772a.run();
            this.f201773b = null;
        } catch (Throwable th) {
            this.f201773b = null;
            lazySet(f201770c);
            C88925a.m154178a(th);
        }
    }

    public RunnableC88875k(Runnable runnable) {
        super(runnable);
    }
}
