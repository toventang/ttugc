package com.bytedance.lottie.p1495a.p1497b;

import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.p1506g.C21089a;
import com.bytedance.lottie.p1506g.C21092d;
import java.util.List;

/* renamed from: com.bytedance.lottie.a.b.k */
public final class C20965k extends AbstractC20960f<C21092d> {
    static {
        Covode.recordClassIndex(24581);
    }

    public C20965k(List<C21089a<C21092d>> list) {
        super(list);
    }

    @Override // com.bytedance.lottie.p1495a.p1497b.AbstractC20954a
    /* renamed from: a */
    public final /* synthetic */ Object mo34463a(C21089a aVar, float f) {
        Object a;
        if (aVar.f49988c == null || aVar.f49989d == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        T t = aVar.f49988c;
        T t2 = aVar.f49989d;
        if (this.f49659d != null && (a = this.f49659d.mo34571a(aVar.f49991f, aVar.f49992g.floatValue(), t, t2, f, mo34468b(), this.f49658c)) != null) {
            return a;
        }
        float f2 = t.f50006a;
        float f3 = f2 + ((t2.f50006a - f2) * f);
        float f4 = t.f50007b;
        float f5 = f4 + (f * (t2.f50007b - f4));
        C21092d dVar = (C21092d) C21092d.C21093a.f50008a.mo34558b();
        if (dVar == null) {
            return new C21092d(f3, f5);
        }
        dVar.f50006a = f3;
        dVar.f50007b = f5;
        return dVar;
    }
}
