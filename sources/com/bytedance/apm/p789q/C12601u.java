package com.bytedance.apm.p789q;

import com.bytedance.covode.number.Covode;
import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/* renamed from: com.bytedance.apm.q.u */
public final class C12601u<E extends Comparable> {

    /* renamed from: a */
    private PriorityQueue<E> f30654a;

    /* renamed from: b */
    private int f30655b;

    static {
        Covode.recordClassIndex(14418);
    }

    /* renamed from: a */
    public final List<E> mo20415a() {
        ArrayList arrayList = new ArrayList(this.f30654a);
        Collections.sort(arrayList);
        return arrayList;
    }

    public C12601u(int i) {
        if (i > 0) {
            this.f30655b = i;
            this.f30654a = new PriorityQueue<>(i, new Comparator<E>() {
                /* class com.bytedance.apm.p789q.C12601u.C126021 */

                static {
                    Covode.recordClassIndex(14419);
                }

                @Override // java.util.Comparator
                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    return ((Comparable) obj).compareTo(obj2);
                }
            });
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public final void mo20416a(E e) {
        if (this.f30654a.size() < this.f30655b) {
            this.f30654a.add(e);
        } else if (e.compareTo(this.f30654a.peek()) > 0) {
            this.f30654a.poll();
            this.f30654a.add(e);
        }
    }
}
