package com.bytedance.jedi.arch.internal;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4569a.EnumC88442c;
import p4560f.p4561a.p4587h.C88925a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.arch.internal.f */
public final class C20495f extends AbstractC88398aa {

    /* renamed from: a */
    private final Handler f48497a;

    /* renamed from: c */
    private final boolean f48498c = false;

    static {
        Covode.recordClassIndex(24018);
    }

    /* renamed from: com.bytedance.jedi.arch.internal.f$a */
    static final class C20496a extends AbstractC88398aa.AbstractC88401c {

        /* renamed from: a */
        private volatile boolean f48499a;

        /* renamed from: b */
        private final Handler f48500b;

        /* renamed from: c */
        private final boolean f48501c;

        static {
            Covode.recordClassIndex(24019);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f48499a;
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            this.f48499a = true;
            this.f48500b.removeCallbacksAndMessages(this);
        }

        public C20496a(Handler handler, boolean z) {
            C89219l.m154719c(handler, "");
            this.f48500b = handler;
            this.f48501c = z;
        }

        @Override // p4560f.p4561a.AbstractC88398aa.AbstractC88401c
        /* renamed from: a */
        public final AbstractC88412b mo20706a(Runnable runnable, long j, TimeUnit timeUnit) {
            C89219l.m154719c(runnable, "");
            C89219l.m154719c(timeUnit, "");
            if (this.f48499a) {
                EnumC88442c cVar = EnumC88442c.INSTANCE;
                C89219l.m154709a((Object) cVar, "");
                return cVar;
            }
            Runnable a = C88925a.m154175a(runnable);
            C89219l.m154709a((Object) a, "");
            boolean a2 = C20498g.m38698a();
            RunnableC20497b bVar = new RunnableC20497b(this.f48500b, a, a2);
            if (a2) {
                bVar.run();
                return bVar;
            }
            Message obtain = Message.obtain(this.f48500b, bVar);
            obtain.obj = this;
            if (this.f48501c) {
                C89219l.m154709a((Object) obtain, "");
                obtain.setAsynchronous(true);
            }
            this.f48500b.sendMessageDelayed(obtain, timeUnit.toMillis(j));
            if (!this.f48499a) {
                return bVar;
            }
            this.f48500b.removeCallbacks(bVar);
            EnumC88442c cVar2 = EnumC88442c.INSTANCE;
            C89219l.m154709a((Object) cVar2, "");
            return cVar2;
        }
    }

    /* renamed from: com.bytedance.jedi.arch.internal.f$b */
    static final class RunnableC20497b implements AbstractC88412b, Runnable {

        /* renamed from: a */
        private volatile boolean f48502a;

        /* renamed from: b */
        private final Handler f48503b;

        /* renamed from: c */
        private final Runnable f48504c;

        /* renamed from: d */
        private final boolean f48505d;

        static {
            Covode.recordClassIndex(24020);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f48502a;
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            if (!this.f48505d) {
                this.f48503b.removeCallbacks(this);
            }
            this.f48502a = true;
        }

        public final void run() {
            try {
                this.f48504c.run();
            } catch (Throwable th) {
                C88925a.m154178a(th);
            }
        }

        public RunnableC20497b(Handler handler, Runnable runnable, boolean z) {
            C89219l.m154719c(handler, "");
            C89219l.m154719c(runnable, "");
            this.f48503b = handler;
            this.f48504c = runnable;
            this.f48505d = z;
        }
    }

    @Override // p4560f.p4561a.AbstractC88398aa
    /* renamed from: a */
    public final AbstractC88398aa.AbstractC88401c mo20704a() {
        return new C20496a(this.f48497a, this.f48498c);
    }

    public C20495f(Handler handler) {
        C89219l.m154719c(handler, "");
        this.f48497a = handler;
    }

    @Override // p4560f.p4561a.AbstractC88398aa
    /* renamed from: a */
    public final AbstractC88412b mo20705a(Runnable runnable, long j, TimeUnit timeUnit) {
        C89219l.m154719c(runnable, "");
        C89219l.m154719c(timeUnit, "");
        Runnable a = C88925a.m154175a(runnable);
        C89219l.m154709a((Object) a, "");
        boolean a2 = C20498g.m38698a();
        RunnableC20497b bVar = new RunnableC20497b(this.f48497a, a, a2);
        if (a2) {
            bVar.run();
            return bVar;
        }
        this.f48497a.postDelayed(bVar, timeUnit.toMillis(j));
        return bVar;
    }
}
