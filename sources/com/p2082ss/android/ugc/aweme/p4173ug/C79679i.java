package com.p2082ss.android.ugc.aweme.p4173ug;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ug.i */
public final class C79679i {

    /* renamed from: a */
    public static final Keva f178789a = Keva.getRepo("new_user_journey");

    /* renamed from: b */
    public static final C79680a f178790b = new C79680a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.ug.i$a */
    public static final class C79680a {
        static {
            Covode.recordClassIndex(92896);
        }

        private C79680a() {
        }

        /* renamed from: a */
        public static long m138493a() {
            long j;
            long currentTimeMillis = System.currentTimeMillis();
            if (C79679i.f178789a.contains("mandatory_login_shown_millis")) {
                j = currentTimeMillis - C79679i.f178789a.getLong("mandatory_login_shown_millis", currentTimeMillis);
            } else {
                j = -1;
            }
            C79679i.f178789a.erase("mandatory_login_shown_millis");
            return j;
        }

        public /* synthetic */ C79680a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m138494a(boolean z, String str, String str2, String str3, String str4, boolean z2, long j) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            C89219l.m154721d(str4, "");
            if (C79679i.f178789a.contains("mandatory_login_shown_millis")) {
                long a = m138493a();
                C33744d a2 = new C33744d().mo59983a("enter_method", str3).mo59983a("enter_from", str2).mo59983a("enter_type", str4).mo59980a("is_register", z ? 1 : 0).mo59980a("error_code", 0).mo59981a("user_id", j).mo59983a("platform", str).mo59980a("gms_auto_fill", z2 ? 1 : 0);
                if (a != -1) {
                    a2.mo59981a("duration", a);
                }
                C39162r.m79460a("onboarding_forced_login_success", a2.f79943a);
            }
        }
    }

    static {
        Covode.recordClassIndex(92895);
    }
}
