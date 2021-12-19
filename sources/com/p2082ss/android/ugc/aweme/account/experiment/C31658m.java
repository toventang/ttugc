package com.p2082ss.android.ugc.aweme.account.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.ClientExpManager;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import java.util.Set;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89047am;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.experiment.m */
public final class C31658m {

    /* renamed from: a */
    static final Keva f75723a;

    /* renamed from: b */
    public static final C31658m f75724b = new C31658m();

    /* renamed from: c */
    private static final AbstractC89244h f75725c = C89250i.m154773a((AbstractC89171a) C31660b.f75729a);

    /* renamed from: d */
    private static final AbstractC89244h f75726d = C89250i.m154773a((AbstractC89171a) C31661c.f75730a);

    /* renamed from: e */
    private static final AbstractC89244h f75727e = C89250i.m154773a((AbstractC89171a) C31659a.f75728a);

    /* renamed from: a */
    public static long m65968a() {
        return ((Number) f75725c.getValue()).longValue();
    }

    /* renamed from: b */
    public static int m65969b() {
        return ((Number) f75727e.getValue()).intValue();
    }

    private C31658m() {
    }

    /* renamed from: com.ss.android.ugc.aweme.account.experiment.m$a */
    static final class C31659a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C31659a f75728a = new C31659a();

        static {
            Covode.recordClassIndex(38390);
        }

        C31659a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25411a("sea_nonpersonalized_popup", ClientExpManager.sea_nonpersonalized_popup()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.experiment.m$b */
    static final class C31660b extends AbstractC89220m implements AbstractC89171a<Long> {

        /* renamed from: a */
        public static final C31660b f75729a = new C31660b();

        static {
            Covode.recordClassIndex(38391);
        }

        C31660b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Long invoke() {
            long currentTimeMillis;
            if (C31658m.f75723a.contains("install_time")) {
                currentTimeMillis = C31658m.f75723a.getLong("install_time", System.currentTimeMillis());
            } else {
                currentTimeMillis = System.currentTimeMillis();
                C31658m.f75723a.storeLong("install_time", currentTimeMillis);
            }
            return Long.valueOf(currentTimeMillis);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.experiment.m$c */
    static final class C31661c extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C31661c f75730a = new C31661c();

        static {
            Covode.recordClassIndex(38392);
        }

        C31661c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            if (C31658m.f75723a.contains("is_new_user")) {
                return Boolean.valueOf(C31658m.f75723a.getBoolean("is_new_user", false));
            }
            Boolean a = C49907s.m93685a();
            Keva keva = C31658m.f75723a;
            C89219l.m154716b(a, "");
            keva.storeBoolean("is_new_user", a.booleanValue());
            return a;
        }
    }

    static {
        Covode.recordClassIndex(38389);
        Keva repo = Keva.getRepo("sea_nonpersonalized_repo");
        C89219l.m154716b(repo, "");
        f75723a = repo;
    }

    /* renamed from: c */
    public static boolean m65970c() {
        if (!((Boolean) f75726d.getValue()).booleanValue()) {
            return false;
        }
        Set a = C89047am.m154438a((Object[]) new String[]{"MM", "LA", "KH"});
        IAccountService a2 = AccountService.m65215a();
        C89219l.m154716b(a2, "");
        if (!a.contains(a2.mo57065b())) {
            return false;
        }
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (g.isLogin()) {
            return false;
        }
        return true;
    }
}
