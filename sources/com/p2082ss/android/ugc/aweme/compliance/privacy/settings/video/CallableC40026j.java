package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.video;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.shortvideo.AVApiImpl;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.video.j */
public final /* synthetic */ class CallableC40026j implements Callable {

    /* renamed from: a */
    private final C39986a f94051a;

    static {
        Covode.recordClassIndex(47792);
    }

    CallableC40026j(C39986a aVar) {
        this.f94051a = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C39986a aVar = this.f94051a;
        String aid = aVar.f93984c.getAid();
        int i = 0;
        String valueOf = String.valueOf((aVar.f93984c.getDuetSetting() == 0 || aVar.f93984c.getReactSetting() == 0) ? 1 : 0);
        if (aVar.f93984c.getDuetSetting() == 0 || aVar.f93984c.getReactSetting() == 0) {
            i = 1;
        }
        String valueOf2 = String.valueOf(i);
        C29844g gVar = new C29844g(C39986a.f93980s);
        gVar.mo52130a("aweme_id", aid);
        gVar.mo52130a("item_duet", valueOf2);
        gVar.mo52130a("item_react", valueOf);
        gVar.mo52128a("enable_stitch", aVar.f93998q ? 1 : 0);
        return AVApiImpl.m123134b().mo109849a(gVar.toString(), BaseResponse.class);
    }
}
