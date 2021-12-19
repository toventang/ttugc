package com.bytedance.apm.battery.p762d.p763a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.apm.battery.d.a.b */
public abstract class AbstractC12335b {

    /* renamed from: d */
    public long f29723d;

    /* renamed from: e */
    public long f29724e;

    /* renamed from: f */
    public String f29725f;

    /* renamed from: g */
    public StackTraceElement[] f29726g;

    static {
        Covode.recordClassIndex(14140);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo20075b() {
        StringBuilder sb = new StringBuilder();
        for (int i = 9; i < this.f29726g.length; i++) {
            sb.append("\tat ").append(this.f29726g[i].toString()).append("\n");
        }
        return sb.toString();
    }
}
