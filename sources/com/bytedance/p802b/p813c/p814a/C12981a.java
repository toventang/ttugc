package com.bytedance.p802b.p813c.p814a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.b.c.a.a */
public final class C12981a {

    /* renamed from: a */
    public EnumC12982a f31608a;

    /* renamed from: b */
    public double f31609b;

    /* renamed from: c */
    public double f31610c;

    /* renamed from: d */
    public double f31611d;

    /* renamed from: e */
    public double f31612e;

    /* renamed from: f */
    public String f31613f;

    /* renamed from: g */
    public long f31614g;

    /* renamed from: h */
    public int f31615h;

    static {
        Covode.recordClassIndex(14817);
    }

    /* renamed from: com.bytedance.b.c.a.a$a */
    public enum EnumC12982a {
        MIX,
        FRONT,
        BACK;

        static {
            Covode.recordClassIndex(14818);
        }
    }

    public final String toString() {
        return "CpuCacheItem{type=" + this.f31608a + ", metricRate=" + this.f31609b + ", metricMaxRate=" + this.f31610c + ", metricCpuStats=" + this.f31611d + ", metricMaxCpuStats=" + this.f31612e + ", sceneString='" + this.f31613f + '\'' + ", firstTs=" + this.f31614g + ", times=" + this.f31615h + '}';
    }

    public C12981a(EnumC12982a aVar, long j) {
        this.f31608a = aVar;
        this.f31614g = j;
    }
}
