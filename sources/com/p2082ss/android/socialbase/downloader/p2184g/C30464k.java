package com.p2082ss.android.socialbase.downloader.p2184g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.ss.android.socialbase.downloader.g.k */
public class C30464k {

    /* renamed from: a */
    private static final String f72609a = C30464k.class.getSimpleName();

    /* renamed from: b */
    private final C30457d f72610b;

    /* renamed from: c */
    private volatile boolean f72611c;

    /* renamed from: d */
    private final AtomicReference<EnumC30467l> f72612d;

    /* renamed from: e */
    private AtomicReference<EnumC30467l> f72613e;

    /* renamed from: f */
    private final ArrayList<Object> f72614f;

    /* renamed from: g */
    private int f72615g;

    /* renamed from: com.ss.android.socialbase.downloader.g.k$a */
    public static class C30466a {

        /* renamed from: a */
        public static final C30464k f72617a = new C30464k((byte) 0);

        static {
            Covode.recordClassIndex(36993);
        }
    }

    static {
        Covode.recordClassIndex(36991);
    }

    private C30464k() {
        this.f72610b = new C30457d();
        this.f72611c = false;
        this.f72612d = new AtomicReference<>(EnumC30467l.UNKNOWN);
        this.f72614f = new ArrayList<>();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.socialbase.downloader.g.k$1 */
    public static /* synthetic */ class C304651 {

        /* renamed from: a */
        static final /* synthetic */ int[] f72616a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        static {
            /*
                r0 = 36992(0x9080, float:5.1837E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.socialbase.downloader.g.l[] r0 = com.p2082ss.android.socialbase.downloader.p2184g.EnumC30467l.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.p2082ss.android.socialbase.downloader.p2184g.C30464k.C304651.f72616a = r2
                com.ss.android.socialbase.downloader.g.l r0 = com.p2082ss.android.socialbase.downloader.p2184g.EnumC30467l.POOR     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.p2082ss.android.socialbase.downloader.p2184g.C30464k.C304651.f72616a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.android.socialbase.downloader.g.l r0 = com.p2082ss.android.socialbase.downloader.p2184g.EnumC30467l.MODERATE     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.p2082ss.android.socialbase.downloader.p2184g.C30464k.C304651.f72616a     // Catch:{ NoSuchFieldError -> 0x002e }
                com.ss.android.socialbase.downloader.g.l r0 = com.p2082ss.android.socialbase.downloader.p2184g.EnumC30467l.GOOD     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.p2082ss.android.socialbase.downloader.p2184g.C30464k.C304651.f72616a     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.ss.android.socialbase.downloader.g.l r0 = com.p2082ss.android.socialbase.downloader.p2184g.EnumC30467l.EXCELLENT     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.socialbase.downloader.p2184g.C30464k.C304651.<clinit>():void");
        }
    }

    /* renamed from: b */
    private boolean m62073b() {
        if (this.f72610b == null) {
            return false;
        }
        try {
            int i = C304651.f72616a[this.f72612d.get().ordinal()];
            double d = 2000.0d;
            double d2 = 550.0d;
            if (i == 1) {
                d2 = 0.0d;
                d = 150.0d;
            } else if (i == 2) {
                d = 550.0d;
                d2 = 150.0d;
            } else if (i != 3) {
                if (i != 4) {
                    return true;
                }
                d = 3.4028234663852886E38d;
                d2 = 2000.0d;
            }
            double d3 = this.f72610b.f72607c;
            if (d3 > d) {
                if (d3 > d * 1.25d) {
                    return true;
                }
            } else if (d3 < d2 * 0.8d) {
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: a */
    public final synchronized EnumC30467l mo54251a() {
        MethodCollector.m26663i(6866);
        C30457d dVar = this.f72610b;
        if (dVar == null) {
            EnumC30467l lVar = EnumC30467l.UNKNOWN;
            MethodCollector.m26664o(6866);
            return lVar;
        }
        try {
            double d = dVar.f72607c;
            if (d < 0.0d) {
                EnumC30467l lVar2 = EnumC30467l.UNKNOWN;
                MethodCollector.m26664o(6866);
                return lVar2;
            } else if (d < 150.0d) {
                EnumC30467l lVar3 = EnumC30467l.POOR;
                MethodCollector.m26664o(6866);
                return lVar3;
            } else if (d < 550.0d) {
                EnumC30467l lVar4 = EnumC30467l.MODERATE;
                MethodCollector.m26664o(6866);
                return lVar4;
            } else if (d < 2000.0d) {
                EnumC30467l lVar5 = EnumC30467l.GOOD;
                MethodCollector.m26664o(6866);
                return lVar5;
            } else {
                EnumC30467l lVar6 = EnumC30467l.EXCELLENT;
                MethodCollector.m26664o(6866);
                return lVar6;
            }
        } catch (Throwable unused) {
            EnumC30467l lVar7 = EnumC30467l.UNKNOWN;
            MethodCollector.m26664o(6866);
            return lVar7;
        }
    }

    /* synthetic */ C30464k(byte b) {
        this();
    }

    /* renamed from: a */
    public final synchronized void mo54252a(long j, long j2) {
        MethodCollector.m26663i(6721);
        double d = (double) j;
        Double.isNaN(d);
        double d2 = (double) j2;
        Double.isNaN(d2);
        double d3 = ((d * 1.0d) / d2) * 8.0d;
        if (j2 == 0 || d3 < 3.0d) {
            MethodCollector.m26664o(6721);
            return;
        }
        try {
            C30457d dVar = this.f72610b;
            double d4 = 1.0d - dVar.f72605a;
            if (dVar.f72608d > dVar.f72606b) {
                dVar.f72607c = Math.exp((d4 * Math.log(dVar.f72607c)) + (dVar.f72605a * Math.log(d3)));
            } else if (dVar.f72608d > 0) {
                double d5 = (double) dVar.f72608d;
                Double.isNaN(d5);
                double d6 = d4 * d5;
                double d7 = (double) dVar.f72608d;
                Double.isNaN(d7);
                double d8 = d6 / (d7 + 1.0d);
                dVar.f72607c = Math.exp((d8 * Math.log(dVar.f72607c)) + ((1.0d - d8) * Math.log(d3)));
            } else {
                dVar.f72607c = d3;
            }
            dVar.f72608d++;
            EnumC30467l a = mo54251a();
            if (this.f72611c) {
                this.f72615g++;
                if (a != this.f72613e.get()) {
                    this.f72611c = false;
                    this.f72615g = 1;
                }
                if (((double) this.f72615g) >= 5.0d && m62073b()) {
                    this.f72611c = false;
                    this.f72615g = 1;
                    this.f72612d.set(this.f72613e.get());
                    try {
                        int size = this.f72614f.size();
                        for (int i = 0; i < size; i++) {
                            this.f72614f.get(i);
                            this.f72612d.get();
                        }
                        MethodCollector.m26664o(6721);
                        return;
                    } catch (Throwable unused) {
                    }
                }
                MethodCollector.m26664o(6721);
                return;
            }
            if (this.f72612d.get() != a) {
                this.f72611c = true;
                this.f72613e = new AtomicReference<>(a);
            }
            MethodCollector.m26664o(6721);
        } catch (Throwable unused2) {
            MethodCollector.m26664o(6721);
        }
    }
}
