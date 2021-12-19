package com.google.android.play.core.p1963b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.play.core.p1964c.AbstractC26967a;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.play.core.b.a */
public final class C26882a<StateT> {

    /* renamed from: a */
    protected final Set<AbstractC26967a<StateT>> f63786a = new HashSet();

    static {
        Covode.recordClassIndex(32357);
    }

    /* renamed from: a */
    public final synchronized void mo44562a(AbstractC26967a<StateT> aVar) {
        MethodCollector.m26663i(13154);
        this.f63786a.add(aVar);
        MethodCollector.m26664o(13154);
    }

    /* renamed from: a */
    public final synchronized void mo44563a(StateT statet) {
        MethodCollector.m26663i(13156);
        for (AbstractC26967a<StateT> aVar : this.f63786a) {
            aVar.mo35005a(statet);
        }
        MethodCollector.m26664o(13156);
    }

    /* renamed from: b */
    public final synchronized void mo44564b(AbstractC26967a<StateT> aVar) {
        MethodCollector.m26663i(13155);
        this.f63786a.remove(aVar);
        MethodCollector.m26664o(13155);
    }
}
