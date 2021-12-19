package com.bytedance.android.livesdk.p476c;

import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.c.c */
public abstract class AbstractC7252c {

    /* renamed from: a */
    public C7256g[] f18050a;

    /* renamed from: b */
    protected C7256g[] f18051b;

    static {
        Covode.recordClassIndex(8000);
    }

    /* renamed from: a */
    public abstract C7256g mo13454a(float f);

    public AbstractC7252c(List<C7256g> list) {
        this.f18050a = new C7256g[list.size()];
        this.f18051b = new C7256g[list.size()];
        list.toArray(this.f18050a);
    }
}
