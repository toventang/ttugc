package com.airbnb.lottie.p105h;

import android.graphics.PointF;
import android.util.JsonReader;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.p037h.p039b.C0767b;
import androidx.p025c.C0498h;
import com.airbnb.lottie.C2044e;
import com.airbnb.lottie.p106i.C2192f;
import com.airbnb.lottie.p107j.C2202a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
/* renamed from: com.airbnb.lottie.h.o */
public class C2174o {

    /* renamed from: a */
    private static final Interpolator f6525a = new LinearInterpolator();

    /* renamed from: b */
    private static C0498h<WeakReference<Interpolator>> f6526b;

    C2174o() {
    }

    static {
        Covode.recordClassIndex(2369);
    }

    /* renamed from: a */
    private static WeakReference<Interpolator> m6741a(int i) {
        WeakReference<Interpolator> a;
        MethodCollector.m26663i(12443);
        synchronized (C2174o.class) {
            try {
                if (f6526b == null) {
                    f6526b = new C0498h<>();
                }
                a = f6526b.mo2183a(i, null);
            } finally {
                MethodCollector.m26664o(12443);
            }
        }
        return a;
    }

    /* renamed from: a */
    private static void m6742a(int i, WeakReference<Interpolator> weakReference) {
        MethodCollector.m26663i(12444);
        synchronized (C2174o.class) {
            try {
                f6526b.mo2186b(i, weakReference);
            } finally {
                MethodCollector.m26664o(12444);
            }
        }
    }

    /* renamed from: a */
    private static <T> C2202a<T> m6738a(JsonReader jsonReader, float f, AbstractC2159af<T> afVar) {
        return new C2202a<>(afVar.mo6078a(jsonReader, f));
    }

    /* renamed from: a */
    private static <T> C2202a<T> m6740a(C2044e eVar, JsonReader jsonReader, float f, AbstractC2159af<T> afVar) {
        Interpolator interpolator;
        jsonReader.beginObject();
        boolean z = false;
        PointF pointF = null;
        PointF pointF2 = null;
        T t = null;
        T t2 = null;
        float f2 = 0.0f;
        PointF pointF3 = null;
        PointF pointF4 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case 101:
                    if (nextName.equals("e")) {
                        t = afVar.mo6078a(jsonReader, f);
                        continue;
                    }
                    break;
                case 104:
                    if (nextName.equals("h")) {
                        if (jsonReader.nextInt() == 1) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                        }
                    }
                    break;
                case 105:
                    if (nextName.equals("i")) {
                        pointF2 = C2172n.m6734b(jsonReader, f);
                        continue;
                    }
                    break;
                case 111:
                    if (nextName.equals("o")) {
                        pointF = C2172n.m6734b(jsonReader, f);
                        continue;
                    }
                    break;
                case 115:
                    if (nextName.equals("s")) {
                        t2 = afVar.mo6078a(jsonReader, f);
                        continue;
                    }
                    break;
                case 116:
                    if (nextName.equals("t")) {
                        f2 = (float) jsonReader.nextDouble();
                        continue;
                    }
                    break;
                case 3701:
                    if (nextName.equals("ti")) {
                        pointF3 = C2172n.m6734b(jsonReader, f);
                        continue;
                    }
                    break;
                case 3707:
                    if (nextName.equals("to")) {
                        pointF4 = C2172n.m6734b(jsonReader, f);
                        continue;
                    }
                    break;
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        if (z) {
            interpolator = f6525a;
            t = t2;
        } else if (pointF == null || pointF2 == null) {
            interpolator = f6525a;
        } else {
            float f3 = -f;
            pointF.x = C2192f.m6785a(pointF.x, f3, f);
            pointF.y = C2192f.m6785a(pointF.y, -100.0f, 100.0f);
            pointF2.x = C2192f.m6785a(pointF2.x, f3, f);
            pointF2.y = C2192f.m6785a(pointF2.y, -100.0f, 100.0f);
            float f4 = pointF.x;
            float f5 = pointF.y;
            float f6 = pointF2.x;
            float f7 = pointF2.y;
            int i = 17;
            if (f4 != 0.0f) {
                i = (int) (f4 * 527.0f);
            }
            if (f5 != 0.0f) {
                i = (int) (((float) (i * 31)) * f5);
            }
            if (f6 != 0.0f) {
                i = (int) (((float) (i * 31)) * f6);
            }
            if (f7 != 0.0f) {
                i = (int) (((float) (i * 31)) * f7);
            }
            WeakReference<Interpolator> a = m6741a(i);
            if (a == null || (interpolator = a.get()) == null) {
                interpolator = C0767b.m2680a(pointF.x / f, pointF.y / f, pointF2.x / f, pointF2.y / f);
                try {
                    m6742a(i, new WeakReference(interpolator));
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
        }
        C2202a<T> aVar = new C2202a<>(eVar, t2, t, interpolator, f2, null);
        aVar.f6575k = pointF4;
        aVar.f6576l = pointF3;
        return aVar;
    }

    /* renamed from: a */
    static <T> C2202a<T> m6739a(JsonReader jsonReader, C2044e eVar, float f, AbstractC2159af<T> afVar, boolean z) {
        if (z) {
            return m6740a(eVar, jsonReader, f, afVar);
        }
        return m6738a(jsonReader, f, afVar);
    }
}
