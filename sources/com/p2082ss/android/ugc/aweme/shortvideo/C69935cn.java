package com.p2082ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p2082ss.android.ugc.aweme.service.IFrameCheckService;
import com.p2082ss.android.ugc.aweme.tools.extract.C78507ab;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cn */
final /* synthetic */ class C69935cn implements C78507ab.AbstractC78508a {

    /* renamed from: a */
    private final Context f156294a;

    static {
        Covode.recordClassIndex(82344);
    }

    C69935cn(Context context) {
        this.f156294a = context;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.extract.C78507ab.AbstractC78508a
    /* renamed from: a */
    public final void mo110352a(String str) {
        Context context = this.f156294a;
        if (str == null) {
            str = "";
        }
        ((IFrameCheckService) ServiceManager.get().getService(IFrameCheckService.class)).mo106969a(context, str);
    }
}
