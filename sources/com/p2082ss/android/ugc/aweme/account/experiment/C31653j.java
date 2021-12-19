package com.p2082ss.android.ugc.aweme.account.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.ClientExpManager;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.EnumC35462cf;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.experiment.service.AccountExperimentLayerServiceImpl;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.experiment.j */
public final class C31653j {

    /* renamed from: a */
    public static final C31653j f75716a = new C31653j();

    /* renamed from: b */
    private static final AbstractC89244h f75717b = C89250i.m154773a((AbstractC89171a) C31654a.f75718a);

    /* renamed from: c */
    private static int m65966c() {
        return ((Number) f75717b.getValue()).intValue();
    }

    private C31653j() {
    }

    /* renamed from: com.ss.android.ugc.aweme.account.experiment.j$a */
    static final class C31654a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C31654a f75718a = new C31654a();

        static {
            Covode.recordClassIndex(38385);
        }

        C31654a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25411a("login_default_open_screen", ClientExpManager.login_default_open_screen()));
        }
    }

    static {
        Covode.recordClassIndex(38384);
    }

    /* renamed from: a */
    public static boolean m65964a() {
        if (!AccountExperimentLayerServiceImpl.m65977b().mo57062a(EnumC35462cf.MAKE_LOGIN_PAGE_DEFAULT)) {
            return false;
        }
        IAccountUserService e = AccountService.m65215a().mo57069e();
        C89219l.m154716b(e, "");
        if (e.isLogin()) {
            return false;
        }
        if (m65966c() == 1 || m65966c() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m65965b() {
        if (!AccountExperimentLayerServiceImpl.m65977b().mo57062a(EnumC35462cf.MAKE_LOGIN_PAGE_DEFAULT)) {
            return false;
        }
        IAccountUserService e = AccountService.m65215a().mo57069e();
        C89219l.m154716b(e, "");
        if (!e.isLogin() && m65966c() == 2) {
            return true;
        }
        return false;
    }
}
