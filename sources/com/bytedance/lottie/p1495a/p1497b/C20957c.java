package com.bytedance.lottie.p1495a.p1497b;

import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.p1506g.C21089a;
import java.util.List;

/* renamed from: com.bytedance.lottie.a.b.c */
public final class C20957c extends AbstractC20960f<Float> {

    /* renamed from: e */
    private static final Float f49662e = Float.valueOf(0.0f);

    /* renamed from: f */
    private static final Float f49663f = Float.valueOf(1.0f);

    /* renamed from: g */
    private static final Float f49664g = Float.valueOf(30.0f);

    /* renamed from: h */
    private static final Float f49665h = Float.valueOf(35.0f);

    /* renamed from: i */
    private static final Float f49666i = Float.valueOf(60.0f);

    /* renamed from: j */
    private static final Float f49667j = Float.valueOf(90.0f);

    /* renamed from: k */
    private static final Float f49668k = Float.valueOf(100.0f);

    /* renamed from: l */
    private static final Float f49669l = Float.valueOf(180.0f);

    /* renamed from: m */
    private static final Float f49670m = Float.valueOf(197.0f);

    static {
        Covode.recordClassIndex(24573);
    }

    public C20957c(List<C21089a<Float>> list) {
        super(list);
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.lottie.p1495a.p1497b.AbstractC20954a
    /* renamed from: a */
    public final /* synthetic */ Object mo34463a(C21089a aVar, float f) {
        Object a;
        if (aVar.f49988c == null || aVar.f49989d == null) {
            if (aVar.f49987b != null) {
                throw new IllegalStateException("Missing values for keyframe. and " + aVar.toString() + ".Composition is" + aVar.f49987b.toString());
            }
            throw new IllegalStateException("Missing values for keyframe. and " + aVar.toString());
        } else if (this.f49659d != null && (a = this.f49659d.mo34571a(aVar.f49991f, aVar.f49992g.floatValue(), aVar.f49988c, aVar.f49989d, f, mo34468b(), this.f49658c)) != null) {
            return a;
        } else {
            float floatValue = aVar.f49988c.floatValue();
            float floatValue2 = floatValue + (f * (aVar.f49989d.floatValue() - floatValue));
            if (floatValue2 == 0.0f) {
                return f49662e;
            }
            if (floatValue2 == 1.0f) {
                return f49663f;
            }
            if (floatValue2 == 30.0f) {
                return f49664g;
            }
            if (floatValue2 == 35.0f) {
                return f49665h;
            }
            if (floatValue2 == 60.0f) {
                return f49666i;
            }
            if (floatValue2 == 90.0f) {
                return f49667j;
            }
            if (floatValue2 == 100.0f) {
                return f49668k;
            }
            if (floatValue2 == 180.0f) {
                return f49669l;
            }
            if (floatValue2 == 197.0f) {
                return f49670m;
            }
            return Float.valueOf(floatValue2);
        }
    }
}
