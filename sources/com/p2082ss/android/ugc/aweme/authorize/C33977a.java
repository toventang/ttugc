package com.p2082ss.android.ugc.aweme.authorize;

import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.authorize.a */
public final class C33977a {

    /* renamed from: a */
    public static final String f80366a = "AwemeAuthorizeTerminal";

    /* renamed from: b */
    public static final String f80367b = "monitor_login_authorize";

    /* renamed from: c */
    public static final int f80368c = 0;

    /* renamed from: d */
    public static final int f80369d = 1;

    /* renamed from: e */
    public static final int f80370e = 2;

    /* renamed from: f */
    public static final C33978a f80371f = new C33978a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.authorize.a$a */
    public static final class C33978a {
        static {
            Covode.recordClassIndex(40909);
        }

        private C33978a() {
        }

        public /* synthetic */ C33978a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m69576a(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6) {
            String str7 = C33977a.f80367b;
            C33743c cVar = new C33743c();
            if (i2 != 0) {
                C33743c a = cVar.mo59974a("error_code", Integer.valueOf(i2)).mo59976a("error_desc", str);
                if (str2 == null) {
                    str2 = "";
                }
                a.mo59976a("client_key", str2);
            }
            cVar.mo59976a("opensdk_name", str3).mo59976a("opensdk_version", str4).mo59976a("commonsdk_name", str5).mo59976a("commsdk_version", str6);
            JSONObject a2 = cVar.mo59977a();
            C89219l.m154716b(a2, "");
            C12290b.m22060a(str7, i, a2);
        }
    }

    static {
        Covode.recordClassIndex(40908);
    }
}
