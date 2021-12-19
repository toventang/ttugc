package com.bytedance.lynx.hybrid.resource.p1526b;

import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.resource.config.C21277c;
import com.bytedance.lynx.hybrid.resource.config.GeckoConfig;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.lynx.hybrid.resource.b.f */
public final class C21263f {

    /* renamed from: a */
    public static final C21263f f50466a = new C21263f();

    private C21263f() {
    }

    static {
        Covode.recordClassIndex(24879);
    }

    /* renamed from: a */
    public static boolean m39968a(String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static GeckoConfig m39966a(C21277c cVar, String str) {
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(str, "");
        GeckoConfig geckoConfig = cVar.f50504k.get(str);
        if (geckoConfig == null) {
            return cVar.f50503j;
        }
        return geckoConfig;
    }

    /* renamed from: a */
    public static String m39967a(String str, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        if (str2.length() == 0) {
            return str;
        }
        return str + '/' + C89361p.m154899a(str2, (CharSequence) "/");
    }
}
