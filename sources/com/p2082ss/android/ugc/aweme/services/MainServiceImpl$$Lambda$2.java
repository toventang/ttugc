package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38757n;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.services.MainServiceImpl$$Lambda$2 */
final /* synthetic */ class MainServiceImpl$$Lambda$2 implements AbstractC38757n.AbstractC38758a {
    private final AbstractC89172b arg$1;

    static {
        Covode.recordClassIndex(79690);
    }

    private MainServiceImpl$$Lambda$2(AbstractC89172b bVar) {
        this.arg$1 = bVar;
    }

    static AbstractC38757n.AbstractC38758a get$Lambda(AbstractC89172b bVar) {
        return new MainServiceImpl$$Lambda$2(bVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38757n.AbstractC38758a
    public final void sendLog(boolean z) {
        this.arg$1.invoke(Boolean.valueOf(z));
    }
}
