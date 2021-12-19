package com.bytedance.helios.sdk.utils;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.sdk.utils.b */
public final class C15480b {
    static {
        Covode.recordClassIndex(17734);
    }

    /* renamed from: a */
    public static final String m28480a(Set<String> set) {
        C89219l.m154719c(set, "");
        ArrayList arrayList = new ArrayList(C89070n.m154526a(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add("\"" + ((String) it.next()) + '\"');
        }
        return arrayList.toString();
    }
}
