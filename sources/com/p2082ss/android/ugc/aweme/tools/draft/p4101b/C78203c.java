package com.p2082ss.android.ugc.aweme.tools.draft.p4101b;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.b.c */
public final class C78203c {
    static {
        Covode.recordClassIndex(91318);
    }

    /* renamed from: a */
    public static final String m136686a(List<String> list) {
        C89219l.m154721d(list, "");
        boolean z = true;
        String str = "(";
        for (String str2 : list) {
            if (z) {
                z = false;
            } else {
                str = str + ",";
            }
            str = str + "'" + str2 + "'";
        }
        return str + ")";
    }
}
