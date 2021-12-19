package com.bytedance.liko.p1483a;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.Npth;
import com.bytedance.crash.entity.C13866d;
import com.bytedance.crash.p932j.C13913i;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.liko.p1484b.AbstractC20838b;
import com.bytedance.liko.p1484b.C20841e;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.bytedance.liko.a.b */
public final class C20833b {

    /* renamed from: a */
    public static C20835a f49269a = new C20835a();

    /* renamed from: com.bytedance.liko.a.b$a */
    public static class C20835a {

        /* renamed from: a */
        public WeakHashMap<Bitmap, C20832a> f49272a = new WeakHashMap<>();

        static {
            Covode.recordClassIndex(24411);
        }
    }

    static {
        Covode.recordClassIndex(24409);
    }

    /* renamed from: com.bytedance.liko.a.b$b */
    public static class RunnableC20836b implements Runnable {
        static {
            Covode.recordClassIndex(24412);
        }

        public final void run() {
            MethodCollector.m26663i(3062);
            System.gc();
            synchronized (this) {
                try {
                    for (Map.Entry<Bitmap, C20832a> entry : C20833b.f49269a.f49272a.entrySet()) {
                        C20832a value = entry.getValue();
                        if (Npth.isInit()) {
                            C13866d a = C13866d.m25085a(new StackTraceElement(value.getClass().getName(), "report", "BitmapEvent", 0), value.f49261a, value.f49266f, Thread.currentThread().getName(), false, "EnsureNotNull", "BitmapWarning");
                            a.mo22350c("CreateThread", value.f49262b);
                            a.mo22350c("CreateTime", String.valueOf(value.f49265e));
                            a.mo22350c("BitmapWidth", String.valueOf(value.f49263c));
                            a.mo22350c("BitmapHeigth", String.valueOf(value.f49264d));
                            if ("BitmapOverViewEvent".equals(value.f49266f)) {
                                a.mo22350c("ImageViewHeigth", String.valueOf(value.f49267g));
                                a.mo22350c("ImageViewWidth", String.valueOf(value.f49268h));
                            }
                            C13913i.m25188a(a);
                        }
                        if (C20841e.f49295b != null) {
                            AbstractC20838b bVar = C20841e.f49295b;
                            C20832a value2 = entry.getValue();
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append("BitmapWarning:" + value2.f49266f + "\n");
                            stringBuffer.append("CreateThread:" + value2.f49262b + " CreateTime:" + value2.f49265e + " width:" + value2.f49263c + " height" + value2.f49264d + "\n");
                            stringBuffer.append(value2.f49261a + "\n");
                            bVar.mo34260a(stringBuffer.toString());
                        }
                    }
                } finally {
                    MethodCollector.m26664o(3062);
                }
            }
        }
    }
}
