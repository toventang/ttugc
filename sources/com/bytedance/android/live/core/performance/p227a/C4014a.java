package com.bytedance.android.live.core.performance.p227a;

import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.performance.C4013a;
import com.bytedance.android.livesdk.livesetting.performance.LiveMtEnableInstantCpuRateSetting;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.core.performance.a.a */
public final class C4014a {

    /* renamed from: a */
    long f10995a = 1000;

    /* renamed from: b */
    long f10996b = 300;

    /* renamed from: c */
    long f10997c = 60;

    /* renamed from: d */
    public int f10998d = LiveMtEnableInstantCpuRateSetting.INSTANCE.getValue();

    /* renamed from: e */
    public double f10999e = -1.0d;

    /* renamed from: f */
    public long f11000f = -1;

    /* renamed from: g */
    public long f11001g = -1;

    /* renamed from: h */
    public long f11002h = -1;

    /* renamed from: i */
    public double f11003i = -1.0d;

    /* renamed from: j */
    public boolean f11004j = C4013a.m9782b();

    /* renamed from: k */
    private C4015b f11005k;

    /* renamed from: l */
    private long f11006l = 300;

    static {
        Covode.recordClassIndex(4548);
    }

    /* renamed from: a */
    private void m9787a() {
        double d = this.f11005k.f11010d;
        double d2 = (double) this.f11005k.f11008b;
        Double.isNaN(d2);
        float f = (float) (d / d2);
        float f2 = (float) this.f11005k.f11009c;
        double d3 = this.f11005k.f11012f;
        double d4 = (double) this.f11005k.f11008b;
        Double.isNaN(d4);
        m9788a(f, f2, (float) (d3 / d4), (float) this.f11005k.f11011e);
    }

    /* renamed from: a */
    private void m9788a(float f, float f2, float f3, float f4) {
        if (f > -1.0f && f2 > -1.0f && this.f11004j && Logger.debug()) {
            C3854a.m9453a(3, "MonitorCpu", "app_usage_rate=".concat(String.valueOf(f)));
            C3854a.m9453a(3, "MonitorCpu", "app_max_usage_rate=".concat(String.valueOf(f2)));
        }
        if (Logger.debug()) {
            C3854a.m9453a(3, "MonitorCpu", "app_stat_speed=".concat(String.valueOf(f3)));
            C3854a.m9453a(3, "MonitorCpu", "app_max_stat_speed=".concat(String.valueOf(f4)));
        }
    }

    /* renamed from: a */
    public final void mo9383a(long j, double d, double d2, long j2, long j3) {
        if (this.f11002h > -1) {
            C4015b bVar = this.f11005k;
            if (bVar == null) {
                this.f11005k = new C4015b(j, d, d, d2, d2);
            } else {
                if (bVar.f11007a == 0) {
                    this.f11005k.f11007a = j;
                }
                this.f11005k.f11008b++;
                this.f11005k.f11010d += d;
                if (this.f11005k.f11009c < d) {
                    this.f11005k.f11009c = d;
                }
                this.f11005k.f11012f += d2;
                if (this.f11005k.f11011e < d2) {
                    this.f11005k.f11011e = d2;
                }
            }
            if (j - this.f11005k.f11007a > this.f11006l * this.f10995a) {
                m9787a();
                this.f11005k.mo9384a();
            }
        }
        this.f11000f = j3;
        this.f11001g = j2;
        this.f10999e = d;
        this.f11002h = j;
        this.f11003i = d2;
    }
}
