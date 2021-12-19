package com.toutiao.proxyserver;

import com.bytedance.covode.number.Covode;
import com.toutiao.proxyserver.C87401x;
import com.toutiao.proxyserver.p4495g.C87328b;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.toutiao.proxyserver.d */
public final class RunnableC87305d implements Runnable, Callable<Void> {

    /* renamed from: d */
    private static final ExecutorService f197894d = new ThreadPoolExecutor(1, 10, 60, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() {
        /* class com.toutiao.proxyserver.RunnableC87305d.ThreadFactoryC873061 */

        static {
            Covode.recordClassIndex(103202);
        }

        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("video-cache-writer-" + thread.getId());
            return thread;
        }
    });

    /* renamed from: a */
    private volatile boolean f197895a;

    /* renamed from: b */
    private boolean f197896b;

    /* renamed from: c */
    private BlockingQueue<C87307a> f197897c;

    /* renamed from: e */
    private C87401x f197898e;

    /* renamed from: f */
    private C87401x.C87402a f197899f;

    /* access modifiers changed from: package-private */
    /* renamed from: com.toutiao.proxyserver.d$a */
    public static class C87307a {

        /* renamed from: f */
        static final Queue<C87307a> f197900f = new LinkedBlockingQueue(16);

        /* renamed from: a */
        C87401x f197901a;

        /* renamed from: b */
        byte[] f197902b;

        /* renamed from: c */
        int f197903c;

        /* renamed from: d */
        int f197904d;

        /* renamed from: e */
        public int f197905e;

        private C87307a() {
        }

        static {
            Covode.recordClassIndex(103203);
        }

        /* renamed from: b */
        public final void mo141347b() {
            C87401x xVar = this.f197901a;
            if (xVar != null) {
                C87328b.m151553a(xVar.f198164a);
            }
        }

        /* renamed from: a */
        public final C87401x mo141346a() {
            C87401x xVar = this.f197901a;
            if (xVar != null) {
                try {
                    xVar.mo141454a(this.f197902b, this.f197903c, this.f197904d);
                } catch (C87401x.C87402a e) {
                    C87328b.m151553a(this.f197901a.f198164a);
                    throw e;
                }
            }
            return this.f197901a;
        }

        /* renamed from: a */
        static C87307a m151515a(int i) {
            C87307a poll = f197900f.poll();
            if (poll == null) {
                poll = new C87307a();
            }
            poll.f197905e = i;
            return poll;
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Void call() {
        run();
        return null;
    }

    static {
        Covode.recordClassIndex(103201);
    }

    /* renamed from: b */
    public final Future<Void> mo141342b() {
        if (this.f197896b && !this.f197895a) {
            this.f197895a = true;
            try {
                return f197894d.submit((Callable) this);
            } catch (Exception unused) {
                this.f197896b = false;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo141340a() {
        if (!this.f197896b || this.f197897c == null || !this.f197895a) {
            C87401x xVar = this.f197898e;
            if (xVar != null) {
                C87328b.m151553a(xVar.f198164a);
                return;
            }
            return;
        }
        this.f197897c.clear();
        BlockingQueue<C87307a> blockingQueue = this.f197897c;
        C87401x xVar2 = this.f197898e;
        C87307a a = C87307a.m151515a(2);
        a.f197901a = xVar2;
        blockingQueue.offer(a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        if (r1 != 3) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.RunnableC87305d.run():void");
    }

    public RunnableC87305d(C87401x xVar) {
        boolean z = C87383u.f198076A;
        this.f197896b = z;
        if (z) {
            this.f197897c = new LinkedBlockingQueue();
        }
        this.f197898e = xVar;
        this.f197895a = false;
    }

    /* renamed from: a */
    public final void mo141341a(byte[] bArr, int i) {
        if (!this.f197896b) {
            C87401x xVar = this.f197898e;
            if (xVar != null) {
                xVar.mo141454a(bArr, 0, i);
            }
        } else if (this.f197899f != null || !this.f197895a) {
            C87401x.C87402a aVar = this.f197899f;
            if (aVar != null && this.f197898e != null) {
                this.f197898e = null;
                throw aVar;
            }
        } else {
            BlockingQueue<C87307a> blockingQueue = this.f197897c;
            C87401x xVar2 = this.f197898e;
            C87307a a = C87307a.m151515a(1);
            a.f197901a = xVar2;
            if (a.f197902b == null || a.f197902b.length != bArr.length) {
                a.f197902b = new byte[bArr.length];
            }
            System.arraycopy(bArr, 0, a.f197902b, 0, bArr.length);
            a.f197903c = 0;
            a.f197904d = i;
            blockingQueue.offer(a);
        }
    }
}
