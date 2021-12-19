package com.bytedance.jedi.p1445a.p1446a;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1462l.AbstractC20318a;
import com.bytedance.jedi.p1445a.p1462l.AbstractC20319b;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import p4600h.C89378p;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.a.a.h */
public final class C20146h {

    /* renamed from: a */
    public static final Map<AbstractC20318a<?>, Map<?, AbstractC20319b<?>>> f47917a;

    static {
        Covode.recordClassIndex(23654);
        Map<AbstractC20318a<?>, Map<?, AbstractC20319b<?>>> synchronizedMap = Collections.synchronizedMap(new WeakHashMap());
        C89219l.m154709a((Object) synchronizedMap, "");
        f47917a = synchronizedMap;
    }

    /* renamed from: a */
    public static final <K, V> Map<K, AbstractC20319b<C89378p<K, V>>> m38126a(Map<?, ?> map) {
        if (map != null) {
            return C89206ad.m154686h(map);
        }
        throw new C89388w("null cannot be cast to non-null type");
    }
}
