package com.p2082ss.android.socialbase.downloader.p2186h;

import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.socialbase.downloader.downloader.C30399c;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.p2189k.C30535g;
import com.p2082ss.android.socialbase.downloader.segment.C30599a;
import com.p2082ss.android.socialbase.downloader.segment.StreamClosedException;
import java.io.InputStream;
import java.util.concurrent.Future;

/* renamed from: com.ss.android.socialbase.downloader.h.a */
public final class C30468a implements AbstractC30470b {

    /* renamed from: a */
    public final InputStream f72619a;

    /* renamed from: b */
    public final Object f72620b = new Object();

    /* renamed from: c */
    C30599a f72621c;

    /* renamed from: d */
    C30599a f72622d;

    /* renamed from: e */
    public volatile boolean f72623e;

    /* renamed from: f */
    public volatile Throwable f72624f;

    /* renamed from: g */
    private final int f72625g;

    /* renamed from: h */
    private final int f72626h;

    /* renamed from: i */
    private final Object f72627i = new Object();

    /* renamed from: j */
    private C30599a f72628j;

    /* renamed from: k */
    private C30599a f72629k;

    /* renamed from: l */
    private C30599a f72630l;

    /* renamed from: m */
    private C30599a f72631m;

    /* renamed from: n */
    private volatile boolean f72632n;

    /* renamed from: o */
    private volatile Future f72633o;

    /* renamed from: p */
    private int f72634p;

    /* renamed from: q */
    private final Runnable f72635q;

    static {
        Covode.recordClassIndex(36995);
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2186h.AbstractC30470b
    /* renamed from: a */
    public final C30599a mo54253a() {
        return m62076d();
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2186h.AbstractC30470b
    /* renamed from: b */
    public final void mo54255b() {
        MethodCollector.m26663i(11375);
        synchronized (this.f72627i) {
            try {
                this.f72632n = true;
                this.f72627i.notify();
            } finally {
                MethodCollector.m26664o(11375);
            }
        }
        Future future = this.f72633o;
        if (future != null) {
            try {
                future.cancel(true);
            } catch (Throwable unused) {
            }
            this.f72633o = null;
        }
    }

    /* renamed from: d */
    private C30599a m62076d() {
        C30599a aVar;
        MethodCollector.m26663i(11693);
        C30599a aVar2 = this.f72631m;
        if (aVar2 != null) {
            this.f72631m = aVar2.f73035d;
            aVar2.f73035d = null;
            MethodCollector.m26664o(11693);
            return aVar2;
        }
        synchronized (this.f72620b) {
            try {
                aVar = this.f72621c;
                if (aVar == null) {
                    while (!this.f72623e) {
                        this.f72620b.wait();
                        aVar = this.f72621c;
                        if (aVar != null) {
                        }
                    }
                    Throwable th = this.f72624f;
                    if (th != null) {
                        if (th instanceof StreamClosedException) {
                            BaseException baseException = new BaseException(1068, "async reader closed!");
                            MethodCollector.m26664o(11693);
                            throw baseException;
                        }
                        C30535g.m62554a(th, "async_read");
                    }
                    BaseException baseException2 = new BaseException(1069, "async reader terminated!");
                    MethodCollector.m26664o(11693);
                    throw baseException2;
                }
                this.f72631m = aVar.f73035d;
                this.f72622d = null;
                this.f72621c = null;
                aVar.f73035d = null;
            } finally {
                MethodCollector.m26664o(11693);
            }
        }
        return aVar;
    }

    /* renamed from: c */
    public final C30599a mo54256c() {
        MethodCollector.m26663i(11538);
        C30599a aVar = this.f72630l;
        if (aVar == null) {
            synchronized (this.f72627i) {
                try {
                    if (!this.f72632n) {
                        C30599a aVar2 = this.f72628j;
                        if (aVar2 != null) {
                            this.f72630l = aVar2.f73035d;
                            this.f72629k = null;
                            this.f72628j = null;
                            aVar2.f73035d = null;
                        } else {
                            int i = this.f72634p;
                            if (i < this.f72626h) {
                                this.f72634p = i + 1;
                                return new C30599a(this.f72625g);
                            }
                            do {
                                this.f72627i.wait();
                                if (!this.f72632n) {
                                    aVar2 = this.f72628j;
                                } else {
                                    StreamClosedException streamClosedException = new StreamClosedException("");
                                    MethodCollector.m26664o(11538);
                                    throw streamClosedException;
                                }
                            } while (aVar2 == null);
                        }
                        this.f72630l = aVar2.f73035d;
                        this.f72629k = null;
                        this.f72628j = null;
                        aVar2.f73035d = null;
                        MethodCollector.m26664o(11538);
                        return aVar2;
                    }
                    StreamClosedException streamClosedException2 = new StreamClosedException("");
                    MethodCollector.m26664o(11538);
                    throw streamClosedException2;
                } finally {
                    MethodCollector.m26664o(11538);
                }
            }
        } else if (!this.f72632n) {
            this.f72630l = aVar.f73035d;
            aVar.f73035d = null;
            MethodCollector.m26664o(11538);
            return aVar;
        } else {
            StreamClosedException streamClosedException3 = new StreamClosedException("");
            MethodCollector.m26664o(11538);
            throw streamClosedException3;
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2186h.AbstractC30470b
    /* renamed from: a */
    public final void mo54254a(C30599a aVar) {
        MethodCollector.m26663i(11374);
        synchronized (this.f72627i) {
            try {
                C30599a aVar2 = this.f72629k;
                if (aVar2 == null) {
                    this.f72629k = aVar;
                    this.f72628j = aVar;
                    this.f72627i.notify();
                } else {
                    aVar2.f73035d = aVar;
                    this.f72629k = aVar;
                }
            } finally {
                MethodCollector.m26664o(11374);
            }
        }
    }

    public C30468a(InputStream inputStream, int i, int i2) {
        RunnableC304691 r1 = new Runnable() {
            /* class com.p2082ss.android.socialbase.downloader.p2186h.C30468a.RunnableC304691 */

            static {
                Covode.recordClassIndex(36996);
            }

            public final void run() {
                C30599a c;
                MethodCollector.m26663i(5566);
                Process.setThreadPriority(10);
                do {
                    try {
                        c = C30468a.this.mo54256c();
                        c.f73034c = C30468a.this.f72619a.read(c.f73032a);
                        C30468a aVar = C30468a.this;
                        synchronized (aVar.f72620b) {
                            try {
                                C30599a aVar2 = aVar.f72622d;
                                if (aVar2 == null) {
                                    aVar.f72622d = c;
                                    aVar.f72621c = c;
                                    aVar.f72620b.notify();
                                } else {
                                    aVar2.f73035d = c;
                                    aVar.f72622d = c;
                                }
                            } finally {
                                MethodCollector.m26664o(5566);
                            }
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(5566);
                        throw th;
                    }
                } while (c.f73034c != -1);
                synchronized (C30468a.this.f72620b) {
                    try {
                        C30468a.this.f72623e = true;
                        C30468a.this.f72620b.notify();
                    } finally {
                        MethodCollector.m26664o(5566);
                    }
                }
                C30535g.m62556a(C30468a.this.f72619a);
            }
        };
        this.f72635q = r1;
        this.f72619a = inputStream;
        this.f72625g = i;
        if (i2 <= 0) {
            i2 = 1;
        } else if (i2 > 64) {
            i2 = 64;
        }
        this.f72626h = i2;
        this.f72633o = C30399c.m61727k().submit(r1);
    }
}
