package com.p2082ss.android.ugc.aweme.share.improve.p3755a;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpermissions.C17773l;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.C39163s;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeACLShare;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.share.ShareDependService;
import com.p2082ss.android.ugc.aweme.share.gif.C68932a;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69124b;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.m */
public final class C69087m implements AbstractC69693h {

    /* renamed from: a */
    private final Aweme f154519a;

    /* renamed from: b */
    private final String f154520b;

    static {
        Covode.recordClassIndex(81401);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: b */
    public final int mo61918b() {
        return R.string.fpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: c */
    public final String mo61919c() {
        return "gif";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    public final int co_() {
        return R.raw.icon_2pt_gif;
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
    /* renamed from: g */
    public final int mo61924g() {
        return R.raw.icon_gif;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: f */
    public final boolean mo61923f() {
        ACLCommonShare downloadGeneral;
        AwemeACLShare awemeACLShareInfo = this.f154519a.getAwemeACLShareInfo();
        if (awemeACLShareInfo == null || (downloadGeneral = awemeACLShareInfo.getDownloadGeneral()) == null || downloadGeneral.getShowType() != 2) {
            return false;
        }
        return true;
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

    public C69087m(Aweme aweme, String str) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(str, "");
        this.f154519a = aweme;
        this.f154520b = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61915a(Context context, SharePackage sharePackage) {
        ACLCommonShare downloadGeneral;
        Activity a;
        ACLCommonShare downloadGeneral2;
        String toastMsg;
        C89219l.m154721d(context, "");
        C89219l.m154721d(sharePackage, "");
        AwemeACLShare awemeACLShareInfo = this.f154519a.getAwemeACLShareInfo();
        if (!(awemeACLShareInfo == null || (downloadGeneral2 = awemeACLShareInfo.getDownloadGeneral()) == null || (toastMsg = downloadGeneral2.getToastMsg()) == null || toastMsg.length() <= 0)) {
            new C79459a(context).mo123052a(toastMsg).mo123053a();
        }
        AwemeACLShare awemeACLShareInfo2 = this.f154519a.getAwemeACLShareInfo();
        if (awemeACLShareInfo2 != null && (downloadGeneral = awemeACLShareInfo2.getDownloadGeneral()) != null && downloadGeneral.getCode() == 0 && (a = C69124b.m122223a(context)) != null) {
            Aweme aweme = this.f154519a;
            String str = this.f154520b;
            String a2 = C48027ac.C48028a.f111257a.mo80055a(C59208ac.m108763b(this.f154519a));
            C89219l.m154716b(a2, "");
            C89219l.m154721d(a, "");
            C89219l.m154721d(aweme, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(a2, "");
            C39162r.m79461a("save_as_gif", new C39163s().mo67941a("group_id", aweme.getAid()).mo67941a("author_id", aweme.getAuthorUid()).mo67941a("enter_from", str).mo67941a("log_pb", a2).mo67942a());
            C17773l.f42440d.mo28243a((ActivityC0945e) a, null).mo28229a("android.permission.WRITE_EXTERNAL_STORAGE").mo28230a(new C68932a.C68933a(ShareDependService.C68822a.m121324a().mo109324a(), a, aweme, str, a2));
        }
    }
}
