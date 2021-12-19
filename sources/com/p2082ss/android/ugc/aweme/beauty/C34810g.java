package com.p2082ss.android.ugc.aweme.beauty;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.beauty.g */
public final class C34810g implements AbstractC34803a {
    @AbstractC27891c(mo46611a = "beautify_on")

    /* renamed from: b */
    private final int f82236b = 0;
    @AbstractC27891c(mo46611a = "is_mbeautify")

    /* renamed from: c */
    private final int f82237c = 0;

    static {
        Covode.recordClassIndex(41814);
    }

    @Override // com.p2082ss.android.ugc.aweme.beauty.AbstractC34803a
    public final int getBeautyStatus() {
        return this.f82236b;
    }

    private C34810g() {
    }

    public final int hashCode() {
        return (getBeautyStatus() * 31) + this.f82237c;
    }

    public final String toString() {
        return "MBeautyStateInfo(beautyStatus=" + getBeautyStatus() + ", modeChosen=" + this.f82237c + ")";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34810g)) {
            return false;
        }
        C34810g gVar = (C34810g) obj;
        if (getBeautyStatus() == gVar.getBeautyStatus() && this.f82237c == gVar.f82237c) {
            return true;
        }
        return false;
    }
}
