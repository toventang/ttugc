package com.bytedance.platform.p1565a.p1567b.p1570c;

import android.app.Application;
import android.os.Handler;
import android.os.Message;
import android.os.MessageQueue;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.p1565a.AbstractC21636b;
import com.bytedance.platform.p1565a.p1566a.C21624a;
import com.bytedance.platform.p1565a.p1566a.C21630g;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.platform.a.b.c.d */
public class RunnableC21659d implements Runnable {

    /* renamed from: c */
    static final Object f51392c = new Object();

    /* renamed from: i */
    private static RunnableC21659d f51393i;

    /* renamed from: a */
    public Application f51394a;

    /* renamed from: b */
    public HandlerC21658c f51395b;

    /* renamed from: d */
    List<Message> f51396d = new ArrayList();

    /* renamed from: e */
    public boolean f51397e;

    /* renamed from: f */
    public AbstractC21636b f51398f;

    /* renamed from: g */
    public boolean f51399g;

    /* renamed from: h */
    private long f51400h;

    /* renamed from: j */
    private MessageQueue f51401j;

    /* renamed from: k */
    private Field f51402k;

    /* renamed from: l */
    private Field f51403l;

    static {
        Covode.recordClassIndex(25300);
    }

    private RunnableC21659d() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo35321c() {
        if (this.f51394a == null) {
            throw new RuntimeException("Must call start(Application context) first!!!");
        }
    }

    /* renamed from: b */
    public static RunnableC21659d m40607b() {
        MethodCollector.m26663i(3582);
        if (f51393i == null) {
            synchronized (RunnableC21659d.class) {
                try {
                    if (f51393i == null) {
                        f51393i = new RunnableC21659d();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3582);
                    throw th;
                }
            }
        }
        RunnableC21659d dVar = f51393i;
        MethodCollector.m26664o(3582);
        return dVar;
    }

    /* renamed from: a */
    public final void mo35320a() {
        MethodCollector.m26663i(3565);
        mo35321c();
        synchronized (f51392c) {
            try {
                MessageQueue messageQueue = this.f51401j;
                if (messageQueue != null) {
                    synchronized (messageQueue) {
                        try {
                            for (Message message : this.f51396d) {
                                if (message.obj != null && message.arg2 == 9527) {
                                    Message obtain = Message.obtain(message);
                                    obtain.arg2 = 9528;
                                    message.what *= -1;
                                    int i = obtain.what;
                                    C21630g.m40583a(C21630g.EnumC21632a.ERROR);
                                    int i2 = obtain.what;
                                    C21630g.m40583a(C21630g.EnumC21632a.ERROR);
                                    ((Handler) C21624a.m40572b()).dispatchMessage(obtain);
                                }
                            }
                        } finally {
                            MethodCollector.m26664o(3565);
                        }
                    }
                    this.f51396d.clear();
                }
            } finally {
                MethodCollector.m26664o(3565);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ef A[Catch:{ all -> 0x011f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        // Method dump skipped, instructions count: 317
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.platform.p1565a.p1567b.p1570c.RunnableC21659d.run():void");
    }
}
