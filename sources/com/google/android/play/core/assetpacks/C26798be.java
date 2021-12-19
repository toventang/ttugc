package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.play.core.assetpacks.be */
final /* synthetic */ class C26798be implements AbstractC26805bl {

    /* renamed from: a */
    private final C26806bm f63542a;

    /* renamed from: b */
    private final List f63543b;

    static {
        Covode.recordClassIndex(32273);
    }

    C26798be(C26806bm bmVar, List list) {
        this.f63542a = bmVar;
        this.f63543b = list;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC26805bl
    /* renamed from: a */
    public final Object mo44493a() {
        C26806bm bmVar = this.f63542a;
        List list = this.f63543b;
        HashMap hashMap = new HashMap();
        for (C26803bj bjVar : bmVar.f63567e.values()) {
            String str = bjVar.f63556c.f63549a;
            if (list.contains(str)) {
                C26803bj bjVar2 = (C26803bj) hashMap.get(str);
                if ((bjVar2 == null ? -1 : bjVar2.f63554a) < bjVar.f63554a) {
                    hashMap.put(str, bjVar);
                }
            }
        }
        return hashMap;
    }
}
