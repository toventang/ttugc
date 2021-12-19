package com.bytedance.p1782z.p1783a.p1784a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.z.a.a.a */
public final class C23721a {

    /* renamed from: a */
    public static C23721a f56113a = new C23721a();

    /* renamed from: b */
    public boolean f56114b;

    /* renamed from: c */
    public boolean f56115c;

    /* renamed from: d */
    public int f56116d = 37;

    /* renamed from: e */
    public int f56117e = 30;

    /* renamed from: f */
    public C23722a f56118f = new C23722a();

    static {
        Covode.recordClassIndex(27826);
    }

    /* renamed from: com.bytedance.z.a.a.a$a */
    public static class C23722a {

        /* renamed from: a */
        public String f56119a = "unknown";

        /* renamed from: b */
        public String f56120b = "default";

        /* renamed from: c */
        public float f56121c;

        /* renamed from: d */
        public float f56122d;

        /* renamed from: e */
        public float f56123e;

        /* renamed from: f */
        public float f56124f;

        static {
            Covode.recordClassIndex(27827);
        }

        public final String toString() {
            return "CpuAbnormalConfig{cpuHardWare='" + this.f56119a + '\'' + ", scene='" + this.f56120b + '\'' + ", cpuSpeed=" + this.f56121c + ", smallCpuCoreTimePercent=" + this.f56122d + ", middleCpuCoreTimePercent=" + this.f56123e + ", BigCpuCoreTimePercent=" + this.f56124f + '}';
        }
    }

    public final String toString() {
        return "AssistConfig{enableProcessTimeFreqPercent=" + this.f56114b + ", enableCpuUsageStat=" + this.f56115c + ", cpuSampleBatteryTemp=" + this.f56116d + ", cpuSampleBatteryLevel=" + this.f56117e + ", cpuAbnormalConfig=" + this.f56118f + '}';
    }
}
