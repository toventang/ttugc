package com.bytedance.common.wschannel.server;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.common.wschannel.server.i */
public final class C13792i {

    /* renamed from: a */
    private static volatile C13772b f33538a;

    static {
        Covode.recordClassIndex(15840);
    }

    /* renamed from: a */
    public static C13772b m24891a(Context context) {
        MethodCollector.m26663i(9335);
        if (f33538a == null) {
            synchronized (C13772b.class) {
                try {
                    if (f33538a == null) {
                        HandlerThread handlerThread = new HandlerThread("wschannel");
                        handlerThread.start();
                        C13771a aVar = new C13771a();
                        C13796k kVar = new C13796k(context, aVar);
                        C13772b bVar = new C13772b(context, handlerThread.getLooper(), new C13800m(context), aVar, kVar, new C13794j(context, new WeakHandler(handlerThread.getLooper(), new WeakHandler.IHandler() {
                            /* class com.bytedance.common.wschannel.server.C13792i.C137931 */

                            static {
                                Covode.recordClassIndex(15841);
                            }

                            @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
                            public final void handleMsg(Message message) {
                            }
                        })));
                        kVar.f33548d = bVar;
                        f33538a = bVar;
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9335);
                    throw th;
                }
            }
        }
        C13772b bVar2 = f33538a;
        MethodCollector.m26664o(9335);
        return bVar2;
    }
}
