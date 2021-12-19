package com.p2082ss.android.ugc.musicprovider.p4320c;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.music.p3481ui.p3483b.C61135b;
import com.p2082ss.android.ugc.aweme.music.p3481ui.p3483b.C61136c;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import com.p2082ss.android.ugc.musicprovider.interfaces.AbstractC84160a;
import com.p2082ss.android.ugc.musicprovider.interfaces.AbstractC84161b;
import com.p2082ss.android.ugc.musicprovider.interfaces.AbstractC84162c;
import com.p2082ss.android.ugc.musicprovider.p4318a.C84126a;
import com.p2082ss.ttvideoengine.AbstractC86369ba;
import com.p2082ss.ttvideoengine.C86313ai;
import com.p2082ss.ttvideoengine.p4430s.C86633c;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.musicprovider.c.d */
public final class C84145d {

    /* renamed from: j */
    public static final C84145d f187790j = C84147b.f187802a;

    /* renamed from: k */
    public static final C84146a f187791k = new C84146a((byte) 0);

    /* renamed from: a */
    public C86313ai f187792a;

    /* renamed from: b */
    public ExecutorService f187793b;

    /* renamed from: c */
    public C84126a f187794c;

    /* renamed from: d */
    public long f187795d;

    /* renamed from: e */
    public String f187796e = "";

    /* renamed from: f */
    public AbstractC84161b f187797f;

    /* renamed from: g */
    public AbstractC84160a f187798g;

    /* renamed from: h */
    public AbstractC84162c f187799h;

    /* renamed from: i */
    AbstractC86369ba f187800i = new C84149d(this);

    /* renamed from: l */
    private Handler f187801l = new Handler(Looper.getMainLooper());

    /* renamed from: com.ss.android.ugc.musicprovider.c.d$a */
    public static final class C84146a {
        static {
            Covode.recordClassIndex(98045);
        }

        private C84146a() {
        }

        public /* synthetic */ C84146a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.musicprovider.c.d$b */
    static final class C84147b {

        /* renamed from: a */
        static final C84145d f187802a = new C84145d();

        /* renamed from: b */
        public static final C84147b f187803b = new C84147b();

        private C84147b() {
        }

        static {
            Covode.recordClassIndex(98046);
        }
    }

    /* renamed from: com.ss.android.ugc.musicprovider.c.d$d */
    public static final class C84149d implements AbstractC86369ba {

        /* renamed from: a */
        final /* synthetic */ C84145d f187805a;

        static {
            Covode.recordClassIndex(98048);
        }

        @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
        /* renamed from: a */
        public final void mo16745a(int i) {
        }

        @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
        /* renamed from: a */
        public final void mo16746a(C86313ai aiVar) {
        }

        @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
        /* renamed from: a */
        public final void mo16747a(C86313ai aiVar, int i) {
        }

        @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
        /* renamed from: a */
        public final void mo16748a(C86313ai aiVar, int i, int i2) {
        }

        @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
        /* renamed from: b */
        public final void mo16750b(C86313ai aiVar) {
        }

        @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
        /* renamed from: b */
        public final void mo16751b(C86313ai aiVar, int i) {
        }

        @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
        /* renamed from: c */
        public final void mo16753c(C86313ai aiVar, int i) {
        }

        @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
        /* renamed from: d */
        public final void mo16755d(C86313ai aiVar, int i) {
        }

        /* renamed from: com.ss.android.ugc.musicprovider.c.d$d$a */
        static final class RunnableC84150a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C84149d f187806a;

            static {
                Covode.recordClassIndex(98049);
            }

            RunnableC84150a(C84149d dVar) {
                this.f187806a = dVar;
            }

            public final void run() {
                AbstractC84160a aVar = this.f187806a.f187805a.f187798g;
                if (aVar != null) {
                    aVar.mo63051a();
                }
            }
        }

        /* renamed from: com.ss.android.ugc.musicprovider.c.d$d$d */
        static final class RunnableC84153d implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C84149d f187810a;

            /* renamed from: b */
            final /* synthetic */ C86313ai f187811b;

            static {
                Covode.recordClassIndex(98052);
            }

            RunnableC84153d(C84149d dVar, C86313ai aiVar) {
                this.f187810a = dVar;
                this.f187811b = aiVar;
            }

            public final void run() {
                AbstractC84162c cVar;
                C86313ai aiVar = this.f187811b;
                if (aiVar != null && (cVar = this.f187810a.f187805a.f187799h) != null) {
                    cVar.mo63046a(aiVar.f193376x);
                }
            }
        }

        /* renamed from: com.ss.android.ugc.musicprovider.c.d$d$c */
        static final class CallableC84152c<V> implements Callable {

