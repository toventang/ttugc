package com.p2082ss.android.ugc.aweme.p2310al;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;

/* renamed from: com.ss.android.ugc.aweme.al.f */
public final class C33491f implements AbstractC81914b {

    /* renamed from: a */
    public final int f79560a;

    static {
        Covode.recordClassIndex(40348);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C33491f) && this.f79560a == ((C33491f) obj).f79560a;
        }
        return true;
    }

    public final int hashCode() {
        return this.f79560a;
    }

    public final String toString() {
        return "UserLoginStateChangeEvent(type=" + this.f79560a + ")";
    }

    public C33491f(int i) {
        this.f79560a = i;
    }
}
