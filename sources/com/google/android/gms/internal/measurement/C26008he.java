package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.he */
final class C26008he extends AbstractC26004ha {
    static {
        Covode.recordClassIndex(31423);
    }

    private C26008he() {
        super((byte) 0);
    }

    /* synthetic */ C26008he(byte b) {
        this();
    }

    /* renamed from: c */
    private static <E> AbstractC25995gs<E> m50647c(Object obj, long j) {
        return (AbstractC25995gs) C26065jh.m50971f(obj, j);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC26004ha
    /* renamed from: b */
    public final void mo42661b(Object obj, long j) {
        m50647c(obj, j).mo42371b();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC26004ha
    /* renamed from: a */
    public final <L> List<L> mo42659a(Object obj, long j) {
        int i;
        AbstractC25995gs c = m50647c(obj, j);
        if (c.mo42366a()) {
            return c;
        }
        int size = c.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size << 1;
        }
        AbstractC25995gs a = c.mo42382a(i);
        C26065jh.m50955a(obj, j, a);
        return a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.google.android.gms.internal.measurement.gs] */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC26004ha
    /* renamed from: a */
    public final <E> void mo42660a(Object obj, Object obj2, long j) {
        AbstractC25995gs<E> c = m50647c(obj, j);
        AbstractC25995gs<E> c2 = m50647c(obj2, j);
        int size = c.size();
        int size2 = c2.size();
        AbstractC25995gs<E> gsVar = c;
        if (size > 0) {
            if (size2 > 0) {
                boolean a = c.mo42366a();
                AbstractC25995gs<E> gsVar2 = c;
                if (!a) {
                    gsVar2 = c.mo42382a(size2 + size);
                }
                gsVar2.addAll(c2);
                gsVar = gsVar2;
            }
            c2 = gsVar;
        }
        C26065jh.m50955a(obj, j, c2);
    }
}
