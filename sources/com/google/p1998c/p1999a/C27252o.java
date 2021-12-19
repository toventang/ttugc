package com.google.p1998c.p1999a;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.c.a.o */
public final class C27252o {

    /* renamed from: a */
    public boolean f64413a;

    /* renamed from: b */
    private final AbstractC27259t f64414b;

    /* renamed from: c */
    private long f64415c;

    /* renamed from: d */
    private long f64416d;

    static {
        Covode.recordClassIndex(32832);
    }

    public C27252o() {
        this.f64414b = AbstractC27259t.f64422a;
    }

    /* renamed from: d */
    public final C27252o mo45342d() {
        this.f64415c = 0;
        this.f64413a = false;
        return this;
    }

    /* renamed from: a */
    public static C27252o m54253a() {
        return new C27252o().mo45340b();
    }

    /* renamed from: e */
    private long m54256e() {
        if (this.f64413a) {
            return (this.f64414b.mo45347a() - this.f64416d) + this.f64415c;
        }
        return this.f64415c;
    }

    /* renamed from: b */
    public final C27252o mo45340b() {
        C27245k.m54244b(!this.f64413a, "This stopwatch is already running.");
        this.f64413a = true;
        this.f64416d = this.f64414b.mo45347a();
        return this;
    }

    /* renamed from: c */
    public final C27252o mo45341c() {
        long a = this.f64414b.mo45347a();
        C27245k.m54244b(this.f64413a, "This stopwatch is already stopped.");
        this.f64413a = false;
        this.f64415c += a - this.f64416d;
        return this;
    }

    /* renamed from: com.google.c.a.o$1 */
    static /* synthetic */ class C272531 {

        /* renamed from: a */
        static final /* synthetic */ int[] f64417a;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
                r0 = 32833(0x8041, float:4.6009E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                java.util.concurrent.TimeUnit[] r0 = java.util.concurrent.TimeUnit.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.google.p1998c.p1999a.C27252o.C272531.f64417a = r2
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.google.p1998c.p1999a.C27252o.C272531.f64417a     // Catch:{ NoSuchFieldError -> 0x0023 }
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.google.p1998c.p1999a.C27252o.C272531.f64417a     // Catch:{ NoSuchFieldError -> 0x002e }
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.google.p1998c.p1999a.C27252o.C272531.f64417a     // Catch:{ NoSuchFieldError -> 0x0039 }
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r2 = com.google.p1998c.p1999a.C27252o.C272531.f64417a     // Catch:{ NoSuchFieldError -> 0x0044 }
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MINUTES     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r2 = com.google.p1998c.p1999a.C27252o.C272531.f64417a     // Catch:{ NoSuchFieldError -> 0x004f }
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.HOURS     // Catch:{ NoSuchFieldError -> 0x004f }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r0 = 6
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r2 = com.google.p1998c.p1999a.C27252o.C272531.f64417a     // Catch:{ NoSuchFieldError -> 0x005a }
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r0 = 7
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.p1998c.p1999a.C27252o.C272531.<clinit>():void");
        }
    }

    public final String toString() {
        TimeUnit timeUnit;
        String str;
        long e = m54256e();
        if (TimeUnit.DAYS.convert(e, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.DAYS;
        } else if (TimeUnit.HOURS.convert(e, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.HOURS;
        } else if (TimeUnit.MINUTES.convert(e, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MINUTES;
        } else if (TimeUnit.SECONDS.convert(e, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.SECONDS;
        } else if (TimeUnit.MILLISECONDS.convert(e, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        } else if (TimeUnit.MICROSECONDS.convert(e, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MICROSECONDS;
        } else {
            timeUnit = TimeUnit.NANOSECONDS;
        }
        double d = (double) e;
        double convert = (double) TimeUnit.NANOSECONDS.convert(1, timeUnit);
        Double.isNaN(d);
        Double.isNaN(convert);
        StringBuilder append = new StringBuilder().append(C1764a.m5929a(Locale.ROOT, "%.4g", new Object[]{Double.valueOf(d / convert)})).append(" ");
        switch (C272531.f64417a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                str = "min";
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                str = "h";
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        return append.append(str).toString();
    }

    /* renamed from: a */
    public static C27252o m54254a(AbstractC27259t tVar) {
        return new C27252o(tVar);
    }

    private C27252o(AbstractC27259t tVar) {
        this.f64414b = (AbstractC27259t) C27245k.m54230a(tVar, "ticker");
    }

    /* renamed from: b */
    public static C27252o m54255b(AbstractC27259t tVar) {
        return new C27252o(tVar).mo45340b();
    }

    /* renamed from: a */
    public final long mo45339a(TimeUnit timeUnit) {
        return timeUnit.convert(m54256e(), TimeUnit.NANOSECONDS);
    }
}
