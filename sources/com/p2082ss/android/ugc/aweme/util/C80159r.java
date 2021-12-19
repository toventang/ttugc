package com.p2082ss.android.ugc.aweme.util;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.util.r */
public final class C80159r {
    static {
        Covode.recordClassIndex(93403);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.ArrayList<java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final ArrayList<String> m138917a(String str) {
        if (str == null || str.length() == 0) {
            return new ArrayList<>();
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (Object obj : C89361p.m154921c(str, new String[]{","})) {
            if (!arrayList.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
