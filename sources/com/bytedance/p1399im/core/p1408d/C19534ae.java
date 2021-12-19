package com.bytedance.p1399im.core.p1408d;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1431d.C19967c;
import com.bytedance.p1399im.core.internal.p1431d.p1433b.AbstractC19965d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.im.core.d.ae */
public class C19534ae {

    /* renamed from: a */
    private List<Long> f46374a = new ArrayList();

    static {
        Covode.recordClassIndex(22378);
    }

    /* renamed from: a */
    public void mo31194a() {
        C19967c a = C19967c.m37645a();
        List<Long> list = this.f46374a;
        for (AbstractC19965d dVar : a.f47471a) {
            dVar.mo31842a().mo31822a(list);
        }
        this.f46374a.clear();
    }
}
