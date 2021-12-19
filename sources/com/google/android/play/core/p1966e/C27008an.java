package com.google.android.play.core.p1966e;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.play.core.e.an */
final class C27008an implements AbstractC27054z {

    /* renamed from: a */
    final /* synthetic */ AbstractC27034f f63910a;

    /* renamed from: b */
    final /* synthetic */ Intent f63911b;

    /* renamed from: c */
    final /* synthetic */ Context f63912c;

    /* renamed from: d */
    final /* synthetic */ C27010ap f63913d;

    static {
        Covode.recordClassIndex(32484);
    }

    C27008an(C27010ap apVar, AbstractC27034f fVar, Intent intent, Context context) {
        this.f63913d = apVar;
        this.f63910a = fVar;
        this.f63911b = intent;
        this.f63912c = context;
    }

    @Override // com.google.android.play.core.p1966e.AbstractC27054z
    /* renamed from: a */
    public final void mo44716a() {
        C27010ap apVar;
        apVar.f63919b.post(new RunnableC27009ao(this.f63913d, this.f63910a, 5, 0));
    }

    @Override // com.google.android.play.core.p1966e.AbstractC27054z
    /* renamed from: a */
    public final void mo44717a(int i) {
        C27010ap apVar;
        apVar.f63919b.post(new RunnableC27009ao(this.f63913d, this.f63910a, 6, i));
    }

    @Override // com.google.android.play.core.p1966e.AbstractC27054z
    /* renamed from: b */
    public final void mo44718b() {
        if (!this.f63911b.getBooleanExtra("triggered_from_app_after_verification", false)) {
            this.f63911b.putExtra("triggered_from_app_after_verification", true);
            this.f63912c.sendBroadcast(this.f63911b);
            return;
        }
        this.f63913d.f63854d.mo44596b("Splits copied and verified more than once.", new Object[0]);
    }
}
