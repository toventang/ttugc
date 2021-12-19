package com.p2082ss.android.ugc.aweme.detail.p2749h;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.helper.C49621g;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.detail.h.q */
public final /* synthetic */ class C41209q implements C49621g.AbstractC49623b {

    /* renamed from: a */
    private final C41178b f96307a;

    static {
        Covode.recordClassIndex(49092);
    }

    C41209q(C41178b bVar) {
        this.f96307a = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.helper.C49621g.AbstractC49623b
    /* renamed from: a */
    public final void mo70544a() {
        C41178b bVar = this.f96307a;
        if (bVar.f114759N != null) {
            bVar.f114759N.post(new RunnableC41204l(bVar));
        }
    }
}
