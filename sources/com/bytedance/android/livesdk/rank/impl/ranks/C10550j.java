package com.bytedance.android.livesdk.rank.impl.ranks;

import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.livesdk.p425aa.C6555i;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.j */
public final /* synthetic */ class C10550j implements AbstractC88433f {

    /* renamed from: a */
    private final C10546f f25370a;

    static {
        Covode.recordClassIndex(12125);
    }

    C10550j(C10546f fVar) {
        this.f25370a = fVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        this.f25370a.mo17373a(-1, (String) null, (String) null, "score_display_config_failed");
        C6555i.m14021b();
        C3854a.m9455a(5, "ttlive_exception", ((Throwable) obj).getStackTrace());
    }
}
