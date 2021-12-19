package com.p2082ss.android.ugc.aweme.dependence.beauty.data;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.dependence.beauty.data.a */
public final class C41101a {
    @AbstractC27891c(mo46611a = "beautify_on")

    /* renamed from: a */
    private final int f96063a;
    @AbstractC27891c(mo46611a = "is_mbeautify")

    /* renamed from: b */
    private final int f96064b;

    static {
        Covode.recordClassIndex(48975);
    }

    private /* synthetic */ C41101a() {
        this(0, 0);
    }

    public final int hashCode() {
        return (this.f96063a * 31) + this.f96064b;
    }

    public final String toString() {
        return "MBeautyStateInfoCopy(beautyStatus=" + this.f96063a + ", modeChosen=" + this.f96064b + ")";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41101a)) {
            return false;
        }
        C41101a aVar = (C41101a) obj;
        if (this.f96063a == aVar.f96063a && this.f96064b == aVar.f96064b) {
            return true;
        }
        return false;
    }

    public C41101a(int i, int i2) {
        this.f96063a = i;
        this.f96064b = i2;
    }
}
