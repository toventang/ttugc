package com.p2082ss.android.ttve.log;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.AbstractC85314ak;

/* renamed from: com.ss.android.ttve.log.a */
public final class C30653a {

    /* renamed from: a */
    public static AbstractC85314ak f73293a;

    static {
        Covode.recordClassIndex(37202);
    }

    /* renamed from: a */
    public static void m63007a(int i, String str) {
        AbstractC85314ak akVar = f73293a;
        if (akVar != null) {
            akVar.mo56238a(i, "[VESDK]".concat(String.valueOf(str)));
        }
    }
}
