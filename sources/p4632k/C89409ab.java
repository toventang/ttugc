package p4632k;

import com.bytedance.covode.number.Covode;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: k.ab */
public class C89409ab {

    /* renamed from: h */
    public static final C89409ab f203072h = new C89411b();

    /* renamed from: i */
    public static final C89410a f203073i = new C89410a((byte) 0);

    /* renamed from: a */
    private boolean f203074a;

    /* renamed from: b */
    private long f203075b;

    /* renamed from: c */
    private long f203076c;

    /* renamed from: e */
    public C89409ab mo143785e() {
        this.f203074a = false;
        return this;
    }

    /* renamed from: k.ab$a */
    public static final class C89410a {
        static {
            Covode.recordClassIndex(105494);
        }

        private C89410a() {
        }

        public /* synthetic */ C89410a(byte b) {
            this();
        }
    }

    /* renamed from: k.ab$b */
    public static final class C89411b extends C89409ab {
        static {
            Covode.recordClassIndex(105495);
        }

        @Override // p4632k.C89409ab
        /* renamed from: f */
        public final void mo143786f() {
        }

        C89411b() {
        }

        @Override // p4632k.C89409ab
        /* renamed from: a */
        public final C89409ab mo143783a(long j) {
            return this;
        }

        @Override // p4632k.C89409ab
        /* renamed from: a */
        public final C89409ab mo143784a(long j, TimeUnit timeUnit) {
            C89219l.m154719c(timeUnit, "");
            return this;
        }
    }

    /* renamed from: P_ */
    public long mo143779P_() {
        return this.f203076c;
    }

    /* renamed from: Q_ */
    public boolean mo143780Q_() {
        return this.f203074a;
    }

    /* renamed from: S_ */
    public C89409ab mo143782S_() {
        this.f203076c = 0;
        return this;
    }

    static {
        Covode.recordClassIndex(105493);
    }

    /* renamed from: R_ */
    public long mo143781R_() {
        if (this.f203074a) {
            return this.f203075b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    /* renamed from: f */
    public void mo143786f() {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.f203074a && this.f203075b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* renamed from: a */
    public C89409ab mo143783a(long j) {
        this.f203074a = true;
        this.f203075b = j;
        return this;
    }

    /* renamed from: a */
    public C89409ab mo143784a(long j, TimeUnit timeUnit) {
        C89219l.m154719c(timeUnit, "");
        if (j >= 0) {
            this.f203076c = timeUnit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException("timeout < 0: ".concat(String.valueOf(j)).toString());
    }
}
