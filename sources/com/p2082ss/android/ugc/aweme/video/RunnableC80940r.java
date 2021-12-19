package com.p2082ss.android.ugc.aweme.video;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.p1733u.C23435d;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.C34671a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.p3682s.C67214a;
import com.p2082ss.android.ugc.aweme.video.preload.C80937s;
import com.p2082ss.android.ugc.aweme.video.simpreloader.C81066l;

/* renamed from: com.ss.android.ugc.aweme.video.r */
public final /* synthetic */ class RunnableC80940r implements Runnable {

    /* renamed from: a */
    private final AbstractC58264w f180975a;

    static {
        Covode.recordClassIndex(94242);
    }

    public RunnableC80940r(AbstractC58264w wVar) {
        this.f180975a = wVar;
    }

    public final void run() {
        AbstractC58264w wVar = this.f180975a;
        C51423a.m95787a("VideoCachePreloaderInitTask");
        C81079v.m140776O();
        C23435d.m44113a(new C81066l(C80937s.m140453b()));
        if (C16048b.m29633a().mo25421a(true, "enable_precreate_session_application", true)) {
            C81079v.m140776O().mo123948w();
        }
        C34671a.f81927a.mo61332f();
        try {
            if (C67214a.m119166p()) {
                C58221f.m105147a(wVar);
            }
            C80937s.m140453b().mo124068a();
        } catch (Exception e) {
            C22708a.m42802a((Throwable) e);
        }
    }
}
