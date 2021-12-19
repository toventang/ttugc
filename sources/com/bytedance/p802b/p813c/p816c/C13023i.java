package com.bytedance.p802b.p813c.p816c;

import com.bytedance.covode.number.Covode;
import java.util.Objects;

/* renamed from: com.bytedance.b.c.c.i */
public final class C13023i {

    /* renamed from: a */
    public int f31730a;

    /* renamed from: b */
    public String f31731b;

    /* renamed from: c */
    public long f31732c;

    /* renamed from: d */
    public double f31733d;

    /* renamed from: e */
    public String f31734e;

    /* renamed from: f */
    public String f31735f;

    /* renamed from: g */
    public long f31736g;

    /* renamed from: h */
    public int f31737h;

    static {
        Covode.recordClassIndex(14859);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f31730a), this.f31731b);
    }

    public final String toString() {
        return "ThreadExceptionItem{threadId=" + this.f31730a + ", threadName='" + this.f31731b + '\'' + ", threadCpuTime=" + this.f31732c + ", processCpuTime=" + this.f31736g + ", cpuUsage=" + this.f31733d + ", weight=" + this.f31734e + ", nice=" + this.f31737h + '}';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13023i)) {
            return false;
        }
        C13023i iVar = (C13023i) obj;
        if (this.f31730a != iVar.f31730a || !this.f31731b.equals(iVar.f31731b)) {
            return false;
        }
        return true;
    }
}
