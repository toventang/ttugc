package com.facebook.fresco.animation.p1862a;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.time.AbstractC24140b;
import com.facebook.fresco.animation.p1862a.AbstractC24270a;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.fresco.animation.a.c */
public final class C24272c<T extends AbstractC24270a> extends C24271b<T> {

    /* renamed from: b */
    final AbstractC24140b f57534b;

    /* renamed from: c */
    public boolean f57535c;

    /* renamed from: d */
    long f57536d;

    /* renamed from: e */
    public long f57537e = InteractFirstFrameTimeOutDurationSetting.DEFAULT;

    /* renamed from: f */
    public long f57538f = 1000;

    /* renamed from: g */
    public AbstractC24274a f57539g;

    /* renamed from: h */
    private final ScheduledExecutorService f57540h;

    /* renamed from: i */
    private final Runnable f57541i = new Runnable() {
        /* class com.facebook.fresco.animation.p1862a.C24272c.RunnableC242731 */

        static {
            Covode.recordClassIndex(28405);
        }

        public final void run() {
            MethodCollector.m26663i(5343);
            synchronized (C24272c.this) {
                try {
                    C24272c.this.f57535c = false;
                    C24272c cVar = C24272c.this;
                    if (cVar.f57534b.now() - cVar.f57536d <= cVar.f57537e) {
                        C24272c.this.mo40051f();
                    } else if (C24272c.this.f57539g != null) {
                        C24272c.this.f57539g.mo40053f();
                    }
                } finally {
                    MethodCollector.m26664o(5343);
                }
            }
        }
    };

    /* renamed from: com.facebook.fresco.animation.a.c$a */
    public interface AbstractC24274a {
        static {
            Covode.recordClassIndex(28406);
        }

        /* renamed from: f */
        void mo40053f();
    }

    static {
        Covode.recordClassIndex(28404);
    }

    /* renamed from: f */
    public final synchronized void mo40051f() {
        MethodCollector.m26663i(5450);
        if (!this.f57535c) {
            this.f57535c = true;
            this.f57540h.schedule(this.f57541i, this.f57538f, TimeUnit.MILLISECONDS);
        }
        MethodCollector.m26664o(5450);
    }

    @Override // com.facebook.fresco.animation.p1862a.AbstractC24270a, com.facebook.fresco.animation.p1862a.C24271b
    /* renamed from: a */
    public final boolean mo40044a(Drawable drawable, Canvas canvas, int i) {
        this.f57536d = this.f57534b.now();
        boolean a = super.mo40044a(drawable, canvas, i);
        mo40051f();
        return a;
    }

    public C24272c(T t, AbstractC24274a aVar, AbstractC24140b bVar, ScheduledExecutorService scheduledExecutorService) {
        super(t);
        this.f57539g = aVar;
        this.f57534b = bVar;
        this.f57540h = scheduledExecutorService;
    }
}
