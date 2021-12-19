package com.p2082ss.android.common.applog;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.LinkedList;

/* renamed from: com.ss.android.common.applog.t */
public class HandlerThreadC29808t extends HandlerThread {

    /* renamed from: a */
    private static volatile HandlerThreadC29808t f71133a;

    /* renamed from: b */
    private Handler f71134b;

    /* renamed from: c */
    private final Object f71135c = new Object();

    /* renamed from: d */
    private volatile boolean f71136d = false;

    /* renamed from: e */
    private final LinkedList<Runnable> f71137e = new LinkedList<>();

    static {
        Covode.recordClassIndex(36213);
    }

    private HandlerThreadC29808t() {
        super("TeaThread");
    }

    /* renamed from: a */
    public static HandlerThreadC29808t m60042a() {
        MethodCollector.m26663i(9767);
        if (f71133a == null) {
            synchronized (HandlerThreadC29808t.class) {
                try {
                    if (f71133a == null) {
                        HandlerThreadC29808t tVar = new HandlerThreadC29808t();
                        f71133a = tVar;
                        tVar.start();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9767);
                    throw th;
                }
            }
        }
        HandlerThreadC29808t tVar2 = f71133a;
        MethodCollector.m26664o(9767);
        return tVar2;
    }

    /* renamed from: b */
    private Handler m60043b() {
        MethodCollector.m26663i(6162);
        if (this.f71134b == null) {
            synchronized (this) {
                try {
                    if (this.f71134b == null) {
                        this.f71134b = new Handler(getLooper());
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6162);
                    throw th;
                }
            }
        }
        Handler handler = this.f71134b;
        MethodCollector.m26664o(6162);
        return handler;
    }

    /* access modifiers changed from: protected */
    public void onLooperPrepared() {
        MethodCollector.m26663i(10070);
        super.onLooperPrepared();
        synchronized (this.f71135c) {
            try {
                this.f71136d = true;
                ArrayList<Runnable> arrayList = new ArrayList(this.f71137e);
                this.f71137e.clear();
                if (!arrayList.isEmpty()) {
                    for (Runnable runnable : arrayList) {
                        mo52082b(runnable);
                    }
                }
            } finally {
                MethodCollector.m26664o(10070);
            }
        }
    }

    /* renamed from: c */
    public final void mo52084c(Runnable runnable) {
        m60043b().removeCallbacks(runnable);
    }

    /* renamed from: b */
    public final void mo52082b(Runnable runnable) {
        if (runnable != null) {
            m60043b().post(runnable);
        }
    }

    /* renamed from: a */
    public final void mo52080a(Runnable runnable) {
        MethodCollector.m26663i(10235);
        if (this.f71136d) {
            mo52083b(runnable, 0);
            MethodCollector.m26664o(10235);
            return;
        }
        synchronized (this.f71135c) {
            try {
                if (this.f71136d) {
                    mo52083b(runnable, 0);
                } else {
                    if (this.f71137e.size() > 1000) {
                        this.f71137e.poll();
                    }
                    this.f71137e.add(runnable);
                }
            } finally {
                MethodCollector.m26664o(10235);
            }
        }
    }

    /* renamed from: a */
    public final void mo52081a(Runnable runnable, long j) {
        if (runnable != null) {
            mo52084c(runnable);
            mo52083b(runnable, j);
        }
    }

    /* renamed from: b */
    public final void mo52083b(Runnable runnable, long j) {
        if (runnable != null) {
            m60043b().postDelayed(runnable, j);
        }
    }
}
