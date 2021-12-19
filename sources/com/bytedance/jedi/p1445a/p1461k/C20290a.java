package com.bytedance.jedi.p1445a.p1461k;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4568e.p4584j.C88914l;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.a.k.a */
public final class C20290a implements AbstractC20292c {

    /* renamed from: a */
    public final C88914l<AbstractC20292c> f48133a = new C88914l<>((byte) 0);

    static {
        Covode.recordClassIndex(23798);
    }

    @Override // com.bytedance.jedi.p1445a.p1461k.AbstractC20292c
    public final void bt_() {
        T[] tArr = this.f48133a.f201922e;
        C89219l.m154709a((Object) tArr, "");
        for (T t : tArr) {
            if (t instanceof AbstractC20292c) {
                t.bt_();
                this.f48133a.mo143187b(t);
            }
        }
    }
}
