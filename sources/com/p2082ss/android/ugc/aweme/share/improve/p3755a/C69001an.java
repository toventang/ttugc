package com.p2082ss.android.ugc.aweme.share.improve.p3755a;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.report.IReportService;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69124b;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.an */
public final class C69001an implements AbstractC69693h {

    /* renamed from: a */
    private final Challenge f154346a;

    static {
        Covode.recordClassIndex(81315);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: b */
    public final int mo61918b() {
        return R.string.fa_;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: c */
    public final String mo61919c() {
        return "report_hashtag";
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

    public C69001an(Challenge challenge) {
        this.f154346a = challenge;
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
        String str;
        String str2;
        String str3;
        User author;
        User author2;
        C89219l.m154721d(context, "");
        C89219l.m154721d(sharePackage, "");
        Uri.Builder appendQueryParameter = new Uri.Builder().appendQueryParameter("report_type", "hashtag");
        Challenge challenge = this.f154346a;
        String str4 = null;
        if (challenge != null) {
            str = challenge.getCid();
        } else {
            str = null;
        }
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("object_id", str);
        Challenge challenge2 = this.f154346a;
        if (challenge2 == null || (author2 = challenge2.getAuthor()) == null) {
            str2 = null;
        } else {
            str2 = author2.getUid();
        }
        C39223a.m79587a().mo68688a(C69124b.m122223a(context), appendQueryParameter2.appendQueryParameter("owner_id", str2));
        IReportService a = C39223a.m79587a();
        Challenge challenge3 = this.f154346a;
        if (challenge3 != null) {
            str3 = challenge3.getCid();
        } else {
            str3 = null;
        }
        Challenge challenge4 = this.f154346a;
        if (!(challenge4 == null || (author = challenge4.getAuthor()) == null)) {
            str4 = author.getUid();
        }
        a.mo68691a("challenge_detail", "hashtag", "", str3, str4, "", "click_share_button");
    }
}
