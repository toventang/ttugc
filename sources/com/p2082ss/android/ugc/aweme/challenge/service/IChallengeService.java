package com.p2082ss.android.ugc.aweme.challenge.service;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.music.model.Music;

/* renamed from: com.ss.android.ugc.aweme.challenge.service.IChallengeService */
public interface IChallengeService {

    /* renamed from: com.ss.android.ugc.aweme.challenge.service.IChallengeService$a */
    public interface AbstractC35542a {
        static {
            Covode.recordClassIndex(42765);
        }

        /* renamed from: a */
        void mo62528a(String str, Music music, boolean z);

        /* renamed from: a */
        boolean mo62529a(String str, Challenge challenge);
    }

    static {
        Covode.recordClassIndex(42764);
    }

    /* renamed from: a */
    void mo62526a(String str, String str2, String str3, Music music, AbstractC35542a aVar);
}
