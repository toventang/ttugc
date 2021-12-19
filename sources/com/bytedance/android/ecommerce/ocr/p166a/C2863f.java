package com.bytedance.android.ecommerce.ocr.p166a;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.android.ecommerce.ocr.a.f */
final class C2863f {

    /* renamed from: a */
    static C2863f f8520a;

    /* renamed from: b */
    Handler f8521b;

    /* renamed from: c */
    HandlerThread f8522c;

    /* renamed from: d */
    int f8523d;

    /* renamed from: e */
    final Object f8524e = new Object();

    static {
        Covode.recordClassIndex(3289);
    }

    C2863f() {
    }

    /* renamed from: a */
    private void m8138a() {
        MethodCollector.m26663i(3420);
        synchronized (this.f8524e) {
            try {
                if (this.f8521b == null) {
                    if (this.f8523d > 0) {
                        HandlerThread handlerThread = new HandlerThread("CameraThread");
                        this.f8522c = handlerThread;
                        handlerThread.start();
                        this.f8521b = new Handler(this.f8522c.getLooper());
                    } else {
                        IllegalStateException illegalStateException = new IllegalStateException("CameraThread is not open");
                        MethodCollector.m26664o(3420);
                        throw illegalStateException;
                    }
                }
            } finally {
                MethodCollector.m26664o(3420);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7455a(Runnable runnable) {
        MethodCollector.m26663i(3416);
        synchronized (this.f8524e) {
            try {
                m8138a();
                this.f8521b.post(runnable);
            } finally {
                MethodCollector.m26664o(3416);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo7456b(Runnable runnable) {
        MethodCollector.m26663i(3423);
        synchronized (this.f8524e) {
            try {
                this.f8523d++;
                mo7455a(runnable);
            } finally {
                MethodCollector.m26664o(3423);
            }
        }
    }
}
