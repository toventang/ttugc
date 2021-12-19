package com.bytedance.platform.p1565a.p1567b.p1568a;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.p1565a.AbstractC21636b;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.platform.a.b.a.c */
public class RunnableC21643c implements Runnable {

    /* renamed from: g */
    private static RunnableC21643c f51347g;

    /* renamed from: a */
    public Application f51348a;

    /* renamed from: b */
    public Handler f51349b;

    /* renamed from: c */
    public boolean f51350c;

    /* renamed from: d */
    public Looper f51351d;

    /* renamed from: e */
    public AbstractC21636b f51352e;

    /* renamed from: f */
    public boolean f51353f;

    /* renamed from: h */
    private MessageQueue f51354h;

    /* renamed from: i */
    private Field f51355i;

    /* renamed from: j */
    private Field f51356j;

    static {
        Covode.recordClassIndex(25284);
    }

    private RunnableC21643c() {
    }

    /* renamed from: a */
    public static RunnableC21643c m40597a() {
        MethodCollector.m26663i(3557);
        if (f51347g == null) {
            synchronized (RunnableC21643c.class) {
                try {
                    if (f51347g == null) {
                        f51347g = new RunnableC21643c();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3557);
                    throw th;
                }
            }
        }
        RunnableC21643c cVar = f51347g;
        MethodCollector.m26664o(3557);
        return cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0097 A[Catch:{ all -> 0x00c6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        // Method dump skipped, instructions count: 228
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.platform.p1565a.p1567b.p1568a.RunnableC21643c.run():void");
    }
}
