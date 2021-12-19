package com.bytedance.platform.p1572b;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;

/* renamed from: com.bytedance.platform.b.d */
public final class C21668d {

    /* renamed from: a */
    private static volatile Handler f51424a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private static HashMap<String, HandlerThread> f51425b = new HashMap<>();

    /* renamed from: com.bytedance.platform.b.d$a */
    public static class HandlerThreadC21669a extends HandlerThread {

        /* renamed from: a */
        private volatile boolean f51426a;

        static {
            Covode.recordClassIndex(25310);
        }

        public final synchronized void start() {
            MethodCollector.m26663i(8870);
            if (this.f51426a) {
                MethodCollector.m26664o(8870);
                return;
            }
            this.f51426a = true;
            super.start();
            MethodCollector.m26664o(8870);
        }

        public HandlerThreadC21669a(String str) {
            super(str, 0);
        }
    }

    static {
        Covode.recordClassIndex(25309);
    }

    /* renamed from: a */
    public static HandlerThread m40613a(String str) {
        HandlerThreadC21669a aVar = new HandlerThreadC21669a(str);
        aVar.start();
        return aVar;
    }
}
