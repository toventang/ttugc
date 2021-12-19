package com.bytedance.lobby.twitter;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.C20879a;
import com.bytedance.lobby.C20891c;
import com.bytedance.lobby.C20892d;
import com.bytedance.lobby.auth.AbstractC20888d;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.auth.C20885b;
import com.bytedance.lobby.internal.LobbyCore;
import com.bytedance.lobby.internal.LobbyViewModel;
import com.bytedance.lobby.p1493b.C20890a;
import com.twitter.sdk.android.core.AbstractC87682b;
import com.twitter.sdk.android.core.AbstractC87793j;
import com.twitter.sdk.android.core.C87690h;
import com.twitter.sdk.android.core.C87794k;
import com.twitter.sdk.android.core.C87808q;
import com.twitter.sdk.android.core.C87810s;
import com.twitter.sdk.android.core.C87814u;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.identity.AbstractC87694a;
import com.twitter.sdk.android.core.identity.C87705h;
import com.twitter.sdk.android.core.identity.TwitterAuthClient;
import java.util.Arrays;

public class TwitterAuth extends TwitterProvider<AuthResult> implements AbstractC20888d {

    /* renamed from: b */
    public static final boolean f49491b = C20879a.f49364a;

    /* renamed from: d */
    public LobbyViewModel f49492d;

    /* renamed from: e */
    private C87705h f49493e;

    /* renamed from: f */
    private AbstractC87682b<C87814u> f49494f;

    @Override // com.bytedance.lobby.auth.AbstractC20888d
    /* renamed from: a */
    public final void mo34323a() {
        this.f49493e = null;
    }

    @Override // com.bytedance.lobby.auth.AbstractC20888d
    /* renamed from: a */
    public final void mo34324a(int i) {
    }

    static {
        Covode.recordClassIndex(24537);
    }

    @Override // com.bytedance.lobby.auth.AbstractC20888d
    /* renamed from: b */
    public final String mo34327b() {
        C87814u a;
        TwitterAuthToken twitterAuthToken;
        AbstractC87793j<C87814u> jVar = C87808q.m152816a().f199461b;
        if (jVar == null || jVar.mo142121a() == null || (a = jVar.mo142121a()) == null || a.f199192a == null || (twitterAuthToken = (TwitterAuthToken) a.f199192a) == null) {
            return null;
        }
        return twitterAuthToken.f199173b;
    }

    public TwitterAuth(C20892d dVar) {
        super(LobbyCore.getApplication(), dVar);
    }

    @Override // com.bytedance.lobby.auth.AbstractC20888d
    /* renamed from: b */
    public final void mo34328b(ActivityC0945e eVar, Bundle bundle) {
        C20885b.m39240a(this.f49492d, this.f49454c.f49402b);
    }

    @Override // com.bytedance.lobby.auth.AbstractC20888d
    /* renamed from: a */
    public final void mo34326a(ActivityC0945e eVar, Bundle bundle) {
        this.f49492d = LobbyViewModel.m39332a(eVar);
        if (!mo34350t_()) {
            C20885b.m39241a(this.f49492d, this.f49454c.f49402b, 1);
            return;
        }
        this.f49493e = new C87705h(eVar);
        C209271 r1 = new AbstractC87682b<C87814u>() {
            /* class com.bytedance.lobby.twitter.TwitterAuth.C209271 */

            static {
                Covode.recordClassIndex(24538);
            }

            @Override // com.twitter.sdk.android.core.AbstractC87682b
            /* renamed from: a */
            public final void mo34386a(C87690h<C87814u> hVar) {
                TwitterAuth twitterAuth = TwitterAuth.this;
                T t = hVar.f199190a;
                String str = ((TwitterAuthToken) t.f199192a).f199173b;
                String str2 = ((TwitterAuthToken) t.f199192a).f199174c;
                AuthResult.C20883a aVar = new AuthResult.C20883a(twitterAuth.f49454c.f49402b, 1);
                aVar.f49377a = true;
                aVar.f49381e = str;
                aVar.f49382f = str2;
                aVar.f49380d = String.valueOf(t.f199193b);
                aVar.f49385i = new C20890a().mo34330a("username", t.f199478c).mo34329a();
                twitterAuth.f49492d.mo34361b(aVar.mo34319a());
            }

            @Override // com.twitter.sdk.android.core.AbstractC87682b
            /* renamed from: a */
            public final void mo34387a(C87810s sVar) {
                String message = sVar.getMessage();
                AuthResult.C20883a aVar = new AuthResult.C20883a(TwitterAuth.this.f49454c.f49402b, 1);
                if (Arrays.asList("Authorize failed.", "Authorization failed, request was canceled.", "Failed to get authorization, bundle incomplete").contains(message)) {
                    aVar.f49377a = false;
                    aVar.f49378b = new C20891c(4, message, "redirect_and_get_token");
                } else {
                    aVar.f49377a = false;
                    aVar.f49378b = new C20891c(sVar);
                }
                TwitterAuth.this.f49492d.mo34361b(aVar.mo34319a());
            }
        };
        this.f49494f = r1;
        this.f49493e.setCallback(r1);
        this.f49493e.performClick();
    }

    @Override // com.bytedance.lobby.auth.AbstractC20888d
    /* renamed from: a */
    public final void mo34325a(ActivityC0945e eVar, int i, int i2, Intent intent) {
        C87705h hVar = this.f49493e;
        if (hVar != null) {
            hVar.getTwitterAuthClient();
            if (i == 140) {
                TwitterAuthClient twitterAuthClient = hVar.getTwitterAuthClient();
                C87794k.m152811c().mo142113b();
                if (!twitterAuthClient.f199198b.mo142139a()) {
                    C87794k.m152811c().mo142112a();
                    return;
                }
                AbstractC87694a aVar = twitterAuthClient.f199198b.f199207a.get();
                if (aVar != null && aVar.mo142137a(i, i2, intent)) {
                    twitterAuthClient.f199198b.f199207a.set(null);
                }
            }
        }
    }
}
