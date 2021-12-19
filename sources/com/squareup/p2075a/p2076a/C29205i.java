package com.squareup.p2075a.p2076a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.squareup.p2075a.C29252z;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.squareup.a.a.i */
public final class C29205i {

    /* renamed from: a */
    private final Set<C29252z> f69175a = new LinkedHashSet();

    static {
        Covode.recordClassIndex(35554);
    }

    /* renamed from: a */
    public final synchronized void mo50939a(C29252z zVar) {
        MethodCollector.m26663i(2008);
        this.f69175a.add(zVar);
        MethodCollector.m26664o(2008);
    }

    /* renamed from: b */
    public final synchronized void mo50940b(C29252z zVar) {
        MethodCollector.m26663i(2010);
        this.f69175a.remove(zVar);
        MethodCollector.m26664o(2010);
    }

    /* renamed from: c */
    public final synchronized boolean mo50941c(C29252z zVar) {
        boolean contains;
        MethodCollector.m26663i(2011);
        contains = this.f69175a.contains(zVar);
        MethodCollector.m26664o(2011);
        return contains;
    }
}
