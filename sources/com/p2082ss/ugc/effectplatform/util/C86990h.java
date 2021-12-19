package com.p2082ss.ugc.effectplatform.util;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.p4450g.C86788a;
import com.p2082ss.ugc.effectplatform.p4452i.AbstractC86801a;
import p4519d.p4520a.p4522b.C87991a;
import p4519d.p4520a.p4528c.C88030c;
import p4519d.p4520a.p4528c.C88037g;
import p4519d.p4520a.p4532e.C88060b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89388w;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.ugc.effectplatform.util.h */
public final class C86990h {

    /* renamed from: a */
    public static String f196146a = "760.0.0.148-alpha.2-mt";

    /* renamed from: b */
    public static final C87991a<AbstractC86801a> f196147b = new C87991a<>(null);

    /* renamed from: c */
    public static final C86990h f196148c = new C86990h();

    /* renamed from: d */
    private static final AbstractC89244h f196149d = C89250i.m154773a((AbstractC89171a) C86991a.f196150a);

    /* renamed from: a */
    private static byte[] m150654a() {
        return (byte[]) f196149d.getValue();
    }

    private C86990h() {
    }

    static {
        Covode.recordClassIndex(102756);
    }

    /* renamed from: com.ss.ugc.effectplatform.util.h$a */
    static final class C86991a extends AbstractC89220m implements AbstractC89171a<byte[]> {

        /* renamed from: a */
        public static final C86991a f196150a = new C86991a();

        static {
            Covode.recordClassIndex(102757);
        }

        C86991a() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ byte[] invoke() {
            String str = C86990h.f196146a;
            C88060b.m153135a("EffectPlatformAES", "initialize-->platformVersion=".concat(String.valueOf(str)));
            if (str != null) {
                String a = C88030c.m153082a(C88037g.m153093a(C86788a.m150337a(str + ":android")));
                if (a != null) {
                    String substring = a.substring(8, 24);
                    C89219l.m154709a((Object) substring, "");
                    C88060b.m153135a("EffectPlatformAES", "md5: " + str + ":android -> " + substring);
                    return C86788a.m150337a(substring);
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new RuntimeException();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ String m150652a(C86990h hVar, String str) {
        return m150653a(str, m150654a());
    }

    /* renamed from: a */
    public final String mo140619a(String str, String str2) {
        C89219l.m154719c(str2, "");
        if (C89361p.m154870a((CharSequence) str2)) {
            return m150652a(this, str);
        }
        String a = C88030c.m153082a(C88037g.m153093a(C86788a.m150337a(str2 + ":android")));
        if (a != null) {
            String substring = a.substring(8, 24);
            C89219l.m154709a((Object) substring, "");
            return m150653a(str, C86788a.m150337a(substring));
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e9, code lost:
        if (r6 >= r5) goto L_0x00eb;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m150653a(java.lang.String r38, byte[] r39) {
        /*
        // Method dump skipped, instructions count: 961
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ugc.effectplatform.util.C86990h.m150653a(java.lang.String, byte[]):java.lang.String");
    }
}
