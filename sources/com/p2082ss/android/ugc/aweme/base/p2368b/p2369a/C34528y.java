package com.p2082ss.android.ugc.aweme.base.p2368b.p2369a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.notice.api.p3513d.AbstractC61571e;

/* renamed from: com.ss.android.ugc.aweme.base.b.a.y */
final class C34528y implements AbstractC61571e {

    /* renamed from: a */
    private Context f81529a;

    /* renamed from: b */
    private Keva f81530b;

    static {
        Covode.recordClassIndex(41486);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.p3513d.AbstractC61571e
    /* renamed from: b */
    public final void mo60987b(String str) {
        this.f81530b.storeString("tutorial_video_msg_id", str);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.p3513d.AbstractC61571e
    /* renamed from: d */
    public final void mo60989d(String str) {
        this.f81530b.storeString("tutorial_video_icon", str);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.p3513d.AbstractC61571e
    /* renamed from: f */
    public final void mo60991f(String str) {
        this.f81530b.storeString("tutorial_video_title", str);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.p3513d.AbstractC61571e
    /* renamed from: h */
    public final void mo60993h(String str) {
        this.f81530b.storeString("tutorial_video_desc", str);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.p3513d.AbstractC61571e
    /* renamed from: j */
    public final void mo60995j(String str) {
        this.f81530b.storeString("tutorial_video_button", str);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.p3513d.AbstractC61571e
    /* renamed from: l */
    public final void mo60997l(String str) {
        this.f81530b.storeString("tutorial_video_deep_link", str);
    }

    public C34528y(Context context) {
        this.f81529a = context;
        this.f81530b = Keva.getRepoFromSp(context, "TutorialVideoPreference", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.p3513d.AbstractC61571e
    /* renamed from: a */
    public final String mo60986a(String str) {
        return this.f81530b.getString("tutorial_video_msg_id", str);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.p3513d.AbstractC61571e
    /* renamed from: c */
    public final String mo60988c(String str) {
        return this.f81530b.getString("tutorial_video_icon", str);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.p3513d.AbstractC61571e
    /* renamed from: e */
    public final String mo60990e(String str) {
        return this.f81530b.getString("tutorial_video_title", str);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.p3513d.AbstractC61571e
    /* renamed from: g */
    public final String mo60992g(String str) {
        return this.f81530b.getString("tutorial_video_desc", str);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.p3513d.AbstractC61571e
    /* renamed from: i */
    public final String mo60994i(String str) {
        return this.f81530b.getString("tutorial_video_button", str);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.p3513d.AbstractC61571e
    /* renamed from: k */
    public final String mo60996k(String str) {
        return this.f81530b.getString("tutorial_video_deep_link", str);
    }
}
