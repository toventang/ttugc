package com.p2082ss.android.message;

import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.message.d */
public class C30066d implements WeakHandler.IHandler {

    /* renamed from: b */
    public static HandlerThread f71756b;

    /* renamed from: c */
    private static C30066d f71757c;

    /* renamed from: d */
    private static boolean f71758d;

    /* renamed from: a */
    public final WeakHandler f71759a;

    static {
        Covode.recordClassIndex(36561);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
    }

    private C30066d() {
        if (f71756b == null) {
            HandlerThread handlerThread = new HandlerThread("PushThreadHandler");
            f71756b = handlerThread;
            handlerThread.start();
            f71758d = true;
        }
        this.f71759a = new WeakHandler(f71756b.getLooper(), this);
    }

    /* renamed from: a */
    public static C30066d m60817a() {
        MethodCollector.m26663i(3239);
        if (f71757c == null) {
            synchronized (C30066d.class) {
                try {
                    if (f71757c == null) {
                        f71757c = new C30066d();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3239);
                    throw th;
                }
            }
        }
        C30066d dVar = f71757c;
        MethodCollector.m26664o(3239);
        return dVar;
    }

    /* renamed from: a */
    public final void mo53432a(Runnable runnable, long j) {
        if (j <= 0) {
            this.f71759a.post(runnable);
        } else {
            this.f71759a.postDelayed(runnable, j);
        }
    }
}
