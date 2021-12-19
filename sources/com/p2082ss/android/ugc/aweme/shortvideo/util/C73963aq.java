package com.p2082ss.android.ugc.aweme.shortvideo.util;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27235f;
import com.google.p1998c.p1999a.C27245k;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.aq */
public final class C73963aq {
    static {
        Covode.recordClassIndex(86713);
    }

    /* renamed from: a */
    public static <T> List<T> m130084a(List<T> list, AbstractC27235f<T, Boolean> fVar) {
        C27245k.m54229a(list);
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (fVar.mo45319a(t).booleanValue()) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }
}
