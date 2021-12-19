package com.p2082ss.android.ugc.aweme.share.improve.p3755a;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.share.ShareDependService;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.a */
public final class C68967a implements AbstractC69693h {

    /* renamed from: a */
    private Aweme f154288a;

    /* renamed from: b */
    private String f154289b;

    static {
        Covode.recordClassIndex(81281);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: b */
    public final int mo61918b() {
        return R.string.fnt;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: c */
    public final String mo61919c() {
        return "ad_settings";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    public final int co_() {
        return R.raw.icon_2pt_horn_ltr;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: d */
    public final boolean mo61921d() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: e */
    public final boolean mo61922e() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: f */
    public final boolean mo61923f() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: g */
    public final int mo61924g() {
        return co_();
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61916a(ImageView imageView) {
        C89219l.m154721d(imageView, "");
        C89219l.m154721d(imageView, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61917a(TextView textView) {
        C89219l.m154721d(textView, "");
        AbstractC69693h.C69694a.m123110a(this, textView);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61914a(Context context) {
        String uid;
        String str = "";
        C89219l.m154721d(context, str);
        C33744d a = new C33744d().mo59983a("enter_from", this.f154289b).mo59983a("group_id", this.f154288a.getAid());
        User author = this.f154288a.getAuthor();
        if (!(author == null || (uid = author.getUid()) == null)) {
            str = uid;
        }
        C39162r.m79460a("show_adsetting_entrance", a.mo59983a("author_id", str).mo59983a("enter_method", "click_share_button").f79943a);
    }

    public C68967a(Aweme aweme, String str) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(str, "");
        this.f154288a = aweme;
        this.f154289b = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61915a(Context context, SharePackage sharePackage) {
        String uid;
        String str = "";
        C89219l.m154721d(context, str);
        C89219l.m154721d(sharePackage, str);
        ShareDependService.C68822a.m121324a().mo109352d(context, this.f154288a);
        C33744d a = new C33744d().mo59983a("enter_from", this.f154289b).mo59983a("group_id", this.f154288a.getAid());
        User author = this.f154288a.getAuthor();
        if (!(author == null || (uid = author.getUid()) == null)) {
            str = uid;
        }
        C39162r.m79460a("click_adsetting_entrance", a.mo59983a("author_id", str).mo59983a("enter_method", "click_share_button").f79943a);
    }
}
