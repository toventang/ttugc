package com.p2082ss.android.ugc.aweme.feed.adapter;

import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.j */
public final class C48257j {
    static {
        Covode.recordClassIndex(56999);
    }

    /* renamed from: a */
    public static final <E> void m91661a(ArrayList<E> arrayList, List<? extends E> list) {
        C89219l.m154721d(arrayList, "");
        if (!C13603b.m24435a((Collection) list)) {
            if (list == null) {
                C89219l.m154715b();
            }
            arrayList.addAll(list);
        }
    }
}
