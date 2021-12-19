package com.p2082ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;
import com.p2082ss.android.ugc.playerkit.videoview.C84294j;
import com.p2082ss.android.ugc.playerkit.videoview.VideoViewComponent;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.z */
public final class C38770z {

    /* renamed from: a */
    public Aweme f91548a;

    /* renamed from: b */
    public Aweme f91549b;

    /* renamed from: c */
    public C84294j f91550c;

    /* renamed from: d */
    public final OnUIPlayListener f91551d;

    /* renamed from: e */
    public final AbstractC38626ah f91552e;

    /* renamed from: f */
    public AbstractC80747i f91553f;

    /* renamed from: g */
    private VideoViewComponent f91554g;

    static {
        Covode.recordClassIndex(46311);
    }

    /* renamed from: c */
    public final void mo67301c() {
        AbstractC80747i iVar = this.f91553f;
        if (iVar != null) {
            iVar.mo123915I();
        }
    }

    /* renamed from: a */
    public final VideoUrlModel mo67299a() {
        VideoUrlModel properPlayAddr;
        Video a = this.f91552e.mo67208a(this.f91548a);
        if (a == null || (properPlayAddr = a.getProperPlayAddr()) == null) {
            return null;
        }
        Aweme aweme = this.f91549b;
        if (aweme == null) {
            aweme = this.f91548a;
        }
        a.setRationAndSourceId(aweme.getAid());
        return properPlayAddr;
    }

    /* renamed from: b */
    public final boolean mo67300b() {
        Aweme aweme;
        if (!this.f91550c.mo129315c() || ((aweme = this.f91548a) != null && aweme.getStatus() != null && this.f91548a.getStatus().isDelete())) {
            return false;
        }
        return true;
    }

    public C38770z(VideoViewComponent videoViewComponent, OnUIPlayListener onUIPlayListener) {
        this(videoViewComponent, onUIPlayListener, AbstractC38626ah.f91281a);
    }

    private C38770z(VideoViewComponent videoViewComponent, OnUIPlayListener onUIPlayListener, AbstractC38626ah ahVar) {
        this.f91554g = videoViewComponent;
        this.f91550c = videoViewComponent.f188405b;
        this.f91551d = onUIPlayListener;
        this.f91552e = ahVar;
    }
}
