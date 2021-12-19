package com.google.android.gms.p1940d;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.gms.d.y */
final class RunnableC25651y implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AbstractC25631h f60790a;

    /* renamed from: b */
    private final /* synthetic */ C25650x f60791b;

    static {
        Covode.recordClassIndex(31062);
    }

    RunnableC25651y(C25650x xVar, AbstractC25631h hVar) {
        this.f60791b = xVar;
        this.f60790a = hVar;
    }

    public final void run() {
        try {
            AbstractC25631h<TContinuationResult> a = this.f60791b.f60787a.mo41892a((TResult) this.f60790a.mo41886d());
            if (a == null) {
                this.f60791b.mo34353a((Exception) new NullPointerException("Continuation returned null"));
                return;
            }
            a.mo41875a(C25633j.f60755b, (AbstractC25628e<? super TContinuationResult>) this.f60791b);
            a.mo41874a(C25633j.f60755b, (AbstractC25627d) this.f60791b);
            a.mo41872a(C25633j.f60755b, (AbstractC25625b) this.f60791b);
        } catch (C25629f e) {
            if (e.getCause() instanceof Exception) {
                this.f60791b.mo34353a((Exception) e.getCause());
            } else {
                this.f60791b.mo34353a((Exception) e);
            }
        } catch (CancellationException unused) {
            this.f60791b.mo41891a();
        } catch (Exception e2) {
            this.f60791b.mo34353a(e2);
        }
    }
}
