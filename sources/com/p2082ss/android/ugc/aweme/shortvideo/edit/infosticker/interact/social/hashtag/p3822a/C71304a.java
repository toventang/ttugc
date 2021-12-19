package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.p3822a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p2082ss.android.ugc.aweme.shortvideo.C70752e;
import com.p2082ss.android.ugc.aweme.video.hashtag.C80735b;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.a.a */
public final class C71304a {

    /* renamed from: a */
    public static final C71304a f159806a = new C71304a();

    private C71304a() {
    }

    static {
        Covode.recordClassIndex(83825);
    }

    /* renamed from: a */
    public static void m125995a(List<C80735b> list, List<? extends AVChallenge> list2) {
        if (list2 != null) {
            for (AVChallenge aVChallenge : list2) {
                C80735b bVar = new C80735b();
                bVar.f180511b = 2;
                bVar.f180515f = "history";
                bVar.f180510a = aVChallenge;
                bVar.f180513d = true;
                list.add(bVar);
            }
        }
    }

    /* renamed from: a */
    public static void m125996a(List<C80735b> list, List<? extends AVChallenge> list2, List<? extends C70752e> list3) {
        HashSet hashSet = new HashSet();
        if (list2 != null) {
            for (AVChallenge aVChallenge : list2) {
                hashSet.add(aVChallenge.challengeName);
            }
        }
        for (C70752e eVar : list3) {
            if (!hashSet.contains(eVar.f158374c.challengeName)) {
                C80735b bVar = new C80735b();
                bVar.f180511b = 2;
                if (eVar.f158372a == 4) {
                    bVar.f180515f = "history";
                } else if (eVar.f158372a == 0) {
                    bVar.f180515f = "recommendation";
                } else {
                    bVar.f180515f = "commercial";
                }
                bVar.f180510a = eVar.f158374c;
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
}
