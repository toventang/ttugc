package com.bytedance.bridge.magpie.p879a.p881b;

import com.bytedance.bridge.magpie.C13402a;
import com.bytedance.bridge.magpie.p883b.C13428a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bridge.magpie.a.b.a */
public final class C13409a implements AbstractC13411c {

    /* renamed from: a */
    private final List<AbstractC13411c> f32710a;

    static {
        Covode.recordClassIndex(15409);
    }

    public C13409a(C13402a aVar) {
        C89219l.m154719c(aVar, "");
        ArrayList arrayList = new ArrayList();
        this.f32710a = arrayList;
        arrayList.add(new C13412d());
        arrayList.add(new C13410b(aVar));
        arrayList.add(new C13413e(aVar));
        arrayList.add(new C13414f(aVar));
    }

    @Override // com.bytedance.bridge.magpie.p879a.p881b.AbstractC13411c
    /* renamed from: a */
    public final boolean mo21641a(C13428a aVar) {
        C89219l.m154719c(aVar, "");
        Iterator<T> it = this.f32710a.iterator();
        while (it.hasNext()) {
            if (it.next().mo21641a(aVar)) {
                return true;
            }
        }
        return false;
    }
}
