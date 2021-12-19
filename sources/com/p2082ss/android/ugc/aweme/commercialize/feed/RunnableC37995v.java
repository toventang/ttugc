package com.p2082ss.android.ugc.aweme.commercialize.feed;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.mask.p2302b.C33312a;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.v */
public final /* synthetic */ class RunnableC37995v implements Runnable {

    /* renamed from: a */
    private final C37899g f89803a;

    /* renamed from: b */
    private final boolean f89804b;

    /* renamed from: c */
    private final boolean f89805c;

    static {
        Covode.recordClassIndex(45456);
    }

    RunnableC37995v(C37899g gVar, boolean z, boolean z2) {
        this.f89803a = gVar;
        this.f89804b = z;
        this.f89805c = z2;
    }

    public final void run() {
        C37899g gVar = this.f89803a;
        boolean z = this.f89804b;
        boolean z2 = this.f89805c;
        gVar.f89519t.setVisibility(8);
        if (z) {
            gVar.mo66010I();
            if (gVar.f89468af != null && z2) {
                gVar.f89468af.mo28466c().mo28504a(gVar.f89514o, gVar.f89467ae, 2, gVar.f89513n + 1);
            }
            AbstractC81915c.m141874a(new C33312a(false, gVar.f89514o.getAid()));
        } else if (TextUtils.equals(gVar.f89466ad, "general_search")) {
            AbstractC81915c.m141874a(new C33312a(false, gVar.f89514o.getAid()));
        }
    }
}
