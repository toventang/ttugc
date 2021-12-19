package com.p2082ss.android.ugc.p4314h;

import android.os.SystemClock;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.p4314h.C84116g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.h.h */
public final class C84118h implements AbstractC84109c {

    /* renamed from: f */
    private static final Lock f187711f = new ReentrantLock();

    /* renamed from: a */
    public C84119i f187712a;

    /* renamed from: b */
    private double f187713b = -1.0d;

    /* renamed from: c */
    private double f187714c = -1.0d;

    /* renamed from: d */
    private Queue<C84119i> f187715d = new ArrayBlockingQueue(C84116g.f187707a);

    /* renamed from: e */
    private C84119i[] f187716e = new C84119i[C84116g.f187707a];

    /* renamed from: g */
    private final List<Object> f187717g = new ArrayList();

    /* renamed from: h */
    private C84116g.AbstractC84117a f187718h;

    /* renamed from: i */
    private C84116g.AbstractC84117a f187719i;

    static {
        Covode.recordClassIndex(98014);
    }

    public C84118h() {
        C84108b bVar = new C84108b();
        this.f187719i = bVar;
        this.f187718h = bVar;
    }

    @Override // com.p2082ss.android.ugc.p4314h.AbstractC84109c
    /* renamed from: c */
    public final void mo124229c() {
        MethodCollector.m26663i(6452);
        this.f187713b = -1.0d;
        synchronized (this.f187717g) {
            try {
                Iterator<Object> it = this.f187717g.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            } finally {
                MethodCollector.m26664o(6452);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.p4314h.AbstractC84109c
    /* renamed from: a */
    public final double mo124223a() {
        double d;
        Throwable th;
        f187711f.lock();
        try {
            d = this.f187718h.mo118414a(this.f187715d, this.f187716e);
            if (-1.0d == d) {
                try {
                    C84116g.AbstractC84117a aVar = this.f187719i;
                    if (aVar != this.f187718h) {
                        d = aVar.mo118414a(this.f187715d, this.f187716e);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        Log.getStackTraceString(th);
                        f187711f.unlock();
                        return d;
                    } catch (Throwable th3) {
                        f187711f.unlock();
                        throw th3;
                    }
                }
            }
        } catch (Throwable th4) {
            th = th4;
            d = -1.0d;
        }
        f187711f.unlock();
        return d;
    }

    @Override // com.p2082ss.android.ugc.p4314h.AbstractC84109c
    /* renamed from: b */
    public final C84119i[] mo124228b() {
        Lock lock = f187711f;
        lock.lock();
        try {
            Queue<C84119i> queue = this.f187715d;
            if (queue != null) {
                C84119i[] iVarArr = new C84119i[queue.size()];
                int i = 0;
                for (C84119i iVar : this.f187715d) {
                    iVarArr[i] = new C84119i(iVar.f187721b, iVar.f187722c, iVar.f187723d, iVar.f187724e);
                    i++;
                }
                return iVarArr;
            }
            lock.unlock();
            return null;
        } finally {
            f187711f.unlock();
        }
    }

    @Override // com.p2082ss.android.ugc.p4314h.AbstractC84110d
    /* renamed from: d */
    public final double mo124230d() {
        C84116g.AbstractC84117a aVar;
        double d = this.f187713b;
        if (d == -1.0d) {
            Lock lock = f187711f;
            lock.lock();
            try {
                d = this.f187713b;
                if (d == -1.0d) {
                    d = this.f187718h.mo118415b(this.f187715d, this.f187716e);
                    if (d == -1.0d && (aVar = this.f187719i) != this.f187718h) {
                        d = aVar.mo118415b(this.f187715d, this.f187716e);
                    }
                    this.f187713b = d;
                }
                lock.unlock();
            } catch (Throwable th) {
                f187711f.unlock();
                throw th;
            }
        }
        if (d > 0.001d) {
            return d;
        }
        double d2 = this.f187714c;
        return d2 > 0.001d ? d2 : d;
    }

    @Override // com.p2082ss.android.ugc.p4314h.AbstractC84109c
    /* renamed from: a */
    public final void mo124224a(double d) {
        this.f187714c = d;
    }

    @Override // com.p2082ss.android.ugc.p4314h.AbstractC84109c
    /* renamed from: a */
    public final void mo124227a(C84116g.AbstractC84117a aVar) {
        this.f187718h = aVar;
    }

    @Override // com.p2082ss.android.ugc.p4314h.AbstractC84109c
    /* renamed from: a */
    public final void mo124226a(int i) {
        if (i > 0 && i != this.f187715d.size()) {
            Lock lock = f187711f;
            lock.lock();
            try {
                ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
                arrayBlockingQueue.addAll(this.f187715d);
                this.f187716e = new C84119i[i];
                this.f187715d = arrayBlockingQueue;
                lock.unlock();
            } catch (Exception e) {
                e.printStackTrace();
                f187711f.unlock();
            } catch (Throwable th) {
                f187711f.unlock();
                throw th;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.p4314h.AbstractC84109c
    /* renamed from: a */
    public final void mo124225a(double d, double d2, long j) {
        Lock lock = f187711f;
        lock.lock();
        try {
            C84119i iVar = this.f187712a;
            if (iVar != null) {
                iVar.f187721b = d;
                iVar.f187722c = d2;
                iVar.f187723d = j;
                iVar.f187724e = SystemClock.elapsedRealtime();
            } else {
                iVar = new C84119i(d, d2, j, SystemClock.elapsedRealtime());
            }
            if (!this.f187715d.offer(iVar)) {
                this.f187712a = this.f187715d.poll();
                this.f187715d.offer(iVar);
            }
            mo124229c();
            lock.unlock();
        } catch (Throwable th) {
            mo124229c();
            f187711f.unlock();
            throw th;
        }
    }
}
