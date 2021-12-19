package com.p2082ss.android.ugc.aweme.kids.p3302a.p3307e;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.a.e.c */
public final class C57109c {
    static {
        Covode.recordClassIndex(67003);
    }

    /* renamed from: a */
    public static final List<C57110d> m103480a(List<? extends C57110d> list) {
        C89219l.m154721d(list, "");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (hashSet.add(t.f130025b)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }
}
