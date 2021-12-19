package com.p2082ss.android.ugc.aweme.account.bean;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.bean.a */
public final class C31594a {

    /* renamed from: a */
    public final String f75552a;

    /* renamed from: b */
    public final String f75553b;

    /* renamed from: c */
    public final boolean f75554c;

    static {
        Covode.recordClassIndex(38321);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31594a)) {
            return false;
        }
        C31594a aVar = (C31594a) obj;
        return C89219l.m154714a(this.f75552a, aVar.f75552a) && C89219l.m154714a(this.f75553b, aVar.f75553b) && this.f75554c == aVar.f75554c;
    }

    public final int hashCode() {
        String str = this.f75552a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f75553b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f75554c;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public final String toString() {
        return "AppBindRequest(platformName=" + this.f75552a + ", bindKey=" + this.f75553b + ", actionBool=" + this.f75554c + ")";
    }
}
