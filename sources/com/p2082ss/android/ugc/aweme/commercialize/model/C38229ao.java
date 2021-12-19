package com.p2082ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.ao */
public final class C38229ao {

    /* renamed from: a */
    public final int f90317a;

    /* renamed from: b */
    public final int f90318b;

    static {
        Covode.recordClassIndex(45713);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38229ao)) {
            return false;
        }
        C38229ao aoVar = (C38229ao) obj;
        return this.f90317a == aoVar.f90317a && this.f90318b == aoVar.f90318b;
    }

    public final int hashCode() {
        return (this.f90317a * 31) + this.f90318b;
    }

    public final String toString() {
        return "Size(width=" + this.f90317a + ", height=" + this.f90318b + ")";
    }

    public C38229ao(int i, int i2) {
        this.f90317a = i;
        this.f90318b = i2;
    }
}
