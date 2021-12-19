package com.p2082ss.android.ugc.aweme.share.silent;

import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.auth.AbstractC20884a;
import com.bytedance.lobby.auth.AuthResult;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.trill.p4373c.p4374a.C85079a;

/* renamed from: com.ss.android.ugc.aweme.share.silent.q */
final /* synthetic */ class C69469q implements AbstractC20884a {

    /* renamed from: a */
    private final C69461j f155186a;

    static {
        Covode.recordClassIndex(81807);
    }

    C69469q(C69461j jVar) {
        this.f155186a = jVar;
    }

    @Override // com.bytedance.lobby.auth.AbstractC20884a
    /* renamed from: a */
    public final void mo34320a(AuthResult authResult) {
        C69461j jVar = this.f155186a;
        if (authResult.f49367a) {
            String str = authResult.f49372f;
            String str2 = authResult.f49373g;
            jVar.mo109712a(jVar.f155166b, true);
            C31575b.m65865g().updateHasTwitterToken(true);
            C31575b.m65865g().updateTwExpireTime();
            SharePrefCache.inst().getTwitterAccessToken().mo59940b(str);
            SharePrefCache.inst().getTwitterSecret().mo59940b(str2);
            SharePrefCache.inst().getAutoSendTwitter().mo59940b(true);
            C85079a.m146284c(str, str2);
        }
    }
}
