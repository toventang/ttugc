package com.p2082ss.optimizer.live.sdk.dns;

import com.bytedance.covode.number.Covode;
import com.p2082ss.optimizer.live.sdk.dns.p4402a.C86150a;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.optimizer.live.sdk.dns.i */
public final class C86162i {

    /* renamed from: a */
    public final String f192152a;

    /* renamed from: b */
    public final List<C86150a> f192153b;

    /* renamed from: c */
    public final float f192154c;

    /* renamed from: d */
    public final float f192155d;

    static {
        Covode.recordClassIndex(101304);
    }

    C86162i(String str, List<C86150a> list, int i) {
        this.f192152a = str;
        this.f192153b = list;
        if (list == null || list.isEmpty()) {
            this.f192154c = 1.0f;
            this.f192155d = Float.MAX_VALUE;
            return;
        }
        this.f192154c = 1.0f - ((((float) list.size()) * 1.0f) / ((float) i));
        float f = 0.0f;
        for (C86150a aVar : list) {
            if (aVar != null) {
                f += aVar.f192121c;
            }
        }
        this.f192155d = f / ((float) list.size());
    }
}
