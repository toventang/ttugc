package com.bytedance.lottie.p1495a.p1497b;

import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.p1505f.C21081c;
import com.bytedance.lottie.p1506g.C21089a;
import java.util.List;

/* renamed from: com.bytedance.lottie.a.b.b */
public final class C20956b extends AbstractC20960f<Integer> {
    static {
        Covode.recordClassIndex(24572);
    }

    public C20956b(List<C21089a<Integer>> list) {
        super(list);
    }

    @Override // com.bytedance.lottie.p1495a.p1497b.AbstractC20954a
    /* renamed from: a */
    public final /* synthetic */ Object mo34463a(C21089a aVar, float f) {
        Object a;
        if (aVar.f49988c == null || aVar.f49989d == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int intValue = aVar.f49988c.intValue();
        int intValue2 = aVar.f49989d.intValue();
        if (this.f49659d == null || (a = this.f49659d.mo34571a(aVar.f49991f, aVar.f49992g.floatValue(), Integer.valueOf(intValue), Integer.valueOf(intValue2), f, mo34468b(), this.f49658c)) == null) {
            return Integer.valueOf(C21081c.m39688a(f, intValue, intValue2));
        }
        return a;
    }
}
