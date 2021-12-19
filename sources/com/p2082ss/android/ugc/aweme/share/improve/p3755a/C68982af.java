package com.p2082ss.android.ugc.aweme.share.improve.p3755a;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.share.ShareDependService;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.af */
public final class C68982af implements AbstractC69693h {

    /* renamed from: a */
    public static final C68983a f154315a = new C68983a((byte) 0);

    /* renamed from: b */
    private final Aweme f154316b;

    /* renamed from: c */
    private final String f154317c;

    static {
        Covode.recordClassIndex(81296);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: b */
    public final int mo61918b() {
        return R.string.es4;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: c */
    public final String mo61919c() {
        return "privacy";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    public final int co_() {
        return R.raw.icon_2pt_lock;
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
        return R.raw.icon_lock;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.af$a */
    public static final class C68983a {
        static {
            Covode.recordClassIndex(81297);
        }

        private C68983a() {
        }

        public /* synthetic */ C68983a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61914a(Context context) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(context, "");
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

    public C68982af(Aweme aweme, String str) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(str, "");
        this.f154316b = aweme;
        this.f154317c = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61915a(Context context, SharePackage sharePackage) {
        String str;
        C89219l.m154721d(context, "");
        C89219l.m154721d(sharePackage, "");
        String string = sharePackage.f155492i.getString("tab_name", "");
        String string2 = sharePackage.f155492i.getString("impr_id", "");
        C33744d a = new C33744d().mo59983a("group_id", this.f154316b.getAid()).mo59983a("enter_from", this.f154317c).mo59983a("impr_id", string2);
        if (TextUtils.equals(this.f154317c, "personal_homepage")) {
            a.mo59983a("tab_name", string);
        }
        if (this.f154316b.getAwemeType() == 40) {
            str = "story";
        } else {
            str = UGCMonitor.TYPE_POST;
        }
        a.mo59983a("story_type", str);
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        User curUser = g.getCurUser();
        C89219l.m154716b(curUser, "");
        a.mo59980a("is_private", curUser.isSecret() ? 1 : 0);
        C39162r.m79460a("click_privacy_setting_video", a.f79943a);
        ShareDependService a2 = ShareDependService.C68822a.m121324a();
        Aweme aweme = this.f154316b;
        C89219l.m154716b(string, "");
        String str2 = this.f154317c;
        C89219l.m154716b(string2, "");
        a2.mo109332a(context, aweme, string, str2, string2);
    }
}
