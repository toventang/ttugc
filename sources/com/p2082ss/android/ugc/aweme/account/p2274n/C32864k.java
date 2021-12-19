package com.p2082ss.android.ugc.aweme.account.p2274n;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.n.k */
public final class C32864k {
    static {
        Covode.recordClassIndex(39649);
    }

    /* renamed from: a */
    public static final int m67463a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if (str == null) {
            try {
                C89219l.m154715b();
            } catch (NumberFormatException unused) {
                return 0;
            }
        }
        return Integer.parseInt(str);
    }
}
