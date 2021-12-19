package com.bytedance.frameworks.baselib.network.p979a;

import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.bytedance.frameworks.baselib.network.a.c */
public class C14588c {

    /* renamed from: a */
    public AtomicReference<EnumC14591d> f35262a = new AtomicReference<>(EnumC14591d.UNKNOWN);

    /* renamed from: b */
    public ArrayList<AbstractC14590b> f35263b = new ArrayList<>();

    /* renamed from: c */
    private C14595f f35264c = new C14595f();

    /* renamed from: d */
    private volatile boolean f35265d = false;

    /* renamed from: e */
    private AtomicReference<EnumC14591d> f35266e;

    /* renamed from: f */
    private int f35267f;

    /* renamed from: com.bytedance.frameworks.baselib.network.a.c$b */
    public interface AbstractC14590b {
        static {
            Covode.recordClassIndex(16681);
        }

        /* renamed from: a */
        void mo23465a();
    }

    static {
        Covode.recordClassIndex(16679);
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.a.c$a */
    public static class C14589a {

        /* renamed from: a */
        public static final C14588c f35268a = new C14588c();

        static {
            Covode.recordClassIndex(16680);
        }
    }

    protected C14588c() {
    }

    /* renamed from: b */
    public final synchronized double mo23464b() {
        MethodCollector.m26663i(10031);
        C14595f fVar = this.f35264c;
        if (fVar == null) {
            MethodCollector.m26664o(10031);
            return -1.0d;
        }
        double d = fVar.f35281c;
        MethodCollector.m26664o(10031);
        return d;
    }

    /* renamed from: c */
    private boolean m26667c() {
        if (this.f35264c == null) {
            return false;
        }
        try {
            EnumC14591d dVar = this.f35262a.get();
            double d = 560.0d;
            double d2 = 112.0d;
            if (EnumC14591d.POOR == dVar) {
                d2 = 0.0d;
                d = 28.0d;
            } else if (EnumC14591d.MODERATE == dVar) {
                d = 112.0d;
                d2 = 28.0d;
            } else if (EnumC14591d.GOOD != dVar) {
                if (EnumC14591d.EXCELLENT == dVar) {
                    d = 3.4028234663852886E38d;
                    d2 = 560.0d;
                }
                return true;
            }
            double d3 = this.f35264c.f35281c;
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
    public final synchronized EnumC14591d mo23462a() {
        MethodCollector.m26663i(10030);
        C14595f fVar = this.f35264c;
        if (fVar == null) {
            EnumC14591d dVar = EnumC14591d.UNKNOWN;
            MethodCollector.m26664o(10030);
            return dVar;
        }
        try {
            double d = fVar.f35281c;
            if (d < 0.0d) {
                EnumC14591d dVar2 = EnumC14591d.UNKNOWN;
                MethodCollector.m26664o(10030);
                return dVar2;
            } else if (d < 28.0d) {
                EnumC14591d dVar3 = EnumC14591d.POOR;
                MethodCollector.m26664o(10030);
                return dVar3;
            } else if (d < 112.0d) {
                EnumC14591d dVar4 = EnumC14591d.MODERATE;
                MethodCollector.m26664o(10030);
                return dVar4;
            } else if (d < 560.0d) {
                EnumC14591d dVar5 = EnumC14591d.GOOD;
                MethodCollector.m26664o(10030);
                return dVar5;
            } else {
                EnumC14591d dVar6 = EnumC14591d.EXCELLENT;
                MethodCollector.m26664o(10030);
                return dVar6;
            }
        } catch (Throwable unused) {
            EnumC14591d dVar7 = EnumC14591d.UNKNOWN;
            MethodCollector.m26664o(10030);
            return dVar7;
        }
    }

    /* renamed from: a */
    public final synchronized void mo23463a(long j, long j2) {
        MethodCollector.m26663i(9874);
        double d = (double) j;
        Double.isNaN(d);
        double d2 = (double) j2;
        Double.isNaN(d2);
        double d3 = ((d * 1.0d) / d2) * 8.0d;
        if (j2 == 0 || d3 < 3.0d) {
            MethodCollector.m26664o(9874);
            return;
        }
        try {
            Logger.debug();
            C14595f fVar = this.f35264c;
            double d4 = 1.0d - fVar.f35279a;
            if (fVar.f35282d > fVar.f35280b) {
                fVar.f35281c = Math.exp((d4 * Math.log(fVar.f35281c)) + (fVar.f35279a * Math.log(d3)));
            } else if (fVar.f35282d > 0) {
                double d5 = (double) fVar.f35282d;
                Double.isNaN(d5);
                double d6 = d4 * d5;
                double d7 = (double) fVar.f35282d;
                Double.isNaN(d7);
                double d8 = d6 / (d7 + 1.0d);
                fVar.f35281c = Math.exp((d8 * Math.log(fVar.f35281c)) + ((1.0d - d8) * Math.log(d3)));
            } else {
                fVar.f35281c = d3;
            }
            fVar.f35282d++;
            if (this.f35265d) {
                this.f35267f++;
                if (mo23462a() != this.f35266e.get()) {
                    this.f35265d = false;
                    this.f35267f = 1;
                }
                if (((double) this.f35267f) >= 5.0d && m26667c()) {
                    this.f35265d = false;
                    this.f35267f = 1;
                    this.f35262a.set(this.f35266e.get());
                    try {
                        int size = this.f35263b.size();
                        for (int i = 0; i < size; i++) {
                            this.f35262a.get();
                            this.f35263b.get(i).mo23465a();
                        }
                        MethodCollector.m26664o(9874);
                        return;
                    } catch (Throwable unused) {
                    }
                }
                MethodCollector.m26664o(9874);
                return;
            }
            if (this.f35262a.get() != mo23462a()) {
                this.f35265d = true;
                this.f35266e = new AtomicReference<>(mo23462a());
            }
            MethodCollector.m26664o(9874);
        } catch (Throwable unused2) {
            MethodCollector.m26664o(9874);
        }
    }
}
