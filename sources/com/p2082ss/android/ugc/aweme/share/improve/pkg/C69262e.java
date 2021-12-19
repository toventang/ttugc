package com.p2082ss.android.ugc.aweme.share.improve.pkg;

import android.content.Context;
import com.bytedance.android.livesdkapi.depend.p683e.C11666c;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.e */
public final class C69262e extends C69257a {

    /* renamed from: a */
    private final C11666c f154812a;

    static {
        Covode.recordClassIndex(81592);
    }

    @Override // com.p2082ss.android.ugc.aweme.share.improve.pkg.C69257a, com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    public final int co_() {
        return R.raw.icon_2pt_broken_heart;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69262e(C11666c cVar) {
        super(cVar);
        C89219l.m154721d(cVar, "");
        this.f154812a = cVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.share.improve.pkg.C69257a, com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61915a(Context context, SharePackage sharePackage) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(sharePackage, "");
        C11666c.AbstractC11668b bVar = this.f154812a.f27810Q;
        if (bVar != null) {
            bVar.mo14244a();
        } else {
            super.mo61915a(context, sharePackage);
        }
    }
}
