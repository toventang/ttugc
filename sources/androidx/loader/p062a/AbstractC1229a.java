package androidx.loader.p062a;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.core.p033d.C0650d;
import androidx.core.p036g.C0698h;
import com.bytedance.covode.number.Covode;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* renamed from: androidx.loader.a.a */
public abstract class AbstractC1229a<D> extends C1232c<D> {

    /* renamed from: a */
    volatile AbstractC1229a<D>.RunnableC1230a f4031a;

    /* renamed from: b */
    volatile AbstractC1229a<D>.RunnableC1230a f4032b;

    /* renamed from: c */
    long f4033c;

    /* renamed from: d */
    long f4034d;

    /* renamed from: e */
    Handler f4035e;

    /* renamed from: f */
    private final Executor f4036f;

    static {
        Covode.recordClassIndex(1336);
    }

    /* renamed from: a */
    public void mo4063a(D d) {
    }

    /* renamed from: d */
    public abstract D mo4067d();

    /* renamed from: e */
    public void mo4068e() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.loader.a.a$a */
    public final class RunnableC1230a extends AbstractC1235d<Void, Void, D> implements Runnable {

        /* renamed from: a */
        boolean f4037a;

        /* renamed from: h */
        private final CountDownLatch f4039h = new CountDownLatch(1);

        static {
            Covode.recordClassIndex(1337);
        }

        public final void run() {
            this.f4037a = false;
            AbstractC1229a.this.mo4066c();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public D mo4069a() {
            try {
                return (D) AbstractC1229a.this.mo4067d();
            } catch (C0650d e) {
                if (this.f4064f.get()) {
                    return null;
                }
                throw e;
            }
        }

        RunnableC1230a() {
        }

        /* access modifiers changed from: protected */
        @Override // androidx.loader.p062a.AbstractC1235d
        /* renamed from: a */
        public final void mo4070a(D d) {
            try {
                AbstractC1229a aVar = AbstractC1229a.this;
                if (aVar.f4031a != this) {
                    aVar.mo4062a(this, d);
                } else if (aVar.f4052r) {
                    aVar.mo4063a((Object) d);
                } else {
                    aVar.f4055u = false;
                    aVar.f4034d = SystemClock.uptimeMillis();
                    aVar.f4031a = null;
                    aVar.mo4073b(d);
                }
            } finally {
                this.f4039h.countDown();
            }
        }

        /* access modifiers changed from: protected */
        @Override // androidx.loader.p062a.AbstractC1235d
        /* renamed from: b */
        public final void mo4071b(D d) {
            try {
                AbstractC1229a.this.mo4062a(this, d);
            } finally {
                this.f4039h.countDown();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.loader.p062a.C1232c
    /* renamed from: a */
    public final void mo4061a() {
        super.mo4061a();
        mo4080k();
        this.f4031a = new RunnableC1230a();
        mo4066c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.loader.p062a.C1232c
    /* renamed from: b */
    public final boolean mo4065b() {
        if (this.f4031a == null) {
            return false;
        }
        if (!this.f4051q) {
            this.f4054t = true;
        }
        if (this.f4032b != null) {
            if (this.f4031a.f4037a) {
                this.f4031a.f4037a = false;
                this.f4035e.removeCallbacks(this.f4031a);
            }
            this.f4031a = null;
            return false;
        } else if (this.f4031a.f4037a) {
            this.f4031a.f4037a = false;
            this.f4035e.removeCallbacks(this.f4031a);
            this.f4031a = null;
            return false;
        } else {
            AbstractC1229a<D>.RunnableC1230a aVar = this.f4031a;
            aVar.f4064f.set(true);
            boolean cancel = aVar.f4062d.cancel(false);
            if (cancel) {
                this.f4032b = this.f4031a;
                mo4068e();
            }
            this.f4031a = null;
            return cancel;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo4066c() {
        if (this.f4032b == null && this.f4031a != null) {
            if (this.f4031a.f4037a) {
                this.f4031a.f4037a = false;
                this.f4035e.removeCallbacks(this.f4031a);
            }
            if (this.f4033c <= 0 || SystemClock.uptimeMillis() >= this.f4034d + this.f4033c) {
                this.f4031a.mo4089a(this.f4036f);
                return;
            }
            this.f4031a.f4037a = true;
            this.f4035e.postAtTime(this.f4031a, this.f4034d + this.f4033c);
        }
    }

    public AbstractC1229a(Context context) {
        this(context, AbstractC1235d.f4059c);
    }

    private AbstractC1229a(Context context, Executor executor) {
        super(context);
        this.f4034d = -10000;
        this.f4036f = executor;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4062a(AbstractC1229a<D>.RunnableC1230a aVar, D d) {
        mo4063a((Object) d);
        if (this.f4032b == aVar) {
            if (this.f4055u) {
                mo4084o();
            }
            this.f4034d = SystemClock.uptimeMillis();
            this.f4032b = null;
            mo4066c();
        }
    }

    @Override // androidx.loader.p062a.C1232c
    /* renamed from: a */
    public void mo4064a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo4064a(str, fileDescriptor, printWriter, strArr);
        if (this.f4031a != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f4031a);
            printWriter.print(" waiting=");
            printWriter.println(this.f4031a.f4037a);
        }
        if (this.f4032b != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f4032b);
            printWriter.print(" waiting=");
            printWriter.println(this.f4032b.f4037a);
        }
        if (this.f4033c != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            C0698h.m2457a(this.f4033c, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            long j = this.f4034d;
            long uptimeMillis = SystemClock.uptimeMillis();
            if (j == 0) {
                printWriter.print("--");
            } else {
                C0698h.m2457a(j - uptimeMillis, printWriter);
            }
            printWriter.println();
        }
    }
}
