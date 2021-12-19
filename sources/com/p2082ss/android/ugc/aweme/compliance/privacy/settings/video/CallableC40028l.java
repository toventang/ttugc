package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.video;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.shortvideo.AVApiImpl;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.video.l */
final /* synthetic */ class CallableC40028l implements Callable {

    /* renamed from: a */
    private final C39986a f94053a;

    static {
        Covode.recordClassIndex(47794);
    }

    CallableC40028l(C39986a aVar) {
        this.f94053a = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        C39986a aVar = this.f94053a;
        String aid = aVar.f93984c.getAid();
        if (aVar.f93984c.getStitchSetting() == 0) {
            i = 1;
        } else {
            i = 0;
        }
        String valueOf = String.valueOf(i);
        C29844g gVar = new C29844g(C39986a.f93980s);
        gVar.mo52130a("aweme_id", aid);
        gVar.mo52130a("item_stitch", valueOf);
        return AVApiImpl.m123134b().mo109849a(gVar.toString(), BaseResponse.class);
    }
}
