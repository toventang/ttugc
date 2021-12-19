package com.p2082ss.android.ugc.aweme.discover.helper;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.search.EnumC67453i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.ag */
public final class C41987ag {

    /* renamed from: a */
    public static final C41987ag f97916a = new C41987ag();

    private C41987ag() {
    }

    static {
        Covode.recordClassIndex(49917);
    }

    /* renamed from: a */
    public static String m84047a(String str) {
        C89219l.m154721d(str, "");
        if (C89219l.m154714a((Object) str, (Object) EnumC67453i.HASHTAG.getTabName())) {
            return "tag";
        }
        return str;
    }
}
