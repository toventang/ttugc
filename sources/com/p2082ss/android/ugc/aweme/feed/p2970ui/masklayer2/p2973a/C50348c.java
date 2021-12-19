package com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.p2973a;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.AbstractC50382f;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.C50345a;
import com.p2082ss.android.ugc.aweme.tcm.api.service.ITcmService;
import com.p2082ss.android.ugc.aweme.tcm.impl.service.TcmServiceImpl;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.c */
public final class C50348c extends AbstractC50367m {
    static {
        Covode.recordClassIndex(59476);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.p2973a.AbstractC50357e
    /* renamed from: a */
    public final void mo85530a(View view) {
        C89219l.m154721d(view, "");
        ITcmService j = TcmServiceImpl.m135859j();
        if (j != null) {
            j.mo121251a(C17867d.m33078a(), this.f116296f);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C50348c(C50345a aVar, AbstractC50382f fVar) {
        super(aVar, fVar);
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(fVar, "");
    }
}
