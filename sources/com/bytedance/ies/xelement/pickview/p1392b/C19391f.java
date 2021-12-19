package com.bytedance.ies.xelement.pickview.p1392b;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.List;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xelement.pickview.b.f */
public final class C19391f {

    /* renamed from: a */
    public static final C19391f f45904a = new C19391f();

    private C19391f() {
    }

    static {
        Covode.recordClassIndex(22186);
    }

    /* renamed from: a */
    public static void m36192a(List<C89378p<String, String>> list, AbstractC19392g gVar) {
        C89219l.m154719c(list, "");
        C89219l.m154719c(gVar, "");
        String a = m36191a(list, C19386b.f45899f);
        if (a != null) {
            gVar.mo30905a(a);
        }
        String a2 = m36191a(list, C19386b.f45900g);
        if (a2 != null) {
            gVar.mo30906b(a2);
        }
    }

    /* renamed from: a */
    public static String m36191a(List<C89378p<String, String>> list, String str) {
        T t;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C89219l.m154714a(t.getFirst(), (Object) str)) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null) {
            return (String) t2.getSecond();
        }
        return null;
    }
}
