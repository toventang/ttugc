package com.p2082ss.android.ugc.aweme.utils.gecko;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.gecko.e */
public final class C80491e<T> {

    /* renamed from: a */
    private final Set<T> f180085a = new LinkedHashSet();

    static {
        Covode.recordClassIndex(93764);
    }

    /* renamed from: a */
    public final synchronized Set<T> mo123763a() {
        LinkedHashSet linkedHashSet;
        MethodCollector.m26663i(6855);
        linkedHashSet = new LinkedHashSet(this.f180085a);
        MethodCollector.m26664o(6855);
        return linkedHashSet;
    }

    /* renamed from: a */
    public final synchronized void mo123764a(Collection<? extends T> collection) {
        MethodCollector.m26663i(6995);
        C89219l.m154721d(collection, "");
        this.f180085a.addAll(collection);
        MethodCollector.m26664o(6995);
    }
}
