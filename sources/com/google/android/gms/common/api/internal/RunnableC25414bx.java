package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.AbstractC25357i;
import com.google.android.gms.common.api.AbstractC25485p;

/* renamed from: com.google.android.gms.common.api.internal.bx */
final class RunnableC25414bx implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AbstractC25485p f60303a;

    /* renamed from: b */
    private final /* synthetic */ C25412bv f60304b;

    static {
        Covode.recordClassIndex(30813);
    }

    public final void run() {
        try {
            BasePendingResult.f60153c.set(true);
            this.f60304b.f60300h.sendMessage(this.f60304b.f60300h.obtainMessage(0, this.f60304b.f60293a.mo41720a()));
            BasePendingResult.f60153c.set(false);
            AbstractC25357i iVar = this.f60304b.f60299g.get();
            if (iVar != null) {
                iVar.mo41528b(this.f60304b);
            }
        } catch (RuntimeException e) {
            this.f60304b.f60300h.sendMessage(this.f60304b.f60300h.obtainMessage(1, e));
            BasePendingResult.f60153c.set(false);
            AbstractC25357i iVar2 = this.f60304b.f60299g.get();
            if (iVar2 != null) {
                iVar2.mo41528b(this.f60304b);
            }
        } catch (Throwable th) {
            BasePendingResult.f60153c.set(false);
            AbstractC25357i iVar3 = this.f60304b.f60299g.get();
            if (iVar3 != null) {
                iVar3.mo41528b(this.f60304b);
            }
            throw th;
        }
    }

    RunnableC25414bx(C25412bv bvVar, AbstractC25485p pVar) {
        this.f60304b = bvVar;
        this.f60303a = pVar;
    }
}
