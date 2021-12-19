package com.bytedance.assem.arch.core;

import com.bytedance.assem.arch.extensions.AbstractC12779c;
import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.assem.arch.core.d */
public final class C12752d {

    /* renamed from: a */
    public final C12752d f31013a;

    /* renamed from: b */
    private final Map<C12760j, AbstractC12779c> f31014b;

    static {
        Covode.recordClassIndex(14576);
    }

    private /* synthetic */ C12752d() {
        this(null);
    }

    /* renamed from: a */
    public final void mo20604a() {
        this.f31014b.clear();
    }

    public C12752d(C12752d dVar) {
        this.f31013a = dVar;
        this.f31014b = new LinkedHashMap();
    }

    /* renamed from: a */
    public final void mo20605a(AbstractC12779c cVar, String str) {
        if (cVar != null) {
            this.f31014b.put(new C12760j(cVar.getClass(), str), cVar);
        }
    }

    /* renamed from: a */
    public final <T> T mo20603a(Class<T> cls, String str) {
        C89219l.m154719c(cls, "");
        C12760j jVar = new C12760j(cls, str);
        for (C12752d dVar = this; dVar != null; dVar = dVar.f31013a) {
            if (dVar.f31014b.containsKey(jVar)) {
                return (T) dVar.f31014b.get(jVar);
            }
        }
        throw new IllegalArgumentException("No such data hierarchy by parent.");
    }

    /* renamed from: b */
    public final <T> T mo20606b(Class<T> cls, String str) {
        C89219l.m154719c(cls, "");
        C12760j jVar = new C12760j(cls, str);
        for (C12752d dVar = this; dVar != null; dVar = dVar.f31013a) {
            if (dVar.f31014b.containsKey(jVar)) {
                return (T) dVar.f31014b.get(jVar);
            }
        }
        return null;
    }
}
