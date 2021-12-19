package com.google.firebase.components;

import com.bytedance.covode.number.Covode;
import com.google.firebase.p2012d.AbstractC27738a;
import java.util.Set;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.components.a */
public abstract class AbstractC27709a implements AbstractC27714e {
    static {
        Covode.recordClassIndex(33292);
    }

    AbstractC27709a() {
    }

    @Override // com.google.firebase.components.AbstractC27714e
    /* renamed from: a */
    public <T> T mo46348a(Class<T> cls) {
        AbstractC27738a<T> c = mo46358c(cls);
        if (c == null) {
            return null;
        }
        return c.mo46341a();
    }

    @Override // com.google.firebase.components.AbstractC27714e
    /* renamed from: b */
    public <T> Set<T> mo46349b(Class<T> cls) {
        return mo46359d(cls).mo46341a();
    }
}
