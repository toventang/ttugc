package com.p2082ss.android.ugc.aweme.challenge.api;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.p1243b.AbstractC17788c;
import com.bytedance.ies.powerpreload.p1243b.C17794i;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.challenge.api.ChallengeApi;
import com.p2082ss.android.ugc.aweme.challenge.model.ChallengeAwemeList;
import com.p2082ss.android.ugc.aweme.challenge.p2446b.C35493a;
import com.p2082ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import java.util.HashMap;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.challenge.api.ChallengeNetPreload */
public final class ChallengeNetPreload implements AbstractC17788c<ChallengeApi.RealApi, AbstractFutureC27655q<ChallengeAwemeList>> {
    private String EXTRA_CHALLENGE_IS_HASHTAG = "extra_challenge_is_hashtag";

    static {
        Covode.recordClassIndex(42679);
    }

    @Override // com.bytedance.ies.powerpreload.p1243b.AbstractC17788c
    public final C17794i getPreloadStrategy(Bundle bundle) {
        return new C17794i(0, ChallengeApi.f83696a, false, 5);
    }

    @Override // com.bytedance.ies.powerpreload.p1243b.AbstractC17788c
    public final boolean handleException(Exception exc) {
        C89219l.m154721d(exc, "");
        exc.printStackTrace();
        return true;
    }

    @Override // com.bytedance.ies.powerpreload.p1243b.AbstractC17789d
    public final boolean enable(Bundle bundle) {
        String str;
        if (bundle != null) {
            str = bundle.getString("id", "");
        } else {
            str = null;
        }
        if (str == null || str.length() == 0 || C35493a.m72584a(str, 0, 20, 2, bundle.getBoolean(this.EXTRA_CHALLENGE_IS_HASHTAG, false), "challenge_video", null, null) != null) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.powerpreload.p1243b.AbstractC17788c
    public final AbstractFutureC27655q<ChallengeAwemeList> preload(Bundle bundle, AbstractC89172b<? super Class<ChallengeApi.RealApi>, ? extends ChallengeApi.RealApi> bVar) {
        String str;
        String str2;
        C89219l.m154721d(bVar, "");
        if (bundle == null || (str = bundle.getString("id", "")) == null) {
            str = "";
        }
        boolean z = false;
        if (bundle != null) {
            z = bundle.getBoolean(this.EXTRA_CHALLENGE_IS_HASHTAG, false);
        }
        if (CommerceChallengeServiceImpl.m75741e().mo65393b(str)) {
            str2 = ChallengeApi.f83700e;
        } else {
            str2 = ChallengeApi.f83697b;
        }
        HashMap hashMap = new HashMap();
        if (z) {
            hashMap.put("hashtag_name", str);
            hashMap.put("query_type", "1");
        } else {
            hashMap.put("ch_id", str);
            hashMap.put("query_type", "0");
        }
        hashMap.put("cursor", "0");
        hashMap.put("count", "20");
        hashMap.put(StringSet.type, "5");
        hashMap.put("source", "challenge_video");
        AbstractFutureC27655q<ChallengeAwemeList> challengeAwemeList = ((ChallengeApi.RealApi) bVar.invoke(ChallengeApi.RealApi.class)).getChallengeAwemeList(str2, hashMap);
        C89219l.m154716b(challengeAwemeList, "");
        return challengeAwemeList;
    }
}
