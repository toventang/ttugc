package com.p2082ss.android.ugc.aweme.account.p2273m;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.m.a */
public final class C32835a {

    /* renamed from: a */
    public static String f78202a = "";

    /* renamed from: b */
    public static String f78203b = "";

    /* renamed from: c */
    public static final C32836a f78204c = new C32836a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.account.m.a$a */
    public static final class C32836a {
        static {
            Covode.recordClassIndex(39620);
        }

        private C32836a() {
        }

        public /* synthetic */ C32836a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m67401a(String str) {
            C89219l.m154721d(str, "");
            C32835a.f78203b = str;
        }

        /* renamed from: a */
        public static void m67402a(boolean z, String str, boolean z2, int i) {
            C33743c a = new C33743c().mo59971a("success", Boolean.valueOf(z));
            if (str == null) {
                str = "";
            }
            JSONObject a2 = a.mo59976a("error_desc", str).mo59971a("has_sim_card", Boolean.valueOf(z2)).mo59974a("google_availability", Integer.valueOf(i)).mo59977a();
            int i2 = !z ? 1 : 0;
            C89219l.m154716b(a2, "");
            C32837b.m67403a("sms_auto_fill", i2, a2);
        }
    }

    static {
        Covode.recordClassIndex(39619);
    }
}
