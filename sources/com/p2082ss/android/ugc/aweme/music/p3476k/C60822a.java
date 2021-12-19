package com.p2082ss.android.ugc.aweme.music.p3476k;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.utils.C80361dw;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.k.a */
public final class C60822a {

    /* renamed from: a */
    public static final C60823a f138231a = new C60823a((byte) 0);

    static {
        Covode.recordClassIndex(71379);
    }

    /* renamed from: com.ss.android.ugc.aweme.music.k.a$a */
    public static final class C60823a {
        static {
            Covode.recordClassIndex(71380);
        }

        private C60823a() {
        }

        public /* synthetic */ C60823a(byte b) {
            this();
        }

        /* renamed from: a */
        public static String m110418a(String str, String str2, String str3) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str3, "");
            String string = Keva.getRepoFromSp(C17867d.m33078a(), str3, 0).getString(str, str2);
            C89219l.m154716b(string, "");
            return string;
        }

        /* renamed from: a */
        public static <T> void m110419a(String str, T t, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            Keva repoFromSp = Keva.getRepoFromSp(C17867d.m33078a(), str2, 0);
            if (t instanceof String) {
                repoFromSp.storeString(str, t);
            } else if (t instanceof Boolean) {
                repoFromSp.storeBoolean(str, t.booleanValue());
            } else {
                repoFromSp.storeString(str, C80361dw.m139334a(t));
            }
        }

        /* renamed from: a */
        public static boolean m110420a(String str, Boolean bool, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            boolean z = false;
            Keva repoFromSp = Keva.getRepoFromSp(C17867d.m33078a(), str2, 0);
            if (bool != null) {
                z = bool.booleanValue();
            }
            return repoFromSp.getBoolean(str, z);
        }
    }
}
