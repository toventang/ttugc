package com.p2082ss.android.ugc.aweme.challenge.p2451g;

import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.challenge.g.h */
public final class C35530h {

    /* renamed from: a */
    public static final C35530h f83793a = new C35530h();

    private C35530h() {
    }

    static {
        Covode.recordClassIndex(42726);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<T> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: ? super T */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final <T> void m72624a(List<T> list, List<? extends T> list2, AbstractC89183m<? super T, ? super T, Boolean> mVar) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        C89219l.m154721d(mVar, "");
        if (!C13603b.m24435a((Collection) list2)) {
            Iterator<? extends T> it = list2.iterator();
            while (it.hasNext()) {
                Object obj = (Object) it.next();
                if (obj != 0) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object obj2 = (Object) it2.next();
                        if (mVar.invoke(obj2, obj).booleanValue()) {
                            if (obj2 != 0) {
                            }
                        }
                    }
                    list.add(obj);
                }
            }
        }
    }
}
