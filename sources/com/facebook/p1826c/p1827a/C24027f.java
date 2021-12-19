package com.facebook.p1826c.p1827a;

import com.bytedance.covode.number.Covode;
import com.facebook.common.p1839k.C24130d;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.c.a.f */
public final class C24027f {
    static {
        Covode.recordClassIndex(28153);
    }

    /* renamed from: c */
    private static String m45460c(AbstractC24026e eVar) {
        return C24130d.m45732a(eVar.mo39543a().getBytes("UTF-8"));
    }

    /* renamed from: b */
    public static String m45459b(AbstractC24026e eVar) {
        try {
            if (eVar instanceof C24028g) {
                return m45460c(((C24028g) eVar).f56889a.get(0));
            }
            return m45460c(eVar);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static List<String> m45458a(AbstractC24026e eVar) {
        try {
            if (eVar instanceof C24028g) {
                List<AbstractC24026e> list = ((C24028g) eVar).f56889a;
                ArrayList arrayList = new ArrayList(list.size());
                for (int i = 0; i < list.size(); i++) {
                    arrayList.add(m45460c(list.get(i)));
                }
                return arrayList;
            }
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(m45460c(eVar));
            return arrayList2;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
