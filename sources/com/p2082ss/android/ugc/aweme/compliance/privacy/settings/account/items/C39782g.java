package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39256o;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.C39699a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.g */
public final class C39782g extends AbstractC39751a {

    /* renamed from: a */
    public static final C39783a f93661a = new C39783a((byte) 0);

    /* renamed from: b */
    private final C39256o f93662b;

    /* renamed from: c */
    private final int f93663c = R.string.fls;

    /* renamed from: d */
    private final int f93664d = R.string.flt;

    static {
        Covode.recordClassIndex(47512);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.g$a */
    public static final class C39783a {
        static {
            Covode.recordClassIndex(47513);
        }

        private C39783a() {
        }

        public /* synthetic */ C39783a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b
    /* renamed from: e */
    public final C39256o mo69120e() {
        return this.f93662b;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b
    /* renamed from: f */
    public final int mo69121f() {
        return this.f93663c;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39720f, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39724i, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b
    /* renamed from: d */
    public final boolean mo69103d() {
        return C39699a.m80587b();
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b
    /* renamed from: g */
    public final Integer mo69122g() {
        return Integer.valueOf(this.f93664d);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39751a
    /* renamed from: a */
    public final void mo69114a(Context context) {
        String str;
        C89219l.m154721d(context, "");
        C39162r.m79460a("enter_data_download", new C33744d().mo59983a("enter_from", "personalization_data").f79943a);
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//webview");
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (g.isLogin() || !GuestModeServiceImpl.m65990d().mo57219c()) {
            str = "https://www.tiktok.com/falcon/rn/export_data/?enter_from=settings&hide_nav_bar=1";
        } else {
            str = "https://www.tiktok.com/web-inapp/download-your-data/guest?hide_nav_bar=1&should_full_screen=1";
        }
        buildRoute.withParam("url", str).withParam("hide_nav_bar", true).open();
    }
}
