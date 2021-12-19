package com.p2082ss.android.ugc.aweme.user.p4197d;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.base.C34608n;

/* renamed from: com.ss.android.ugc.aweme.user.d.a */
public class C80058a implements WeakHandler.IHandler {

    /* renamed from: a */
    private static volatile C80058a f179397a;

    /* renamed from: b */
    private WeakHandler f179398b = new WeakHandler(Looper.getMainLooper(), this);

    static {
        Covode.recordClassIndex(93289);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
    }

    private C80058a() {
    }

    /* renamed from: a */
    public static C80058a m138795a() {
        MethodCollector.m26663i(12932);
        if (f179397a == null) {
            synchronized (C80058a.class) {
                try {
                    if (f179397a == null) {
                        f179397a = new C80058a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12932);
                    throw th;
                }
            }
        }
        C80058a aVar = f179397a;
        MethodCollector.m26664o(12932);
        return aVar;
    }

    /* renamed from: a */
    public static void m138796a(Handler handler) {
        C34608n.m70658a().mo61083a(handler, CallableC80059b.f179399a, 115);
    }
}
