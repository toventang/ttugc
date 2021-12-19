package com.p2082ss.android.ugc.aweme.main.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.experiment.C46796cm;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.main.experiment.g */
public final class C59086g {

    /* renamed from: a */
    public static final C59086g f134492a = new C59086g();

    /* renamed from: b */
    private static final AbstractC89244h f134493b = C89250i.m154773a((AbstractC89171a) C59087a.f134495a);

    /* renamed from: c */
    private static Keva f134494c;

    /* renamed from: e */
    private static boolean m108567e() {
        return ((Boolean) f134493b.getValue()).booleanValue();
    }

    private C59086g() {
    }

    /* renamed from: b */
    public static boolean m108564b() {
        if (C16048b.m29633a().mo25412a(true, "following_foru_swipe_disable_unloginuser", 0) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m108565c() {
        Keva keva = f134494c;
        if (keva != null) {
            return keva.getBoolean("swiped", false);
        }
        return false;
    }

    /* renamed from: d */
    public static void m108566d() {
        Keva keva = f134494c;
        if (keva != null) {
            keva.storeBoolean("swiped", true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.experiment.g$a */
    static final class C59087a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C59087a f134495a = new C59087a();

        static {
            Covode.recordClassIndex(69435);
        }

        C59087a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (C16048b.m29633a().mo25412a(true, "following_foru_swipe_disable_unloginuser", 0) == 0) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(69434);
        try {
            f134494c = Keva.getRepoFromSp(C17867d.m33078a(), "MTMainTabPreferences", 0);
        } catch (Throwable th) {
            C51423a.m95787a("SharedPreferencesAnnotatedManager getSP failed " + th.getMessage());
        }
    }

    /* renamed from: a */
    public static boolean m108563a() {
        if (C46796cm.f109016a) {
            if (!m108567e() || C39223a.m79601o().mo68703a()) {
                return false;
            }
            return true;
        } else if (C16048b.m29633a().mo25412a(true, "following_foru_swipe_disable_unloginuser", 0) == 0 || C39223a.m79601o().mo68703a()) {
            return false;
        } else {
            return true;
        }
    }
}
