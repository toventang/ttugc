package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.measurement.internal.fr */
final class RunnableC26393fr implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzao f62055a;

    /* renamed from: b */
    private final /* synthetic */ zzn f62056b;

    /* renamed from: c */
    private final /* synthetic */ BinderC26382fg f62057c;

    static {
        Covode.recordClassIndex(31815);
    }

    public final void run() {
        BinderC26382fg fgVar = this.f62057c;
        zzao zzao = this.f62055a;
        zzn zzn = this.f62056b;
        if (!(!"_cmp".equals(zzao.f62578a) || zzao.f62579b == null || zzao.f62579b.f62577a.size() == 0)) {
            String d = zzao.f62579b.mo43669d("_cis");
            if (!TextUtils.isEmpty(d) && (("referrer broadcast".equals(d) || "referrer API".equals(d)) && fgVar.f62022a.f62355b.f62001e.mo43641d(zzn.f62590a, C26530p.f62480S))) {
                fgVar.f62022a.mo43016q().f61833i.mo43170a("Event has been filtered ", zzao.toString());
                zzao = new zzao("_cmpx", zzao.f62579b, zzao.f62580c, zzao.f62581d);
            }
        }
        this.f62057c.f62022a.mo43484k();
        this.f62057c.f62022a.mo43464a(zzao, this.f62056b);
    }

    RunnableC26393fr(BinderC26382fg fgVar, zzao zzao, zzn zzn) {
        this.f62057c = fgVar;
        this.f62055a = zzao;
        this.f62056b = zzn;
    }
}
