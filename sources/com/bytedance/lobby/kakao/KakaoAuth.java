package com.bytedance.lobby.kakao;

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
import com.bytedance.lobby.internal.LobbyViewModel;
import com.kakao.auth.ApiResponseCallback;
import com.kakao.auth.AuthService;
import com.kakao.auth.AuthType;
import com.kakao.auth.ISessionCallback;
import com.kakao.auth.KakaoSDK;
import com.kakao.auth.Session;
import com.kakao.auth.authorization.accesstoken.AccessToken;
import com.kakao.auth.network.response.AccessTokenInfoResponse;
import com.kakao.network.ErrorResult;
import com.kakao.util.exception.KakaoException;

public class KakaoAuth extends KakaoProvider<AuthResult> implements AbstractC20888d {

    /* renamed from: b */
    public static final boolean f49480b = C20879a.f49364a;

    /* renamed from: d */
    public LobbyViewModel f49481d;

    /* renamed from: e */
    private ISessionCallback f49482e;

    @Override // com.bytedance.lobby.auth.AbstractC20888d
    /* renamed from: a */
    public final void mo34323a() {
    }

    static {
        Covode.recordClassIndex(24527);
    }

    @Override // com.bytedance.lobby.auth.AbstractC20888d
    /* renamed from: b */
    public final String mo34327b() {
        Session currentSession;
        AccessToken tokenInfo;
        if (KakaoSDK.getAdapter() == null || (currentSession = Session.getCurrentSession()) == null || (tokenInfo = currentSession.getTokenInfo()) == null) {
            return null;
        }
        return tokenInfo.getAccessToken();
    }

    public KakaoAuth(C20892d dVar) {
        super(dVar);
    }

    @Override // com.bytedance.lobby.auth.AbstractC20888d
    /* renamed from: a */
    public final void mo34324a(int i) {
        if ((i == 2 || i == 3) && KakaoSDK.getAdapter() != null && Session.getCurrentSession() != null) {
            Session.getCurrentSession().close();
        }
    }

    /* renamed from: a */
    public final void mo34370a(C20891c cVar) {
        AuthResult.C20883a aVar = new AuthResult.C20883a(this.f49454c.f49402b, 1);
        aVar.f49377a = false;
        aVar.f49378b = cVar;
        this.f49481d.mo34361b(aVar.mo34319a());
    }

