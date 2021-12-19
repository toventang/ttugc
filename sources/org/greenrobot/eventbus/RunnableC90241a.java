package org.greenrobot.eventbus;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: org.greenrobot.eventbus.a */
public class RunnableC90241a implements Runnable, AbstractC90263q {

    /* renamed from: a */
    private final C90262p f204994a = new C90262p();

    /* renamed from: b */
    private final EventBus f204995b;

    static {
        Covode.recordClassIndex(106512);
    }

    public void run() {
        C90261o a = this.f204994a.mo145419a();
        if (a != null) {
            this.f204995b.mo145392a(a);
            return;
        }
        throw new IllegalStateException("No pending post available");
    }

    RunnableC90241a(EventBus eventBus) {
        this.f204995b = eventBus;
    }

    @Override // org.greenrobot.eventbus.AbstractC90263q
    /* renamed from: a */
    public final void mo145403a(C90269v vVar, Object obj) {
        this.f204994a.mo145420a(C90261o.m157008a(vVar, obj));
        this.f204995b.f204982g.execute(this);
    }
}
