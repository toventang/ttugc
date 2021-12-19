package org.greenrobot.eventbus;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* access modifiers changed from: package-private */
/* renamed from: org.greenrobot.eventbus.p */
public final class C90262p {

    /* renamed from: a */
    private C90261o f205031a;

    /* renamed from: b */
    private C90261o f205032b;

    static {
        Covode.recordClassIndex(106533);
    }

    C90262p() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized C90261o mo145419a() {
        C90261o oVar;
        MethodCollector.m26663i(12537);
        oVar = this.f205031a;
        if (oVar != null) {
            C90261o oVar2 = oVar.f205030c;
            this.f205031a = oVar2;
            if (oVar2 == null) {
                this.f205032b = null;
            }
        }
        MethodCollector.m26664o(12537);
        return oVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized C90261o mo145421b() {
        C90261o a;
        MethodCollector.m26663i(12538);
        if (this.f205031a == null) {
            wait(1000);
        }
        a = mo145419a();
        MethodCollector.m26664o(12538);
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo145420a(C90261o oVar) {
        MethodCollector.m26663i(12536);
        if (oVar != null) {
            C90261o oVar2 = this.f205032b;
            if (oVar2 != null) {
                oVar2.f205030c = oVar;
                this.f205032b = oVar;
            } else if (this.f205031a == null) {
                this.f205032b = oVar;
                this.f205031a = oVar;
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("Head present, but no tail");
                MethodCollector.m26664o(12536);
                throw illegalStateException;
            }
            notifyAll();
            MethodCollector.m26664o(12536);
        } else {
            NullPointerException nullPointerException = new NullPointerException("null cannot be enqueued");
            MethodCollector.m26664o(12536);
            throw nullPointerException;
        }
    }
}
