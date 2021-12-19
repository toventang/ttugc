package com.p2082ss.android.ugc.aweme.discover.mixfeed.p2788a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42411h;
import java.util.List;
import p4600h.p4601a.C89070n;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.a.b */
public final class C42309b {

    /* renamed from: a */
    public static final List<Integer> f98547a = C89070n.m154522b(16, 19);

    /* renamed from: b */
    private static final List<Integer> f98548b = C89070n.m154522b(65280, 1048336);

    static {
        Covode.recordClassIndex(50252);
    }

    /* renamed from: a */
    public static final boolean m84669a(C42411h hVar) {
        int feedType;
        if (hVar == null || (feedType = hVar.getFeedType()) == 65465 || f98548b.contains(Integer.valueOf(feedType))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m84670a(Integer num) {
        if (num == null) {
            return false;
        }
        num.intValue();
        if (num.intValue() == 70 || num.intValue() == 8 || num.intValue() == 72 || num.intValue() == 62) {
            return true;
        }
        return false;
    }
}
