package com.p2082ss.android.ugc.aweme.p2441cf.p2442a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.cf.a.a */
public final class C35466a {
    static {
        Covode.recordClassIndex(42651);
    }

    /* renamed from: a */
    private static int m72526a(int i, int i2, int i3, int i4, int i5) {
        return ((((((((i + 31) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5;
    }

    /* renamed from: a */
    public static int m72527a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        if (obj2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = obj2.hashCode();
        }
        if (obj3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = obj3.hashCode();
        }
        if (obj4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = obj4.hashCode();
        }
        if (obj5 != null) {
            i = obj5.hashCode();
        }
        return m72526a(hashCode, hashCode2, hashCode3, hashCode4, i);
    }
}
