package com.p2082ss.android.ugc.aweme.challenge.p2451g;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.base.p2377h.C34597d;
import com.p2082ss.android.ugc.aweme.challenge.data.C35505a;
import com.p2082ss.android.ugc.aweme.challenge.data.C35511d;
import com.p2082ss.android.ugc.aweme.challenge.data.C35514e;
import com.p2082ss.android.ugc.aweme.challenge.data.C35515f;
import com.p2082ss.android.ugc.aweme.challenge.model.ChallengeList;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.challenge.g.e */
final /* synthetic */ class CallableC35526e implements Callable {

    /* renamed from: a */
    static final Callable f83789a = new CallableC35526e();

    static {
        Covode.recordClassIndex(42722);
    }

    private CallableC35526e() {
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        List<C35514e> a;
        ChallengeList challengeList = new ChallengeList();
        ArrayList arrayList = new ArrayList();
        if (TextUtils.equals(C34597d.m70637d().mo61051a("hash_tag_history_version", ""), "")) {
            C34597d.m70637d().mo61057b("hash_tag_history_version", "v2");
            if (!AccountService.m65215a().mo57069e().isLogin() && (a = C35515f.m72611a()) != null && a.size() > 0) {
                C35511d.m72605a().mo62411a(a);
                for (C35514e eVar : a) {
                    Challenge challenge = new Challenge();
                    challenge.setChallengeName(eVar.f83751a);
                    arrayList.add(challenge);
                }
            }
        } else {
            List<C35505a> list = C35511d.m72605a().f83744b;
            if (list != null && list.size() > 0) {
                for (C35505a aVar : list) {
                    Challenge challenge2 = new Challenge();
                    challenge2.setChallengeName(aVar.f83732a);
                    arrayList.add(challenge2);
                }
            }
        }
        challengeList.items = arrayList;
        return challengeList;
    }
}
