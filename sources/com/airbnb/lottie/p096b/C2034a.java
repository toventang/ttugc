package com.airbnb.lottie.p096b;

import android.os.Handler;
import android.util.DisplayMetrics;
import com.airbnb.lottie.C2122g;
import com.airbnb.lottie.p097c.C2039a;
import com.airbnb.lottie.p097c.C2040b;
import com.airbnb.lottie.p099e.p102c.C2091b;
import com.airbnb.lottie.p104g.C2142b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.airbnb.lottie.b.a */
public final class C2034a {

    /* renamed from: a */
    public final C2122g f6106a;

    /* renamed from: b */
    public DisplayMetrics f6107b;

    /* renamed from: c */
    public Handler f6108c;

    /* renamed from: d */
    public Float f6109d;

    /* renamed from: e */
    public Runnable f6110e = new Runnable() {
        /* class com.airbnb.lottie.p096b.C2034a.RunnableC20362 */

        static {
            Covode.recordClassIndex(2231);
        }

        public final void run() {
            MethodCollector.m26663i(12165);
            if (C2034a.this.f6108c != null) {
                C2034a.this.f6108c.removeCallbacks(C2034a.this.f6110e);
            }
            Float f = C2034a.this.f6109d;
            C2091b bVar = C2034a.this.f6106a.f6408m;
            if (f == null || bVar == null) {
                MethodCollector.m26664o(12165);
                return;
            }
            synchronized (C2034a.this.f6106a.f6414s) {
                try {
                    bVar.mo5963a(f.floatValue());
                    try {
                        if (C2034a.this.f6106a.mo6038m()) {
                            boolean a = C2040b.m6460a(C2034a.this.f6106a, C2034a.this.f6107b);
                            C2122g gVar = C2034a.this.f6106a;
                            if (C2142b.f6470c) {
                                if (!(gVar == null || gVar.f6410o == null)) {
                                    gVar.f6410o.mo6061b(a);
                                }
                                if (C2142b.f6468a != null) {
                                    C2142b.f6468a.mo6061b(a);
                                }
                            }
                        }
                    } catch (Throwable unused) {
                    }
                } finally {
                    MethodCollector.m26664o(12165);
                }
            }
        }
    };

    /* renamed from: f */
    private Runnable f6111f = new Runnable() {
        /* class com.airbnb.lottie.p096b.C2034a.RunnableC20373 */

        static {
            Covode.recordClassIndex(2232);
        }

        public final void run() {
            C2039a.m6458a(C2034a.this.f6106a);
            C2122g gVar = C2034a.this.f6106a;
            C89219l.m154719c(gVar, "");
            C2040b.f6118a.remove(Integer.valueOf(gVar.hashCode()));
        }
    };

    static {
        Covode.recordClassIndex(2229);
    }

    /* renamed from: a */
    public final void mo5932a() {
        Handler handler = this.f6108c;
        if (handler != null) {
            handler.post(this.f6111f);
        }
    }

    /* renamed from: b */
    public final void mo5933b() {
        this.f6109d = null;
        Handler handler = this.f6108c;
        if (handler != null) {
            handler.removeCallbacks(this.f6110e);
        }
    }

    public C2034a(C2122g gVar, DisplayMetrics displayMetrics) {
        this.f6106a = gVar;
        this.f6107b = displayMetrics;
    }
}
