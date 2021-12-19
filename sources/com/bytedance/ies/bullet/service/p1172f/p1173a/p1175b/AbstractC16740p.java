package com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16740p;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16741q;
import java.util.Iterator;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.f.a.b.p */
public abstract class AbstractC16740p<T extends AbstractC16740p<T, S, R>, S extends AbstractC16741q, R> {

    /* renamed from: b */
    public final R f39982b;

    static {
        Covode.recordClassIndex(19180);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract S mo26543a();

    public AbstractC16740p(R r) {
        this.f39982b = r;
    }

    /* renamed from: a */
    public final R mo26571a(Class<R> cls) {
        C89219l.m154719c(cls, "");
        S a = mo26543a();
        R r = this.f39982b;
        C89219l.m154719c(cls, "");
        Iterator<T> it = a.mo26542a().iterator();
        while (it.hasNext()) {
            r = (R) it.next().mo26551b(cls, r);
        }
        return r;
    }
}
