package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.b */
public final class C55758b {
    static {
        Covode.recordClassIndex(65544);
    }

    /* renamed from: a */
    public static final <R> List<R> m101514a(LinkedHashMap<AbstractC55765e<R>, List<R>> linkedHashMap) {
        C89219l.m154721d(linkedHashMap, "");
        ArrayList arrayList = new ArrayList();
        Collection<List<R>> values = linkedHashMap.values();
        C89219l.m154716b(values, "");
        for (T t : values) {
            C89219l.m154716b(t, "");
            arrayList.addAll(t);
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final <R> int m101515b(LinkedHashMap<AbstractC55765e<R>, List<R>> linkedHashMap) {
        C89219l.m154721d(linkedHashMap, "");
        Collection<List<R>> values = linkedHashMap.values();
        C89219l.m154716b(values, "");
        Iterator<T> it = values.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().size();
        }
        return i;
    }
}