            /* renamed from: a */
            final /* synthetic */ C84149d f187809a;

            static {
                Covode.recordClassIndex(98051);
            }

            CallableC84152c(C84149d dVar) {
                this.f187809a = dVar;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                String str;
                C84145d dVar = this.f187809a.f187805a;
                long elapsedRealtime = SystemClock.elapsedRealtime() - dVar.f187795d;
                C84126a aVar = dVar.f187794c;
                if (aVar != null) {
                    String obj = aVar.f187737b.toString();
                    C86313ai aiVar = dVar.f187792a;
                    String str2 = null;
                    if (aiVar != null) {
                        str = aiVar.mo137266r();
                    } else {
                        str = null;
                    }
                    C61136c.m110753a(elapsedRealtime, obj, str, dVar.f187796e);
                    String str3 = aVar.f187741f;
                    String obj2 = aVar.f187737b.toString();
                    C86313ai aiVar2 = dVar.f187792a;
                    if (aiVar2 != null) {
                        str2 = aiVar2.mo137266r();
                    }
                    C61135b.m110749a(str3, obj2, str2, Long.valueOf(elapsedRealtime));
                }
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.musicprovider.c.d$d$b */
        static final class CallableC84151b<V> implements Callable {

            /* renamed from: a */
            final /* synthetic */ C84149d f187807a;

            /* renamed from: b */
            final /* synthetic */ C86633c f187808b;

            static {
                Covode.recordClassIndex(98050);
            }

            CallableC84151b(C84149d dVar, C86633c cVar) {
                this.f187807a = dVar;
                this.f187808b = cVar;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                String str;
                C84145d dVar = this.f187807a.f187805a;
                C86633c cVar = this.f187808b;
                long elapsedRealtime = SystemClock.elapsedRealtime() - dVar.f187795d;
                C84126a aVar = dVar.f187794c;
                if (!(aVar == null || cVar == null)) {
                    int i = cVar.f195251a;
                    String obj = aVar.f187737b.toString();
                    C86313ai aiVar = dVar.f187792a;
                    String str2 = null;
                    if (aiVar != null) {
                        str = aiVar.mo137266r();
                    } else {
                        str = null;
                    }
                    C61136c.m110752a(i, elapsedRealtime, obj, str, cVar.f195254d, dVar.f187796e);
                    String str3 = aVar.f187741f;
                    String obj2 = aVar.f187737b.toString();
                    C86313ai aiVar2 = dVar.f187792a;
                    if (aiVar2 != null) {
                        str2 = aiVar2.mo137266r();
                    }
                    C61135b.m110750a(str3, obj2, str2, cVar.f195254d);
                }
                dVar.mo128970a(new RunnableC84148c(dVar));
                return C89391z.f203057a;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C84149d(C84145d dVar) {
            this.f187805a = dVar;
        }

        @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
        /* renamed from: d */
        public final void mo16754d(C86313ai aiVar) {
            this.f187805a.mo128970a(new RunnableC84150a(this));
        }

        @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
        /* renamed from: c */
        public final void mo16752c(C86313ai aiVar) {
            C1731i.m5640b(new CallableC84152c(this), this.f187805a.f187793b);
            this.f187805a.mo128970a(new RunnableC84153d(this, aiVar));
        }

        @Override // com.p2082ss.ttvideoengine.AbstractC86369ba
        /* renamed from: a */
        public final void mo16749a(C86633c cVar) {
            C1731i.m5640b(new CallableC84151b(this, cVar), this.f187805a.f187793b);
        }
    }

    /* renamed from: com.ss.android.ugc.musicprovider.c.d$c */
    static final class RunnableC84148c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C84145d f187804a;

        static {
            Covode.recordClassIndex(98047);
        }

        RunnableC84148c(C84145d dVar) {
            this.f187804a = dVar;
        }

        public final void run() {
            AbstractC84161b bVar = this.f187804a.f187797f;
            if (bVar != null) {
                bVar.mo63052a();
            }
        }
    }

    static {
        Covode.recordClassIndex(98044);
    }

    public C84145d() {
        ExecutorService a = C40780g.m82242a(C40787l.m82269a(EnumC40793o.SERIAL).mo70028a());
        Objects.requireNonNull(a, "null cannot be cast to non-null type java.util.concurrent.ExecutorService");
        this.f187793b = a;
    }

    /* renamed from: a */
    public final void mo128970a(Runnable runnable) {
        Thread currentThread = Thread.currentThread();
        Looper mainLooper = Looper.getMainLooper();
        C89219l.m154716b(mainLooper, "");
        if (currentThread == mainLooper.getThread()) {
            runnable.run();
        } else {
            this.f187801l.post(runnable);
        }
    }
}
