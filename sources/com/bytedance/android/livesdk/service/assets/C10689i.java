package com.bytedance.android.livesdk.service.assets;

import com.bytedance.android.live.base.model.user.C2997d;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.gift.model.C8848l;
import com.bytedance.android.livesdk.gift.model.C8859w;
import com.bytedance.android.livesdk.model.message.C9895y;
import com.bytedance.android.livesdk.model.message.p579c.C9698b;
import com.bytedance.android.livesdk.model.message.p579c.C9700d;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.p692h.C11778b;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.service.assets.i */
public final class C10689i {
    static {
        Covode.recordClassIndex(12286);
    }

    /* renamed from: a */
    private static boolean m19255a(User user, long j) {
        if (user.getId() == j) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C9895y m19254a(long j, C8859w wVar, User user, User user2) {
        C9895y yVar = new C9895y();
        C11778b bVar = new C11778b();
        bVar.f28137c = j;
        bVar.f28138d = wVar.f21790k;
        bVar.f28141g = true;
        bVar.f28140f = wVar.f21784e;
        bVar.f28144j = wVar.f21781b;
        yVar.f28134O = bVar;
        C9698b bVar2 = wVar.f21781b;
        if (bVar2 != null && !C13603b.m24435a((Collection) bVar2.f23648d)) {
            Iterator<C9700d> it = bVar2.f23648d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C9700d next = it.next();
                if (next.f23660d != null && next.f23660d.f23677a != null && m19255a(next.f23660d.f23677a, C11115u.m19743a().mo17915b().mo13161c())) {
                    User user3 = next.f23660d.f23677a;
                    if (user3 != null) {
                        yVar.f23932g = user3;
                    }
                }
            }
        }
        if (user2 != null) {
            yVar.f23932g = user2;
        } else {
            yVar.f23932g = C2997d.C2998a.m8305a();
        }
        yVar.f23935j = wVar.f21788i;
        yVar.f23936k = wVar.f21782c;
        yVar.f23934i = wVar.f21785f;
        yVar.f23933h = user;
        yVar.f23939n = wVar.f21789j;
        yVar.f23940o = wVar.f21786g;
        yVar.f23941p = wVar.f21787h;
        yVar.f23944s = true;
        yVar.f16442c = true;
        yVar.f23945t = GiftManager.inst().findGiftById(wVar.f21785f);
        yVar.f23947v = wVar.f21800u;
        return yVar;
    }

    /* renamed from: b */
    public static List<C9895y> m19256b(long j, C8859w wVar, User user, User user2) {
        List<C8848l> list;
        ArrayList arrayList = new ArrayList();
        if (wVar == null || (list = wVar.f21794o) == null) {
            return arrayList;
        }
        for (C8848l lVar : list) {
            C9895y yVar = new C9895y();
            C11778b bVar = new C11778b();
            bVar.f28137c = j;
            bVar.f28138d = lVar.f21739g;
            bVar.f28141g = true;
            bVar.f28140f = lVar.f21734b;
            bVar.f28144j = lVar.f21733a;
            yVar.f28134O = bVar;
            C9698b bVar2 = lVar.f21733a;
            if (bVar2 != null && !C13603b.m24435a((Collection) bVar2.f23648d)) {
                Iterator<C9700d> it = bVar2.f23648d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C9700d next = it.next();
                    if (next.f23660d != null && next.f23660d.f23677a != null && m19255a(next.f23660d.f23677a, C11115u.m19743a().mo17915b().mo13161c())) {
                        User user3 = next.f23660d.f23677a;
                        if (user3 != null) {
                            yVar.f23932g = user3;
                        }
                    }
                }
            }
            if (user2 != null) {
                yVar.f23932g = user2;
            } else {
                yVar.f23932g = C2997d.C2998a.m8305a();
            }
            yVar.f23935j = lVar.f21737e;
            yVar.f23936k = wVar.f21782c;
            yVar.f23934i = lVar.f21735c;
            yVar.f23933h = user;
            yVar.f23939n = lVar.f21738f;
            yVar.f23940o = lVar.f21736d;
            yVar.f23941p = wVar.f21787h;
            yVar.f23944s = true;
            yVar.f16442c = true;
            yVar.f23946u = lVar.f21740h;
            if (lVar.f21741i != null) {
                yVar.f23945t = lVar.f21741i;
            } else {
                yVar.f23945t = GiftManager.inst().findGiftById(wVar.f21785f);
            }
            yVar.f23947v = wVar.f21800u;
            arrayList.add(yVar);
        }
        return arrayList;
    }
}
