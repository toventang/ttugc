package com.p2082ss.android.ugc.aweme.shortvideo.subtitle;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.i */
public final class C73230i<T> {

    /* renamed from: a */
    public final int f164466a;

    /* renamed from: b */
    public final String f164467b;

    /* renamed from: c */
    public final T f164468c;

    static {
        Covode.recordClassIndex(85948);
    }

    public C73230i() {
        this(0, null, null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C73230i)) {
            return false;
        }
        C73230i iVar = (C73230i) obj;
        return this.f164466a == iVar.f164466a && C89219l.m154714a(this.f164467b, iVar.f164467b) && C89219l.m154714a(this.f164468c, iVar.f164468c);
    }

    public final int hashCode() {
        int i = this.f164466a * 31;
        String str = this.f164467b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        T t = this.f164468c;
        if (t != null) {
            i2 = t.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ExecuteResult(ret=" + this.f164466a + ", failedMsg=" + this.f164467b + ", data=" + ((Object) this.f164468c) + ")";
    }

    /* renamed from: a */
    public final boolean mo115765a() {
        if (this.f164466a != 0) {
            return true;
        }
        return false;
    }

    public C73230i(int i, String str, T t) {
        C89219l.m154721d(str, "");
        this.f164466a = i;
        this.f164467b = str;
        this.f164468c = t;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C73230i(int i, String str, Object obj, int i2) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : obj);
    }
}
