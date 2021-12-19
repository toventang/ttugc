package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.comment.p2503ui.C37157k;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.be */
final /* synthetic */ class C37043be implements AbstractC89172b {

    /* renamed from: a */
    private final C37157k.C371708 f87262a;

    static {
        Covode.recordClassIndex(44397);
    }

    C37043be(C37157k.C371708 r1) {
        this.f87262a = r1;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        SmartRouter.buildRoute(C37157k.this.getActivity(), "//setting/blocklist").open();
        return C89391z.f203057a;
    }
}
