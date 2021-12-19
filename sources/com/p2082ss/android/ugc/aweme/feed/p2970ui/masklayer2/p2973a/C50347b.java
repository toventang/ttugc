package com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.p2973a;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.AbstractC50382f;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.C50345a;
import com.p2082ss.android.ugc.aweme.tcm.api.service.ITcmService;
import com.p2082ss.android.ugc.aweme.tcm.impl.service.TcmServiceImpl;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.b */
public final class C50347b extends AbstractC50367m {
    static {
        Covode.recordClassIndex(59475);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.p2973a.AbstractC50357e
    /* renamed from: a */
    public final void mo85530a(View view) {
        C89219l.m154721d(view, "");
        ITcmService j = TcmServiceImpl.m135859j();
        if (j != null) {
            Context context = view.getContext();
            C89219l.m154716b(context, "");
            j.mo121258b(context, this.f116296f);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C50347b(C50345a aVar, AbstractC50382f fVar) {
        super(aVar, fVar);
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(fVar, "");
    }
}
