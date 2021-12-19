package com.p2082ss.android.ugc.aweme.ftc.p3040l.p3041a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.gamora.recorder.p4307n.C83938b;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.l.a.h */
public final class C52707h {

    /* renamed from: a */
    public static final C52707h f121322a = new C52707h();

    private C52707h() {
    }

    static {
        Covode.recordClassIndex(62103);
    }

    /* renamed from: a */
    public static final List<C83938b> m97577a(AbstractC52708i iVar) {
        int i;
        C89219l.m154721d(iVar, "");
        ArrayList arrayList = new ArrayList();
        List<C83938b> a = iVar.mo88379a();
        int c = iVar.mo88387c();
        if (a.size() > c) {
            if (iVar.mo88384b() != null) {
                i = 1;
            } else {
                i = 0;
            }
            arrayList.addAll(a.subList(c - i, a.size()));
        }
        return arrayList;
    }

    /* renamed from: a */
    private static final List<C83938b> m97578a(List<? extends C83938b> list, int i) {
        ArrayList arrayList = new ArrayList();
        if (list.size() > i) {
            arrayList.addAll(list.subList(0, i));
        } else {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static final List<C83938b> m97579a(List<? extends C83938b> list, int i, C83938b bVar) {
        int i2;
        C89219l.m154721d(list, "");
        if (list.size() <= i) {
            return m97578a(list, i);
        }
        if (bVar != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        List<C83938b> a = m97578a(list, i - i2);
        if (bVar == null) {
            return a;
        }
        a.add(bVar);
        return a;
    }
}
