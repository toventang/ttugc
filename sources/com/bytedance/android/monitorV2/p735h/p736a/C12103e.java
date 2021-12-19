package com.bytedance.android.monitorV2.p735h.p736a;

import com.C1764a;
import com.bytedance.android.monitorV2.p737i.C12115b;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.monitorV2.h.a.e */
public final class C12103e {

    /* renamed from: a */
    public boolean f29101a = true;

    /* renamed from: b */
    public boolean f29102b = true;

    /* renamed from: c */
    public boolean f29103c = true;

    /* renamed from: d */
    public boolean f29104d = true;

    /* renamed from: e */
    public boolean f29105e = true;

    /* renamed from: f */
    public boolean f29106f = true;

    /* renamed from: g */
    public boolean f29107g = true;

    /* renamed from: h */
    public boolean f29108h = true;

    /* renamed from: i */
    public boolean f29109i = true;

    /* renamed from: j */
    public boolean f29110j = true;

    /* renamed from: k */
    public boolean f29111k = true;

    /* renamed from: l */
    public boolean f29112l = true;

    /* renamed from: m */
    public boolean f29113m = true;

    static {
        Covode.recordClassIndex(13832);
    }

    /* renamed from: a */
    public final boolean mo19467a() {
        C12115b.m21584c("HybridMonitor", C1764a.m5928a("switch enableMonitor: %b", new Object[]{Boolean.valueOf(this.f29101a)}));
        return this.f29101a;
    }

    /* renamed from: b */
    public final boolean mo19468b() {
        C12115b.m21584c("HybridMonitor", C1764a.m5928a("switch webEnableMonitor: %b", new Object[]{Boolean.valueOf(this.f29102b)}));
        return this.f29102b;
    }

    /* renamed from: c */
    public final boolean mo19469c() {
        C12115b.m21584c("HybridMonitor", C1764a.m5928a("switch webEnableBlank: %b", new Object[]{Boolean.valueOf(this.f29103c)}));
        return this.f29103c;
    }

    /* renamed from: d */
    public final boolean mo19470d() {
        C12115b.m21584c("HybridMonitor", C1764a.m5928a("switch webEnableJSB: %b", new Object[]{Boolean.valueOf(this.f29105e)}));
        return this.f29105e;
    }

    /* renamed from: e */
    public final boolean mo19471e() {
        C12115b.m21584c("HybridMonitor", C1764a.m5928a("switch webEnableInject: %b", new Object[]{Boolean.valueOf(this.f29106f)}));
        return this.f29106f;
    }

    /* renamed from: f */
    public final boolean mo19472f() {
        C12115b.m21584c("HybridMonitor", C1764a.m5928a("switch lynxEnableMonitor: %b", new Object[]{Boolean.valueOf(this.f29107g)}));
        return this.f29107g;
    }

    /* renamed from: g */
    public final boolean mo19473g() {
        C12115b.m21584c("HybridMonitor", C1764a.m5928a("switch ynxEnablePerf: %b", new Object[]{Boolean.valueOf(this.f29108h)}));
        return this.f29108h;
    }

    /* renamed from: h */
    public final boolean mo19474h() {
        C12115b.m21584c("HybridMonitor", C1764a.m5928a("switch lynxEnableBlank: %b", new Object[]{Boolean.valueOf(this.f29109i)}));
        return this.f29109i;
    }

    /* renamed from: i */
    public final boolean mo19475i() {
        C12115b.m21584c("HybridMonitor", C1764a.m5928a("switch lynxEnableJsb: %b", new Object[]{Boolean.valueOf(this.f29111k)}));
        return this.f29111k;
    }

    /* renamed from: j */
    public final boolean mo19476j() {
        C12115b.m21584c("HybridMonitor", C1764a.m5928a("switch ebEnableUpdatePageData: %b", new Object[]{Boolean.valueOf(this.f29113m)}));
        return this.f29113m;
    }

    public final String toString() {
        return "SwitchConfig{enableMonitor=" + this.f29101a + ", webEnableMonitor=" + this.f29102b + ", webEnableBlank=" + this.f29103c + ", webEnableFetch=" + this.f29104d + ", webEnableJSB=" + this.f29105e + ", webEnableInject=" + this.f29106f + "\n, lynxEnableMonitor=" + this.f29107g + ", lynxEnablePerf=" + this.f29108h + ", lynxEnableBlank=" + this.f29109i + ", lynxEnableFetch=" + this.f29110j + ", lynxEnableJsb=" + this.f29111k + "\n, webEnableAutoReport=" + this.f29112l + ", webEnableUpdatePageData=" + this.f29113m + '}';
    }
}
