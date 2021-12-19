package com.p2082ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.utils.C80633x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.w */
public final class C80632w {

    /* renamed from: a */
    public static int f180283a;

    /* renamed from: b */
    private static final Map<String, Set<C80633x>> f180284b = new HashMap();

    static {
        Covode.recordClassIndex(93906);
    }

    /* renamed from: a */
    public static final void m139802a(int i) {
        Map<String, Set<C80633x>> map = f180284b;
        if (map == null) {
            C89219l.m154715b();
        }
        for (Set<C80633x> set : map.values()) {
            if (set == null) {
                C89219l.m154715b();
            }
            Iterator<C80633x> it = set.iterator();
            while (it.hasNext()) {
                if (it.next().f180287c == i) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: a */
    public static final Map<String, String> m139800a(Aweme aweme, String str, String str2) {
        C89219l.m154721d(str, "");
        return m139801a(aweme, str, str2, (AbstractC80348dm) null);
    }

    /* renamed from: a */
    public static final Map<String, String> m139801a(Aweme aweme, String str, String str2, AbstractC80348dm dmVar) {
        String str3;
        String str4;
        C89219l.m154721d(str, "");
        HashMap hashMap = new HashMap();
        Map<String, Set<C80633x>> map = f180284b;
        if (map == null) {
            C89219l.m154715b();
        }
        Set<C80633x> set = map.get(str);
        if (set != null) {
            ArrayList arrayList = new ArrayList();
            for (T t : set) {
                if (t.f180287c == f180283a) {
                    arrayList.add(t);
                }
            }
            ArrayList<C80633x> arrayList2 = arrayList;
            if (arrayList2 != null && arrayList2.size() > 0) {
                for (C80633x xVar : arrayList2) {
                    C80633x.AbstractC80634a aVar = xVar.f180286b;
                    if (str2 == null) {
                        str3 = "";
                    } else {
                        str3 = str2;
                    }
                    if (aVar.mo106812a(aweme, str3)) {
                        C80633x.AbstractC80634a aVar2 = xVar.f180286b;
                        if (str2 == null) {
                            str4 = "";
                        } else {
                            str4 = str2;
                        }
                        String a = aVar2.mo106811a(aweme, str4, dmVar);
                        if (!TextUtils.isEmpty(xVar.f180285a) && !TextUtils.isEmpty(a)) {
                            hashMap.put(xVar.f180285a, a);
                        }
                    }
                }
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static final void m139803a(String str, String str2, C80633x.AbstractC80634a aVar, int i) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(aVar, "");
        Map<String, Set<C80633x>> map = f180284b;
        if (map == null) {
            C89219l.m154715b();
        }
        Set<C80633x> set = map.get(str);
        if (set == null) {
            set = new LinkedHashSet<>();
            map.put(str, set);
        }
        set.add(new C80633x(str2, aVar, i));
    }
}
