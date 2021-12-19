package com.google.android.gms.p1940d;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.d.o */
final class RunnableC25641o implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AbstractC25631h f60766a;

    /* renamed from: b */
    private final /* synthetic */ C25640n f60767b;

    static {
        Covode.recordClassIndex(31052);
    }

    RunnableC25641o(C25640n nVar, AbstractC25631h hVar) {
        this.f60767b = nVar;
        this.f60766a = hVar;
    }

    public final void run() {
        try {
            AbstractC25631h<TContinuationResult> a = this.f60767b.f60763a.mo41863a(this.f60766a);
            if (a == null) {
                this.f60767b.mo34353a((Exception) new NullPointerException("Continuation returned null"));
                return;
            }
            a.mo41875a(C25633j.f60755b, (AbstractC25628e<? super TContinuationResult>) this.f60767b);
            a.mo41874a(C25633j.f60755b, (AbstractC25627d) this.f60767b);
            a.mo41872a(C25633j.f60755b, (AbstractC25625b) this.f60767b);
        } catch (C25629f e) {
            if (e.getCause() instanceof Exception) {
                this.f60767b.f60764b.mo41878a((Exception) e.getCause());
            } else {
                this.f60767b.f60764b.mo41878a(e);
            }
        } catch (Exception e2) {
            this.f60767b.f60764b.mo41878a(e2);
        }
    }
}
