package p4560f.p4561a.p4562a.p4564b;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4569a.EnumC88442c;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.a.b.b */
final class C88395b extends AbstractC88398aa {

    /* renamed from: a */
    private final Handler f200662a;

    /* renamed from: c */
    private final boolean f200663c = false;

    static {
        Covode.recordClassIndex(104437);
    }

    /* renamed from: f.a.a.b.b$a */
    static final class C88396a extends AbstractC88398aa.AbstractC88401c {

        /* renamed from: a */
        private final Handler f200664a;

        /* renamed from: b */
        private final boolean f200665b;

        /* renamed from: c */
        private volatile boolean f200666c;

        static {
            Covode.recordClassIndex(104438);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f200666c;
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            this.f200666c = true;
            this.f200664a.removeCallbacksAndMessages(this);
        }

        C88396a(Handler handler, boolean z) {
            this.f200664a = handler;
            this.f200665b = z;
        }

        @Override // p4560f.p4561a.AbstractC88398aa.AbstractC88401c
        /* renamed from: a */
        public final AbstractC88412b mo20706a(Runnable runnable, long j, TimeUnit timeUnit) {
            Objects.requireNonNull(runnable, "run == null");
            Objects.requireNonNull(timeUnit, "unit == null");
            if (this.f200666c) {
                return EnumC88442c.INSTANCE;
            }
            RunnableC88397b bVar = new RunnableC88397b(this.f200664a, C88925a.m154175a(runnable));
            Message obtain = Message.obtain(this.f200664a, bVar);
            obtain.obj = this;
            if (this.f200665b) {
                obtain.setAsynchronous(true);
            }
            this.f200664a.sendMessageDelayed(obtain, timeUnit.toMillis(j));
            if (!this.f200666c) {
                return bVar;
            }
            this.f200664a.removeCallbacks(bVar);
            return EnumC88442c.INSTANCE;
        }
    }

    /* renamed from: f.a.a.b.b$b */
    static final class RunnableC88397b implements AbstractC88412b, Runnable {

        /* renamed from: a */
        private final Handler f200667a;

        /* renamed from: b */
        private final Runnable f200668b;

        /* renamed from: c */
        private volatile boolean f200669c;

        static {
            Covode.recordClassIndex(104439);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f200669c;
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            this.f200667a.removeCallbacks(this);
            this.f200669c = true;
        }

        public final void run() {
            try {
                this.f200668b.run();
            } catch (Throwable th) {
                C88925a.m154178a(th);
            }
        }

        RunnableC88397b(Handler handler, Runnable runnable) {
            this.f200667a = handler;
            this.f200668b = runnable;
        }
    }

    @Override // p4560f.p4561a.AbstractC88398aa
    /* renamed from: a */
    public final AbstractC88398aa.AbstractC88401c mo20704a() {
        return new C88396a(this.f200662a, this.f200663c);
    }

    C88395b(Handler handler) {
        this.f200662a = handler;
    }

    @Override // p4560f.p4561a.AbstractC88398aa
    /* renamed from: a */
    public final AbstractC88412b mo20705a(Runnable runnable, long j, TimeUnit timeUnit) {
        Objects.requireNonNull(runnable, "run == null");
        Objects.requireNonNull(timeUnit, "unit == null");
        RunnableC88397b bVar = new RunnableC88397b(this.f200662a, C88925a.m154175a(runnable));
        Message obtain = Message.obtain(this.f200662a, bVar);
        if (this.f200663c) {
            obtain.setAsynchronous(true);
        }
        this.f200662a.sendMessageDelayed(obtain, timeUnit.toMillis(j));
        return bVar;
    }
}
