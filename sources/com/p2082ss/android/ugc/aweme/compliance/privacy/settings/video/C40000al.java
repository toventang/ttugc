package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.video;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.VideoControl;
import com.p2082ss.android.ugc.aweme.p2386be.C34800h;
import com.p2082ss.android.ugc.aweme.p2727db.C40947i;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.video.al */
final /* synthetic */ class C40000al implements AbstractC89172b {

    /* renamed from: a */
    private final C39986a f94021a;

    static {
        Covode.recordClassIndex(47766);
    }

    C40000al(C39986a aVar) {
        this.f94021a = aVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        VideoControl videoControl;
        C34800h hVar = (C34800h) obj;
        Aweme aweme = this.f94021a.f93984c;
        boolean z = false;
        if (!(aweme == null || (videoControl = aweme.getVideoControl()) == null || videoControl.preventDownloadType == 3)) {
            z = true;
        }
        return C40947i.m82453b(C40947i.m82452a(hVar, z), true);
    }
}
