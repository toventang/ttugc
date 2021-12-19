package com.p2082ss.android.ugc.aweme.account.p2273m;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.m.e */
public final class C32842e {

    /* renamed from: a */
    public static final String f78212a = "LogoutTerminal";

    /* renamed from: b */
    public static final String f78213b = "monitor_logout";

    /* renamed from: c */
    public static final String f78214c = "monitor_switch_account";

    /* renamed from: d */
    public static final C32843a f78215d = new C32843a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.account.m.e$a */
    public static final class C32843a {
        static {
            Covode.recordClassIndex(39627);
        }

        private C32843a() {
        }

        public /* synthetic */ C32843a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m67419a(int i, Integer num, String str) {
            C32837b.m67403a(C32842e.f78214c, i, m67418a(num, str, ""));
        }

        /* renamed from: a */
        private static JSONObject m67418a(Integer num, String str, String str2) {
            C89219l.m154721d(str2, "");
            C33743c cVar = new C33743c();
            if (num == null || num.intValue() != 0) {
                cVar.mo59974a("error_code", num).mo59976a("error_desc", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                cVar.mo59976a("extra", str2);
            }
            JSONObject a = cVar.mo59977a();
            C89219l.m154716b(a, "");
            return a;
        }

        /* renamed from: a */
        public static void m67420a(int i, String str, int i2, String str2) {
            C89219l.m154721d(str, "");
            C32837b.m67403a(C32842e.f78213b, i, m67418a(Integer.valueOf(i2), str2, str));
        }
    }

    static {
        Covode.recordClassIndex(39626);
    }
}
