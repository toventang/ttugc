package com.bytedance.android.monitorV2.lynx.p743c.p744a;

import com.bytedance.android.monitorV2.p728a.AbstractC12067b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.bytedance.android.monitorV2.lynx.c.a.a */
public final class C12164a {

    /* renamed from: a */
    private Map<String, List<AbstractC12067b>> f29260a = new WeakHashMap();

    static {
        Covode.recordClassIndex(13893);
    }

    /* renamed from: a */
    public final List<AbstractC12067b> mo19532a(String str) {
        List<AbstractC12067b> remove;
        MethodCollector.m26663i(6155);
        synchronized (this) {
            try {
                remove = this.f29260a.remove(str);
            } finally {
                MethodCollector.m26664o(6155);
            }
        }
        return remove;
    }

    /* renamed from: a */
    public final void mo19533a(String str, AbstractC12067b bVar) {
        MethodCollector.m26663i(6154);
        synchronized (this) {
            try {
                List<AbstractC12067b> list = this.f29260a.get(str);
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(bVar);
                this.f29260a.put(str, list);
            } finally {
                MethodCollector.m26664o(6154);
            }
        }
    }
}
