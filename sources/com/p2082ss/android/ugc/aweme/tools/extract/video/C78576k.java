package com.p2082ss.android.ugc.aweme.tools.extract.video;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p2082ss.android.ugc.aweme.service.IFrameCheckService;
import com.p2082ss.android.ugc.aweme.tools.extract.C78507ab;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.tools.extract.video.k */
public final /* synthetic */ class C78576k implements C78507ab.AbstractC78508a {

    /* renamed from: a */
    private final Context f176583a;

    static {
        Covode.recordClassIndex(91710);
    }

    C78576k(Context context) {
        this.f176583a = context;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.extract.C78507ab.AbstractC78508a
    /* renamed from: a */
    public final void mo110352a(String str) {
        Context context = this.f176583a;
        if (str == null) {
            str = "";
        }
        ((IFrameCheckService) ServiceManager.get().getService(IFrameCheckService.class)).mo106969a(context, str);
    }
}
