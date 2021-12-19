package com.bytedance.lottie.p1495a.p1497b;

import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.p1506g.C21089a;
import java.util.List;

/* renamed from: com.bytedance.lottie.a.b.e */
public final class C20959e extends AbstractC20960f<Integer> {
    static {
        Covode.recordClassIndex(24575);
    }

    public C20959e(List<C21089a<Integer>> list) {
        super(list);
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.lottie.p1495a.p1497b.AbstractC20954a
    /* renamed from: a */
    public final /* synthetic */ Object mo34463a(C21089a aVar, float f) {
        Object a;
        if (aVar.f49988c == null || aVar.f49989d == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        } else if (this.f49659d != null && (a = this.f49659d.mo34571a(aVar.f49991f, aVar.f49992g.floatValue(), aVar.f49988c, aVar.f49989d, f, mo34468b(), this.f49658c)) != null) {
            return a;
        } else {
            int intValue = aVar.f49988c.intValue();
            return Integer.valueOf((int) (((float) intValue) + (f * ((float) (aVar.f49989d.intValue() - intValue)))));
        }
    }
}
