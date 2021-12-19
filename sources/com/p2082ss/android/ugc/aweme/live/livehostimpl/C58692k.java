package com.p2082ss.android.ugc.aweme.live.livehostimpl;

import android.app.Activity;
import com.bytedance.android.livesdkapi.depend.AbstractC11624b;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.k */
final /* synthetic */ class C58692k implements AbstractC88433f {

    /* renamed from: a */
    private final AbstractC11624b f133616a;

    static {
        Covode.recordClassIndex(68994);
    }

    C58692k(AbstractC11624b bVar) {
        this.f133616a = bVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        this.f133616a.onActivityStarted((Activity) obj);
    }
}
