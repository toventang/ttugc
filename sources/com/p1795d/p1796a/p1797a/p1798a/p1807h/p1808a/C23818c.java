package com.p1795d.p1796a.p1797a.p1798a.p1807h.p1808a;

import com.bytedance.covode.number.Covode;
import com.p1795d.p1796a.p1797a.p1798a.p1807h.p1808a.AbstractAsyncTaskC23815b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.d.a.a.a.h.a.c */
public final class C23818c implements AbstractAsyncTaskC23815b.AbstractC23816a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f56336a;

    /* renamed from: b */
    private final ThreadPoolExecutor f56337b;

    /* renamed from: c */
    private final ArrayDeque<AbstractAsyncTaskC23815b> f56338c = new ArrayDeque<>();

    /* renamed from: d */
    private AbstractAsyncTaskC23815b f56339d = null;

    static {
        Covode.recordClassIndex(27926);
    }

    public C23818c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f56336a = linkedBlockingQueue;
        this.f56337b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* renamed from: b */
    private void m45024b() {
        AbstractAsyncTaskC23815b poll = this.f56338c.poll();
        this.f56339d = poll;
        if (poll != null) {
            poll.mo39281a(this.f56337b);
        }
    }

    @Override // com.p1795d.p1796a.p1797a.p1798a.p1807h.p1808a.AbstractAsyncTaskC23815b.AbstractC23816a
    /* renamed from: a */
    public final void mo39283a() {
        this.f56339d = null;
        m45024b();
    }

    /* renamed from: a */
    public final void mo39286a(AbstractAsyncTaskC23815b bVar) {
        bVar.f56334d = this;
        this.f56338c.add(bVar);
        if (this.f56339d == null) {
            m45024b();
        }
    }
}
