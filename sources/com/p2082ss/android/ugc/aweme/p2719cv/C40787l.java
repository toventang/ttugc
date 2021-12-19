package com.p2082ss.android.ugc.aweme.p2719cv;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.ss.android.ugc.aweme.cv.l */
public final class C40787l {

    /* renamed from: a */
    public EnumC40793o f95496a;

    /* renamed from: b */
    public String f95497b;

    /* renamed from: c */
    public int f95498c;

    /* renamed from: d */
    public BlockingQueue<Runnable> f95499d;

    /* renamed from: e */
    public RejectedExecutionHandler f95500e;

    /* renamed from: f */
    public long f95501f;

    /* renamed from: g */
    public ThreadFactory f95502g;

    static {
        Covode.recordClassIndex(48639);
    }

    /* renamed from: com.ss.android.ugc.aweme.cv.l$a */
    public static final class C40788a {

        /* renamed from: a */
        public EnumC40793o f95503a;

        /* renamed from: b */
        public String f95504b;

        /* renamed from: c */
        public int f95505c;

        /* renamed from: d */
        public BlockingQueue<Runnable> f95506d;

        /* renamed from: e */
        public RejectedExecutionHandler f95507e;

        /* renamed from: f */
        public long f95508f;

        /* renamed from: g */
        public ThreadFactory f95509g;

        static {
            Covode.recordClassIndex(48640);
        }

        /* renamed from: a */
        public final C40787l mo70028a() {
            return new C40787l(this, (byte) 0);
        }

        /* renamed from: a */
        public final C40788a mo70025a(int i) {
            this.f95505c = i;
            return this;
        }

        /* renamed from: a */
        public final C40788a mo70026a(String str) {
            this.f95504b = str;
            return this;
        }

        /* renamed from: a */
        public final C40788a mo70027a(ThreadFactory threadFactory) {
            this.f95509g = threadFactory;
            return this;
        }

        private C40788a(EnumC40793o oVar) {
            this.f95505c = 1;
            this.f95506d = new LinkedBlockingQueue();
            this.f95507e = new ThreadPoolExecutor.AbortPolicy();
            this.f95508f = -1;
            this.f95503a = oVar;
        }

        /* synthetic */ C40788a(EnumC40793o oVar, byte b) {
            this(oVar);
        }
    }

    /* renamed from: a */
    public static C40788a m82269a(EnumC40793o oVar) {
        return new C40788a(oVar, (byte) 0);
    }

    private C40787l(C40788a aVar) {
        this.f95496a = aVar.f95503a;
        this.f95497b = aVar.f95504b;
        this.f95498c = aVar.f95505c;
        this.f95499d = aVar.f95506d;
        this.f95500e = aVar.f95507e;
        this.f95501f = aVar.f95508f;
        this.f95502g = aVar.f95509g;
    }

    /* synthetic */ C40787l(C40788a aVar, byte b) {
        this(aVar);
    }
}
