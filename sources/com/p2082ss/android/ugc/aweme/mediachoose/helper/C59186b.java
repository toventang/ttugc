package com.p2082ss.android.ugc.aweme.mediachoose.helper;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mediachoose.helper.b */
public final class C59186b {
    static {
        Covode.recordClassIndex(69545);
    }

    /* renamed from: a */
    public static final String m108689a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        StringBuilder append = new StringBuilder().append(str);
        if (!TextUtils.isEmpty(str)) {
            str2 = " AND ".concat(String.valueOf(str2));
        }
        return append.append(str2).toString();
    }
}
