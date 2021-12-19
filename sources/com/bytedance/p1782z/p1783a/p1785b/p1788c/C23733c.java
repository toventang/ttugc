package com.bytedance.p1782z.p1783a.p1785b.p1788c;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1782z.p1783a.p1790c.AbstractC23738b;
import com.bytedance.p1782z.p1783a.p1791d.C23743a;

/* renamed from: com.bytedance.z.a.b.c.c */
public class C23733c implements AbstractC23738b {

    /* renamed from: a */
    public String f56181a;

    /* renamed from: b */
    public int f56182b = -1;

    /* renamed from: c */
    public long f56183c;

    /* renamed from: d */
    public long f56184d;

    /* renamed from: e */
    public long f56185e;

    /* renamed from: f */
    public double f56186f;

    static {
        Covode.recordClassIndex(27838);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("proc_stat:{pid=").append(this.f56182b).append(" process_name:").append(this.f56181a).append(" history cpu_time:").append(this.f56183c).append(" delta cpu_time:").append(this.f56184d).append(" delta cpu_time * cpuNum:").append(this.f56184d * ((long) C23743a.m44891a())).append(" cpu_usage:").append(this.f56186f * 100.0d).append("%}");
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo39183a(long j) {
        if (this.f56184d >= 0) {
            double a = (double) C23743a.m44891a();
            double d = (double) this.f56184d;
            Double.isNaN(a);
            Double.isNaN(d);
            double d2 = a * d;
            double d3 = (double) j;
            Double.isNaN(d3);
            this.f56186f = d2 / d3;
        }
    }

    /* renamed from: a */
    public final void mo39184a(AbstractC23738b bVar) {
        long j;
        long j2 = this.f56183c;
        if (bVar == null) {
            j = 0;
        } else {
            j = ((C23733c) bVar).f56183c;
        }
        long j3 = j2 - j;
        this.f56184d = j3;
        if (this.f56185e == 0) {
            this.f56185e = j3;
        }
    }
}
