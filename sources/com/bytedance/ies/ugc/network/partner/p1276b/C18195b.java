package com.bytedance.ies.ugc.network.partner.p1276b;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.C22027b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.ugc.network.partner.b.b */
public final class C18195b {

    /* renamed from: a */
    private final Map<String, List<C22027b>> f43331a;

    static {
        Covode.recordClassIndex(20851);
    }

    public /* synthetic */ C18195b() {
        this(C89086z.INSTANCE);
    }

    /* renamed from: a */
    public final List<C22027b> mo29046a() {
        Map<String, List<C22027b>> map = this.f43331a;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<C22027b>> entry : map.entrySet()) {
            C89070n.m154535a((Collection) arrayList, (Iterable) entry.getValue());
        }
        return arrayList;
    }

    /* renamed from: b */
    private final List<C22027b> m33848b(String str) {
        Map<String, List<C22027b>> map = this.f43331a;
        String c = m33849c(str);
        List<C22027b> list = map.get(c);
        if (list == null) {
            list = new ArrayList<>();
            map.put(c, list);
        }
        return list;
    }

    /* renamed from: c */
    private static String m33849c(String str) {
        Locale locale = Locale.getDefault();
        C89219l.m154716b(locale, "");
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = str.toLowerCase(locale);
        C89219l.m154716b(lowerCase, "");
        return lowerCase;
    }

    public C18195b(List<C22027b> list) {
        C89219l.m154721d(list, "");
        this.f43331a = new LinkedHashMap();
        for (C22027b bVar : list) {
            String str = bVar.f52037a;
            C89219l.m154716b(str, "");
            m33847a(bVar, str);
        }
    }

    /* renamed from: a */
    public final String mo29045a(String str) {
        T t;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str, "");
        List<C22027b> list = this.f43331a.get(m33849c(str));
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (t.f52038b != null) {
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                return t2.f52038b;
            }
        }
        return null;
    }

    /* renamed from: a */
    private final void m33847a(C22027b bVar, String str) {
        m33848b(str).add(bVar);
    }

    /* renamed from: a */
    public final void mo29047a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        List<C22027b> b = m33848b(str);
        b.clear();
        b.add(new C22027b(str, str2));
    }

    /* renamed from: b */
    public final void mo29048b(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        m33847a(new C22027b(str, str2), str);
    }
}
