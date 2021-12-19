package com.p2082ss.android.ugc.gamora.recorder.p4307n.p4308a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.gamora.recorder.p4307n.C83938b;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.recorder.n.a.j */
public final class C83937j {

    /* renamed from: a */
    public static final C83937j f187372a = new C83937j();

    private C83937j() {
    }

    static {
        Covode.recordClassIndex(97828);
    }

    /* renamed from: a */
    public static final List<C83938b> m144371a(AbstractC83906b bVar) {
        int i;
        C89219l.m154721d(bVar, "");
        ArrayList arrayList = new ArrayList();
        List<C83938b> a = bVar.mo128791a();
        int c = bVar.mo128799c();
        if (a.size() > c) {
            if (bVar.mo128796b() != null) {
                i = 1;
            } else {
                i = 0;
            }
            arrayList.addAll(a.subList(c - i, a.size()));
        }
        return arrayList;
    }

    /* renamed from: a */
    private static final List<C83938b> m144372a(List<? extends C83938b> list, int i) {
        ArrayList arrayList = new ArrayList();
        if (list.size() > i) {
            arrayList.addAll(list.subList(0, i));
        } else {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static final List<C83938b> m144373a(List<? extends C83938b> list, int i, C83938b bVar) {
        int i2;
        C89219l.m154721d(list, "");
        if (list.size() <= i) {
            return m144372a(list, i);
        }
        if (bVar != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        List<C83938b> a = m144372a(list, i - i2);
        if (bVar == null) {
            return a;
        }
        a.add(bVar);
        return a;
    }
}
