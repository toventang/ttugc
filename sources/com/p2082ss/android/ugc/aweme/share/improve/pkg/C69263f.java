package com.p2082ss.android.ugc.aweme.share.improve.pkg;

import android.app.Activity;
import android.content.Context;
import com.bytedance.android.livesdkapi.C11755f;
import com.bytedance.android.livesdkapi.depend.p683e.C11666c;
import com.bytedance.android.livesdkapi.service.AbstractC11846d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.f */
public final class C69263f extends C69266i {

    /* renamed from: a */
    private final C11666c f154813a;

    static {
        Covode.recordClassIndex(81593);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h, com.p2082ss.android.ugc.aweme.share.improve.pkg.C69266i
    public final int co_() {
        return R.raw.icon_2pt_flag;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69263f(Activity activity, C11666c cVar) {
        super(activity, cVar);
        C89219l.m154721d(activity, "");
        C89219l.m154721d(cVar, "");
        this.f154813a = cVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h, com.p2082ss.android.ugc.aweme.share.improve.pkg.C69266i
    /* renamed from: a */
    public final void mo61915a(Context context, SharePackage sharePackage) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(sharePackage, "");
        C11666c.AbstractC11669c cVar = this.f154813a.f27809P;
        if (cVar != null) {
            cVar.mo18438a();
            AbstractC11846d a = C11755f.m20713a();
            if (a != null) {
                a.mo13000a(this.f154813a.f27801H, this.f154813a.f27836z, this.f154813a.f27794A, this.f154813a.f27807N);
                if (C89391z.f203057a != null) {
                    return;
                }
            }
        }
        super.mo61915a(context, sharePackage);
    }
}
