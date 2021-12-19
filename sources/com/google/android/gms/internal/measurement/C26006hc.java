package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.hc */
final class C26006hc extends AbstractC26004ha {

    /* renamed from: c */
    private static final Class<?> f61282c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private C26006hc() {
        super((byte) 0);
    }

    static {
        Covode.recordClassIndex(31421);
    }

    /* synthetic */ C26006hc(byte b) {
        this();
    }

    /* renamed from: c */
    private static <E> List<E> m50637c(Object obj, long j) {
        return (List) C26065jh.m50971f(obj, j);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC26004ha
    /* renamed from: a */
    public final <L> List<L> mo42659a(Object obj, long j) {
        return m50636a(obj, j, 10);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC26004ha
    /* renamed from: b */
    public final void mo42661b(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) C26065jh.m50971f(obj, j);
        if (list instanceof AbstractC26005hb) {
            unmodifiableList = ((AbstractC26005hb) list).mo42654e();
        } else if (!f61282c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof AbstractC26033ic) || !(list instanceof AbstractC25995gs)) {
                unmodifiableList = Collections.unmodifiableList(list);
            } else {
                AbstractC25995gs gsVar = (AbstractC25995gs) list;
                if (gsVar.mo42366a()) {
                    gsVar.mo42371b();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        C26065jh.m50955a(obj, j, unmodifiableList);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC26004ha
    /* renamed from: a */
    public final <E> void mo42660a(Object obj, Object obj2, long j) {
        List c = m50637c(obj2, j);
        List a = m50636a(obj, j, c.size());
        int size = a.size();
        int size2 = c.size();
        if (size > 0) {
            if (size2 > 0) {
                a.addAll(c);
            }
            c = a;
        }
        C26065jh.m50955a(obj, j, c);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: java.util.ArrayList */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private static <L> List<L> m50636a(Object obj, long j, int i) {
        C26001gy gyVar;
        List<L> arrayList;
        List<L> c = m50637c(obj, j);
        if (c.isEmpty()) {
            if (c instanceof AbstractC26005hb) {
                arrayList = new C26001gy(i);
            } else if (!(c instanceof AbstractC26033ic) || !(c instanceof AbstractC25995gs)) {
                arrayList = new ArrayList<>(i);
            } else {
                arrayList = ((AbstractC25995gs) c).mo42382a(i);
            }
            C26065jh.m50955a(obj, j, arrayList);
            return arrayList;
        }
        if (f61282c.isAssignableFrom(c.getClass())) {
            ArrayList arrayList2 = new ArrayList(c.size() + i);
            arrayList2.addAll(c);
            C26065jh.m50955a(obj, j, arrayList2);
            gyVar = arrayList2;
        } else if (c instanceof C26060jc) {
            C26001gy gyVar2 = new C26001gy(c.size() + i);
            gyVar2.addAll(c);
            C26065jh.m50955a(obj, j, gyVar2);
            gyVar = gyVar2;
        } else if (!(c instanceof AbstractC26033ic) || !(c instanceof AbstractC25995gs)) {
            return c;
        } else {
            AbstractC25995gs gsVar = (AbstractC25995gs) c;
            if (gsVar.mo42366a()) {
                return c;
            }
            AbstractC25995gs a = gsVar.mo42382a(c.size() + i);
            C26065jh.m50955a(obj, j, a);
            return a;
        }
        return gyVar;
    }
}
