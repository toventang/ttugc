package com.p2082ss.android.ugc.aweme.p3924sp;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.ss.android.ugc.aweme.sp.d */
public class C74913d {

    /* renamed from: a */
    static final Object f168396a = new Object();

    /* renamed from: b */
    static Object f168397b = new Object();

    /* renamed from: c */
    static final LinkedList<Runnable> f168398c = new LinkedList<>();

    /* renamed from: d */
    static final LinkedList<Runnable> f168399d = new LinkedList<>();

    /* renamed from: e */
    static boolean f168400e = true;

    /* renamed from: f */
    private static final String f168401f = C74913d.class.getSimpleName();

    /* renamed from: g */
    private static Handler f168402g = null;

    /* renamed from: h */
    private static final C74911b f168403h = new C74911b();

    /* renamed from: i */
    private static int f168404i = 0;

    /* renamed from: b */
    public static boolean m131474b() {
        boolean z;
        MethodCollector.m26663i(10618);
        synchronized (f168396a) {
            try {
                if (!f168399d.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
            } finally {
                MethodCollector.m26664o(10618);
            }
        }
        return z;
    }

    static {
        Covode.recordClassIndex(87778);
    }

    /* renamed from: a */
    static Handler m131473a() {
        Handler handler;
        MethodCollector.m26663i(10617);
        synchronized (f168396a) {
            try {
                if (f168402g == null) {
                    HandlerThread handlerThread = new HandlerThread("queued-work-looper", -2);
                    handlerThread.start();
                    f168402g = new HandlerC74914a(handlerThread.getLooper());
                }
                handler = f168402g;
            } finally {
                MethodCollector.m26664o(10617);
            }
        }
        return handler;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sp.d$a */
    public static class HandlerC74914a extends Handler {
        static {
            Covode.recordClassIndex(87779);
        }

        HandlerC74914a(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            LinkedList linkedList;
            MethodCollector.m26663i(13672);
            if (message.what == 1) {
                synchronized (C74913d.f168397b) {
                    try {
                        synchronized (C74913d.f168396a) {
                            try {
                                linkedList = (LinkedList) C74913d.f168399d.clone();
                                C74913d.f168399d.clear();
                                C74913d.m131473a().removeMessages(1);
                            } finally {
                                MethodCollector.m26664o(13672);
                            }
                        }
                        if (linkedList.size() > 0) {
                            Iterator it = linkedList.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                        }
                    } finally {
                        MethodCollector.m26664o(13672);
                    }
                }
                return;
            }
            MethodCollector.m26664o(13672);
        }
    }
}
