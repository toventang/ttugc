package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48191b;
import com.p2082ss.android.ugc.aweme.feed.helper.C49621g;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2963q.C49860aw;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.ui.ak */
public final /* synthetic */ class C50050ak implements C49621g.AbstractC49623b {

    /* renamed from: a */
    private final C50041af f115536a;

    static {
        Covode.recordClassIndex(59176);
    }

    C50050ak(C50041af afVar) {
        this.f115536a = afVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.helper.C49621g.AbstractC49623b
    /* renamed from: a */
    public final void mo70544a() {
        C50041af afVar = this.f115536a;
        C49621g gVar = afVar.f115509B;
        C49860aw awVar = afVar.f115519n;
        if (awVar != null && !gVar.mo81416a(awVar.mo81108aC())) {
            AbstractC48191b bVar = awVar.f114768W;
            C89219l.m154716b(bVar, "");
            List<Aweme> e = bVar.mo80288e();
            if (e != null) {
                Iterator<T> it = e.iterator();
                while (it.hasNext()) {
                    gVar.mo81417a((Aweme) it.next());
                }
            }
        }
    }
}
