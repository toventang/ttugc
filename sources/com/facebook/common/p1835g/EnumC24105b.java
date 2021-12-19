package com.facebook.common.p1835g;

import com.bytedance.covode.number.Covode;

/* renamed from: com.facebook.common.g.b */
public enum EnumC24105b {
    OnCloseToDalvikHeapLimit(0.5d),
    OnSystemMemoryCriticallyLowWhileAppInForeground(1.0d),
    OnSystemLowMemoryWhileAppInForeground(0.5d),
    OnSystemLowMemoryWhileAppInBackground(1.0d),
    OnAppBackgrounded(1.0d);
    

    /* renamed from: a */
    private double f57034a;

    public final double getSuggestedTrimRatio() {
        return this.f57034a;
    }

    static {
        Covode.recordClassIndex(28233);
    }

    private EnumC24105b(double d) {
        this.f57034a = d;
    }
}
