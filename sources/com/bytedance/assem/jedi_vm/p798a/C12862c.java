package com.bytedance.assem.jedi_vm.p798a;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4569a.EnumC88442c;
import p4560f.p4561a.p4587h.C88925a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.assem.jedi_vm.a.c */
public final class C12862c extends AbstractC88398aa {

    /* renamed from: a */
    private final Handler f31297a;

    /* renamed from: c */
    private final boolean f31298c = false;

    static {
        Covode.recordClassIndex(14694);
    }

    /* renamed from: com.bytedance.assem.jedi_vm.a.c$a */
    static final class C12863a extends AbstractC88398aa.AbstractC88401c {

        /* renamed from: a */
        private volatile boolean f31299a;

        /* renamed from: b */
        private final Handler f31300b;

        /* renamed from: c */
        private final boolean f31301c;

        static {
            Covode.recordClassIndex(14695);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f31299a;
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            this.f31299a = true;
            this.f31300b.removeCallbacksAndMessages(this);
        }

        public C12863a(Handler handler, boolean z) {
            C89219l.m154719c(handler, "");
            this.f31300b = handler;
            this.f31301c = z;
        }

        @Override // p4560f.p4561a.AbstractC88398aa.AbstractC88401c
        /* renamed from: a */
        public final AbstractC88412b mo20706a(Runnable runnable, long j, TimeUnit timeUnit) {
            C89219l.m154719c(runnable, "");
            C89219l.m154719c(timeUnit, "");
            if (this.f31299a) {
                EnumC88442c cVar = EnumC88442c.INSTANCE;
                C89219l.m154709a((Object) cVar, "");
                return cVar;
            }
            Runnable a = C88925a.m154175a(runnable);
            C89219l.m154709a((Object) a, "");
            boolean a2 = C12865d.m23117a();
            RunnableC12864b bVar = new RunnableC12864b(this.f31300b, a, a2);
            if (a2) {
                bVar.run();
                return bVar;
            }
            Message obtain = Message.obtain(this.f31300b, bVar);
            obtain.obj = this;
            if (this.f31301c) {
                C89219l.m154709a((Object) obtain, "");
                obtain.setAsynchronous(true);
            }
            this.f31300b.sendMessageDelayed(obtain, timeUnit.toMillis(j));
            if (!this.f31299a) {
                return bVar;
            }
            this.f31300b.removeCallbacks(bVar);
            EnumC88442c cVar2 = EnumC88442c.INSTANCE;
            C89219l.m154709a((Object) cVar2, "");
            return cVar2;
        }
    }

    /* renamed from: com.bytedance.assem.jedi_vm.a.c$b */
    static final class RunnableC12864b implements AbstractC88412b, Runnable {

        /* renamed from: a */
        private volatile boolean f31302a;

        /* renamed from: b */
        private final Handler f31303b;

        /* renamed from: c */
        private final Runnable f31304c;

        /* renamed from: d */
        private final boolean f31305d;

        static {
            Covode.recordClassIndex(14696);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f31302a;
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            if (!this.f31305d) {
                this.f31303b.removeCallbacks(this);
            }
            this.f31302a = true;
        }

        public final void run() {
            try {
                this.f31304c.run();
            } catch (Throwable th) {
                C88925a.m154178a(th);
            }
        }

        public RunnableC12864b(Handler handler, Runnable runnable, boolean z) {
            C89219l.m154719c(handler, "");
            C89219l.m154719c(runnable, "");
            this.f31303b = handler;
            this.f31304c = runnable;
            this.f31305d = z;
        }
    }

    @Override // p4560f.p4561a.AbstractC88398aa
    /* renamed from: a */
    public final AbstractC88398aa.AbstractC88401c mo20704a() {
        return new C12863a(this.f31297a, this.f31298c);
    }

    public C12862c(Handler handler) {
        C89219l.m154719c(handler, "");
        this.f31297a = handler;
    }

    @Override // p4560f.p4561a.AbstractC88398aa
    /* renamed from: a */
    public final AbstractC88412b mo20705a(Runnable runnable, long j, TimeUnit timeUnit) {
        C89219l.m154719c(runnable, "");
        C89219l.m154719c(timeUnit, "");
        Runnable a = C88925a.m154175a(runnable);
        C89219l.m154709a((Object) a, "");
        boolean a2 = C12865d.m23117a();
        RunnableC12864b bVar = new RunnableC12864b(this.f31297a, a, a2);
        if (a2) {
            bVar.run();
            return bVar;
        }
        this.f31297a.postDelayed(bVar, timeUnit.toMillis(j));
        return bVar;
    }
}
