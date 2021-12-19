package com.p2082ss.android.ugc.aweme.discover.tooltip;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.ClientExpManager;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.tooltip.d */
public final class C42536d {

    /* renamed from: a */
    public static AbstractC42535c f99176a;

    /* renamed from: b */
    public static boolean f99177b;

    /* renamed from: c */
    public static boolean f99178c;

    /* renamed from: d */
    public static boolean f99179d = true;

    /* renamed from: e */
    public static boolean f99180e;

    /* renamed from: f */
    public static boolean f99181f;

    /* renamed from: g */
    public static String f99182g = "";

    /* renamed from: h */
    public static long f99183h = -1;

    /* renamed from: i */
    public static long f99184i = -1;

    /* renamed from: j */
    public static String f99185j = "";

    /* renamed from: k */
    public static String f99186k = "automatic_dismissal";

    /* renamed from: l */
    public static final Keva f99187l = Keva.getRepo("first_time_discovery");

    /* renamed from: m */
    public static int f99188m;

    /* renamed from: n */
    public static final AbstractC89244h f99189n = C89250i.m154773a((AbstractC89171a) C42538b.f99191a);

    /* renamed from: o */
    public static final C42537a f99190o = new C42537a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.discover.tooltip.d$a */
    public static final class C42537a {
        static {
            Covode.recordClassIndex(50629);
        }

        /* renamed from: a */
        public static Boolean m85032a() {
            return (Boolean) C42536d.f99189n.getValue();
        }

        private C42537a() {
        }

        /* renamed from: f */
        public static void m85041f() {
            AbstractC42535c cVar = C42536d.f99176a;
            if (cVar != null) {
                cVar.mo72669b();
            }
        }

        /* renamed from: c */
        public static int m85037c() {
            if (C42536d.f99187l.getBoolean("first_time", true)) {
                return 1;
            }
            return 0;
        }

        /* renamed from: e */
        public static int m85040e() {
            if (C42536d.f99187l.getBoolean("tooltip_shown", false)) {
                return 1;
            }
            return 0;
        }

        /* renamed from: b */
        public static void m85035b() {
            Boolean a = m85032a();
            C89219l.m154716b(a, "");
            if (a.booleanValue()) {
                C42536d.f99188m = 1;
            }
        }

        /* renamed from: d */
        public static int m85039d() {
            Boolean a = m85032a();
            C89219l.m154716b(a, "");
            if (a.booleanValue()) {
                return 1;
            }
            return 0;
        }

        public /* synthetic */ C42537a(byte b) {
            this();
        }

        /* renamed from: b */
        public static void m85036b(String str) {
            C89219l.m154721d(str, "");
            C42536d.f99185j = str;
        }

        /* renamed from: c */
        public static void m85038c(String str) {
            C89219l.m154721d(str, "");
            C42536d.f99182g = str;
        }

        /* renamed from: a */
        public static void m85033a(String str) {
            C89219l.m154721d(str, "");
            if (C16048b.m29633a().mo25411a("return_fyp_tooltip", ClientExpManager.return_fyp_tooltip()) != 0) {
                C42536d.f99186k = str;
            }
        }

        /* renamed from: a */
        public static void m85034a(boolean z) {
            C42536d.f99177b = z;
            if (!z) {
                C42536d.f99187l.storeBoolean("tooltip_shown", true);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.tooltip.d$b */
    static final class C42538b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C42538b f99191a = new C42538b();

        static {
            Covode.recordClassIndex(50630);
        }

        C42538b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            if (C42536d.f99187l.contains("is_new_user_key")) {
                return Boolean.valueOf(C42536d.f99187l.getBoolean("is_new_user_key", false));
            }
            Boolean a = C49907s.m93685a();
            Keva keva = C42536d.f99187l;
            C89219l.m154716b(a, "");
            keva.storeBoolean("is_new_user_key", a.booleanValue());
            return a;
        }
    }

    static {
        Covode.recordClassIndex(50628);
        C42537a.m85035b();
    }
}
