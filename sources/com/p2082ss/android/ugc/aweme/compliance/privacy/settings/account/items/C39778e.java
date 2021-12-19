package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39256o;
import com.p2082ss.android.ugc.aweme.compliance.privacy.data.C39659b;
import com.p2082ss.android.ugc.aweme.compliance.privacy.p2666a.C39631a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.PrivacySettingViewModel;
import com.p2082ss.android.ugc.aweme.p2929fe.p2930a.C47809e;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.e */
public final class C39778e extends AbstractC39751a {

    /* renamed from: a */
    public final PrivacySettingViewModel f93651a;

    /* renamed from: b */
    private final AbstractC89244h f93652b = C89250i.m154773a((AbstractC89171a) C39779a.f93655a);

    /* renamed from: c */
    private final int f93653c = R.string.n4;

    /* renamed from: d */
    private final int f93654d = R.raw.icon_bubble_ellipsis_right;

    static {
        Covode.recordClassIndex(47508);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39720f, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39724i, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b
    /* renamed from: c */
    public final boolean mo69102c() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39720f, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39724i, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b
    /* renamed from: d */
    public final boolean mo69103d() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b
    /* renamed from: e */
    public final C39256o mo69120e() {
        return (C39256o) this.f93652b.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b
    /* renamed from: f */
    public final int mo69121f() {
        return this.f93653c;
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.e$a */
    static final class C39779a extends AbstractC89220m implements AbstractC89171a<C39256o> {

        /* renamed from: a */
        public static final C39779a f93655a = new C39779a();

        static {
            Covode.recordClassIndex(47509);
        }

        C39779a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C39256o invoke() {
            return C39659b.m80537a(0, UGCMonitor.EVENT_COMMENT);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b
    /* renamed from: h */
    public final Integer mo69124h() {
        return Integer.valueOf(this.f93654d);
    }

    public C39778e(PrivacySettingViewModel privacySettingViewModel) {
        C89219l.m154721d(privacySettingViewModel, "");
        this.f93651a = privacySettingViewModel;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39751a
    /* renamed from: a */
    public final void mo69114a(Context context) {
        C89219l.m154721d(context, "");
        C39162r.m79460a("enter_comment_permission", new C33744d().mo59983a("enter_from", "privacy_and_safety_settings").mo59980a("is_private", C39631a.m80486b() ? 1 : 0).f79943a);
        C39162r.m79460a("enter_comment_filter", new C33744d().mo59983a("enter_from", "privacy_and_safety_settings").f79943a);
        Boolean a = C47809e.C47810a.f110762a.mo79871a("filter_comment_manager_visible_" + C39631a.m80484a(), (Boolean) true);
        C33744d a2 = new C33744d().mo59983a("enter_from", "privacy_setting");
        C89219l.m154716b(a, "");
        C39162r.m79460a("enter_filter_comment", a2.mo59980a("is_show_management", a.booleanValue() ? 1 : 0).f79943a);
        SmartRouter.buildRoute(context, "//commentcontrol/setting").open(3);
    }
}
