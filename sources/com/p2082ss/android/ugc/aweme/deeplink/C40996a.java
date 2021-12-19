package com.p2082ss.android.ugc.aweme.deeplink;

import android.net.Uri;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.deeplink.a */
public final class C40996a {

    /* renamed from: a */
    public static final String f95869a = "sslocal";

    /* renamed from: b */
    public static final String f95870b = "snssdk";

    /* renamed from: c */
    public static final String f95871c = "localsdk";

    /* renamed from: d */
    public static final String f95872d = "musically";

    /* renamed from: e */
    public static final String f95873e = "tiktok";

    /* renamed from: f */
    public static final C40997a f95874f = new C40997a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.deeplink.a$a */
    public static final class C40997a {
        static {
            Covode.recordClassIndex(48860);
        }

        private C40997a() {
        }

        /* renamed from: a */
        public static String m82610a() {
            return C40996a.f95870b + C17867d.f42590n;
        }

        public /* synthetic */ C40997a(byte b) {
            this();
        }

        /* renamed from: a */
        public static String m82611a(String str) {
            C89219l.m154721d(str, "");
            if (C13627m.m24498a(str)) {
                return str;
            }
            try {
                Uri parse = Uri.parse(str);
                C89219l.m154716b(parse, "");
                String scheme = parse.getScheme();
                String a = m82610a();
                if (C89219l.m154714a((Object) C40996a.f95869a, (Object) scheme) || C89219l.m154714a((Object) C40996a.f95871c, (Object) scheme)) {
                    return C89361p.m154869a(str, scheme, a, false);
                }
                return str;
            } catch (Exception unused) {
                return str;
            }
        }
    }

    static {
        Covode.recordClassIndex(48859);
    }
}
