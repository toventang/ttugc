package com.p2082ss.android.ugc.aweme.discover.adapter;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.u */
final /* synthetic */ class C41746u implements AbstractC89172b {

    /* renamed from: a */
    static final AbstractC89172b f97383a = new C41746u();

    static {
        Covode.recordClassIndex(49659);
    }

    private C41746u() {
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        Aweme aweme = (Aweme) obj;
        if (aweme != null) {
            return aweme.getAid();
        }
        return null;
    }
}
