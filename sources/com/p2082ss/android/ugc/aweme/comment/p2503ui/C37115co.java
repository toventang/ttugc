package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.comment.C36164a;
import com.p2082ss.android.ugc.aweme.comment.adapter.C36216b;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.co */
final /* synthetic */ class C37115co implements AbstractC39063h.AbstractC39067a {

    /* renamed from: a */
    private final DialogInterface$OnShowListenerC37084bz f87475a;

    static {
        Covode.recordClassIndex(44469);
    }

    C37115co(DialogInterface$OnShowListenerC37084bz bzVar) {
        this.f87475a = bzVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
    /* renamed from: l */
    public final void mo62679l() {
        C36164a aVar = this.f87475a.f87389U;
        String str = aVar.f85434e.keyword;
        if (str != null && str.length() > 0) {
            C36216b bVar = aVar.f85431b;
            if (bVar == null) {
                C89219l.m154710a("adapter");
            }
            bVar.ao_();
            String str2 = aVar.f85434e.keyword;
            C89219l.m154716b(str2, "");
            aVar.mo63322a(str2, 1);
        } else if (C89219l.m154714a((Object) aVar.f85434e.keyword, (Object) "")) {
            C36216b bVar2 = aVar.f85431b;
            if (bVar2 == null) {
                C89219l.m154710a("adapter");
            }
            bVar2.ao_();
            aVar.mo63320a(aVar.f85434e.cursor, 1);
        }
    }
}
