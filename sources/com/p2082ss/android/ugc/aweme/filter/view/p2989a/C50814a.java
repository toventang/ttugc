package com.p2082ss.android.ugc.aweme.filter.view.p2989a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.C50694b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.view.a.a */
public final class C50814a {

    /* renamed from: a */
    public final EnumC50815b f117261a;

    /* renamed from: b */
    public final C50694b f117262b;

    static {
        Covode.recordClassIndex(59985);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50814a)) {
            return false;
        }
        C50814a aVar = (C50814a) obj;
        return C89219l.m154714a(this.f117261a, aVar.f117261a) && C89219l.m154714a(this.f117262b, aVar.f117262b);
    }

    public final int hashCode() {
        EnumC50815b bVar = this.f117261a;
        int i = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        C50694b bVar2 = this.f117262b;
        if (bVar2 != null) {
            i = bVar2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "FilterBoxActionEvent(type=" + this.f117261a + ", data=" + this.f117262b + ")";
    }

    public C50814a(EnumC50815b bVar, C50694b bVar2) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        this.f117261a = bVar;
        this.f117262b = bVar2;
    }
}
