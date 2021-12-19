package com.bytedance.lottie.p1504e;

import android.graphics.PointF;
import android.util.JsonReader;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.p037h.p039b.C0767b;
import androidx.p025c.C0498h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lottie.C21088g;
import com.bytedance.lottie.p1505f.C21084f;
import com.bytedance.lottie.p1506g.C21089a;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.lottie.e.o */
public class C21066o {

    /* renamed from: a */
    private static final Interpolator f49943a = new LinearInterpolator();

    /* renamed from: b */
    private static C0498h<WeakReference<Interpolator>> f49944b;

    static {
        Covode.recordClassIndex(24682);
    }

    /* renamed from: a */
    private static WeakReference<Interpolator> m39661a(int i) {
        WeakReference<Interpolator> a;
        MethodCollector.m26663i(9907);
        synchronized (C21066o.class) {
            try {
                if (f49944b == null) {
                    f49944b = new C0498h<>();
                }
                a = f49944b.mo2183a(i, null);
            } finally {
                MethodCollector.m26664o(9907);
            }
        }
        return a;
    }

    /* renamed from: a */
    private static void m39662a(int i, WeakReference<Interpolator> weakReference) {
        MethodCollector.m26663i(10066);
        synchronized (C21066o.class) {
            try {
                f49944b.mo2186b(i, weakReference);
            } finally {
                MethodCollector.m26664o(10066);
            }
        }
    }

    /* renamed from: a */
    private static <T> C21089a<T> m39658a(JsonReader jsonReader, float f, AbstractC21051af<T> afVar) {
        return new C21089a<>(afVar.mo34520a(jsonReader, f));
    }

    /* renamed from: a */
    private static <T> C21089a<T> m39660a(C21088g gVar, JsonReader jsonReader, float f, AbstractC21051af<T> afVar) {
        Interpolator interpolator;
        jsonReader.beginObject();
        PointF pointF = null;
        PointF pointF2 = null;
        T t = null;
        T t2 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        boolean z = false;
        float f2 = 0.0f;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case 101:
                    if (nextName.equals("e")) {
                        t2 = afVar.mo34520a(jsonReader, f);
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
                        pointF2 = C21064n.m39654b(jsonReader, f);
                        continue;
                    }
                    break;
                case 111:
                    if (nextName.equals("o")) {
                        pointF = C21064n.m39654b(jsonReader, f);
                        continue;
                    }
                    break;
                case 115:
                    if (nextName.equals("s")) {
                        t = afVar.mo34520a(jsonReader, f);
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
                        pointF4 = C21064n.m39654b(jsonReader, f);
                        continue;
                    }
                    break;
                case 3707:
                    if (nextName.equals("to")) {
                        pointF3 = C21064n.m39654b(jsonReader, f);
                        continue;
                    }
                    break;
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        if (z) {
            interpolator = f49943a;
            t2 = t;
        } else if (pointF == null || pointF2 == null) {
            interpolator = f49943a;
        } else {
            float f3 = -f;
            pointF.x = C21084f.m39705a(pointF.x, f3, f);
            pointF.y = C21084f.m39705a(pointF.y, -100.0f, 100.0f);
            pointF2.x = C21084f.m39705a(pointF2.x, f3, f);
            pointF2.y = C21084f.m39705a(pointF2.y, -100.0f, 100.0f);
            int i = (int) ((((float) (((int) ((((float) (((int) ((((float) (((int) (((pointF.x + 1.0f) * 527.0f) + 1.0f)) * 31)) * (pointF.y + 2.0f)) + 1.0f)) * 31)) * (pointF2.x + 3.0f)) + 1.0f)) * 31)) * (pointF2.y + 4.0f)) + 1.0f);
            WeakReference<Interpolator> a = m39661a(i);
            if (a == null || (interpolator = a.get()) == null) {
                interpolator = C0767b.m2680a(pointF.x / f, pointF.y / f, pointF2.x / f, pointF2.y / f);
                try {
                    m39662a(i, new WeakReference(interpolator));
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
        }
        C21089a<T> aVar = new C21089a<>(gVar, t, t2, interpolator, f2, null);
        aVar.f49993h = pointF3;
        aVar.f49994i = pointF4;
        return aVar;
    }

    /* renamed from: a */
    public static <T> C21089a<T> m39659a(JsonReader jsonReader, C21088g gVar, float f, AbstractC21051af<T> afVar, boolean z) {
        if (z) {
            return m39660a(gVar, jsonReader, f, afVar);
        }
        return m39658a(jsonReader, f, afVar);
    }
}
