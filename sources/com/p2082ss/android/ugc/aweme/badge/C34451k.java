package com.p2082ss.android.ugc.aweme.badge;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.badge.k */
public final class C34451k {

    /* renamed from: a */
    public final Integer f81414a;

    /* renamed from: b */
    public final String f81415b;

    /* renamed from: c */
    public final List<C34448h> f81416c;

    /* renamed from: d */
    public final C34435d f81417d;

    /* renamed from: e */
    public final boolean f81418e;

    /* renamed from: f */
    public final boolean f81419f;

    static {
        Covode.recordClassIndex(41399);
    }

    public C34451k() {
        this(null, false, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34451k)) {
            return false;
        }
        C34451k kVar = (C34451k) obj;
        return C89219l.m154714a(this.f81414a, kVar.f81414a) && C89219l.m154714a(this.f81415b, kVar.f81415b) && C89219l.m154714a(this.f81416c, kVar.f81416c) && C89219l.m154714a(this.f81417d, kVar.f81417d) && this.f81418e == kVar.f81418e && this.f81419f == kVar.f81419f;
    }

    public final int hashCode() {
        Integer num = this.f81414a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.f81415b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<C34448h> list = this.f81416c;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        C34435d dVar = this.f81417d;
        if (dVar != null) {
            i = dVar.hashCode();
        }
        int i2 = (hashCode3 + i) * 31;
        boolean z = this.f81418e;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (i2 + i4) * 31;
        if (!this.f81419f) {
            i3 = 0;
        }
        return i7 + i3;
    }

    public final String toString() {
        return "Result(statusCode=" + this.f81414a + ", statusMsg=" + this.f81415b + ", data=" + this.f81416c + ", campaign=" + this.f81417d + ", isLoading=" + this.f81418e + ", loadSuccess=" + this.f81419f + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C34451k(List list, boolean z, int i) {
        this(null, null, (i & 4) != 0 ? null : list, null, (i & 16) != 0 ? true : z, false);
    }

    public C34451k(Integer num, String str, List<C34448h> list, C34435d dVar, boolean z, boolean z2) {
        this.f81414a = num;
        this.f81415b = str;
        this.f81416c = list;
        this.f81417d = dVar;
        this.f81418e = z;
        this.f81419f = z2;
    }
}
