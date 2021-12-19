package com.p2082ss.android.ugc.aweme.share.p3767m;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.share.C68862ag;
import com.p2082ss.android.ugc.aweme.share.p3748f.C68925b;
import com.p2082ss.android.ugc.aweme.share.p3754i.C68960a;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.m.c */
public final class C69304c {

    /* renamed from: a */
    public static final C69304c f154869a = new C69304c();

    private C69304c() {
    }

    static {
        Covode.recordClassIndex(81634);
    }

    /* renamed from: a */
    public static boolean m122502a(AbstractC69581b bVar) {
        C89219l.m154721d(bVar, "");
        return m122504b(bVar);
    }

    /* renamed from: b */
    private static boolean m122504b(AbstractC69581b bVar) {
        C89219l.m154721d(bVar, "");
        if ((C68925b.m121620b() || C68925b.m121621c() || C68925b.m121622d()) && C89219l.m154714a((Object) bVar.mo109548a(), (Object) "whatsapp")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m122503a(AbstractC69581b bVar, boolean z) {
        C89219l.m154721d(bVar, "");
        if (C68925b.m121619a() && C89219l.m154714a((Object) bVar.mo109548a(), (Object) "whatsapp")) {
            return true;
        }
        if (m122504b(bVar)) {
            return false;
        }
        C68960a a = C68960a.m121644a();
        C89219l.m154716b(a, "");
        List<C68862ag> list = a.f154275a;
        if (list == null || list.isEmpty()) {
            return z;
        }
        for (C68862ag agVar : list) {
            C89219l.m154716b(agVar, "");
            if (C89219l.m154714a((Object) agVar.f154008a, (Object) bVar.mo109548a())) {
                if (agVar.f154010c == 0) {
                    return true;
                }
                return false;
            }
        }
        return z;
    }
}
