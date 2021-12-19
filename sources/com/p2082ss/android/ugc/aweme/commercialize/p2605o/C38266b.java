package com.p2082ss.android.ugc.aweme.commercialize.p2605o;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.o.b */
public final class C38266b {

    /* renamed from: a */
    public int f90434a;

    /* renamed from: b */
    public int f90435b;

    /* renamed from: c */
    public long f90436c;

    /* renamed from: d */
    public final int f90437d;

    /* renamed from: e */
    public Runnable f90438e;

    /* renamed from: f */
    public boolean f90439f;

    static {
        Covode.recordClassIndex(45750);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.o.b$a */
    public static final class C38267a {

        /* renamed from: a */
        private long f90440a = 1;

        /* renamed from: b */
        private int f90441b;

        /* renamed from: c */
        private Runnable f90442c;

        /* renamed from: d */
        private boolean f90443d;

        static {
            Covode.recordClassIndex(45751);
        }

        /* renamed from: a */
        public final C38266b mo66850a() {
            long j = this.f90440a;
            int i = this.f90441b;
            Runnable runnable = this.f90442c;
            if (runnable == null) {
                C89219l.m154710a("callback");
            }
            return new C38266b(j, i, runnable, this.f90443d, (byte) 0);
        }

        /* renamed from: a */
        public final C38267a mo66846a(int i) {
            this.f90441b = i;
            return this;
        }

        /* renamed from: a */
        public final C38267a mo66849a(boolean z) {
            this.f90443d = z;
            return this;
        }

        /* renamed from: a */
        public final C38267a mo66848a(Runnable runnable) {
            C89219l.m154721d(runnable, "");
            this.f90442c = runnable;
            return this;
        }

        /* renamed from: a */
        public final C38267a mo66847a(long j) {
            if (j > 0) {
                if (j <= 0) {
                    j = 1;
                }
                this.f90440a = j;
                return this;
            }
            throw new IllegalArgumentException("Invalid video duration ".concat(String.valueOf(j)));
        }
    }

    private C38266b(long j, int i, Runnable runnable, boolean z) {
        this.f90436c = j;
        this.f90437d = i;
        this.f90438e = runnable;
        this.f90439f = z;
        this.f90434a = (int) (((long) i) / j);
        this.f90435b = (int) (((long) i) % j);
    }

    public /* synthetic */ C38266b(long j, int i, Runnable runnable, boolean z, byte b) {
        this(j, i, runnable, z);
    }
}
