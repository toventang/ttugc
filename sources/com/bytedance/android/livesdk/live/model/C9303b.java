package com.bytedance.android.livesdk.live.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.live.model.b */
public final class C9303b {
    @AbstractC27891c(mo46611a = "enable")

    /* renamed from: a */
    public final String f22737a;
    @AbstractC27891c(mo46611a = "is_follow")

    /* renamed from: b */
    public final boolean f22738b;
    @AbstractC27891c(mo46611a = "param")

    /* renamed from: c */
    public final String f22739c;
    @AbstractC27891c(mo46611a = "channel_id")

    /* renamed from: d */
    public final int f22740d;

    static {
        Covode.recordClassIndex(10231);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9303b)) {
            return false;
        }
        C9303b bVar = (C9303b) obj;
        return C89219l.m154714a(this.f22737a, bVar.f22737a) && this.f22738b == bVar.f22738b && C89219l.m154714a(this.f22739c, bVar.f22739c) && this.f22740d == bVar.f22740d;
    }

    public final int hashCode() {
        String str = this.f22737a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f22738b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        String str2 = this.f22739c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((i5 + i) * 31) + this.f22740d;
    }

    public final String toString() {
        return "LiveFeedSettings(enable=" + this.f22737a + ", isFollow=" + this.f22738b + ", param=" + this.f22739c + ", channel_id=" + this.f22740d + ")";
    }

    public /* synthetic */ C9303b() {
        this("0", "");
    }

    private C9303b(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f22737a = str;
        this.f22738b = false;
        this.f22739c = str2;
        this.f22740d = 0;
    }
}
