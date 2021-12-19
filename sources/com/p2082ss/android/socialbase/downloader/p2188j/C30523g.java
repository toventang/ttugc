package com.p2082ss.android.socialbase.downloader.p2188j;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.ss.android.socialbase.downloader.j.g */
public final class C30523g {

    /* renamed from: a */
    public Object f72819a = new Object();

    /* renamed from: b */
    public Queue<C30525b> f72820b = new ConcurrentLinkedQueue();

    /* renamed from: c */
    public HandlerThreadC30524a f72821c;

    /* renamed from: d */
    public Handler f72822d;

    static {
        Covode.recordClassIndex(37051);
    }

    /* renamed from: com.ss.android.socialbase.downloader.j.g$a */
    public class HandlerThreadC30524a extends HandlerThread {
        static {
            Covode.recordClassIndex(37052);
        }

        /* access modifiers changed from: protected */
        public final void onLooperPrepared() {
            MethodCollector.m26663i(7919);
            super.onLooperPrepared();
            Looper looper = getLooper();
            synchronized (C30523g.this.f72819a) {
                try {
                    C30523g.this.f72822d = new Handler(looper);
                } finally {
                    MethodCollector.m26664o(7919);
                }
            }
            while (!C30523g.this.f72820b.isEmpty()) {
                C30525b poll = C30523g.this.f72820b.poll();
                C30523g.this.f72822d.postDelayed(poll.f72824a, poll.f72825b);
            }
        }

        HandlerThreadC30524a(String str) {
            super(str);
        }
    }

    public C30523g(String str) {
        this.f72821c = new HandlerThreadC30524a(str);
    }

    /* renamed from: a */
    public final void mo54361a(Runnable runnable, long j) {
        MethodCollector.m26663i(7778);
        if (this.f72822d == null) {
            synchronized (this.f72819a) {
                try {
                    if (this.f72822d == null) {
                        this.f72820b.add(new C30525b(runnable, j));
                        return;
                    }
                } finally {
                    MethodCollector.m26664o(7778);
                }
            }
        }
        this.f72822d.postDelayed(runnable, j);
        MethodCollector.m26664o(7778);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.socialbase.downloader.j.g$b */
    public class C30525b {

        /* renamed from: a */
        public Runnable f72824a;

        /* renamed from: b */
        public long f72825b;

        static {
            Covode.recordClassIndex(37053);
        }

        public C30525b(Runnable runnable, long j) {
            this.f72824a = runnable;
            this.f72825b = j;
        }
    }
}
