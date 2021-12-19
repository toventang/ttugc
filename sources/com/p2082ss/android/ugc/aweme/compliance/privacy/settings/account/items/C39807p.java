package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39256o;
import com.p2082ss.android.ugc.aweme.compliance.privacy.data.C39659b;
import com.p2082ss.android.ugc.aweme.compliance.privacy.p2666a.C39631a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.PrivacySettingViewModel;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.p */
public final class C39807p extends AbstractC39751a {

    /* renamed from: a */
    public final IAVSettingsService f93717a = AVExternalServiceImpl.m113114a().configService().avsettingsConfig();

    /* renamed from: b */
    public final PrivacySettingViewModel f93718b;

    /* renamed from: c */
    private final AbstractC89244h f93719c = C89250i.m154773a((AbstractC89171a) C39808a.f93722a);

    /* renamed from: d */
    private final int f93720d = R.string.n9;

    /* renamed from: e */
    private final int f93721e = R.raw.icon_stitch;

    static {
        Covode.recordClassIndex(47537);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b
    /* renamed from: e */
    public final C39256o mo69120e() {
        return (C39256o) this.f93719c.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b
    /* renamed from: f */
    public final int mo69121f() {
        return this.f93720d;
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.p$a */
    static final class C39808a extends AbstractC89220m implements AbstractC89171a<C39256o> {

        /* renamed from: a */
        public static final C39808a f93722a = new C39808a();

        static {
            Covode.recordClassIndex(47538);
        }

        C39808a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C39256o invoke() {
            return C39659b.m80537a(0, "stitch");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b
    /* renamed from: h */
    public final Integer mo69124h() {
        return Integer.valueOf(this.f93721e);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39720f, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39724i, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b
    /* renamed from: d */
    public final boolean mo69103d() {
        if (!super.mo69103d() || !this.f93717a.enableStitch()) {
            return false;
        }
        return true;
    }

    public C39807p(PrivacySettingViewModel privacySettingViewModel) {
        C89219l.m154721d(privacySettingViewModel, "");
        this.f93718b = privacySettingViewModel;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39751a
    /* renamed from: a */
    public final void mo69114a(Context context) {
        C89219l.m154721d(context, "");
        C39162r.m79460a("enter_stitch_permission", new C33744d().mo59983a("enter_from", "privacy_and_safety_settings").mo59980a("is_private", C39631a.m80486b() ? 1 : 0).f79943a);
        SmartRouter.buildRoute(context, "aweme://stitchcontrol/setting").open(9);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0040  */
    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39751a, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39714c
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo69095a(com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.C39723h r7, int r8) {
        /*
        // Method dump skipped, instructions count: 130
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.C39807p.mo69095a(com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.h, int):void");
    }
}
