package com.twitter.sdk.android.core.internal.scribe;

import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.w */
public final class C87789w {
    static {
        Covode.recordClassIndex(103787);
    }

    /* renamed from: a */
    public static C87787v m152800a(C87764e eVar, String str, long j, String str2, String str3, List<Object> list) {
        String str4 = eVar.f199342a;
        str4.hashCode();
        if (!str4.equals("tfw")) {
            return new C87755aa(eVar, j, str2, str3, list);
        }
        return new C87757ab(eVar, str, j, str2, str3, list);
    }
}
