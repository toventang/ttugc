package com.bytedance.sdk.p1625a.p1626a;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1664o.AbstractC22511d;
import com.p2082ss.android.account.C29351f;

/* renamed from: com.bytedance.sdk.a.a.c */
public final class C22306c {
    static {
        Covode.recordClassIndex(26122);
    }

    /* renamed from: com.bytedance.sdk.a.a.c$a */
    public static class C22307a {

        /* renamed from: a */
        public static String f52737a = "https://";

        /* renamed from: b */
        public static String f52738b = "http://";

        static {
            Covode.recordClassIndex(26123);
        }

        /* renamed from: a */
        public static String m41971a() {
            return C29351f.m58781a().mo52209a();
        }

        /* renamed from: a */
        public static String m41972a(String str) {
            AbstractC22511d dVar = C29351f.f69673c;
            if (dVar == null || !dVar.mo36785a()) {
                return f52737a + m41971a() + str;
            }
            return f52738b + m41971a() + str;
        }
    }

    /* renamed from: com.bytedance.sdk.a.a.c$b */
    public static class C22308b {
        static {
            Covode.recordClassIndex(26124);
        }

        /* renamed from: a */
        private static String m41973a() {
            return C29351f.m58781a().mo52209a();
        }

        /* renamed from: a */
        public static String m41974a(String str) {
            AbstractC22511d dVar = C29351f.f69673c;
            if (dVar == null || !dVar.mo36785a()) {
                return "https://" + m41973a() + str;
            }
            return "http://" + m41973a() + str;
        }
    }
}
