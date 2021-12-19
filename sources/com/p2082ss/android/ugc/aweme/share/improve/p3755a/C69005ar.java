package com.p2082ss.android.ugc.aweme.share.improve.p3755a;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69124b;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.ar */
public final class C69005ar implements AbstractC69693h {

    /* renamed from: a */
    private final User f154350a;

    static {
        Covode.recordClassIndex(81319);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: b */
    public final int mo61918b() {
        return R.string.fa_;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: c */
    public final String mo61919c() {
        return "report";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    public final int co_() {
        return R.raw.icon_2pt_flag;
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

    public C69005ar(User user) {
        C89219l.m154721d(user, "");
        this.f154350a = user;
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

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61915a(Context context, SharePackage sharePackage) {
        String str = "";
        C89219l.m154721d(context, str);
        C89219l.m154721d(sharePackage, str);
        C39162r.m79460a("report_user", new C33744d().mo59983a("enter_from", "others_homepage").mo59983a("to_user_id", this.f154350a.getUid()).f79943a);
        try {
            C28022o oVar = new C28022o();
            oVar.mo46801a("unique_id", C80580in.m139684b(this.f154350a));
            oVar.mo46798a("is_blocked", Boolean.valueOf(this.f154350a.isBlock()));
            String b = C80342dg.m139300a().mo46674b(oVar);
            C89219l.m154716b(b, str);
            str = b;
        } catch (Exception e) {
            e.printStackTrace();
        }
        C39223a.m79587a().mo68688a(C69124b.m122223a(context), new Uri.Builder().appendQueryParameter("owner_id", this.f154350a.getUid()).appendQueryParameter("object_id", this.f154350a.getUid()).appendQueryParameter("report_type", "user").appendQueryParameter("extra", str));
        C39223a.m79587a().mo68691a("others_homepage", "user", "", this.f154350a.getUid(), this.f154350a.getUid(), "", "click_share_button");
    }
}
