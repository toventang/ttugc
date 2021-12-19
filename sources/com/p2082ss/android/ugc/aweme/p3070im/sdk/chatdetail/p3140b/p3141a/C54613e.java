package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3140b.p3141a;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.e */
public final class C54613e {

    /* renamed from: a */
    public final List<C54606a> f125196a;

    /* renamed from: b */
    public final boolean f125197b;

    /* renamed from: c */
    public final boolean f125198c;

    static {
        Covode.recordClassIndex(64326);
    }

    public C54613e() {
        this((List) null, false, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54613e)) {
            return false;
        }
        C54613e eVar = (C54613e) obj;
        return C89219l.m154714a(this.f125196a, eVar.f125196a) && this.f125197b == eVar.f125197b && this.f125198c == eVar.f125198c;
    }

    public final int hashCode() {
        List<C54606a> list = this.f125196a;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        boolean z = this.f125197b;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        if (!this.f125198c) {
            i = 0;
        }
        return i5 + i;
    }

    public final String toString() {
        return "GroupRequestInfo(requests=" + this.f125196a + ", hasMore=" + this.f125197b + ", isLoading=" + this.f125198c + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C54613e(List list, boolean z, int i) {
        this((List<C54606a>) ((i & 1) != 0 ? C89086z.INSTANCE : list), (i & 2) != 0 ? false : z, false);
    }

    private C54613e(List<C54606a> list, boolean z, boolean z2) {
        C89219l.m154721d(list, "");
        this.f125196a = list;
        this.f125197b = z;
        this.f125198c = z2;
    }

    /* renamed from: a */
    public static /* synthetic */ C54613e m100125a(C54613e eVar, List list, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            list = eVar.f125196a;
        }
        if ((i & 2) != 0) {
            z = eVar.f125197b;
        }
        if ((i & 4) != 0) {
            z2 = eVar.f125198c;
        }
        C89219l.m154721d(list, "");
        return new C54613e(list, z, z2);
    }
}
