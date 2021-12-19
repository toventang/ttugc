package com.kakao.auth;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.kakao.auth.authorization.accesstoken.AccessToken;
import com.kakao.auth.authorization.accesstoken.AccessTokenManager;
import com.kakao.auth.authorization.authcode.AuthCodeManager;
import com.kakao.auth.authorization.authcode.AuthorizationCode;
import com.kakao.auth.helper.StartActivityWrapper;
import com.kakao.auth.network.response.AccessTokenInfoResponse;
import com.kakao.common.KakaoContextService;
import com.kakao.network.ErrorResult;
import com.kakao.util.exception.KakaoException;
import com.kakao.util.helper.SharedPreferencesCache;
import com.kakao.util.helper.log.Logger;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

public class Session implements ISession {
    private static Session currentSession;
    public final Object INSTANCE_LOCK;
    private AccessToken accessToken;
    private AccessTokenCallback accessTokenCallback;
    public AccessTokenManager accessTokenManager;
    private final PendingIntent alarmIntent;
    private final SharedPreferencesCache appCache;
    private AuthCodeCallback authCodeCallback;
    private AuthCodeManager authCodeManager;
    private AuthService authService;
    public AuthorizationCode authorizationCode;
    private final List<ISessionCallback> callbacks;
    private final Context context;
    private final KakaoContextService contextService;
    public volatile RequestType requestType;
    private final AlarmManager tokenAlarmManager;

    static {
        Covode.recordClassIndex(33825);
    }

    public SharedPreferencesCache getAppCache() {
        return this.appCache;
    }

    /* access modifiers changed from: package-private */
    public List<ISessionCallback> getCallbacks() {
        return this.callbacks;
    }

    /* access modifiers changed from: package-private */
    public Context getContext() {
        return this.context;
    }

    @Override // com.kakao.auth.ISession
    public void close() {
        internalClose(null);
    }

    public void deregisterTokenManager() {
        this.tokenAlarmManager.cancel(this.alarmIntent);
    }

    public boolean checkAndImplicitOpen() {
        if (isClosed() || !implicitOpen()) {
            return false;
        }
        return true;
    }

    @Override // com.kakao.auth.ISession
    public synchronized AccessTokenManager getAccessTokenManager() {
        AccessTokenManager accessTokenManager2;
        MethodCollector.m26663i(11048);
        accessTokenManager2 = this.accessTokenManager;
        MethodCollector.m26664o(11048);
        return accessTokenManager2;
    }

    public final String getAppKey() {
        return this.contextService.phaseInfo().appKey();
    }

    @Override // com.kakao.auth.ISession
    public synchronized AuthCodeManager getAuthCodeManager() {
        AuthCodeManager authCodeManager2;
        MethodCollector.m26663i(11047);
        authCodeManager2 = this.authCodeManager;
        MethodCollector.m26664o(11047);
        return authCodeManager2;
    }

    public static synchronized Session getCurrentSession() {
        Session session;
        synchronized (Session.class) {
            MethodCollector.m26663i(11046);
            session = currentSession;
            if (session != null) {
                MethodCollector.m26664o(11046);
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("Session is not initialized. Call KakaoSDK#init first.");
                MethodCollector.m26664o(11046);
                throw illegalStateException;
            }
        }
        return session;
    }

    /* access modifiers changed from: package-private */
    public void checkAccessTokenInfo() {
        if (isClosed()) {
            deregisterTokenManager();
        } else if (isOpenable()) {
            implicitOpen();
        } else {
            this.authService.requestAccessTokenInfo(new ApiResponseCallback<AccessTokenInfoResponse>() {
                /* class com.kakao.auth.Session.C280723 */

                static {
                    Covode.recordClassIndex(33829);
                }

                @Override // com.kakao.auth.ApiResponseCallback
                public void onNotSignedUp() {
                }

                @Override // com.kakao.auth.ApiResponseCallback
                public void onSessionClosed(ErrorResult errorResult) {
                    Session.this.deregisterTokenManager();
                }

                @Override // com.kakao.network.callback.ResponseCallback, com.kakao.auth.ApiResponseCallback
                public void onFailure(ErrorResult errorResult) {
                    Session.this.registerTokenManager(300000);
                }

                public void onSuccess(AccessTokenInfoResponse accessTokenInfoResponse) {
                    Session.this.registerTokenManager(Math.min(10800000L, accessTokenInfoResponse.getExpiresInMillis()));
                }
            });
        }
    }

