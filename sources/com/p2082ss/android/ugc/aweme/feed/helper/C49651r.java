package com.p2082ss.android.ugc.aweme.feed.helper;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.p2082ss.android.ugc.playerkit.videoview.VideoViewComponent;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.helper.r */
public final class C49651r {

    /* renamed from: a */
    public Aweme f114281a;

    /* renamed from: b */
    public VideoViewComponent f114282b;

    /* renamed from: c */
    public OnUIPlayListener f114283c;

    static {
        Covode.recordClassIndex(58498);
    }

    /* renamed from: d */
    private final boolean m93092d() {
        if (this.f114281a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo81446b() {
        if (m93092d()) {
            this.f114282b.mo129268b(this.f114283c);
            VideoViewComponent videoViewComponent = this.f114282b;
            Aweme aweme = this.f114281a;
            if (aweme == null) {
                C89219l.m154715b();
            }
            videoViewComponent.mo129262a(aweme.getVideo());
        }
    }

    /* renamed from: c */
    public final void mo81447c() {
        this.f114282b.mo80280a(this.f114283c);
        this.f114282b.mo129269c();
        this.f114282b.mo129270d();
    }

    /* renamed from: a */
    public final void mo81445a() {
        if (m93092d()) {
            this.f114282b.mo129268b(this.f114283c);
            VideoViewComponent videoViewComponent = this.f114282b;
            Aweme aweme = this.f114281a;
            if (aweme == null) {
                C89219l.m154715b();
            }
            videoViewComponent.mo129263a(aweme.getVideo(), C16048b.m29633a().mo25412a(true, "decoder_type", 0));
        }
    }

    public C49651r(VideoViewComponent videoViewComponent, OnUIPlayListener onUIPlayListener) {
        C89219l.m154721d(videoViewComponent, "");
        C89219l.m154721d(onUIPlayListener, "");
        this.f114282b = videoViewComponent;
        this.f114283c = onUIPlayListener;
    }
}
