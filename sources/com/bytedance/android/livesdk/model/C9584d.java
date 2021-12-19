package com.bytedance.android.livesdk.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.model.d */
public class C9584d {
    @AbstractC27891c(mo46611a = "level")

    /* renamed from: a */
    public long f23222a;

    static {
        Covode.recordClassIndex(11123);
    }

    public int hashCode() {
        long j = this.f23222a;
        return (int) (j ^ (j >>> 32));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.f23222a == ((C9584d) obj).f23222a) {
            return true;
        }
        return false;
    }
}
