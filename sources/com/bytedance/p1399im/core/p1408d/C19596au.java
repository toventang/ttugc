package com.bytedance.p1399im.core.p1408d;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.im.core.d.au */
public final class C19596au {

    /* renamed from: a */
    public int f46535a;

    /* renamed from: b */
    public long f46536b;

    /* renamed from: c */
    public long f46537c;

    /* renamed from: d */
    public long f46538d;

    /* renamed from: e */
    public long f46539e;

    static {
        Covode.recordClassIndex(22440);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RequestTimestampModel{");
        sb.append("cmd=").append(this.f46535a);
        sb.append(", clientStartTime=").append(this.f46536b);
        sb.append(", clientEndTime=").append(this.f46537c);
        sb.append(", serverArrivedTime=").append(this.f46538d);
        sb.append(", serverExecutionEndTime=").append(this.f46539e);
        sb.append('}');
        return sb.toString();
    }
}
