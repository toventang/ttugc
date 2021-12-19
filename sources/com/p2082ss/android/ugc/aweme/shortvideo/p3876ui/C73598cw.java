package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import com.bytedance.als.AbstractC2565m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.p3834g.C71853a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3834g.C71859c;
import java.util.Iterator;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.cw */
final /* synthetic */ class C73598cw implements AbstractC2565m {

    /* renamed from: a */
    private final C73560cj f165415a;

    static {
        Covode.recordClassIndex(86336);
    }

    C73598cw(C73560cj cjVar) {
        this.f165415a = cjVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
    public final void onChanged(Object obj) {
        T next;
        C73560cj cjVar = this.f165415a;
        if (((Boolean) obj).booleanValue()) {
            C71859c cVar = cjVar.f165306ad;
            Iterator<T> it = cVar.mo113506b().iterator();
            if (!it.hasNext()) {
                next = null;
            } else {
                next = it.next();
                if (it.hasNext()) {
                    int i = next.f161035c;
                    do {
                        T next2 = it.next();
                        int i2 = next2.f161035c;
                        if (i < i2) {
                            next = next2;
                            i = i2;
                        }
                    } while (it.hasNext());
                }
            }
            T t = next;
            if (t != null) {
                t.f161036d.invoke();
                C71853a a = cVar.mo113504a();
                C89219l.m154721d(t, "");
                int a2 = a.mo113499a(t) + 1;
                a.mo113500a().storeInt(t.f161033a, a2);
                C71853a.C71854a.m126878a().put(t.f161033a, Integer.valueOf(a2));
            }
            cVar.mo113506b().clear();
        }
    }
}
