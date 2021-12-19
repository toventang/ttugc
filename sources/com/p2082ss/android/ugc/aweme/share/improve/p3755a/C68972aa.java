package com.p2082ss.android.ugc.aweme.share.improve.p3755a;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeACLShare;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.AbstractC58894c;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.C58901f;
import com.p2082ss.android.ugc.aweme.share.ShareDependService;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69124b;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.aa */
public final class C68972aa implements AbstractC69693h {

    /* renamed from: a */
    public static final C68973a f154299a = new C68973a((byte) 0);

    /* renamed from: b */
    private final Aweme f154300b;

    /* renamed from: c */
    private final String f154301c;

    static {
        Covode.recordClassIndex(81286);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: b */
    public final int mo61918b() {
        return R.string.hav;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: c */
    public final String mo61919c() {
        return "live_photo";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    public final int co_() {
        return R.raw.icon_2pt_live_wallpaper;
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
        return R.raw.icon_live_wallpaper;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.aa$a */
    public static final class C68973a {
        static {
            Covode.recordClassIndex(81287);
        }

        private C68973a() {
        }

        public /* synthetic */ C68973a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: f */
    public final boolean mo61923f() {
        AwemeACLShare awemeACLShareInfo;
        ACLCommonShare downloadGeneral;
        if (C58901f.m108236c() || (awemeACLShareInfo = this.f154300b.getAwemeACLShareInfo()) == null || (downloadGeneral = awemeACLShareInfo.getDownloadGeneral()) == null || downloadGeneral.getShowType() != 2) {
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

    public C68972aa(Aweme aweme, String str) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(str, "");
        this.f154300b = aweme;
        this.f154301c = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61915a(Context context, SharePackage sharePackage) {
        ACLCommonShare downloadGeneral;
        ACLCommonShare downloadGeneral2;
        String toastMsg;
        C89219l.m154721d(context, "");
        C89219l.m154721d(sharePackage, "");
        if (C58901f.m108236c()) {
            new C79459a(C17867d.m33078a()).mo123050a(R.string.hax).mo123053a();
            return;
        }
        AwemeACLShare awemeACLShareInfo = this.f154300b.getAwemeACLShareInfo();
        if (!(awemeACLShareInfo == null || (downloadGeneral2 = awemeACLShareInfo.getDownloadGeneral()) == null || (toastMsg = downloadGeneral2.getToastMsg()) == null || toastMsg.length() == 0)) {
            new C79459a(context).mo123052a(toastMsg).mo123053a();
        }
        AwemeACLShare awemeACLShareInfo2 = this.f154300b.getAwemeACLShareInfo();
        if (awemeACLShareInfo2 != null && (downloadGeneral = awemeACLShareInfo2.getDownloadGeneral()) != null && downloadGeneral.getCode() == 0) {
            String string = sharePackage.f155492i.getString("previousPage");
            if (string == null) {
                string = "";
            }
            C89219l.m154716b(string, "");
            Activity a = C69124b.m122223a(context);
            if (a != null) {
                Aweme aweme = this.f154300b;
                C33744d a2 = new C33744d().mo59983a("group_id", aweme.getAid()).mo59983a("author_id", aweme.getAuthorUid()).mo59983a("request_id", aweme.getRequestId()).mo59983a("previous_page", string).mo59983a("enter_from", "share");
                boolean d = C58901f.m108237d();
                a2.mo59980a("need_plugin", d ? 1 : 0);
                if (d) {
                    boolean b = C29843f.m60133b(a, AbstractC58894c.f134066a);
                    a2.mo59980a("plugin_install", b ? 1 : 0);
                    if (b) {
                        a2.mo59980a("install_type", C58901f.m108225a(a) ? 1 : 0);
                    }
                }
                C39162r.m79460a("wall_paper_click", a2.f79943a);
                ShareDependService.C68822a.m121324a().mo109329a(a, this.f154300b);
            }
        }
    }
}
