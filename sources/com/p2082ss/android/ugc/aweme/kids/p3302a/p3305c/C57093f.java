package com.p2082ss.android.ugc.aweme.kids.p3302a.p3305c;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.a.c.f */
public final class C57093f {

    /* renamed from: a */
    public final ConcurrentHashMap<String, AbstractC57086b> f129979a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public final ConcurrentHashMap<String, AbstractC57086b> f129980b = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(66987);
    }

    /* renamed from: a */
    public final void mo94247a(String str, AbstractC57086b bVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(bVar, "");
        if (bVar instanceof C57094g) {
            this.f129979a.put(str, bVar);
        } else {
            this.f129980b.put(str, bVar);
        }
    }

    /* renamed from: b */
    public final void mo94248b(String str, AbstractC57086b bVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(bVar, "");
        if (bVar instanceof C57094g) {
            this.f129979a.remove(str);
        } else {
            this.f129980b.remove(str);
        }
    }
}
