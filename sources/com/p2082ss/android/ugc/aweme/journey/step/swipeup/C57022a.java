package com.p2082ss.android.ugc.aweme.journey.step.swipeup;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.p2082ss.android.ugc.playerkit.videoview.VideoViewComponent;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.step.swipeup.a */
public final class C57022a {

    /* renamed from: a */
    Aweme f129836a;

    /* renamed from: b */
    public VideoViewComponent f129837b;

    /* renamed from: c */
    public OnUIPlayListener f129838c;

    static {
        Covode.recordClassIndex(66911);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo94180b() {
        if (this.f129836a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo94179a() {
        if (mo94180b()) {
            this.f129837b.mo129268b(this.f129838c);
            VideoViewComponent videoViewComponent = this.f129837b;
            Aweme aweme = this.f129836a;
            if (aweme == null) {
                C89219l.m154715b();
            }
            videoViewComponent.mo129262a(aweme.getVideo());
        }
    }

    public C57022a(VideoViewComponent videoViewComponent, OnUIPlayListener onUIPlayListener) {
        C89219l.m154721d(videoViewComponent, "");
        C89219l.m154721d(onUIPlayListener, "");
        this.f129837b = videoViewComponent;
        this.f129838c = onUIPlayListener;
    }
}
