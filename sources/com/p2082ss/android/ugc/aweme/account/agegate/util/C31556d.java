package com.p2082ss.android.ugc.aweme.account.agegate.util;

import com.bytedance.covode.number.Covode;
import java.util.regex.Pattern;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.util.d */
public final class C31556d {

    /* renamed from: a */
    public static final Pattern f75487a;

    /* renamed from: b */
    public static final C31557a f75488b = new C31557a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.util.d$a */
    public static final class C31557a {
        static {
            Covode.recordClassIndex(38276);
        }

        private C31557a() {
        }

        public /* synthetic */ C31557a(byte b) {
            this();
        }

        /* renamed from: a */
        public static boolean m65839a(String str) {
            C89219l.m154721d(str, "");
            return C31556d.f75487a.matcher(str).matches();
        }
    }

    static {
        Covode.recordClassIndex(38275);
        Pattern compile = Pattern.compile("^.{0,30}$");
        C89219l.m154716b(compile, "");
        f75487a = compile;
    }
}
