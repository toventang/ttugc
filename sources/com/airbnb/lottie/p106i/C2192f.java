package com.airbnb.lottie.p106i;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.p093a.p094a.AbstractC2001k;
import com.airbnb.lottie.p099e.C2047a;
import com.airbnb.lottie.p099e.C2104e;
import com.airbnb.lottie.p099e.p101b.C2077l;
import com.airbnb.lottie.p104g.C2144d;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.airbnb.lottie.i.f */
public final class C2192f {

    /* renamed from: a */
    private static final ThreadLocal<PointF> f6549a = new ThreadLocal<PointF>() {
        /* class com.airbnb.lottie.p106i.C2192f.C21931 */

        static {
            Covode.recordClassIndex(2388);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public final /* synthetic */ PointF initialValue() {
            return new PointF();
        }
    };

    /* renamed from: a */
    public static int m6788a(int i, int i2, float f) {
        return (int) (((float) i) + (f * ((float) (i2 - i))));
    }

    static {
        Covode.recordClassIndex(2387);
    }

    /* renamed from: a */
    public static int m6787a(int i) {
        return Math.max(0, Math.min(255, i));
    }

    /* renamed from: a */
    static int m6786a(float f, float f2) {
        boolean z;
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        if ((i ^ i2) >= 0) {
            z = true;
        } else {
            z = false;
        }
        int i4 = i % i2;
        if (!z && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    /* renamed from: a */
    public static PointF m6789a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    /* renamed from: a */
    public static void m6790a(C2077l lVar, Path path) {
        PointF pointF;
        path.reset();
        PointF pointF2 = lVar.f6236b;
        path.moveTo(pointF2.x, pointF2.y);
        if (C2144d.C2145a.f6479a) {
            pointF = f6549a.get();
            pointF.set(pointF2.x, pointF2.y);
        } else {
            pointF = new PointF(pointF2.x, pointF2.y);
        }
        for (int i = 0; i < lVar.f6235a.size(); i++) {
            C2047a aVar = lVar.f6235a.get(i);
            PointF pointF3 = aVar.f6152a;
            PointF pointF4 = aVar.f6153b;
            PointF pointF5 = aVar.f6154c;
            if (!pointF3.equals(pointF) || !pointF4.equals(pointF5)) {
                path.cubicTo(pointF3.x, pointF3.y, pointF4.x, pointF4.y, pointF5.x, pointF5.y);
            } else {
                path.lineTo(pointF5.x, pointF5.y);
            }
            pointF.set(pointF5.x, pointF5.y);
        }
        if (lVar.f6237c) {
            path.close();
        }
    }

    /* renamed from: a */
    public static float m6785a(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    /* renamed from: a */
    public static void m6791a(C2104e eVar, int i, List<C2104e> list, C2104e eVar2, AbstractC2001k kVar) {
        if (eVar.mo5980c(kVar.mo5903b(), i)) {
            list.add(eVar2.mo5977a(kVar.mo5903b()).mo5976a(kVar));
        }
    }
}
