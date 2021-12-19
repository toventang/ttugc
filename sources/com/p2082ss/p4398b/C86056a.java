package com.p2082ss.p4398b;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.b.a */
public final class C86056a {

    /* renamed from: a */
    public static HandlerThread f192001a;

    /* renamed from: b */
    public static HandlerC86057a f192002b;

    /* renamed from: c */
    public static AbstractC86058b f192003c;

    /* renamed from: d */
    public static int f192004d;

    /* renamed from: e */
    public static AtomicInteger f192005e = new AtomicInteger(0);

    static {
        Covode.recordClassIndex(100764);
    }

    /* renamed from: a */
    public static void m147813a() {
        HandlerThread handlerThread = f192001a;
        if (handlerThread != null) {
            handlerThread.quit();
            f192003c.mo20044b();
            f192001a = null;
            f192002b = null;
            f192003c = null;
        }
    }

    /* renamed from: com.ss.b.a$a */
    public static class HandlerC86057a extends Handler {
        static {
            Covode.recordClassIndex(100765);
        }

        public HandlerC86057a(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            if (C86056a.f192003c != null) {
                int i = message.what;
                Context context = (Context) message.obj;
                if (i == 1) {
                    C86056a.f192003c.mo20043a(C86059c.m147822c(context), -1);
                } else if (i == 2) {
                    AbstractC86058b bVar = C86056a.f192003c;
                    C86059c.m147820b(context);
                    bVar.mo20043a(-1.0f, -1);
                } else if (i == 3) {
                    C86056a.f192003c.mo20043a(-1.0f, C86059c.m147823d(context));
                } else if (i == 4) {
                    AbstractC86058b bVar2 = C86056a.f192003c;
                    float c = C86059c.m147822c(context);
                    C86059c.m147820b(context);
                    bVar2.mo20043a(c, -1);
                } else if (i == 5) {
                    try {
                        AbstractC86058b bVar3 = C86056a.f192003c;
                        float c2 = C86059c.m147822c(context);
                        C86059c.m147820b(context);
                        bVar3.mo20043a(c2, C86059c.m147823d(context));
                    } catch (NullPointerException unused) {
                    }
                }
                sendMessageDelayed(obtainMessage(i, context), (long) C86056a.f192004d);
            }
        }
    }
}
