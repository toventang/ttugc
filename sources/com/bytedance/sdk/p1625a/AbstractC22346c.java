package com.bytedance.sdk.p1625a;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1627a.AbstractC22288a;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22289b;

/* renamed from: com.bytedance.sdk.a.c */
public abstract class AbstractC22346c<T extends C22289b> extends AbstractC22288a<T> {
    static {
        Covode.recordClassIndex(26162);
    }

    /* renamed from: a */
    public abstract void mo36681a(T t, int i);

    /* renamed from: a */
    public void mo36682a(T t, String str) {
    }

    /* renamed from: b */
    public boolean mo36683b(T t) {
        return false;
    }

    /* renamed from: c */
    public boolean mo36684c(T t) {
        return false;
    }

    /* renamed from: d */
    public String mo36685d(T t) {
        return null;
    }

    /* renamed from: e */
    public abstract void mo36686e(T t);

    @Override // com.bytedance.sdk.p1625a.p1626a.p1627a.AbstractC22288a
    /* renamed from: a */
    public final void mo36605a(T t) {
        if (t.f52713b) {
            mo36686e(t);
        } else if (!mo36683b(t)) {
            mo36681a(t, t.f52715d);
        } else if (mo36684c(t)) {
            mo36682a(t, mo36685d(t));
        } else {
            mo36681a(t, t.f52715d);
        }
    }
}
