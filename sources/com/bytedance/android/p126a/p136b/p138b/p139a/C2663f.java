package com.bytedance.android.p126a.p136b.p138b.p139a;

import com.bytedance.android.p126a.p136b.C2651a;
import com.bytedance.android.p126a.p136b.p138b.C2665b;
import com.bytedance.android.p126a.p136b.p138b.C2667c;
import com.bytedance.android.p126a.p136b.p138b.p139a.AbstractC2656a;
import com.bytedance.android.p126a.p136b.p138b.p139a.AbstractC2661e;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.android.a.b.b.a.f */
public final class C2663f implements AbstractC2661e.AbstractC2662a {

    /* renamed from: a */
    private List<AbstractC2661e> f7955a;

    static {
        Covode.recordClassIndex(3051);
    }

    @Override // com.bytedance.android.p126a.p136b.p138b.p139a.AbstractC2661e.AbstractC2662a
    /* renamed from: a */
    public final C2665b mo7178a() {
        throw new UnsupportedOperationException("do not call");
    }

    @Override // com.bytedance.android.p126a.p136b.p138b.p139a.AbstractC2661e.AbstractC2662a
    /* renamed from: a */
    public final C2667c mo7179a(C2665b bVar) {
        return new AbstractC2656a.C2657a(this.f7955a).mo7179a(bVar);
    }

    /* renamed from: a */
    public final void mo7181a(List<AbstractC2661e> list) {
        Iterator<AbstractC2661e> it = list.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                it.remove();
            }
        }
        if (!list.isEmpty()) {
            List<AbstractC2661e> list2 = this.f7955a;
            list2.addAll(list2.size() - 1, list);
        }
    }

    public C2663f(C2651a aVar, AbstractC2656a aVar2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2664g(aVar));
        arrayList.add(new C2660d(aVar));
        this.f7955a = arrayList;
        arrayList.add(aVar2);
    }
}
