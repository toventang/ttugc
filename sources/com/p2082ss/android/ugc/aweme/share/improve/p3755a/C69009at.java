package com.p2082ss.android.ugc.aweme.share.improve.p3755a;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.share.ShareDependService;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69123a;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69124b;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.at */
public final class C69009at implements AbstractC69693h {

    /* renamed from: a */
    private final Aweme f154356a;

    /* renamed from: b */
    private final String f154357b;

    static {
        Covode.recordClassIndex(81323);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: b */
    public final int mo61918b() {
        return R.string.fcg;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: c */
    public final String mo61919c() {
        return "reuse_mv_template";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    public final int co_() {
        return R.raw.icon_2pt_template;
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
        return R.raw.icon_template;
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

    public C69009at(Aweme aweme, String str) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(str, "");
        this.f154356a = aweme;
        this.f154357b = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61915a(Context context, SharePackage sharePackage) {
        String str;
        String str2;
        C89219l.m154721d(context, "");
        C89219l.m154721d(sharePackage, "");
        if (C69123a.m122222a(this, context, this.f154356a, this.f154357b)) {
            FaceStickerBean.sCurPropSource = "prop_reuse";
            C39162r.m79460a("mvtheme_reuse_icon", new C33744d().mo59983a("mv_id", this.f154356a.getUploadMiscInfoStruct().mvThemeId).mo59983a("action_type", "click").mo59983a("group_id", this.f154356a.getAid()).f79943a);
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (g.isLogin() || !AVExternalServiceImpl.m113114a().configService().avsettingsConfig().needLoginBeforeRecord()) {
                ShareDependService a = ShareDependService.C68822a.m121324a();
                String str3 = this.f154356a.getUploadMiscInfoStruct().mvThemeId;
                C89219l.m154716b(str3, "");
                a.mo109335a(context, str3, this.f154356a.getUploadMiscInfoStruct().mvType);
                int i = this.f154356a.getUploadMiscInfoStruct().mvType;
                C33744d dVar = new C33744d();
                String str4 = "mv_page";
                if (i == 1) {
                    str = "jianying_mv_reuse";
                } else {
                    str = str4;
                }
                C33744d a2 = dVar.mo59983a("shoot_way", str);
                if (i == 1) {
                    str4 = "jianying_mv_page";
                }
                C33744d a3 = a2.mo59983a("enter_from", str4).mo59983a("mv_id", this.f154356a.getUploadMiscInfoStruct().mvThemeId).mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80054a(new LogPbBean())).mo59983a("group_id", this.f154356a.getAid()).mo59983a("author_id", this.f154356a.getAuthorUid());
                if (i == 1) {
                    str2 = "jianying_mv";
                } else {
                    str2 = "mv";
                }
                C39162r.m79460a("shoot", a3.mo59983a("content_type", str2).f79943a);
                return;
            }
            C58957c.m108318a(C69124b.m122223a(context), this.f154357b, "click_share_button");
        }
    }
}
