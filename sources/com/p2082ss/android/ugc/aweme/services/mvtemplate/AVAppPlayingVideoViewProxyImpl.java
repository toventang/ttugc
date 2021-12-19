package com.p2082ss.android.ugc.aweme.services.mvtemplate;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4137c.p4138a.AbstractC78929a;
import com.p2082ss.android.ugc.playerkit.videoview.C84249a;
import com.p2082ss.android.ugc.playerkit.videoview.VideoViewComponent;

/* renamed from: com.ss.android.ugc.aweme.services.mvtemplate.AVAppPlayingVideoViewProxyImpl */
public final class AVAppPlayingVideoViewProxyImpl implements AbstractC78929a {
    static {
        Covode.recordClassIndex(79903);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4137c.p4138a.AbstractC78929a
    public final void release() {
        VideoViewComponent videoViewComponent;
        C84249a aVar = C84249a.C84250a.f188424a;
        if (aVar.f188422a != null && (videoViewComponent = aVar.f188422a.get()) != null) {
            videoViewComponent.mo129270d();
        }
    }
}
