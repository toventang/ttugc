package com.p2082ss.android.ugc.aweme.p2306ah;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.property.p3609a.C65330a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71516s;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ah.b */
public final class C33448b {

    /* renamed from: a */
    public static final C33448b f79501a = new C33448b();

    private C33448b() {
    }

    static {
        Covode.recordClassIndex(40305);
    }

    /* renamed from: a */
    public static final void m68556a(HashMap<String, Integer> hashMap, Set<String> set) {
        C89219l.m154721d(hashMap, "");
        C89219l.m154721d(set, "");
        Iterator<Map.Entry<String, Integer>> it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> next = it.next();
            C89219l.m154716b(next, "");
            Map.Entry<String, Integer> entry = next;
            if (set.contains(entry.getKey()) && (!C89219l.m154714a((Object) entry.getKey(), (Object) "music") || !C65330a.m117012a() || !C71516s.m126392b())) {
                it.remove();
            }
        }
    }
}
