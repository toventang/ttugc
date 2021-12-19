package com.p2082ss.android.ugc.aweme.newfollow.p3506c;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p2082ss.android.ugc.aweme.feed.p2944e.C49431d;
import com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;
import com.p2082ss.android.ugc.playerkit.videoview.C84294j;
import com.p2082ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;

/* renamed from: com.ss.android.ugc.aweme.newfollow.c.c */
public class C61501c {

    /* renamed from: a */
    public Aweme f139604a;

    /* renamed from: b */
    public C84294j f139605b;

    /* renamed from: c */
    public final OnUIPlayListener f139606c;

    /* renamed from: d */
    public int f139607d;

    /* renamed from: e */
    public AbstractC80747i f139608e;

    /* renamed from: f */
    public String f139609f;

    /* renamed from: g */
    private Aweme f139610g;

    /* renamed from: h */
    private final C49431d f139611h = null;

    static {
        Covode.recordClassIndex(72158);
    }

    /* renamed from: h */
    public final void mo99156h() {
        AbstractC80747i iVar = this.f139608e;
        if (iVar != null) {
            iVar.mo123912F();
        }
    }

    /* renamed from: i */
    public final void mo99157i() {
        AbstractC80747i iVar = this.f139608e;
        if (iVar != null) {
            iVar.mo123913G();
        }
    }

    /* renamed from: c */
    public final long mo99151c() {
        AbstractC80747i iVar = this.f139608e;
        if (iVar != null) {
            return iVar.mo123891n();
        }
        return 0;
    }

    /* renamed from: d */
    public final void mo99152d() {
        this.f139607d = 1;
        AbstractC80747i iVar = this.f139608e;
        if (iVar != null) {
            iVar.mo123908B();
        }
    }

    /* renamed from: f */
    public final void mo99154f() {
        if (mo99155g()) {
            this.f139607d = 0;
            m111346j();
        }
    }

    /* renamed from: k */
    private String m111347k() {
        if (!TextUtils.isEmpty(this.f139609f)) {
            return this.f139609f;
        }
        C49431d dVar = this.f139611h;
        if (dVar != null) {
            return dVar.mo81064j();
        }
        return "";
    }

    /* renamed from: l */
    private boolean m111348l() {
        Aweme aweme = this.f139604a;
        if (aweme == null || aweme.getStatus() == null || !this.f139604a.getStatus().isDelete()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo99147a() {
        AbstractC80747i iVar = this.f139608e;
        if (iVar != null && iVar.mo123945b(this.f139606c)) {
            this.f139608e.mo123937a((OnUIPlayListener) null);
        }
    }

    /* renamed from: b */
    public final long mo99150b() {
        AbstractC80747i iVar = this.f139608e;
        if (iVar != null) {
            return iVar.mo123887j();
        }
        return 0;
    }

    /* renamed from: e */
    public final VideoUrlModel mo99153e() {
        VideoUrlModel properPlayAddr;
        Video b = m111345b(this.f139604a);
        if (b == null || (properPlayAddr = b.getProperPlayAddr()) == null) {
            return null;
        }
        Aweme aweme = this.f139610g;
        if (aweme == null) {
            aweme = this.f139604a;
        }
        b.setRationAndSourceId(aweme.getAid());
        return properPlayAddr;
    }

    /* renamed from: g */
    public final boolean mo99155g() {
        if (!this.f139605b.mo129315c() || m111348l()) {
            return false;
        }
        m111347k();
        return true;
    }

    /* renamed from: j */
    private void m111346j() {
        AbstractC80747i iVar;
        if (mo99153e() != null && (iVar = this.f139608e) != null) {
            iVar.mo123937a(this.f139606c);
            this.f139608e.mo123934a(this.f139605b.mo129313b());
            this.f139608e.mo123941b(m111345b(this.f139604a), this.f139606c);
        }
    }

    /* renamed from: b */
    public static Video m111345b(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        return aweme.getVideo();
    }

    /* renamed from: a */
    public final void mo99148a(float f) {
        AbstractC80747i iVar;
        if (mo99155g() && (iVar = this.f139608e) != null) {
            iVar.mo123937a(this.f139606c);
            this.f139608e.mo123934a(this.f139605b.mo129313b());
            this.f139608e.mo123931a(f);
        }
    }

    /* renamed from: a */
    public final void mo99149a(Aweme aweme) {
        if (aweme != null) {
            if (aweme.getAwemeType() == 13) {
                this.f139610g = aweme;
                this.f139604a = aweme.getForwardItem();
                return;
            }
            this.f139610g = null;
            this.f139604a = aweme;
        }
    }

    public C61501c(KeepSurfaceTextureView keepSurfaceTextureView, OnUIPlayListener onUIPlayListener) {
        this.f139605b = C84294j.m144981a(keepSurfaceTextureView);
        this.f139606c = onUIPlayListener;
    }
}
