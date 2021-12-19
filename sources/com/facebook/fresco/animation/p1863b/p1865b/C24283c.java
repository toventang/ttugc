package com.facebook.fresco.animation.p1863b.p1865b;

import android.graphics.Bitmap;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1833e.C24099a;
import com.facebook.common.p1836h.C24117a;
import com.facebook.fresco.animation.p1862a.AbstractC24270a;
import com.facebook.fresco.animation.p1863b.AbstractC24280b;
import com.facebook.fresco.animation.p1863b.AbstractC24286c;
import com.facebook.imagepipeline.p1878c.AbstractC24357f;
import java.util.concurrent.ExecutorService;

/* renamed from: com.facebook.fresco.animation.b.b.c */
public class C24283c implements AbstractC24282b {

    /* renamed from: a */
    public static final Class<?> f57563a = C24283c.class;

    /* renamed from: b */
    public final AbstractC24357f f57564b;

    /* renamed from: c */
    public final AbstractC24286c f57565c;

    /* renamed from: d */
    public final Bitmap.Config f57566d;

    /* renamed from: e */
    public final SparseArray<Runnable> f57567e = new SparseArray<>();

    /* renamed from: f */
    private final ExecutorService f57568f;

    static {
        Covode.recordClassIndex(28415);
    }

    /* renamed from: com.facebook.fresco.animation.b.b.c$a */
    class RunnableC24284a implements Runnable {

        /* renamed from: b */
        private final AbstractC24280b f57570b;

        /* renamed from: c */
        private final AbstractC24270a f57571c;

        /* renamed from: d */
        private final int f57572d;

        /* renamed from: e */
        private final int f57573e;

        static {
            Covode.recordClassIndex(28416);
        }

        public final void run() {
            MethodCollector.m26663i(5605);
            try {
                if (this.f57570b.mo40059b(this.f57572d)) {
                    C24099a.m45635a(C24283c.f57563a, "Frame %d is cached already.", Integer.valueOf(this.f57572d));
                    synchronized (C24283c.this.f57567e) {
                        try {
                            C24283c.this.f57567e.remove(this.f57573e);
                        } finally {
                            MethodCollector.m26664o(5605);
                        }
                    }
                    return;
                }
                if (m46198a(this.f57572d, 1)) {
                    C24099a.m45635a(C24283c.f57563a, "Prepared frame frame %d.", Integer.valueOf(this.f57572d));
                } else {
                    C24099a.m45656c(C24283c.f57563a, "Could not prepare frame %d.", Integer.valueOf(this.f57572d));
                }
                synchronized (C24283c.this.f57567e) {
                    try {
                        C24283c.this.f57567e.remove(this.f57573e);
                    } finally {
                        MethodCollector.m26664o(5605);
                    }
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(5605);
                throw th;
            }
        }

        /* renamed from: a */
        private boolean m46198a(int i, int i2) {
            char c;
            boolean a;
            while (true) {
                C24117a<Bitmap> aVar = null;
                if (i2 != 1) {
                    try {
                        aVar = C24283c.this.f57564b.mo40148a(this.f57571c.mo40045b(), this.f57571c.mo40047c(), C24283c.this.f57566d);
                        c = 65535;
                    } catch (RuntimeException e) {
                        C24099a.m45639a(C24283c.f57563a, "Failed to create frame bitmap", (Throwable) e);
                        C24117a.m45712c(aVar);
                        return false;
                    }
                } else {
                    try {
                        AbstractC24280b bVar = this.f57570b;
                        this.f57571c.mo40045b();
                        this.f57571c.mo40047c();
                        aVar = bVar.mo40057b();
                        c = 2;
                    } catch (Throwable th) {
                        C24117a.m45712c(null);
                        throw th;
                    }
                }
                a = m46199a(i, aVar);
                C24117a.m45712c(aVar);
                if (a || c == 65535) {
                    return a;
                }
                i2 = 2;
            }
            return a;
        }

        /* renamed from: a */
        private boolean m46199a(int i, C24117a<Bitmap> aVar) {
            MethodCollector.m26663i(5732);
            if (!C24117a.m45710a((C24117a<?>) aVar)) {
                MethodCollector.m26664o(5732);
                return false;
            } else if (!C24283c.this.f57565c.mo40065a(i, aVar.mo39695a())) {
                MethodCollector.m26664o(5732);
                return false;
            } else {
                C24099a.m45635a(C24283c.f57563a, "Frame %d ready.", Integer.valueOf(this.f57572d));
                synchronized (C24283c.this.f57567e) {
                    try {
                        this.f57570b.mo40058b(this.f57572d, aVar);
                    } catch (Throwable th) {
                        MethodCollector.m26664o(5732);
                        throw th;
                    }
                }
                MethodCollector.m26664o(5732);
                return true;
            }
        }

        public RunnableC24284a(AbstractC24270a aVar, AbstractC24280b bVar, int i, int i2) {
            this.f57571c = aVar;
            this.f57570b = bVar;
            this.f57572d = i;
            this.f57573e = i2;
        }
    }

    @Override // com.facebook.fresco.animation.p1863b.p1865b.AbstractC24282b
    /* renamed from: a */
    public final boolean mo40061a(AbstractC24280b bVar, AbstractC24270a aVar, int i) {
        MethodCollector.m26663i(9105);
        int hashCode = (aVar.hashCode() * 31) + i;
        synchronized (this.f57567e) {
            try {
                if (this.f57567e.get(hashCode) != null) {
                    C24099a.m45635a(f57563a, "Already scheduled decode job for frame %d", Integer.valueOf(i));
                    return true;
                } else if (bVar.mo40059b(i)) {
                    C24099a.m45635a(f57563a, "Frame %d is cached already.", Integer.valueOf(i));
                    MethodCollector.m26664o(9105);
                    return true;
                } else {
                    RunnableC24284a aVar2 = new RunnableC24284a(aVar, bVar, i, hashCode);
                    this.f57567e.put(hashCode, aVar2);
                    this.f57568f.execute(aVar2);
                    MethodCollector.m26664o(9105);
                    return true;
                }
            } finally {
                MethodCollector.m26664o(9105);
            }
        }
    }

    public C24283c(AbstractC24357f fVar, AbstractC24286c cVar, Bitmap.Config config, ExecutorService executorService) {
        this.f57564b = fVar;
        this.f57565c = cVar;
        this.f57566d = config;
        this.f57568f = executorService;
    }
}
