package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.ay */
public final class C26791ay {

    /* renamed from: a */
    private final Map<String, Double> f63531a = new HashMap();

    static {
        Covode.recordClassIndex(32266);
    }

    C26791ay() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized double mo44490a(String str, C26808bo boVar) {
        double d;
        MethodCollector.m26663i(12274);
        double d2 = (double) ((C26784ar) boVar).f63490e;
        Double.isNaN(d2);
        double d3 = (double) ((C26784ar) boVar).f63491f;
        Double.isNaN(d3);
        d = (d2 + 1.0d) / d3;
        this.f63531a.put(str, Double.valueOf(d));
        MethodCollector.m26664o(12274);
        return d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo44491a(String str) {
        MethodCollector.m26663i(12272);
        this.f63531a.put(str, Double.valueOf(0.0d));
        MethodCollector.m26664o(12272);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized double mo44492b(String str) {
        MethodCollector.m26663i(12273);
        Double d = this.f63531a.get(str);
        if (d == null) {
            MethodCollector.m26664o(12273);
            return 0.0d;
        }
        double doubleValue = d.doubleValue();
        MethodCollector.m26664o(12273);
        return doubleValue;
    }
}
