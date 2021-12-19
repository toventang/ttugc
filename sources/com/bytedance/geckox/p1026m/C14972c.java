package com.bytedance.geckox.p1026m;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.p1022i.C14957a;

/* renamed from: com.bytedance.geckox.m.c */
public class C14972c {

    /* renamed from: c */
    private static C14972c f36568c;

    /* renamed from: a */
    public Handler f36569a;

    /* renamed from: b */
    private HandlerThread f36570b;

    static {
        Covode.recordClassIndex(17085);
    }

    private C14972c() {
        m27568b();
    }

    /* renamed from: a */
    public static C14972c m27567a() {
        MethodCollector.m26663i(3902);
        if (f36568c == null) {
            synchronized (C14972c.class) {
                try {
                    if (f36568c == null) {
                        f36568c = new C14972c();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3902);
                    throw th;
                }
            }
        }
        C14972c cVar = f36568c;
        MethodCollector.m26664o(3902);
        return cVar;
    }

    /* renamed from: b */
    private void m27568b() {
        if (this.f36569a == null || this.f36570b.getLooper() == null) {
            HandlerThread handlerThread = new HandlerThread("timer-task", 4);
            this.f36570b = handlerThread;
            handlerThread.start();
            this.f36569a = new HandlerC14973a(this.f36570b.getLooper());
        }
    }

    /* renamed from: a */
    public final void mo24088a(int i) {
        Handler handler = this.f36569a;
        if (handler != null) {
            handler.removeMessages(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.geckox.m.c$a */
    public class HandlerC14973a extends Handler {
        static {
            Covode.recordClassIndex(17086);
        }

        public final void handleMessage(Message message) {
            AbstractC14969a aVar = (AbstractC14969a) message.obj;
            C14957a.m27543a("handler timer task execute", Integer.valueOf(aVar.mo24079a()), Long.valueOf(aVar.f36560b));
            aVar.mo24080b();
            if (aVar.f36560b > 0) {
                Message obtainMessage = C14972c.this.f36569a.obtainMessage(message.what);
                obtainMessage.obj = aVar;
                C14972c.this.f36569a.sendMessageDelayed(obtainMessage, aVar.f36560b);
            }
        }

        public HandlerC14973a(Looper looper) {
            super(looper);
        }
    }

    /* renamed from: a */
    public final void mo24089a(AbstractC14969a aVar, long j) {
        if (j >= 0) {
            m27569b(aVar, j, 0);
        }
    }

    /* renamed from: a */
    public final void mo24090a(AbstractC14969a aVar, long j, long j2) {
        m27569b(aVar, j, j2);
    }

    /* renamed from: b */
    private void m27569b(AbstractC14969a aVar, long j, long j2) {
        m27568b();
        int a = aVar.mo24079a();
        aVar.f36560b = j2;
        Message obtainMessage = this.f36569a.obtainMessage(a);
        obtainMessage.obj = aVar;
        obtainMessage.what = a;
        this.f36569a.sendMessageDelayed(obtainMessage, j);
    }
}
