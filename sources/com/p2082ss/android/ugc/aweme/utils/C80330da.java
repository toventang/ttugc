package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.da */
public final class C80330da {

    /* renamed from: a */
    public static HashMap<String, AbstractC80321cz> f179858a = new HashMap<>();

    /* renamed from: b */
    public static final C80331a f179859b = new C80331a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.utils.da$a */
    public static final class C80331a {
        static {
            Covode.recordClassIndex(93599);
        }

        private C80331a() {
        }

        public /* synthetic */ C80331a(byte b) {
            this();
        }

        /* renamed from: b */
        public static AbstractC80321cz m139267b(String str) {
            C89219l.m154721d(str, "");
            return C80330da.f179858a.get(str);
        }

        /* renamed from: a */
        public static AbstractC80321cz m139266a(String str) {
            C89219l.m154721d(str, "");
            AbstractC80321cz czVar = C80330da.f179858a.get(str);
            if (czVar != null) {
                return czVar;
            }
            C80473gd gdVar = new C80473gd(str);
            C80330da.f179858a.put(str, gdVar);
            return gdVar;
        }
    }

    static {
        Covode.recordClassIndex(93598);
    }
}