    @Override // com.bytedance.lobby.auth.AbstractC20888d
    /* renamed from: a */
    public final void mo34326a(ActivityC0945e eVar, Bundle bundle) {
        this.f49481d = LobbyViewModel.m39332a(eVar);
        if (!mo34350t_()) {
            C20885b.m39241a(this.f49481d, this.f49454c.f49402b, 1);
            return;
        }
        this.f49482e = new ISessionCallback() {
            /* class com.bytedance.lobby.kakao.KakaoAuth.C209211 */

            static {
                Covode.recordClassIndex(24528);
            }

            @Override // com.kakao.auth.ISessionCallback
            public final void onSessionOpened() {
                final Session currentSession = Session.getCurrentSession();
                if (currentSession != null) {
                    AuthService.getInstance().requestAccessTokenInfo(new ApiResponseCallback<AccessTokenInfoResponse>() {
                        /* class com.bytedance.lobby.kakao.KakaoAuth.C209211.C209221 */

                        static {
                            Covode.recordClassIndex(24529);
                        }

                        @Override // com.kakao.auth.ApiResponseCallback
                        public final void onNotSignedUp() {
                            KakaoAuth.this.mo34370a(new C20891c(-999, "KakaoSDK ApiResponseCallback onNotSignedUp"));
                        }

                        @Override // com.kakao.network.callback.ResponseCallback, com.kakao.auth.ApiResponseCallback
                        public final void onFailure(ErrorResult errorResult) {
                            C20891c cVar;
                            KakaoAuth kakaoAuth = KakaoAuth.this;
                            if (errorResult != null) {
                                cVar = new C20891c(errorResult.getErrorCode(), errorResult.getErrorMessage());
                            } else {
                                cVar = new C20891c(3, "KakaoSDK ApiResponseCallback onFailure with no ErrorResult");
                            }
                            kakaoAuth.mo34370a(cVar);
                        }

                        @Override // com.kakao.network.callback.ResponseCallback, com.kakao.auth.ApiResponseCallback
                        public final void onFailureForUiThread(ErrorResult errorResult) {
                            C20891c cVar;
                            KakaoAuth kakaoAuth = KakaoAuth.this;
                            if (errorResult != null) {
                                cVar = new C20891c(errorResult.getErrorCode(), errorResult.getErrorMessage());
                            } else {
                                cVar = new C20891c(3, "KakaoSDK ApiResponseCallback onFailureForUiThread with no ErrorResult");
                            }
                            kakaoAuth.mo34370a(cVar);
                        }

                        @Override // com.kakao.auth.ApiResponseCallback
                        public final void onSessionClosed(ErrorResult errorResult) {
                            C20891c cVar;
                            KakaoAuth kakaoAuth = KakaoAuth.this;
                            if (errorResult != null) {
                                cVar = new C20891c(errorResult.getErrorCode(), errorResult.getErrorMessage());
                            } else {
                                cVar = new C20891c(3, "KakaoSDK ApiResponseCallback onSessionClosed with no ErrorResult");
                            }
                            kakaoAuth.mo34370a(cVar);
                        }

                        @Override // com.kakao.network.callback.ResponseCallback
                        public final /* synthetic */ void onSuccess(Object obj) {
                            AccessTokenInfoResponse accessTokenInfoResponse = (AccessTokenInfoResponse) obj;
                            if (accessTokenInfoResponse == null) {
                                KakaoAuth.this.mo34370a(new C20891c(3, "KakaoSDK ApiResponseCallback onSuccess called, but AccessTokenInfoResponse is null."));
                                return;
                            }
                            KakaoAuth kakaoAuth = KakaoAuth.this;
                            Session session = currentSession;
                            long currentTimeMillis = System.currentTimeMillis() + accessTokenInfoResponse.getExpiresInMillis();
                            AuthResult.C20883a aVar = new AuthResult.C20883a(kakaoAuth.f49454c.f49402b, 1);
                            aVar.f49377a = true;
                            aVar.f49381e = session.getTokenInfo().getAccessToken();
                            aVar.f49383g = currentTimeMillis;
                            aVar.f49380d = String.valueOf(accessTokenInfoResponse.getUserId());
                            kakaoAuth.f49481d.mo34361b(aVar.mo34319a());
                        }
                    });
                }
            }

            @Override // com.kakao.auth.ISessionCallback
            public final void onSessionOpenFailed(KakaoException kakaoException) {
                AuthResult.C20883a aVar = new AuthResult.C20883a(KakaoAuth.this.f49454c.f49402b, 1);
                aVar.f49377a = false;
                aVar.f49378b = new C20891c(kakaoException).setCancelled(true);
                KakaoAuth.this.f49481d.mo34361b(aVar.mo34319a());
            }
        };
        Session.getCurrentSession().addCallback(this.f49482e);
        Session.getCurrentSession().checkAndImplicitOpen();
        Session.getCurrentSession().open(AuthType.KAKAO_LOGIN_ALL, eVar);
    }

    @Override // com.bytedance.lobby.auth.AbstractC20888d
    /* renamed from: b */
    public final void mo34328b(ActivityC0945e eVar, Bundle bundle) {
        if (Session.getCurrentSession().isOpened()) {
            Session.getCurrentSession().close();
            AuthResult.C20883a aVar = new AuthResult.C20883a(this.f49454c.f49402b, 1);
            aVar.f49377a = true;
            this.f49481d.mo34361b(aVar.mo34319a());
        }
    }

    @Override // com.bytedance.lobby.auth.AbstractC20888d
    /* renamed from: a */
    public final void mo34325a(ActivityC0945e eVar, int i, int i2, Intent intent) {
        if (this.f49482e != null) {
            Session.getCurrentSession().handleActivityResult(i, i2, intent);
        }
    }
}
