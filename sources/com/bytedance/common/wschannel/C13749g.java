package com.bytedance.common.wschannel;

import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.message.C30066d;

/* renamed from: com.bytedance.common.wschannel.g */
public class C13749g implements WeakHandler.IHandler {

    /* renamed from: a */
    public static WeakHandler f33386a;

    /* renamed from: b */
    private static volatile C13749g f33387b;

    static {
        Covode.recordClassIndex(15784);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
    }

    private C13749g() {
        if (f33386a == null) {
            try {
                f33386a = C30066d.m60817a().f71759a;
            } catch (Throwable unused) {
                HandlerThread handlerThread = new HandlerThread("WsHT");
                handlerThread.start();
                f33386a = new WeakHandler(handlerThread.getLooper(), this);
            }
        }
    }

    /* renamed from: a */
    public static C13749g m24785a() {
        MethodCollector.m26663i(12317);
        if (f33387b == null) {
            synchronized (C13749g.class) {
                try {
                    if (f33387b == null) {
                        f33387b = new C13749g();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12317);
                    throw th;
                }
            }
        }
        C13749g gVar = f33387b;
        MethodCollector.m26664o(12317);
        return gVar;
    }

    /* renamed from: a */
    public static void m24786a(Runnable runnable) {
        f33386a.post(runnable);
    }
}
