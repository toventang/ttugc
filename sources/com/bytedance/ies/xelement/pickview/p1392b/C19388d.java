package com.bytedance.ies.xelement.pickview.p1392b;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89388w;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.ies.xelement.pickview.b.d */
public final class C19388d {

    /* renamed from: a */
    public static final C19388d f45901a = new C19388d();

    /* renamed from: b */
    private static final AbstractC89244h f45902b = C89250i.m154773a((AbstractC89171a) C19389a.f45903a);

    /* renamed from: a */
    private static List<String> m36185a() {
        return (List) f45902b.getValue();
    }

    private C19388d() {
    }

    static {
        Covode.recordClassIndex(22183);
    }

    /* renamed from: com.bytedance.ies.xelement.pickview.b.d$a */
    static final class C19389a extends AbstractC89220m implements AbstractC89171a<List<? extends String>> {

        /* renamed from: a */
        public static final C19389a f45903a = new C19389a();

        static {
            Covode.recordClassIndex(22184);
        }

        C19389a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<? extends String> invoke() {
            return C89070n.m154522b(C19386b.f45899f, C19386b.f45895b, C19386b.f45894a, C19386b.f45896c, C19386b.f45897d, C19386b.f45898e, C19386b.f45900g);
        }
    }

    /* renamed from: a */
    public static List<C89378p<String, String>> m36186a(String str) {
        C89378p pVar;
        C89219l.m154719c(str, "");
        List<String> b = C89361p.m154915b(str, new String[]{";"});
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) b, 10));
        Iterator<T> it = b.iterator();
        while (it.hasNext()) {
            List c = C89361p.m154921c(it.next(), new String[]{":"});
            if (c.size() == 2) {
                String str2 = (String) c.get(0);
                if (str2 != null) {
                    String obj = C89361p.m154910b((CharSequence) str2).toString();
                    String str3 = (String) c.get(1);
                    if (str3 != null) {
                        pVar = new C89378p(obj, C89361p.m154910b((CharSequence) str3).toString());
                    } else {
                        throw new C89388w("null cannot be cast to non-null type");
                    }
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else {
                pVar = null;
            }
            arrayList.add(pVar);
        }
        List f = C89070n.m154580f((Iterable) arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : f) {
            if (m36185a().contains(((C89378p) obj2).getFirst())) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }
}
