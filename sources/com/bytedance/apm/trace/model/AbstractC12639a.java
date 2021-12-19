package com.bytedance.apm.trace.model;

import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.bytedance.apm.trace.model.a */
public abstract class AbstractC12639a {

    /* renamed from: a */
    protected List<String> f30779a;

    static {
        Covode.recordClassIndex(14456);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo20449a(String str) {
        if (!this.f30779a.contains(str)) {
            this.f30779a.add(str);
        }
    }
}
