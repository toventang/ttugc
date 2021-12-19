package com.bytedance.android.live.liveinteract.multiguest.p316a.p319c;

import com.bytedance.android.livesdk.chatroom.model.p495b.C7664c;
import com.bytedance.android.livesdk.chatroom.model.p495b.C7666e;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.c.e */
public final class C5166e {

    /* renamed from: a */
    public static final C5166e f13378a = new C5166e();

    private C5166e() {
    }

    static {
        Covode.recordClassIndex(5758);
    }

    /* renamed from: a */
    public static C7666e m11414a(C7664c cVar, int i) {
        C89219l.m154721d(cVar, "");
        C7666e eVar = new C7666e();
        eVar.f19001c = cVar.f18989a;
        eVar.f19002d = cVar.f18990b;
        eVar.f19004f = cVar.f18991c;
        eVar.f19005g = cVar.f18992d;
        eVar.f19008j = cVar.f18995g;
        eVar.f19006h = cVar.f18993e;
        eVar.f18999a = cVar.f18994f;
        if (i != -1) {
            eVar.f19003e = i;
        } else {
            eVar.f19003e = cVar.f18996h;
        }
        return eVar;
    }

    /* renamed from: a */
    public static List<C7666e> m11415a(List<? extends C7664c> list, int i) {
        ArrayList arrayList = new ArrayList();
        if (list == null || list.isEmpty()) {
            return arrayList;
        }
        ArrayList<Object> arrayList2 = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(m11414a((C7664c) it.next(), i));
        }
        for (Object obj : arrayList2) {
            arrayList.add(obj);
        }
        return arrayList;
    }
}
