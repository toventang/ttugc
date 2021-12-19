package com.p2082ss.android.ugc.aweme.feed.p2944e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.playerkit.model.C84215n;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.e.w */
public final /* synthetic */ class C49489w implements AbstractC88983w {

    /* renamed from: a */
    private final C49445o f113822a;

    /* renamed from: b */
    private final C84215n f113823b;

    /* renamed from: c */
    private final int f113824c;

    /* renamed from: d */
    private final Aweme f113825d;

    static {
        Covode.recordClassIndex(58302);
    }

    C49489w(C49445o oVar, C84215n nVar, int i, Aweme aweme) {
        this.f113822a = oVar;
        this.f113823b = nVar;
        this.f113824c = i;
        this.f113825d = aweme;
    }

    @Override // p4560f.p4561a.AbstractC88983w
    public final void subscribe(AbstractC88982v vVar) {
        C49445o oVar = this.f113822a;
        C84215n nVar = this.f113823b;
        oVar.mo81194a(nVar.f188111a, this.f113824c, this.f113825d);
    }
}
