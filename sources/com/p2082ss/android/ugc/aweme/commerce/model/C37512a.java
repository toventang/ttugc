package com.p2082ss.android.ugc.aweme.commerce.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.commerce.model.a */
public final class C37512a implements Serializable {
    @AbstractC27891c(mo46611a = "end")
    public float end;
    @AbstractC27891c(mo46611a = "start")
    public float start;

    static {
        Covode.recordClassIndex(44900);
    }

    public C37512a() {
    }

    public static /* synthetic */ C37512a copy$default(C37512a aVar, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = aVar.start;
        }
        if ((i & 2) != 0) {
            f2 = aVar.end;
        }
        return aVar.copy(f, f2);
    }

    public final float component1() {
        return this.start;
    }

    public final float component2() {
        return this.end;
    }

    public final C37512a copy(float f, float f2) {
        return new C37512a(f, f2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37512a)) {
            return false;
        }
        C37512a aVar = (C37512a) obj;
        return Float.compare(this.start, aVar.start) == 0 && Float.compare(this.end, aVar.end) == 0;
    }

    public final int hashCode() {
        return (m75638x344aad96(this.start) * 31) + m75638x344aad96(this.end);
    }

    public final String toString() {
        return "ActivityTimeRange(start=" + this.start + ", end=" + this.end + ")";
    }

    public final float getEnd() {
        return this.end;
    }

    public final float getStart() {
        return this.start;
    }

    /* renamed from: com_ss_android_ugc_aweme_commerce_model_ActivityTimeRange_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m75638x344aad96(float f) {
        return Float.floatToIntBits(f);
    }

    public C37512a(float f, float f2) {
        this.start = f;
        this.end = f2;
    }
}
