package com.p2082ss.android.ugc.aweme.qrcode.presenter.p3658a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.tools.detail.IMovieReuseService;

/* renamed from: com.ss.android.ugc.aweme.qrcode.presenter.a.g */
final /* synthetic */ class C66434g implements IMovieReuseService.AbstractC78107b {

    /* renamed from: a */
    private final C66423c f149360a;

    static {
        Covode.recordClassIndex(77968);
    }

    C66434g(C66423c cVar) {
        this.f149360a = cVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.detail.IMovieReuseService.AbstractC78107b
    /* renamed from: a */
    public final void mo105358a(int i, Boolean bool) {
        C66423c cVar = this.f149360a;
        if (cVar.f149327b == null) {
            return;
        }
        if (bool.booleanValue()) {
            cVar.f149327b.mo105373e();
            cVar.f149327b.mo105370b();
            cVar.f149327b.mo105371c();
            return;
        }
        cVar.f149327b.mo105370b();
        if (i == 0) {
            cVar.f149327b.mo105369a(200);
        } else if (i == -1) {
            cVar.f149327b.mo105369a(0);
        } else {
            cVar.f149327b.mo105369a(1500);
        }
    }
}