    @Override // com.kakao.auth.ISession
    public void clearCallbacks() {
        MethodCollector.m26663i(12132);
        synchronized (this.callbacks) {
            try {
                this.callbacks.clear();
            } finally {
                MethodCollector.m26664o(12132);
            }
        }
    }

    public final String getAccessToken() {
        String str;
        MethodCollector.m26663i(12917);
        synchronized (this.INSTANCE_LOCK) {
            try {
                AccessToken accessToken2 = this.accessToken;
                if (accessToken2 == null) {
                    str = null;
                } else {
                    str = accessToken2.getAccessToken();
                }
            } finally {
                MethodCollector.m26664o(12917);
            }
        }
        return str;
    }

    public final String getRefreshToken() {
        String str;
        MethodCollector.m26663i(12918);
        synchronized (this.INSTANCE_LOCK) {
            try {
                AccessToken accessToken2 = this.accessToken;
                if (accessToken2 == null) {
                    str = null;
                } else {
                    str = accessToken2.getRefreshToken();
                }
            } finally {
                MethodCollector.m26664o(12918);
            }
        }
        return str;
    }

    public RequestType getRequestType() {
        RequestType requestType2;
        MethodCollector.m26663i(11505);
        synchronized (this.INSTANCE_LOCK) {
            try {
                requestType2 = this.requestType;
            } finally {
                MethodCollector.m26664o(11505);
            }
        }
        return requestType2;
    }

    @Override // com.kakao.auth.ISession
    public final AccessToken getTokenInfo() {
        AccessToken accessToken2;
        MethodCollector.m26663i(11506);
        synchronized (this.INSTANCE_LOCK) {
            try {
                accessToken2 = this.accessToken;
            } finally {
                MethodCollector.m26664o(11506);
            }
        }
        return accessToken2;
    }

