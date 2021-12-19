package com.kakao.auth.authorization.accesstoken;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.auth.AccessTokenCallback;
import com.kakao.auth.ApprovalType;
import com.kakao.auth.authorization.accesstoken.AccessToken;
import com.kakao.auth.network.response.AuthResponseError;
import com.kakao.common.KakaoContextService;
import com.kakao.network.NetworkService;
import java.util.concurrent.Future;

/* access modifiers changed from: package-private */
public class DefaultAccessTokenManager implements AccessTokenManager {
    private ApprovalType approvalType;
    private KakaoContextService contextService;
    private NetworkService networkService;

    static {
        Covode.recordClassIndex(33854);
    }

    @Override // com.kakao.auth.authorization.accesstoken.AccessTokenManager
    public synchronized Future<AccessToken> refreshAccessToken(String str, AccessTokenCallback accessTokenCallback) {
        Future<AccessToken> request;
        MethodCollector.m26663i(8994);
        request = this.networkService.request(new AccessTokenRequest(this.contextService.phaseInfo(), this.contextService.getAppConfiguration(), null, str, this.approvalType.toString()), AccessToken.Factory.CONVERTER, AuthResponseError.CONVERTER, accessTokenCallback);
        MethodCollector.m26664o(8994);
        return request;
    }

    @Override // com.kakao.auth.authorization.accesstoken.AccessTokenManager
    public Future<AccessToken> requestAccessTokenByAuthCode(String str, AccessTokenCallback accessTokenCallback) {
        return this.networkService.request(new AccessTokenRequest(this.contextService.phaseInfo(), this.contextService.getAppConfiguration(), str, null, this.approvalType.toString()), AccessToken.Factory.CONVERTER, AuthResponseError.CONVERTER, accessTokenCallback);
    }

    DefaultAccessTokenManager(KakaoContextService kakaoContextService, NetworkService networkService2, ApprovalType approvalType2) {
        this.contextService = kakaoContextService;
        this.networkService = networkService2;
        this.approvalType = approvalType2;
    }
}
