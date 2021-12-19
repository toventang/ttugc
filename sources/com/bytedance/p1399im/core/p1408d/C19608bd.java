package com.bytedance.p1399im.core.p1408d;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.im.core.d.bd */
public final class C19608bd {

    /* renamed from: a */
    public final Map<Integer, Long> f46597a = new ConcurrentHashMap(20);

    static {
        Covode.recordClassIndex(22452);
    }

    public final String toString() {
        return "TraceStruct{innerStorage=" + this.f46597a + '}';
    }

    /* renamed from: a */
    public final void mo31390a(int i, long j) {
        this.f46597a.put(Integer.valueOf(i), Long.valueOf(j));
    }
}
