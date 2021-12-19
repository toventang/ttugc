package com.bytedance.jedi.arch;

import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.arch.d */
public class C20391d<T> {

    /* renamed from: a */
    public boolean f48282a;

    /* renamed from: b */
    public final T f48283b;

    static {
        Covode.recordClassIndex(23903);
    }

    /* renamed from: a */
    public final T mo33723a() {
        if (this.f48282a) {
            return null;
        }
        this.f48282a = true;
        return this.f48283b;
    }

    public C20391d(T t) {
        this.f48283b = t;
    }

    /* renamed from: a */
    public final void mo33724a(AbstractC89172b<? super T, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        if (!this.f48282a) {
            this.f48282a = true;
            bVar.invoke(this.f48283b);
        }
    }
}
