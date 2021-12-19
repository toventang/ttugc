package com.bytedance.p1782z.p1783a.p1785b.p1788c;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1782z.p1783a.p1790c.AbstractC23738b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.z.a.b.c.b */
public final class C23732b implements AbstractC23738b {

    /* renamed from: a */
    public List<LinkedHashMap<Long, Long>> f56177a = new ArrayList();

    /* renamed from: b */
    public long f56178b = 0;

    /* renamed from: c */
    public long f56179c = 0;

    /* renamed from: d */
    private long f56180d = 0;

    static {
        Covode.recordClassIndex(27837);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("cputime:{deltaTime:").append(this.f56178b).append(" totaltime:").append(mo39181a()).append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public final long mo39181a() {
        if (this.f56180d == 0 && !this.f56177a.isEmpty()) {
            for (LinkedHashMap<Long, Long> linkedHashMap : this.f56177a) {
                for (Map.Entry<Long, Long> entry : linkedHashMap.entrySet()) {
                    this.f56180d += entry.getValue().longValue();
                }
            }
        }
        return this.f56180d;
    }
}
