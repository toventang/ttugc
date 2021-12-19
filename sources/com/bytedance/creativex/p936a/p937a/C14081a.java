package com.bytedance.creativex.p936a.p937a;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.creativex.a.a.a */
public final class C14081a implements AbstractC14085c {

    /* renamed from: a */
    private final Map<String, Class<?>> f34260a;

    /* renamed from: b */
    private final AbstractC89172b<Class<?>, Boolean> f34261b;

    static {
        Covode.recordClassIndex(16148);
    }

    private /* synthetic */ C14081a() {
        this(C140821.f34262a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super java.lang.Class<?>, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public C14081a(AbstractC89172b<? super Class<?>, Boolean> bVar) {
        C89219l.m154721d(bVar, "");
        this.f34261b = bVar;
        this.f34260a = new LinkedHashMap();
    }

    @Override // com.bytedance.creativex.p936a.p937a.AbstractC14085c
    /* renamed from: a */
    public final Class<?> mo22599a(String str) {
        C89219l.m154721d(str, "");
        Class<?> cls = this.f34260a.get(str);
        if (cls != null) {
            return cls;
        }
        throw new IllegalArgumentException("unregistered key:".concat(String.valueOf(str)).toString());
    }

    @Override // com.bytedance.creativex.p936a.p937a.AbstractC14085c
    /* renamed from: a */
    public final void mo22600a(String str, Class<?> cls) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(cls, "");
        if (this.f34261b.invoke(cls).booleanValue()) {
            this.f34260a.put(str, cls);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
