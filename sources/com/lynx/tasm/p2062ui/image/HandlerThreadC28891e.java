package com.lynx.tasm.p2062ui.image;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.base.C28454c;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.lynx.tasm.ui.image.e */
public class HandlerThreadC28891e extends HandlerThread {

    /* renamed from: e */
    private static volatile HandlerThreadC28891e f68266e;

    /* renamed from: a */
    List<Runnable> f68267a;

    /* renamed from: b */
    List<Runnable> f68268b;

    /* renamed from: c */
    Handler f68269c;

    /* renamed from: d */
    Handler f68270d;

    static {
        Covode.recordClassIndex(35014);
    }

    private HandlerThreadC28891e() {
        super("Lynx_image");
        start();
    }

    /* access modifiers changed from: protected */
    public void onLooperPrepared() {
        super.onLooperPrepared();
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            /* class com.lynx.tasm.p2062ui.image.HandlerThreadC28891e.RunnableC288921 */

            static {
                Covode.recordClassIndex(35015);
            }

            public final void run() {
                HandlerThreadC28891e eVar = HandlerThreadC28891e.this;
                eVar.f68270d = new Handler(eVar.getLooper());
                eVar.f68269c = new Handler(Looper.myLooper());
                if (eVar.f68267a != null && !eVar.f68267a.isEmpty()) {
                    for (Runnable runnable : eVar.f68267a) {
                        eVar.f68269c.post(runnable);
                    }
                    eVar.f68267a.clear();
                }
                if (!(eVar.f68268b == null || eVar.f68268b.isEmpty())) {
                    for (Runnable runnable2 : eVar.f68268b) {
                        eVar.f68270d.post(runnable2);
                    }
                    eVar.f68268b.clear();
                }
            }
        });
    }

    /* renamed from: a */
    public static HandlerThreadC28891e m57879a() {
        MethodCollector.m26663i(7777);
        if (f68266e == null) {
            synchronized (HandlerThreadC28891e.class) {
                try {
                    if (f68266e == null) {
                        f68266e = new HandlerThreadC28891e();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7777);
                    throw th;
                }
            }
        }
        HandlerThreadC28891e eVar = f68266e;
        MethodCollector.m26664o(7777);
        return eVar;
    }

    /* renamed from: a */
    public final void mo50103a(Runnable runnable) {
        boolean z;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            z = true;
        } else {
            z = false;
        }
        C28454c.m56882a(z);
        Handler handler = this.f68270d;
        if (handler == null) {
            if (this.f68268b == null) {
                this.f68268b = new LinkedList();
            }
            this.f68268b.add(runnable);
            return;
        }
        handler.post(runnable);
    }
}
