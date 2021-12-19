package com.facebook.internal.p1899b.p1900a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.internal.p1899b.AbstractC24713a;
import com.facebook.internal.p1899b.AbstractC24725c;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.facebook.internal.b.a.d */
public final class C24719d implements AbstractC24725c {

    /* renamed from: a */
    private static C24719d f58701a;

    /* renamed from: c */
    private static final Integer f58702c = 100;

    /* renamed from: b */
    private Queue<AbstractC24713a> f58703b = new LinkedList();

    @Override // com.facebook.internal.p1899b.AbstractC24725c
    /* renamed from: a */
    public final boolean mo40559a() {
        return this.f58703b.isEmpty();
    }

    static {
        Covode.recordClassIndex(28872);
    }

    private C24719d() {
    }

    @Override // com.facebook.internal.p1899b.AbstractC24725c
    /* renamed from: b */
    public final AbstractC24713a mo40561b() {
        return this.f58703b.poll();
    }

    /* renamed from: c */
    public static synchronized C24719d m47340c() {
        C24719d dVar;
        synchronized (C24719d.class) {
            MethodCollector.m26663i(9642);
            if (f58701a == null) {
                f58701a = new C24719d();
            }
            dVar = f58701a;
            MethodCollector.m26664o(9642);
        }
        return dVar;
    }

    @Override // com.facebook.internal.p1899b.AbstractC24725c
    /* renamed from: a */
    public final boolean mo40560a(Collection<? extends AbstractC24713a> collection) {
        if (collection != null) {
            this.f58703b.addAll(collection);
        }
        if (this.f58703b.size() >= f58702c.intValue()) {
            return true;
        }
        return false;
    }
}
