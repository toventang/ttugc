package com.p2082ss.android.ugc.aweme.setting.p3716d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;

/* renamed from: com.ss.android.ugc.aweme.setting.d.a */
public final class C68066a implements AbstractC81914b {

    /* renamed from: a */
    public final int f152458a;

    static {
        Covode.recordClassIndex(80262);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C68066a) && this.f152458a == ((C68066a) obj).f152458a;
        }
        return true;
    }

    public final int hashCode() {
        return this.f152458a;
    }

    public final String toString() {
        return "ChatControlChangeEvent(value=" + this.f152458a + ")";
    }

    public C68066a(int i) {
        this.f152458a = i;
    }
}
