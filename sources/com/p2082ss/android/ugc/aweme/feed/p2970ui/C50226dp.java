package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.p2949i.AbstractC49691s;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.dp */
final /* synthetic */ class C50226dp implements AbstractC49691s {

    /* renamed from: a */
    private final C50224dn f115983a;

    static {
        Covode.recordClassIndex(59352);
    }

    C50226dp(C50224dn dnVar) {
        this.f115983a = dnVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2949i.AbstractC49691s
    /* renamed from: a */
    public final void mo63634a(Object obj) {
        C50224dn dnVar = this.f115983a;
        if (dnVar.f113958Q != null) {
            dnVar.f113958Q.mo60191a("feed_internal_event", obj);
        }
    }
}
