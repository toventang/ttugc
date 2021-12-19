package com.airbnb.lottie.p104g;

import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* renamed from: com.airbnb.lottie.g.a */
public final class C2139a {

    /* renamed from: a */
    protected boolean f6452a = false;

    /* renamed from: b */
    public float f6453b = 0.0f;

    /* renamed from: c */
    private boolean f6454c;

    /* renamed from: d */
    private long f6455d;

    /* renamed from: e */
    private C2140a f6456e = new C2140a();

    /* renamed from: f */
    private C2140a f6457f = new C2140a();

    /* renamed from: g */
    private C2140a f6458g = new C2140a();

    /* renamed from: h */
    private C2140a f6459h = new C2140a();

    /* renamed from: i */
    private C2140a f6460i = new C2140a();

    /* renamed from: j */
    private WeakReference<AbstractC2141b> f6461j;

    /* renamed from: k */
    private long f6462k = 0;

    /* renamed from: l */
    private long f6463l = 0;

    /* renamed from: com.airbnb.lottie.g.a$b */
    public interface AbstractC2141b {
        static {
            Covode.recordClassIndex(2336);
        }
    }

    static {
        Covode.recordClassIndex(2334);
    }

    /* renamed from: a */
    public final void mo6056a() {
        if (this.f6454c) {
            this.f6457f.mo6063a(this.f6455d);
        }
    }

    /* renamed from: b */
    public final void mo6060b() {
        if (this.f6454c) {
            this.f6458g.mo6063a(this.f6455d);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.airbnb.lottie.g.a$a */
    public static class C2140a {

        /* renamed from: a */
        public long f6464a;

        /* renamed from: b */
        public long f6465b;

        /* renamed from: c */
        private long f6466c;

        /* renamed from: d */
        private long f6467d;

        static {
            Covode.recordClassIndex(2335);
        }

        /* renamed from: a */
        public final int mo6062a() {
            int i;
            long j = this.f6464a;
            long j2 = j - this.f6465b;
            if (j2 > 0) {
                i = (int) (((((float) ((this.f6466c - this.f6467d) * 1000000000)) * 1.0f) / ((float) j2)) + 0.5f);
            } else {
                i = 0;
            }
            this.f6465b = j;
            this.f6467d = this.f6466c;
            return i;
        }

        /* renamed from: a */
        public final void mo6063a(long j) {
            if (j != this.f6464a) {
                long j2 = this.f6466c + 1;
                this.f6466c = j2;
                this.f6464a = j;
                if (this.f6465b == 0) {
                    this.f6465b = j;
                    this.f6467d = j2;
                }
            }
        }
    }

    protected C2139a() {
    }

    /* renamed from: a */
    public final void mo6058a(AbstractC2141b bVar) {
        if (bVar == null) {
            this.f6461j = null;
        } else {
            this.f6461j = new WeakReference<>(bVar);
        }
    }

    /* renamed from: b */
    public final void mo6061b(boolean z) {
        if (this.f6454c && z) {
            this.f6460i.mo6063a(this.f6455d);
        }
    }

    /* renamed from: a */
    public final void mo6059a(boolean z) {
        if (this.f6454c && z) {
            this.f6459h.mo6063a(this.f6455d);
        }
    }

    /* renamed from: a */
    public final void mo6057a(long j) {
        WeakReference<AbstractC2141b> weakReference;
        if (this.f6454c) {
            this.f6455d = j;
            this.f6456e.mo6063a(j);
            if (this.f6452a && this.f6456e.f6464a - this.f6456e.f6465b >= 1000000000 && (weakReference = this.f6461j) != null && weakReference.get() != null) {
                this.f6456e.mo6062a();
                this.f6457f.mo6062a();
                this.f6459h.mo6062a();
                this.f6460i.mo6062a();
                this.f6458g.mo6062a();
                this.f6453b = 0.0f;
            }
        }
    }
}
