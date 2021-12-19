package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72423a;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C74002bq;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.az */
public final /* synthetic */ class C72160az implements AbstractC72423a {

    /* renamed from: a */
    private final boolean f161769a;

    static {
        Covode.recordClassIndex(84825);
    }

    C72160az(boolean z) {
        this.f161769a = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72423a
    /* renamed from: a */
    public final void mo114410a(boolean z) {
        C39162r.m79460a("tool_performance_4k_video_select", new C84425b().mo129407a("is_4k_enable", C74002bq.m130147a()).mo129407a("is_4k_video", z).mo129407a("is_success", this.f161769a).f188764a);
    }
}
