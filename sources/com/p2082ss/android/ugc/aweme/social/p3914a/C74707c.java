package com.p2082ss.android.ugc.aweme.social.p3914a;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.social.widget.card.C74787i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.social.a.c */
public final class C74707c {

    /* renamed from: a */
    public static final C74699a f167913a;

    /* renamed from: b */
    public static boolean f167914b;

    /* renamed from: c */
    public static final C74707c f167915c = new C74707c();

    /* renamed from: d */
    private static final C74700b f167916d = C74700b.f167901c;

    /* renamed from: e */
    private static String f167917e = "";

    /* renamed from: f */
    private static final AbstractC89244h f167918f = C89250i.m154773a((AbstractC89171a) C74708a.f167919a);

    /* renamed from: f */
    private static boolean m131162f() {
        return ((Boolean) f167918f.getValue()).booleanValue();
    }

    private C74707c() {
    }

    /* renamed from: com.ss.android.ugc.aweme.social.a.c$a */
    static final class C74708a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C74708a f167919a = new C74708a();

        static {
            Covode.recordClassIndex(87543);
        }

        C74708a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = false;
            if (IMService.createIIMServicebyMonsterPlugin(false).getFriendsCount() <= 5) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: a */
    public static Keva m131159a() {
        Keva repo = Keva.getRepo("f_recommend_prefix_" + m131161e());
        C89219l.m154716b(repo, "");
        return repo;
    }

    /* renamed from: e */
    private static String m131161e() {
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        String curUserId = g.getCurUserId();
        if (curUserId == null) {
            return "";
        }
        return curUserId;
    }

    /* renamed from: g */
    private static boolean m131163g() {
        if (m131162f() || C74787i.f168102a.mo117805a().mo117846b()) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(87542);
        C74699a a = C74700b.m131153a();
        C89219l.m154716b(a, "");
        f167913a = a;
    }

    /* renamed from: d */
    public static void m131160d() {
        if (C74700b.m131154b() || C74700b.m131156d()) {
            m131159a().storeInt("following_exp_ff_c", 0);
            m131159a().storeLong("following_h_ff_t", -1);
        }
    }

    /* renamed from: b */
    public final boolean mo117722b() {
        C74700b.m131153a();
        if (!C74700b.m131157e()) {
            return false;
        }
        if (!C89219l.m154714a((Object) f167917e, (Object) m131161e())) {
            f167917e = m131161e();
            boolean h = m131164h();
            f167914b = h;
            if (h) {
                f167914b = m131163g();
            }
        }
        return f167914b;
    }

    /* renamed from: c */
    public final boolean mo117723c() {
        if (C74700b.m131155c()) {
            if (m131164h() && !mo117722b()) {
                return true;
            }
            return false;
        } else if (!C74700b.m131156d() || !mo117722b()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: h */
    private static boolean m131164h() {
        Integer num;
        long j = m131159a().getLong("following_h_t_k", -1);
        if (j != -1) {
            Integer num2 = f167913a.f167898d;
            if (num2 == null) {
                return true;
            }
            if (m131158a(System.currentTimeMillis(), j) < ((long) num2.intValue())) {
                return false;
            }
            m131159a().storeLong("following_h_t_k", -1);
            return true;
        }
        long j2 = m131159a().getLong("following_h_ff_t", -1);
        if (j2 == -1 || (num = f167913a.f167897c) == null) {
            return true;
        }
        if (m131158a(System.currentTimeMillis(), j2) < ((long) num.intValue())) {
            return false;
        }
        m131159a().storeLong("following_h_ff_t", -1);
        m131159a().storeInt("following_exp_ff_c", 0);
        return true;
    }

    /* renamed from: a */
    private static long m131158a(long j, long j2) {
        return Math.abs((j - j2) / 86400000);
    }
}
