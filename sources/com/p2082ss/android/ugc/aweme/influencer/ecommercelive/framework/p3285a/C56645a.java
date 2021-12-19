package com.p2082ss.android.ugc.aweme.influencer.ecommercelive.framework.p3285a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.influencer.ecommercelive.framework.p3285a.C56647b;
import java.util.Map;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.framework.a.a */
public final class C56645a {

    /* renamed from: b */
    public static final C56646a f129099b = new C56646a((byte) 0);

    /* renamed from: a */
    public final C56647b.C56648a f129100a;

    static {
        Covode.recordClassIndex(66490);
    }

    /* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.framework.a.a$a */
    public static final class C56646a {
        static {
            Covode.recordClassIndex(66491);
        }

        private C56646a() {
        }

        public /* synthetic */ C56646a(byte b) {
            this();
        }
    }

    public C56645a(String str) {
        C89219l.m154721d(str, "");
        this.f129100a = C56647b.f129101a.mo93533a(str);
    }

    /* renamed from: b */
    private static Boolean m102645b(String str) {
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = str.toLowerCase();
        C89219l.m154716b(lowerCase, "");
        int hashCode = lowerCase.hashCode();
        if (hashCode != 3569038) {
            if (hashCode == 97196323 && lowerCase.equals("false")) {
                return false;
            }
            return null;
        } else if (lowerCase.equals("true")) {
            return true;
        } else {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b6 A[EDGE_INSN: B:37:0x00b6->B:34:0x00b6 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo93531a(java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 183
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.influencer.ecommercelive.framework.p3285a.C56645a.mo93531a(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public final void mo93532a(String str, String str2) {
        String str3;
        C89219l.m154721d(str, "");
        if (str2 != null) {
            Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
            str3 = str2.toLowerCase();
            C89219l.m154716b(str3, "");
        } else {
            str3 = null;
        }
        C56647b bVar = C56647b.f129101a;
        C56647b.C56648a aVar = this.f129100a;
        if (aVar == null) {
            C89219l.m154715b();
        }
        Map<String, Object> a = bVar.mo93534a(aVar);
        if (str3 == null) {
            a.remove(str);
        } else {
            a.put(str, str3);
        }
    }
}
