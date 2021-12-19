package com.p2082ss.android.ugc.aweme.account.p2273m;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.m.f */
public final class C32844f {

    /* renamed from: a */
    public static final String f78216a = "SendCodeTerminal";

    /* renamed from: b */
    public static final String f78217b = "monitor_send_sms";

    /* renamed from: c */
    public static final String f78218c = "monitor_whatsapp_sms";

    /* renamed from: d */
    public static final C32845a f78219d = new C32845a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.account.m.f$a */
    public static final class C32845a {
        static {
            Covode.recordClassIndex(39629);
        }

        private C32845a() {
        }

        public /* synthetic */ C32845a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m67422a(int i, int i2, int i3, String str) {
            m67423a(i, i2, i3, str, null);
        }

        /* renamed from: b */
        public static void m67424b(int i, int i2, int i3, String str) {
            C32837b.m67403a(C32844f.f78218c, i, m67421a(i3, str, i2, "choose_dialog"));
        }

        /* renamed from: a */
        private static JSONObject m67421a(int i, String str, int i2, String str2) {
            C33743c cVar = new C33743c();
            if (i != 0) {
                cVar.mo59974a("error_code", Integer.valueOf(i)).mo59976a("error_desc", str);
            }
            cVar.mo59974a("send_type", Integer.valueOf(i2));
            if (str2 != null) {
                cVar.mo59976a("send_from", str2);
            }
            JSONObject a = cVar.mo59977a();
            C89219l.m154716b(a, "");
            return a;
        }

        /* renamed from: a */
        public static void m67423a(int i, int i2, int i3, String str, String str2) {
            C32837b.m67403a(C32844f.f78217b, i, m67421a(i3, str, i2, str2));
        }
    }

    static {
        Covode.recordClassIndex(39628);
    }
}
