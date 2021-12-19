package com.p2082ss.android.ugc.aweme.qrcode.presenter.p3658a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.IMainService;

/* renamed from: com.ss.android.ugc.aweme.qrcode.presenter.a.f */
final /* synthetic */ class C66433f implements IMainService.DownLoadFinishListener {

    /* renamed from: a */
    private final C66423c f149359a;

    static {
        Covode.recordClassIndex(77967);
    }

    C66433f(C66423c cVar) {
        this.f149359a = cVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IMainService.DownLoadFinishListener
    public final void doAfterDownLoad(int i, Boolean bool) {
        C66423c cVar = this.f149359a;
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
