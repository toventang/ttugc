package com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a;

import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.a.d */
public final class C64944d<AREA> {

    /* renamed from: a */
    public final List<C64940b<AREA>> f146769a = new ArrayList();

    static {
        Covode.recordClassIndex(76412);
    }

    /* renamed from: a */
    public final void mo104274a(AREA area, AbstractC89277c<? extends AbstractC12748a> cVar) {
        C89219l.m154721d(area, "");
        C89219l.m154721d(cVar, "");
        C64940b<AREA> bVar = new C64940b<>(area, cVar);
        List<C64940b<AREA>> list = this.f146769a;
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f146761a);
        }
        if (!arrayList.contains(bVar.f146761a)) {
            this.f146769a.add(bVar);
        }
    }
}
