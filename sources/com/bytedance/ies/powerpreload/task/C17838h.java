package com.bytedance.ies.powerpreload.task;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.p1243b.AbstractC17789d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerpreload.task.h */
public final class C17838h {

    /* renamed from: a */
    public AbstractRunnableC17828f<?> f42548a;

    /* renamed from: b */
    public final Class<? extends AbstractC17789d> f42549b;

    /* renamed from: c */
    public final String f42550c;

    static {
        Covode.recordClassIndex(20403);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17838h)) {
            return false;
        }
        C17838h hVar = (C17838h) obj;
        return C89219l.m154714a(this.f42549b, hVar.f42549b) && C89219l.m154714a(this.f42550c, hVar.f42550c);
    }

    public final int hashCode() {
        Class<? extends AbstractC17789d> cls = this.f42549b;
        int i = 0;
        int hashCode = (cls != null ? cls.hashCode() : 0) * 31;
        String str = this.f42550c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "TaskWrapper(preload=" + this.f42549b + ", key=" + this.f42550c + ")";
    }

    /* renamed from: a */
    public final void mo28300a(AbstractRunnableC17828f<?> fVar) {
        AbstractRunnableC17828f<?> fVar2 = this.f42548a;
        if (fVar2 != null) {
            fVar2.f42537e = true;
        }
        this.f42548a = fVar;
    }

    public C17838h(Class<? extends AbstractC17789d> cls, String str) {
        C89219l.m154719c(cls, "");
        this.f42549b = cls;
        this.f42550c = str;
    }

    /* renamed from: a */
    public final boolean mo28301a(Class<? extends AbstractC17789d> cls, String str) {
        if (cls == null) {
            if (str == null || str.length() <= 0 || !C89219l.m154714a((Object) str, (Object) this.f42550c)) {
                return false;
            }
            return true;
        } else if (!C89219l.m154714a(this.f42549b, cls) || !C89219l.m154714a((Object) this.f42550c, (Object) str)) {
            return false;
        } else {
            return true;
        }
    }
}
