package com.facebook.drawee.p1845a.p1846a.p1848b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1833e.C24099a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.drawee.a.a.b.a */
public final class C24171a implements AbstractC24175b {

    /* renamed from: a */
    private final List<AbstractC24175b> f57160a;

    static {
        Covode.recordClassIndex(28302);
    }

    public C24171a(AbstractC24175b... bVarArr) {
        ArrayList arrayList = new ArrayList(2);
        this.f57160a = arrayList;
        Collections.addAll(arrayList, bVarArr);
    }

    /* renamed from: a */
    public final synchronized void mo39770a(AbstractC24175b bVar) {
        MethodCollector.m26663i(7396);
        this.f57160a.add(bVar);
        MethodCollector.m26664o(7396);
    }

    /* renamed from: b */
    public final synchronized void mo39771b(AbstractC24175b bVar) {
        MethodCollector.m26663i(7547);
        this.f57160a.remove(bVar);
        MethodCollector.m26664o(7547);
    }

    @Override // com.facebook.drawee.p1845a.p1846a.p1848b.AbstractC24175b
    /* renamed from: a */
    public final synchronized void mo39769a(String str, int i, boolean z) {
        MethodCollector.m26663i(7548);
        int size = this.f57160a.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC24175b bVar = this.f57160a.get(i2);
            if (bVar != null) {
                try {
                    bVar.mo39769a(str, i, z);
                } catch (Exception e) {
                    C24099a.m45658c("ForwardingImageOriginListener", "InternalListener exception in onImageLoaded", e);
                }
            }
        }
        MethodCollector.m26664o(7548);
    }
}
