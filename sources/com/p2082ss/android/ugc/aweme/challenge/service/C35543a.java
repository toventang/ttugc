package com.p2082ss.android.ugc.aweme.challenge.service;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.challenge.api.ChallengeApi;
import com.p2082ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.p2082ss.android.ugc.aweme.challenge.service.IChallengeService;
import com.p2082ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.challenge.service.a */
public final class C35543a implements IChallengeService {
    static {
        Covode.recordClassIndex(42766);
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.service.a$a */
    static class C35544a {

        /* renamed from: a */
        public static final C35543a f83822a = new C35543a();

        static {
            Covode.recordClassIndex(42767);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.service.IChallengeService
    /* renamed from: a */
    public final void mo62526a(String str, String str2, String str3, Music music, IChallengeService.AbstractC35542a aVar) {
        C1731i<ChallengeDetail> fetchChallengeDetail;
        boolean z = false;
        if (!CommerceChallengeServiceImpl.m75741e().mo65393b(str2) || C80580in.m139687c()) {
            fetchChallengeDetail = ChallengeApi.f83702g.fetchChallengeDetail(str2, null, 0, 0);
            z = true;
        } else {
            fetchChallengeDetail = ChallengeApi.m72575a(str2, null);
        }
        fetchChallengeDetail.mo5538b(new C35545b(z, str2), C1731i.f5562a).mo5534a(new C35546c(str, str3, music, aVar), C1731i.f5564c, null);
    }
}
