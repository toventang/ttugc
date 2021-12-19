package com.p2082ss.android.ugc.aweme.account.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22289b;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.util.l */
public final class C33043l {

    /* renamed from: a */
    public static final C33043l f78590a = new C33043l();

    private C33043l() {
    }

    static {
        Covode.recordClassIndex(39850);
    }

    /* renamed from: a */
    private static boolean m67679a(Integer num) {
        if (num == null || num.intValue() < 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final String m67677a(C22289b bVar) {
        Integer num;
        String str = null;
        if (bVar != null) {
            num = Integer.valueOf(bVar.f52715d);
            str = bVar.f52717f;
        } else {
            num = null;
        }
        return m67678a(num, str);
    }

    /* renamed from: a */
    public static final String m67678a(Integer num, String str) {
        if (!m67679a(num) && str != null && str.length() != 0) {
            return str;
        }
        if (C31291a.f74991a == null) {
            return "Sorry, error occurred";
        }
        String string = C31291a.f74991a.getString(R.string.dcq);
        C89219l.m154716b(string, "");
        return string;
    }
}
