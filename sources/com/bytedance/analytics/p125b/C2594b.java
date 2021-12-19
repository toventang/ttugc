package com.bytedance.analytics.p125b;

import android.util.Base64;
import com.bytedance.analytics.page.C2602f;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89338d;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.analytics.b.b */
public final class C2594b {

    /* renamed from: a */
    public static final C2594b f7811a = new C2594b();

    /* renamed from: b */
    public static AbstractC89183m<? super String, ? super String, C89391z> f7812b;

    static {
        Covode.recordClassIndex(2981);
    }

    private C2594b() {
    }

    /* renamed from: a */
    public static final void m7541a(String str) {
        C89219l.m154721d(str, "");
        AbstractC89183m<? super String, ? super String, C89391z> mVar = f7812b;
        if (mVar != null) {
            mVar.invoke("BTMLogTag", str);
        }
    }

    /* renamed from: b */
    private static void m7542b(String str) {
        AbstractC89183m<? super String, ? super String, C89391z> mVar = f7812b;
        if (mVar != null) {
            mVar.invoke("BTMLogTag_Page", str);
        }
    }

    /* renamed from: a */
    public static void m7540a(C2602f fVar) {
        String str;
        String str2;
        String str3 = "";
        C89219l.m154721d(fVar, str3);
        if (f7812b != null) {
            String str4 = fVar.f7837q;
            if (str4 != null) {
                List<String> b = C89361p.m154915b(str4, new String[]{"."});
                String str5 = b.get(1);
                try {
                    str2 = String.valueOf(Long.parseLong(str5));
                } catch (Exception unused) {
                    byte[] decode = Base64.decode(str5, 0);
                    C89219l.m154716b(decode, str3);
                    str2 = new String(decode, C89338d.f202990a);
                }
                str = str2 + '.' + b.get(2) + '.' + b.get(3);
            } else {
                str = str3;
            }
            String str6 = fVar.f7839s;
            if (str6 != null) {
                String str7 = (String) C89361p.m154921c(str6, new String[]{"."}).get(1);
                try {
                    str3 = String.valueOf(Long.parseLong(str7));
                } catch (Exception unused2) {
                    byte[] decode2 = Base64.decode(str7, 0);
                    C89219l.m154716b(decode2, str3);
                    str3 = new String(decode2, C89338d.f202990a);
                }
            }
            m7542b("name:" + fVar.f7822b + ",back:" + fVar.f7835o + ",pre:" + str + ",duration:" + fVar.f7840t + "ms,lastStay:" + str3);
        }
    }
}
