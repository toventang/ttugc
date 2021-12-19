package org.greenrobot.eventbus;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.logging.Level;

/* access modifiers changed from: package-private */
/* renamed from: org.greenrobot.eventbus.b */
public final class RunnableC90243b implements Runnable, AbstractC90263q {

    /* renamed from: a */
    private final C90262p f204998a = new C90262p();

    /* renamed from: b */
    private final EventBus f204999b;

    /* renamed from: c */
    private volatile boolean f205000c;

    static {
        Covode.recordClassIndex(106514);
    }

    public final void run() {
        MethodCollector.m26663i(13832);
        while (true) {
            try {
                C90261o b = this.f204998a.mo145421b();
                if (b == null) {
                    synchronized (this) {
                        try {
                            b = this.f204998a.mo145419a();
                            if (b == null) {
                                this.f205000c = false;
                                return;
                            }
                        } catch (Throwable th) {
                            MethodCollector.m26664o(13832);
                            throw th;
                        }
                    }
                }
                this.f204999b.mo145392a(b);
            } catch (InterruptedException e) {
                this.f204999b.f204984i.mo145406a(Level.WARNING, Thread.currentThread().getName() + " was interruppted", e);
                return;
            } finally {
                this.f205000c = false;
                MethodCollector.m26664o(13832);
            }
        }
    }

    RunnableC90243b(EventBus eventBus) {
        this.f204999b = eventBus;
    }

    @Override // org.greenrobot.eventbus.AbstractC90263q
    /* renamed from: a */
    public final void mo145403a(C90269v vVar, Object obj) {
        MethodCollector.m26663i(13831);
        C90261o a = C90261o.m157008a(vVar, obj);
        synchronized (this) {
            try {
                this.f204998a.mo145420a(a);
                if (!this.f205000c) {
                    this.f205000c = true;
                    this.f204999b.f204982g.execute(this);
                }
            } finally {
                MethodCollector.m26664o(13831);
            }
        }
    }
}
