package com.p2082ss.android.ugc.aweme.common;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39220y;
import com.p2082ss.android.ugc.aweme.model.AbstractC60142d;
import com.p2082ss.android.ugc.aweme.model.AbstractC60154n;
import com.p2082ss.android.ugc.aweme.model.C60152l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.common.z */
public final class C39222z {

    /* renamed from: a */
    public static final LinkedList<AbstractC60154n> f92644a = new LinkedList<>();

    /* renamed from: b */
    public static AbstractC39075aa f92645b;

    /* renamed from: c */
    public static final C39222z f92646c = new C39222z();

    private C39222z() {
    }

    /* renamed from: a */
    public static void m79578a() {
        f92644a.clear();
        f92645b = null;
    }

    static {
        Covode.recordClassIndex(46855);
    }

    /* renamed from: b */
    public static void m79582b() {
        AbstractC39075aa aaVar;
        LinkedList<AbstractC60154n> linkedList = f92644a;
        if ((!linkedList.isEmpty()) && (aaVar = f92645b) != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(C39220y.C39221a.m79574a(linkedList.getFirst().mo97829d(), true));
            aaVar.mo67831a(arrayList, !linkedList.isEmpty());
        }
    }

    /* renamed from: a */
    public static void m79579a(AbstractC39075aa aaVar) {
        C89219l.m154721d(aaVar, "");
        f92645b = aaVar;
    }

    /* renamed from: a */
    public static void m79580a(AbstractC60154n nVar) {
        C89219l.m154721d(nVar, "");
        LinkedList<AbstractC60154n> linkedList = f92644a;
        linkedList.add(nVar);
        if (linkedList.size() == 1) {
            m79582b();
        }
    }

    /* renamed from: a */
    public static List<C39220y> m79577a(AbstractC60142d dVar) {
        C89219l.m154721d(dVar, "");
        ArrayList arrayList = new ArrayList();
        for (C60152l lVar : dVar.mo97820f().values()) {
            arrayList.add(C39220y.C39221a.m79572a(lVar.f137116b, lVar.f137115a));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m79581a(String str) {
        C89219l.m154721d(str, "");
        Iterator<AbstractC60154n> it = f92644a.iterator();
        while (it.hasNext()) {
            if (C89219l.m154714a((Object) str, (Object) it.next().mo97829d())) {
                return true;
            }
        }
        return false;
    }
}
