package com.toutiao.proxyserver.p4494f;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.toutiao.proxyserver.f.a */
public final class C87314a {

    /* renamed from: a */
    private C87322e f197908a;

    /* renamed from: b */
    private volatile boolean f197909b;

    /* renamed from: c */
    private AtomicReference<EnumC87317b> f197910c;

    /* renamed from: d */
    private AtomicReference<EnumC87317b> f197911d;

    /* renamed from: e */
    private ArrayList<Object> f197912e;

    /* renamed from: f */
    private int f197913f;

    static {
        Covode.recordClassIndex(103210);
    }

    /* renamed from: com.toutiao.proxyserver.f.a$a */
    static class C87316a {

        /* renamed from: a */
        public static final C87314a f197915a = new C87314a((byte) 0);

        static {
            Covode.recordClassIndex(103212);
        }
    }

    private C87314a() {
        this.f197908a = new C87322e();
        this.f197909b = false;
        this.f197910c = new AtomicReference<>(EnumC87317b.UNKNOWN);
        this.f197912e = new ArrayList<>();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.toutiao.proxyserver.f.a$1 */
    public static /* synthetic */ class C873151 {

        /* renamed from: a */
        static final /* synthetic */ int[] f197914a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        static {
            /*
                r0 = 103211(0x1932b, float:1.4463E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.toutiao.proxyserver.f.b[] r0 = com.toutiao.proxyserver.p4494f.EnumC87317b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.toutiao.proxyserver.p4494f.C87314a.C873151.f197914a = r2
                com.toutiao.proxyserver.f.b r0 = com.toutiao.proxyserver.p4494f.EnumC87317b.POOR     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.toutiao.proxyserver.p4494f.C87314a.C873151.f197914a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.toutiao.proxyserver.f.b r0 = com.toutiao.proxyserver.p4494f.EnumC87317b.MODERATE     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.toutiao.proxyserver.p4494f.C87314a.C873151.f197914a     // Catch:{ NoSuchFieldError -> 0x002e }
                com.toutiao.proxyserver.f.b r0 = com.toutiao.proxyserver.p4494f.EnumC87317b.GOOD     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.toutiao.proxyserver.p4494f.C87314a.C873151.f197914a     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.toutiao.proxyserver.f.b r0 = com.toutiao.proxyserver.p4494f.EnumC87317b.EXCELLENT     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.p4494f.C87314a.C873151.<clinit>():void");
        }
    }

    /* renamed from: a */
    private synchronized EnumC87317b m151527a() {
        MethodCollector.m26663i(12160);
        C87322e eVar = this.f197908a;
        if (eVar == null) {
            EnumC87317b bVar = EnumC87317b.UNKNOWN;
            MethodCollector.m26664o(12160);
            return bVar;
        }
        double d = eVar.f197931c;
        if (d < 0.0d) {
            EnumC87317b bVar2 = EnumC87317b.UNKNOWN;
            MethodCollector.m26664o(12160);
            return bVar2;
        } else if (d < 150.0d) {
            EnumC87317b bVar3 = EnumC87317b.POOR;
            MethodCollector.m26664o(12160);
            return bVar3;
        } else if (d < 550.0d) {
            EnumC87317b bVar4 = EnumC87317b.MODERATE;
            MethodCollector.m26664o(12160);
            return bVar4;
        } else if (d < 2000.0d) {
            EnumC87317b bVar5 = EnumC87317b.GOOD;
            MethodCollector.m26664o(12160);
            return bVar5;
        } else {
            EnumC87317b bVar6 = EnumC87317b.EXCELLENT;
            MethodCollector.m26664o(12160);
            return bVar6;
        }
    }

    /* synthetic */ C87314a(byte b) {
        this();
    }

    /* renamed from: a */
    public final synchronized void mo141348a(long j, long j2) {
        MethodCollector.m26663i(12159);
        if (j2 != 0) {
            double d = (double) j;
            Double.isNaN(d);
            double d2 = (double) j2;
            Double.isNaN(d2);
            double d3 = ((d * 1.0d) / d2) * 8.0d;
            if (d3 >= 10.0d) {
                C87322e eVar = this.f197908a;
                double d4 = 1.0d - eVar.f197929a;
                if (eVar.f197932d > eVar.f197930b) {
                    eVar.f197931c = Math.exp((d4 * Math.log(eVar.f197931c)) + (eVar.f197929a * Math.log(d3)));
                } else if (eVar.f197932d > 0) {
                    double d5 = (double) eVar.f197932d;
                    Double.isNaN(d5);
                    double d6 = d4 * d5;
                    double d7 = (double) eVar.f197932d;
                    Double.isNaN(d7);
                    double d8 = d6 / (d7 + 1.0d);
                    eVar.f197931c = Math.exp((d8 * Math.log(eVar.f197931c)) + ((1.0d - d8) * Math.log(d3)));
                } else {
                    eVar.f197931c = d3;
                }
                eVar.f197932d++;
                if (this.f197909b) {
                    this.f197913f++;
                    if (m151527a() != this.f197911d.get()) {
                        this.f197909b = false;
                        this.f197913f = 1;
                    }
                    if (((double) this.f197913f) >= 5.0d && this.f197908a != null) {
                        int i = C873151.f197914a[this.f197910c.get().ordinal()];
                        double d9 = 2000.0d;
                        double d10 = 550.0d;
                        if (i == 1) {
                            d10 = 0.0d;
                            d9 = 150.0d;
                        } else if (i == 2) {
                            d9 = 550.0d;
                            d10 = 150.0d;
                        } else if (i != 3) {
                            if (i == 4) {
                                d9 = 3.4028234663852886E38d;
                                d10 = 2000.0d;
                            }
                            this.f197909b = false;
                            this.f197913f = 1;
                            this.f197910c.set(this.f197911d.get());
                            int size = this.f197912e.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                this.f197912e.get(i2);
                                this.f197910c.get();
                            }
                        }
                        double d11 = this.f197908a.f197931c;
                        if (d11 <= d9) {
                        }
                    }
                    MethodCollector.m26664o(12159);
                    return;
                }
                if (this.f197910c.get() != m151527a()) {
                    this.f197909b = true;
                    this.f197911d = new AtomicReference<>(m151527a());
                }
                MethodCollector.m26664o(12159);
                return;
            }
        }
        MethodCollector.m26664o(12159);
    }
}
