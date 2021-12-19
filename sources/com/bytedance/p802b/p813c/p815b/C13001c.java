package com.bytedance.p802b.p813c.p815b;

import com.bytedance.covode.number.Covode;
import java.util.Map;

/* renamed from: com.bytedance.b.c.b.c */
public final class C13001c {

    /* renamed from: a */
    public boolean f31670a;

    /* renamed from: b */
    public boolean f31671b;

    /* renamed from: c */
    public double f31672c = 3.0d;

    /* renamed from: d */
    public double f31673d = 6.0d;

    /* renamed from: e */
    public double f31674e = 0.05d;

    /* renamed from: f */
    public boolean f31675f;

    /* renamed from: g */
    public Map<String, Double> f31676g;

    /* renamed from: h */
    public Map<String, Double> f31677h;

    static {
        Covode.recordClassIndex(14837);
    }

    public final String toString() {
        return "CpuExceptionConfig{isOpen=" + this.f31670a + ", isCollectMainThread=" + this.f31671b + ", maxProcessBackCpuSpeed=" + this.f31672c + ", maxProcessForeCpuSpeed=" + this.f31673d + ", maxThreadCpuRate=" + this.f31674e + ", isCollectAllProcess=" + this.f31675f + ", backSceneMaxSpeedMap=" + this.f31676g + ", foreSceneMaxSpeedMap=" + this.f31677h + '}';
    }
}
