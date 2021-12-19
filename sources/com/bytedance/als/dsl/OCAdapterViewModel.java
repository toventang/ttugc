package com.bytedance.als.dsl;

import androidx.lifecycle.AbstractC1174ac;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.C21597n;
import p4600h.p4611f.p4613b.C89219l;

public final class OCAdapterViewModel extends AbstractC1174ac {

    /* renamed from: a */
    public final C21597n f7716a;

    /* renamed from: b */
    private C21582f f7717b;

    static {
        Covode.recordClassIndex(2934);
    }

    /* renamed from: a */
    public final C21582f mo7022a() {
        C21582f a = this.f7716a.mo35258a();
        C89219l.m154716b(a, "");
        this.f7717b = a;
        return a;
    }

    /* renamed from: b */
    public final C21582f mo7023b() {
        C21582f fVar = this.f7717b;
        if (fVar == null) {
            return mo7022a();
        }
        return fVar;
    }

    public OCAdapterViewModel(C21582f fVar, C2554e eVar) {
        C21597n nVar;
        C89219l.m154721d(eVar, "");
        if (fVar == null) {
            nVar = new C21597n(null, eVar.f7721a);
        } else {
            nVar = new C21597n(fVar, eVar.f7721a);
        }
        this.f7716a = nVar;
    }
}
