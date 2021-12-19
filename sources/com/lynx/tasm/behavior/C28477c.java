package com.lynx.tasm.behavior;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.lynx.tasm.behavior.c */
public class C28477c {

    /* renamed from: a */
    private final Map<String, C28463a> f66976a = new HashMap();

    static {
        Covode.recordClassIndex(34475);
    }

    public C28477c(List<C28463a> list) {
        mo48989a(list);
    }

    /* renamed from: a */
    private void m56920a(C28463a aVar) {
        if (aVar != null) {
            String str = aVar.f66942b;
            this.f66976a.get(str);
            this.f66976a.put(str, aVar);
        }
    }

    /* renamed from: a */
    public final C28463a mo48988a(String str) {
        C28463a aVar = this.f66976a.get(str);
        if (aVar != null) {
            return aVar;
        }
        throw new RuntimeException("No BehaviorController defined for class ".concat(String.valueOf(str)));
    }

    /* renamed from: a */
    public final void mo48989a(List<C28463a> list) {
        if (list != null) {
            for (C28463a aVar : list) {
                m56920a(aVar);
            }
        }
    }
}
