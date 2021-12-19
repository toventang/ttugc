package com.p2082ss.android.ugc.aweme.video.hashtag.helper;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p2082ss.android.ugc.aweme.shortvideo.C70752e;
import com.p2082ss.android.ugc.aweme.shortvideo.C71832f;
import com.p2082ss.android.ugc.aweme.video.hashtag.C80735b;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.video.hashtag.helper.a */
public final class C80746a {

    /* renamed from: a */
    public static final C80746a f180543a = new C80746a();

    private C80746a() {
    }

    static {
        Covode.recordClassIndex(94036);
    }

    /* renamed from: a */
    public static final List<C80735b> m140000a(List<? extends AVChallenge> list, C71832f fVar) {
        List<? extends C70752e> list2;
        boolean z;
        boolean z2;
        LinkedList linkedList = new LinkedList();
        if (fVar != null) {
            list2 = fVar.f160978a;
            z2 = fVar.f160979b;
            z = fVar.f160980c;
        } else {
            list2 = null;
            z = false;
            z2 = true;
        }
        if (list != null && z2) {
            m140002a(linkedList, list, list2);
        }
        m140001a(linkedList, list2);
        int i = 20;
        if (list2 != null && !list2.isEmpty() && !z) {
            i = ((C70752e) list2.get(list2.size() - 1)).f158373b + 1;
        }
        if (i <= linkedList.size() - 1) {
            return linkedList.subList(0, i);
        }
        return linkedList;
    }

    /* renamed from: a */
    private static void m140001a(List<C80735b> list, List<? extends C70752e> list2) {
        if (list2 != null) {
            for (C70752e eVar : list2) {
                C80735b bVar = new C80735b();
                bVar.f180511b = 2;
                if (eVar.f158372a == 0) {
                    bVar.f180515f = "recommendation";
                } else {
                    bVar.f180515f = "commercial";
                }
                bVar.f180510a = eVar.f158374c;
                if (eVar.f158372a == 2) {
                    bVar.f180512c = 2131232459;
                } else if (eVar.f158372a == 3) {
                    bVar.f180512c = 2131232626;
                } else {
                    bVar.f180512c = -1;
                }
                bVar.f180514e = eVar.f158375d;
                if (eVar.f158373b > list.size()) {
                    list.add(bVar);
                } else if (eVar.f158373b < 0) {
                    list.add(0, bVar);
                } else {
                    list.add(eVar.f158373b, bVar);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m140002a(List<C80735b> list, List<? extends AVChallenge> list2, List<? extends C70752e> list3) {
        HashSet hashSet = new HashSet();
        if (list3 != null) {
            for (C70752e eVar : list3) {
                hashSet.add(eVar.f158374c.challengeName);
            }
        }
        for (AVChallenge aVChallenge : list2) {
            C80735b bVar = new C80735b();
            bVar.f180511b = 2;
            bVar.f180515f = "history";
            bVar.f180510a = aVChallenge;
            bVar.f180512c = 2131232625;
            bVar.f180513d = true;
            if (!hashSet.contains(aVChallenge.getChallengeName())) {
                list.add(bVar);
            }
        }
    }
}
