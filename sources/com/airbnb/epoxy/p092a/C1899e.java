package com.airbnb.epoxy.p092a;

import com.airbnb.epoxy.p092a.AbstractC1898d;
import com.bytedance.covode.number.Covode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import p4600h.p4601a.AbstractC89040af;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89269g;
import p4600h.p4619j.C89271h;

/* renamed from: com.airbnb.epoxy.a.e */
public final class C1899e<P extends AbstractC1898d> {

    /* renamed from: a */
    public final ArrayDeque<P> f5739a;

    static {
        Covode.recordClassIndex(2090);
    }

    public C1899e(int i, AbstractC89171a<? extends P> aVar) {
        C89219l.m154719c(aVar, "");
        C89269g a = C89271h.m154766a(0, i);
        ArrayList arrayList = new ArrayList(C89070n.m154526a(a, 10));
        Iterator it = a.iterator();
        while (it.hasNext()) {
            ((AbstractC89040af) it).mo143429a();
            arrayList.add(aVar.invoke());
        }
        this.f5739a = new ArrayDeque<>(arrayList);
    }
}