    public final boolean hasValidAccessToken() {
        boolean z;
        MethodCollector.m26663i(12919);
        synchronized (this.INSTANCE_LOCK) {
            try {
                AccessToken accessToken2 = this.accessToken;
                if (accessToken2 == null || !accessToken2.hasValidAccessToken()) {
                    z = false;
                } else {
                    z = true;
                }
            } finally {
                MethodCollector.m26664o(12919);
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public boolean implicitOpen() {
        if (!getTokenInfo().hasValidRefreshToken()) {
            return false;
        }
        internalOpen(null, null, null, null, null, null);
        return true;
    }

    public void invalidateAccessToken() {
        MethodCollector.m26663i(12921);
        synchronized (this.INSTANCE_LOCK) {
            try {
                this.accessToken.clearAccessToken();
                this.accessToken.clearRefreshToken();
            } finally {
                MethodCollector.m26664o(12921);
            }
        }
    }

    public boolean isAvailableOpenByRefreshToken() {
        if (isOpened() || getTokenInfo().hasValidRefreshToken()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean isRefreshingAccessToken() {
        MethodCollector.m26663i(11504);
        if (this.requestType == RequestType.REFRESHING_ACCESS_TOKEN) {
            MethodCollector.m26664o(11504);
            return true;
        }
        MethodCollector.m26664o(11504);
        return false;
    }

    public void removeAccessToken() {
        MethodCollector.m26663i(12920);
        synchronized (this.INSTANCE_LOCK) {
            try {
                AccessToken accessToken2 = this.accessToken;
                if (accessToken2 != null) {
                    accessToken2.clearAccessToken();
                }
            } finally {
                MethodCollector.m26664o(12920);
            }
        }
    }

    public void removeRefreshToken() {
        MethodCollector.m26663i(12922);
        synchronized (this.INSTANCE_LOCK) {
            try {
                AccessToken accessToken2 = this.accessToken;
                if (accessToken2 != null) {
                    accessToken2.clearRefreshToken();
                }
            } finally {
                MethodCollector.m26664o(12922);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public enum RequestType {
        GETTING_AUTHORIZATION_CODE,
        GETTING_ACCESS_TOKEN,
        REFRESHING_ACCESS_TOKEN;

        static {
            Covode.recordClassIndex(33832);
        }
    }

    @Override // com.kakao.auth.ISession
    public AccessTokenCallback getAccessTokenCallback() {
        MethodCollector.m26663i(12393);
        if (this.accessTokenCallback == null) {
            synchronized (Session.class) {
                try {
                    if (this.accessTokenCallback == null) {
                        this.accessTokenCallback = new AccessTokenCallback() {
                            /* class com.kakao.auth.Session.C280745 */

                            static {
                                Covode.recordClassIndex(33831);
                            }

                            @Override // com.kakao.auth.authorization.accesstoken.AccessTokenListener
                            public void onAccessTokenFailure(ErrorResult errorResult) {
                                Session.this.onAccessTokenFailure(errorResult);
                            }

                            @Override // com.kakao.auth.authorization.accesstoken.AccessTokenListener
                            public void onAccessTokenReceived(AccessToken accessToken) {
                                Session.this.onAccessTokenReceived(accessToken);
                            }
                        };
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12393);
                    throw th;
                }
            }
        }
        AccessTokenCallback accessTokenCallback2 = this.accessTokenCallback;
        MethodCollector.m26664o(12393);
        return accessTokenCallback2;
    }

    public AuthCodeCallback getAuthCodeCallback() {
        MethodCollector.m26663i(12278);
        if (this.authCodeCallback == null) {
            synchronized (Session.class) {
                try {
                    if (this.authCodeCallback == null) {
                        this.authCodeCallback = new AuthCodeCallback() {
                            /* class com.kakao.auth.Session.C280734 */

                            static {
                                Covode.recordClassIndex(33830);
                            }

                            @Override // com.kakao.auth.AuthCodeCallback
                            public void onAuthCodeFailure(ErrorResult errorResult) {
                                Session.this.onAuthCodeFailure(errorResult);
                            }

                            @Override // com.kakao.auth.AuthCodeCallback
                            public void onAuthCodeReceived(String str) {
                                Session.this.onAuthCodeReceived(str);
                            }
                        };
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12278);
                    throw th;
                }
            }
        }
        AuthCodeCallback authCodeCallback2 = this.authCodeCallback;
        MethodCollector.m26664o(12278);
        return authCodeCallback2;
    }

    @Override // com.kakao.auth.ISession
    public final synchronized boolean isClosed() {
        MethodCollector.m26663i(11503);
        if (isOpened() || isOpenable()) {
            MethodCollector.m26664o(11503);
            return false;
        }
        MethodCollector.m26664o(11503);
        return true;
    }

    @Override // com.kakao.auth.ISession
    public synchronized boolean isOpenable() {
        MethodCollector.m26663i(11502);
        if (getTokenInfo() == null || isOpened() || (!this.authorizationCode.hasAuthorizationCode() && !getTokenInfo().hasValidRefreshToken())) {
            MethodCollector.m26664o(11502);
            return false;
        }
        MethodCollector.m26664o(11502);
        return true;
    }

    @Override // com.kakao.auth.ISession
    public final synchronized boolean isOpened() {
        MethodCollector.m26663i(11501);
        if (getTokenInfo() == null || !getTokenInfo().hasValidAccessToken()) {
            MethodCollector.m26664o(11501);
            return false;
        }
        MethodCollector.m26664o(11501);
        return true;
    }

    @Override // com.kakao.auth.ISession
    public void openWithAuthCode(String str) {
        onAuthCodeReceived(str);
    }

    /* access modifiers changed from: package-private */
    public void setAuthService(AuthService authService2) {
        this.authService = authService2;
    }

    /* renamed from: com_kakao_auth_Session_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext */
    public static Context m56164xf7f31545(Application application) {
        Context applicationContext = application.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    public void onAuthCodeFailure(ErrorResult errorResult) {
        internalClose(wrapAsKakaoException(errorResult.getException()));
    }

    private boolean shouldCloseSession(ErrorResult errorResult) {
        if (errorResult.getHttpStatus() == 401 || errorResult.getHttpStatus() == 400) {
            return true;
        }
        return false;
    }

    private void updateAccessToken(AccessToken accessToken2) {
        MethodCollector.m26663i(11507);
        synchronized (this.INSTANCE_LOCK) {
            try {
                getTokenInfo().updateAccessToken(accessToken2);
            } finally {
                MethodCollector.m26664o(11507);
            }
        }
    }

    private KakaoException wrapAsKakaoException(Exception exc) {
        if (exc == null) {
            return null;
        }
        if (exc instanceof KakaoException) {
            return (KakaoException) exc;
        }
        return new KakaoException(exc);
    }

    public void onAccessTokenReceived(AccessToken accessToken2) {
        postProcessAccessToken(accessToken2);
        for (ISessionCallback iSessionCallback : new ArrayList(this.callbacks)) {
            iSessionCallback.onSessionOpened();
        }
    }

    public void registerTokenManager(long j) {
        this.tokenAlarmManager.cancel(this.alarmIntent);
        try {
            this.tokenAlarmManager.setInexactRepeating(3, SystemClock.elapsedRealtime() + j, j, this.alarmIntent);
        } catch (Exception e) {
            Logger.m56228w("Failed to register automatic token refresh.", e);
        }
    }

    @Override // com.kakao.auth.ISession
    public void removeCallback(ISessionCallback iSessionCallback) {
        MethodCollector.m26663i(11993);
        synchronized (this.callbacks) {
            if (iSessionCallback != null) {
                try {
                    this.callbacks.remove(iSessionCallback);
                } catch (Throwable th) {
                    MethodCollector.m26664o(11993);
                    throw th;
                }
            }
        }
        MethodCollector.m26664o(11993);
    }

    @Override // com.kakao.auth.ISession
    public void addCallback(ISessionCallback iSessionCallback) {
        MethodCollector.m26663i(11831);
        synchronized (this.callbacks) {
            if (iSessionCallback != null) {
                try {
                    if (!this.callbacks.contains(iSessionCallback)) {
                        this.callbacks.add(iSessionCallback);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11831);
                    throw th;
                }
            }
        }
        MethodCollector.m26664o(11831);
    }

    public void onAuthCodeReceived(String str) {
        MethodCollector.m26663i(12621);
        if (str != null) {
            synchronized (this.INSTANCE_LOCK) {
                try {
                    this.requestType = null;
                    this.authorizationCode = new AuthorizationCode(str);
                } finally {
                    MethodCollector.m26664o(12621);
                }
            }
            internalOpen(null, null, str, null, null, null);
        }
    }

    public void postProcessAccessToken(AccessToken accessToken2) {
        MethodCollector.m26663i(12739);
        synchronized (this.INSTANCE_LOCK) {
            try {
                this.authorizationCode = AuthorizationCode.createEmptyCode();
                updateAccessToken(accessToken2);
                this.requestType = null;
            } catch (Throwable th) {
                MethodCollector.m26664o(12739);
                throw th;
            }
        }
        registerTokenManager((long) Math.min(10800000, getTokenInfo().getRemainingExpireTime()));
        MethodCollector.m26664o(12739);
    }

    public boolean shouldClearSessionState(ErrorResult errorResult) {
        KakaoException kakaoException = new KakaoException(KakaoException.ErrorType.AUTHORIZATION_FAILED, errorResult.getErrorMessage());
        if (this.requestType != null && this.requestType == RequestType.GETTING_ACCESS_TOKEN) {
            internalClose(kakaoException);
            return false;
        } else if (this.requestType != RequestType.REFRESHING_ACCESS_TOKEN || !shouldCloseSession(errorResult)) {
            return true;
        } else {
            internalClose(kakaoException);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public void internalClose(KakaoException kakaoException) {
        MethodCollector.m26663i(12513);
        synchronized (this.INSTANCE_LOCK) {
            try {
                this.requestType = null;
                this.authorizationCode = AuthorizationCode.createEmptyCode();
                getTokenInfo().clearAccessToken();
                getTokenInfo().clearRefreshToken();
            } finally {
                MethodCollector.m26664o(12513);
            }
        }
        SharedPreferencesCache sharedPreferencesCache = this.appCache;
        if (sharedPreferencesCache != null) {
            sharedPreferencesCache.clearAll();
        }
        try {
            deregisterTokenManager();
        } catch (Throwable th) {
            Logger.m56208e(th);
        }
        if (kakaoException != null) {
            for (ISessionCallback iSessionCallback : new ArrayList(this.callbacks)) {
                iSessionCallback.onSessionOpenFailed(kakaoException);
            }
        }
    }

    public void onAccessTokenFailure(ErrorResult errorResult) {
        MethodCollector.m26663i(12830);
        if (shouldClearSessionState(errorResult)) {
            synchronized (this.INSTANCE_LOCK) {
                try {
                    this.requestType = null;
                } finally {
                    MethodCollector.m26664o(12830);
                }
            }
            for (ISessionCallback iSessionCallback : new ArrayList(this.callbacks)) {
                iSessionCallback.onSessionOpenFailed(new KakaoException(KakaoException.ErrorType.AUTHORIZATION_FAILED, errorResult.getErrorMessage()));
            }
        }
    }

    @Override // com.kakao.auth.ISession
    public Future<AccessToken> refreshAccessToken(final AccessTokenCallback accessTokenCallback2) {
        MethodCollector.m26663i(11344);
        if (getTokenInfo() == null || !getTokenInfo().hasValidRefreshToken()) {
            KakaoException kakaoException = new KakaoException(KakaoException.ErrorType.ILLEGAL_STATE, "Refresh token has already expired. Logging user out.");
            internalClose(kakaoException);
            if (accessTokenCallback2 != null) {
                accessTokenCallback2.onAccessTokenFailure(new ErrorResult(kakaoException));
            }
            MethodCollector.m26664o(11344);
            return null;
        }
        synchronized (this.INSTANCE_LOCK) {
            try {
                this.requestType = RequestType.REFRESHING_ACCESS_TOKEN;
            } catch (Throwable th) {
                MethodCollector.m26664o(11344);
                throw th;
            }
        }
        Future<AccessToken> refreshAccessToken = this.accessTokenManager.refreshAccessToken(getTokenInfo().getRefreshToken(), new AccessTokenCallback() {
            /* class com.kakao.auth.Session.C280691 */

            static {
                Covode.recordClassIndex(33826);
            }

            @Override // com.kakao.auth.authorization.accesstoken.AccessTokenListener
            public void onAccessTokenReceived(AccessToken accessToken) {
                Session.this.postProcessAccessToken(accessToken);
                AccessTokenCallback accessTokenCallback = accessTokenCallback2;
                if (accessTokenCallback != null) {
                    accessTokenCallback.onAccessTokenReceived(accessToken);
                }
            }

            @Override // com.kakao.auth.authorization.accesstoken.AccessTokenListener
            public void onAccessTokenFailure(ErrorResult errorResult) {
                MethodCollector.m26663i(8868);
                if (Session.this.shouldClearSessionState(errorResult)) {
                    synchronized (Session.this.INSTANCE_LOCK) {
                        try {
                            Session.this.requestType = null;
                        } catch (Throwable th) {
                            MethodCollector.m26664o(8868);
                            throw th;
                        }
                    }
                }
                AccessTokenCallback accessTokenCallback = accessTokenCallback2;
                if (accessTokenCallback != null) {
                    accessTokenCallback.onAccessTokenFailure(errorResult);
                }
                MethodCollector.m26664o(8868);
            }
        });
        MethodCollector.m26664o(11344);
        return refreshAccessToken;
    }

    @Override // com.kakao.auth.ISession
    public void open(AuthType authType, Activity activity) {
        internalOpen(authType, new StartActivityWrapper(activity), null, null, null, null);
    }

    @Override // com.kakao.auth.ISession
    public void open(AuthType authType, Fragment fragment) {
        internalOpen(authType, new StartActivityWrapper(fragment), null, null, null, null);
    }

    /* renamed from: com_kakao_auth_Session_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService */
    public static Object m56163x38c2111(Context context2, String str) {
        Object obj;
        MethodCollector.m26663i(11342);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context2.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context2.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context2.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(11342);
                }
            }
        } else {
            obj = context2.getSystemService(str);
        }
        return obj;
    }

    static synchronized void initialize(Application application, ApprovalType approvalType) {
        synchronized (Session.class) {
            MethodCollector.m26663i(11045);
            Session session = currentSession;
            if (session != null) {
                session.clearCallbacks();
                currentSession.close();
            }
            KakaoContextService instance = KakaoContextService.getInstance();
            ISessionConfig sessionConfig = KakaoSDK.getAdapter().getSessionConfig();
            Session session2 = new Session(m56164xf7f31545(application), instance, sessionConfig, AuthCodeManager.Factory.initialize(application, sessionConfig), AccessTokenManager.Factory.initialize(m56164xf7f31545(application), approvalType));
            currentSession = session2;
            session2.setAuthService(AuthService.getInstance());
            MethodCollector.m26664o(11045);
        }
    }

    public boolean handleActivityResult(int i, int i2, Intent intent) {
        AuthCodeManager authCodeManager2 = this.authCodeManager;
        if (authCodeManager2 == null || !authCodeManager2.handleActivityResult(i, i2, intent)) {
            return false;
        }
        return true;
    }

    public void updateScopes(Activity activity, List<String> list, AccessTokenCallback accessTokenCallback2) {
        updateScopes(new StartActivityWrapper(activity), list, accessTokenCallback2);
    }

    public void open(AuthType authType, Activity activity, Map<String, String> map) {
        internalOpen(authType, new StartActivityWrapper(activity), null, map, null, null);
    }

    public void updateScopes(Fragment fragment, List<String> list, AccessTokenCallback accessTokenCallback2) {
        updateScopes(new StartActivityWrapper(fragment), list, accessTokenCallback2);
    }

    private void updateScopes(StartActivityWrapper startActivityWrapper, List<String> list, final AccessTokenCallback accessTokenCallback2) {
        MethodCollector.m26663i(11346);
        if (getTokenInfo() == null || !getTokenInfo().hasValidRefreshToken()) {
            KakaoException kakaoException = new KakaoException(KakaoException.ErrorType.ILLEGAL_STATE, "Refresh token has already expired. Logging user out.");
            internalClose(kakaoException);
            if (accessTokenCallback2 != null) {
                accessTokenCallback2.onAccessTokenFailure(new ErrorResult(kakaoException));
            }
            MethodCollector.m26664o(11346);
            return;
        }
        synchronized (this.INSTANCE_LOCK) {
            try {
                this.requestType = RequestType.GETTING_AUTHORIZATION_CODE;
            } catch (Throwable th) {
                MethodCollector.m26664o(11346);
                throw th;
            }
        }
        this.authCodeManager.requestAuthCodeWithScopes(AuthType.KAKAO_ACCOUNT, startActivityWrapper, list, new AuthCodeCallback() {
            /* class com.kakao.auth.Session.C280702 */

            static {
                Covode.recordClassIndex(33827);
            }

            @Override // com.kakao.auth.AuthCodeCallback
            public void onAuthCodeFailure(ErrorResult errorResult) {
                MethodCollector.m26663i(10083);
                synchronized (Session.this.INSTANCE_LOCK) {
                    try {
                        Session.this.authorizationCode = AuthorizationCode.createEmptyCode();
                        Session.this.requestType = null;
                    } finally {
                        MethodCollector.m26664o(10083);
                    }
                }
                AccessTokenCallback accessTokenCallback = accessTokenCallback2;
                if (accessTokenCallback != null) {
                    accessTokenCallback.onAccessTokenFailure(errorResult);
                }
            }

            @Override // com.kakao.auth.AuthCodeCallback
            public void onAuthCodeReceived(String str) {
                MethodCollector.m26663i(10082);
                synchronized (Session.this.INSTANCE_LOCK) {
                    try {
                        Session.this.authorizationCode = new AuthorizationCode(str);
                        Session.this.requestType = RequestType.GETTING_ACCESS_TOKEN;
                    } catch (Throwable th) {
                        MethodCollector.m26664o(10082);
                        throw th;
                    }
                }
                Session.this.accessTokenManager.requestAccessTokenByAuthCode(str, new AccessTokenCallback() {
                    /* class com.kakao.auth.Session.C280702.C280711 */

                    static {
                        Covode.recordClassIndex(33828);
                    }

                    @Override // com.kakao.auth.authorization.accesstoken.AccessTokenListener
                    public void onAccessTokenReceived(AccessToken accessToken) {
                        Session.this.postProcessAccessToken(accessToken);
                        if (accessTokenCallback2 != null) {
                            accessTokenCallback2.onAccessTokenReceived(accessToken);
                        }
                    }

                    @Override // com.kakao.auth.authorization.accesstoken.AccessTokenListener
                    public void onAccessTokenFailure(ErrorResult errorResult) {
                        MethodCollector.m26663i(9916);
                        synchronized (Session.this.INSTANCE_LOCK) {
                            try {
                                Session.this.authorizationCode = AuthorizationCode.createEmptyCode();
                                Session.this.requestType = null;
                            } finally {
                                MethodCollector.m26664o(9916);
                            }
                        }
                        if (accessTokenCallback2 != null) {
                            accessTokenCallback2.onAccessTokenFailure(errorResult);
                        }
                    }
                });
                MethodCollector.m26664o(10082);
            }
        });
        MethodCollector.m26664o(11346);
    }

    public void open(AuthType authType, Fragment fragment, Map<String, String> map) {
        internalOpen(authType, new StartActivityWrapper(fragment), null, map, null, null);
    }

    public void openWithCustomAccountsUrl(Activity activity, Map<String, String> map, String str, Map<String, String> map2) {
        internalOpen(AuthType.KAKAO_ACCOUNT, new StartActivityWrapper(activity), null, map, str, map2);
    }

    private void requestAuthCode(AuthType authType, StartActivityWrapper startActivityWrapper, Map<String, String> map, String str, Map<String, String> map2) {
        if (str != null) {
            this.authCodeManager.requestAuthCodeWithCustomAccountsUrl(startActivityWrapper, map, str, map2, getAuthCodeCallback());
        } else {
            this.authCodeManager.requestAuthCode(authType, startActivityWrapper, map, getAuthCodeCallback());
        }
    }

    Session(Context context2, KakaoContextService kakaoContextService, ISessionConfig iSessionConfig, AuthCodeManager authCodeManager2, AccessTokenManager accessTokenManager2) {
        MethodCollector.m26663i(11197);
        Object obj = new Object();
        this.INSTANCE_LOCK = obj;
        if (context2 != null) {
            this.context = context2;
            this.contextService = kakaoContextService;
            SharedPreferencesCache sharedPreferencesCache = new SharedPreferencesCache(context2, kakaoContextService.phaseInfo().appKey());
            this.appCache = sharedPreferencesCache;
            synchronized (obj) {
                try {
                    this.authorizationCode = AuthorizationCode.createEmptyCode();
                    this.accessToken = AccessToken.Factory.createFromCache(iSessionConfig, sharedPreferencesCache);
                } catch (Throwable th) {
                    MethodCollector.m26664o(11197);
                    throw th;
                }
            }
            this.authCodeManager = authCodeManager2;
            this.accessTokenManager = accessTokenManager2;
            this.callbacks = new ArrayList();
            this.tokenAlarmManager = (AlarmManager) m56163x38c2111(context2, "alarm");
            this.alarmIntent = PendingIntent.getBroadcast(context2, 0, new Intent(context2, TokenAlarmReceiver.class), 134217728);
            MethodCollector.m26664o(11197);
            return;
        }
        KakaoException kakaoException = new KakaoException(KakaoException.ErrorType.ILLEGAL_ARGUMENT, "cannot create Session without Context.");
        MethodCollector.m26664o(11197);
        throw kakaoException;
    }

    private void internalOpen(AuthType authType, StartActivityWrapper startActivityWrapper, String str, Map<String, String> map, String str2, Map<String, String> map2) {
        MethodCollector.m26663i(11670);
        if (isOpened()) {
            for (ISessionCallback iSessionCallback : new ArrayList(this.callbacks)) {
                iSessionCallback.onSessionOpened();
            }
            MethodCollector.m26664o(11670);
        } else if (getRequestType() != null) {
            Logger.m56227w(getRequestType() + " is still not finished. Just return.");
            MethodCollector.m26664o(11670);
        } else {
            try {
                synchronized (this.INSTANCE_LOCK) {
                    try {
                        if (isClosed()) {
                            this.requestType = RequestType.GETTING_AUTHORIZATION_CODE;
                            requestAuthCode(authType, startActivityWrapper, map, str2, map2);
                        } else if (!isOpenable()) {
                            KakaoException kakaoException = new KakaoException(KakaoException.ErrorType.AUTHORIZATION_FAILED, "current session state is not possible to open.");
                            MethodCollector.m26664o(11670);
                            throw kakaoException;
                        } else if (str != null) {
                            this.requestType = RequestType.GETTING_ACCESS_TOKEN;
                            this.accessTokenManager.requestAccessTokenByAuthCode(str, getAccessTokenCallback());
                        } else {
                            this.requestType = RequestType.REFRESHING_ACCESS_TOKEN;
                            this.accessTokenManager.refreshAccessToken(getTokenInfo().getRefreshToken(), getAccessTokenCallback());
                        }
                    } finally {
                        MethodCollector.m26664o(11670);
                    }
                }
            } catch (KakaoException e) {
                internalClose(e);
                MethodCollector.m26664o(11670);
            }
        }
    }
}
