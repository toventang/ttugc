package com.p2082ss.android.ugc.aweme.commercialize.egg.impl.p2557a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.commercialize.egg.p2552a.AbstractC37781a;
import com.p2082ss.android.ugc.aweme.commercialize.egg.p2555d.C37787a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.a.c */
public final class C37800c {

    /* renamed from: a */
    public static final C37800c f89264a = new C37800c();

    private C37800c() {
    }

    static {
        Covode.recordClassIndex(45247);
    }

    /* renamed from: a */
    public static AbstractC37781a m76450a(String str, C37787a aVar, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        int hashCode = str.hashCode();
        if (hashCode != 3321751) {
            if (hashCode != 950398559 || !str.equals(UGCMonitor.EVENT_COMMENT)) {
                return null;
            }
            C37796a aVar2 = new C37796a();
            String str3 = aVar.f89223m;
            C89219l.m154721d(str3, "");
            aVar2.f89257e = str3;
            String str4 = aVar.f89224n;
            C89219l.m154721d(str4, "");
            aVar2.f89258f = str4;
            String str5 = aVar.f89225o;
            C89219l.m154721d(str5, "");
            aVar2.f89259g = str5;
            String str6 = aVar.f89216f;
            C89219l.m154721d(str6, "");
            aVar2.f89253a = str6;
            String str7 = aVar.f89214d;
            C89219l.m154721d(str7, "");
            aVar2.f89255c = str7;
            String str8 = aVar.f89215e;
            C89219l.m154721d(str8, "");
            aVar2.f89256d = str8;
            if (str2 == null) {
                str2 = "";
            }
            C89219l.m154721d(str2, "");
            aVar2.f89254b = str2;
            return aVar2;
        } else if (!str.equals("like")) {
            return null;
        } else {
            C37798b bVar = new C37798b();
            String str9 = aVar.f89223m;
            C89219l.m154721d(str9, "");
            bVar.f89261a = str9;
            String str10 = aVar.f89224n;
            C89219l.m154721d(str10, "");
            bVar.f89262b = str10;
            String str11 = aVar.f89225o;
            C89219l.m154721d(str11, "");
            bVar.f89263c = str11;
            return bVar;
        }
    }
}
