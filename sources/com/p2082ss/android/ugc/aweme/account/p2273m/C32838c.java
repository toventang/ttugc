package com.p2082ss.android.ugc.aweme.account.p2273m;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.m.c */
public final class C32838c {

    /* renamed from: a */
    public static final String f78206a = "BindPhoneTerminal";

    /* renamed from: b */
    public static final String f78207b = "monitor_bind_phone";

    /* renamed from: c */
    public static final String f78208c = "monitor_rebind_phone";

    /* renamed from: d */
    public static final C32839a f78209d = new C32839a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.account.m.c$a */
    public static final class C32839a {
        static {
            Covode.recordClassIndex(39623);
        }

        private C32839a() {
        }

        public /* synthetic */ C32839a(byte b) {
            this();
        }

        /* renamed from: a */
        private static JSONObject m67406a(int i, String str, String str2) {
            C33743c cVar = new C33743c();
            if (i != 0) {
                cVar.mo59974a("error_code", Integer.valueOf(i)).mo59976a("error_desc", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                cVar.mo59976a("scene", str2);
            }
            JSONObject a = cVar.mo59977a();
            C89219l.m154716b(a, "");
            return a;
        }

        /* renamed from: a */
        public static void m67407a(int i, String str, int i2, String str2) {
            C89219l.m154721d(str, "");
            C32837b.m67403a(C32838c.f78207b, i, m67406a(i2, str2, str));
        }

        /* renamed from: b */
        public static void m67408b(int i, String str, int i2, String str2) {
            C89219l.m154721d(str, "");
            C32837b.m67403a(C32838c.f78208c, i, m67406a(i2, str2, str));
        }
    }

    static {
        Covode.recordClassIndex(39622);
    }
}
