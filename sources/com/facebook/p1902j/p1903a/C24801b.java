package com.facebook.p1902j.p1903a;

import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.j.a.b */
public final class C24801b {

    /* renamed from: a */
    private C24807e f58844a;

    /* renamed from: b */
    private volatile boolean f58845b;

    /* renamed from: c */
    private AtomicReference<EnumC24803c> f58846c;

    /* renamed from: d */
    private AtomicReference<EnumC24803c> f58847d;

    /* renamed from: e */
    private ArrayList<Object> f58848e;

    /* renamed from: f */
    private int f58849f;

    static {
        Covode.recordClassIndex(28954);
    }

    /* renamed from: com.facebook.j.a.b$a */
    public static class C24802a {

        /* renamed from: a */
        public static final C24801b f58850a = new C24801b((byte) 0);

        static {
            Covode.recordClassIndex(28955);
        }
    }

    private C24801b() {
        this.f58844a = new C24807e();
        this.f58845b = false;
        this.f58846c = new AtomicReference<>(EnumC24803c.UNKNOWN);
        this.f58848e = new ArrayList<>();
    }

    /* renamed from: b */
    public final synchronized double mo40616b() {
        MethodCollector.m26663i(LiveFeedRefreshTimeSetting.DEFAULT);
        C24807e eVar = this.f58844a;
        if (eVar == null) {
            MethodCollector.m26664o(LiveFeedRefreshTimeSetting.DEFAULT);
            return -1.0d;
        }
        double d = eVar.f58861c;
        MethodCollector.m26664o(LiveFeedRefreshTimeSetting.DEFAULT);
        return d;
    }

    /* renamed from: a */
    public final synchronized EnumC24803c mo40614a() {
        MethodCollector.m26663i(173);
        C24807e eVar = this.f58844a;
        if (eVar == null) {
            EnumC24803c cVar = EnumC24803c.UNKNOWN;
            MethodCollector.m26664o(173);
            return cVar;
        }
        double d = eVar.f58861c;
        if (d < 0.0d) {
            EnumC24803c cVar2 = EnumC24803c.UNKNOWN;
            MethodCollector.m26664o(173);
            return cVar2;
        } else if (d < 150.0d) {
            EnumC24803c cVar3 = EnumC24803c.POOR;
            MethodCollector.m26664o(173);
            return cVar3;
        } else if (d < 550.0d) {
            EnumC24803c cVar4 = EnumC24803c.MODERATE;
            MethodCollector.m26664o(173);
            return cVar4;
        } else if (d < 2000.0d) {
            EnumC24803c cVar5 = EnumC24803c.GOOD;
            MethodCollector.m26664o(173);
            return cVar5;
        } else {
            EnumC24803c cVar6 = EnumC24803c.EXCELLENT;
            MethodCollector.m26664o(173);
            return cVar6;
        }
    }

    /* synthetic */ C24801b(byte b) {
        this();
    }

    /* renamed from: a */
    public final synchronized void mo40615a(long j, long j2) {
        MethodCollector.m26663i(169);
        if (j2 != 0) {
            double d = (double) j;
            Double.isNaN(d);
            double d2 = (double) j2;
            Double.isNaN(d2);
            double d3 = ((d * 1.0d) / d2) * 8.0d;
            if (d3 >= 10.0d) {
                C24807e eVar = this.f58844a;
                double d4 = 1.0d - eVar.f58859a;
                if (eVar.f58862d > eVar.f58860b) {
                    eVar.f58861c = Math.exp((d4 * Math.log(eVar.f58861c)) + (eVar.f58859a * Math.log(d3)));
                } else if (eVar.f58862d > 0) {
                    double d5 = (double) eVar.f58862d;
                    Double.isNaN(d5);
                    double d6 = d4 * d5;
                    double d7 = (double) eVar.f58862d;
                    Double.isNaN(d7);
                    double d8 = d6 / (d7 + 1.0d);
                    eVar.f58861c = Math.exp((d8 * Math.log(eVar.f58861c)) + ((1.0d - d8) * Math.log(d3)));
                } else {
                    eVar.f58861c = d3;
                }
                eVar.f58862d++;
                if (this.f58845b) {
                    this.f58849f++;
                    if (mo40614a() != this.f58847d.get()) {
                        this.f58845b = false;
                        this.f58849f = 1;
                    }
                    if (((double) this.f58849f) >= 5.0d) {
                        this.f58845b = false;
                        this.f58849f = 1;
                        this.f58846c.set(this.f58847d.get());
                        int size = this.f58848e.size();
                        for (int i = 0; i < size; i++) {
                            this.f58848e.get(i);
                            this.f58846c.get();
                        }
                    }
                    MethodCollector.m26664o(169);
                    return;
                }
                if (this.f58846c.get() != mo40614a()) {
                    this.f58845b = true;
                    this.f58847d = new AtomicReference<>(mo40614a());
                }
                MethodCollector.m26664o(169);
                return;
            }
        }
        MethodCollector.m26664o(169);
    }
}
