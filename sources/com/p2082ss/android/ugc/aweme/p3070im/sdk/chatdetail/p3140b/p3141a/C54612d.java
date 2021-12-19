package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3140b.p3141a;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.d */
public final class C54612d {

    /* renamed from: a */
    public final String f125192a;

    /* renamed from: b */
    public final boolean f125193b;

    /* renamed from: c */
    public final boolean f125194c;

    /* renamed from: d */
    public final boolean f125195d;

    static {
        Covode.recordClassIndex(64325);
    }

    public C54612d() {
        this(null, false, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54612d)) {
            return false;
        }
        C54612d dVar = (C54612d) obj;
        return C89219l.m154714a(this.f125192a, dVar.f125192a) && this.f125193b == dVar.f125193b && this.f125194c == dVar.f125194c && this.f125195d == dVar.f125195d;
    }

    public final int hashCode() {
        String str = this.f125192a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f125193b;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        boolean z2 = this.f125194c;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = (i5 + i6) * 31;
        if (!this.f125195d) {
            i = 0;
        }
        return i9 + i;
    }

    public final String toString() {
        return "GroupNameInfo(groupName=" + this.f125192a + ", groupNameModified=" + this.f125193b + ", groupNameEditing=" + this.f125194c + ", groupNameChecking=" + this.f125195d + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C54612d(String str, boolean z, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, false, false);
    }

    public C54612d(String str, boolean z, boolean z2, boolean z3) {
        C89219l.m154721d(str, "");
        this.f125192a = str;
        this.f125193b = z;
        this.f125194c = z2;
        this.f125195d = z3;
    }

    /* renamed from: a */
    public static /* synthetic */ C54612d m100124a(C54612d dVar, String str, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            str = dVar.f125192a;
        }
        if ((i & 2) != 0) {
            z = dVar.f125193b;
        }
        if ((i & 4) != 0) {
            z2 = dVar.f125194c;
        }
        if ((i & 8) != 0) {
            z3 = dVar.f125195d;
        }
        C89219l.m154721d(str, "");
        return new C54612d(str, z, z2, z3);
    }
}
