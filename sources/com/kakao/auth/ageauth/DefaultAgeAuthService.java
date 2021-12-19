package com.kakao.auth.ageauth;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import com.bytedance.covode.number.Covode;
import com.kakao.auth.AuthService;
import com.kakao.auth.KakaoSDK;
import com.kakao.auth.authorization.authcode.KakaoWebViewActivity;
import com.kakao.network.ServerProtocol;
import com.kakao.util.exception.KakaoException;
import com.kakao.util.helper.Utility;
import com.kakao.util.helper.log.Logger;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class DefaultAgeAuthService implements AgeAuthService {
    private static DefaultAgeAuthService instance;
    public Handler sHandler;

    static {
        Covode.recordClassIndex(33839);
    }

    /* access modifiers changed from: package-private */
    public static class AgeAuthResult {
        private KakaoException exception;
        private AtomicInteger result = new AtomicInteger();

        static {
            Covode.recordClassIndex(33842);
        }

        public KakaoException getException() {
            return this.exception;
        }

        public AtomicInteger getResult() {
            return this.result;
        }

        public void setException(KakaoException kakaoException) {
            this.exception = kakaoException;
        }

        public void setResult(AtomicInteger atomicInteger) {
            this.result = atomicInteger;
        }
    }

    public static DefaultAgeAuthService getInstance() {
        if (instance == null) {
            instance = new DefaultAgeAuthService(new Handler(Looper.getMainLooper()));
        }
        return instance;
    }

    DefaultAgeAuthService(Handler handler) {
        this.sHandler = handler;
    }

    /* renamed from: com_kakao_auth_ageauth_DefaultAgeAuthService_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity */
    public static void m56166xdc7d63c8(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    @Override // com.kakao.auth.ageauth.AgeAuthService
    public int requestAgeAuth(final Bundle bundle, final Context context) {
        final AgeAuthResult ageAuthResult = new AgeAuthResult();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.sHandler.post(new Runnable() {
            /* class com.kakao.auth.ageauth.DefaultAgeAuthService.RunnableC280771 */

            static {
                Covode.recordClassIndex(33840);
            }

            public void run() {
                try {
                    DefaultAgeAuthService.this.requestWebviewAuth(context, bundle, new ResultReceiver(DefaultAgeAuthService.this.sHandler) {
                        /* class com.kakao.auth.ageauth.DefaultAgeAuthService.RunnableC280771.ResultReceiverC280781 */

                        static {
                            Covode.recordClassIndex(33841);
                        }

                        /* access modifiers changed from: protected */
                        public void onReceiveResult(int i, Bundle bundle) {
                            int value = AuthService.AgeAuthStatus.CLIENT_ERROR.getValue();
                            if (i == 0) {
                                String string = bundle.getString("key.redirect.url");
                                if (!(string == null || Uri.parse(string).getQueryParameter("status") == null)) {
                                    value = Integer.valueOf(Uri.parse(string).getQueryParameter("status")).intValue();
                                }
                            } else if (i == 1) {
                                ageAuthResult.setException((KakaoException) bundle.getSerializable("key.exception"));
                            }
                            ageAuthResult.getResult().set(value);
                            countDownLatch.countDown();
                        }
                    });
                } catch (Exception e) {
                    ageAuthResult.getResult().set(AuthService.AgeAuthStatus.CLIENT_ERROR.getValue());
                    ageAuthResult.setException(new KakaoException(e));
                    countDownLatch.countDown();
                }
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            Logger.m56205e(e.toString());
        }
        if (ageAuthResult.getException() == null) {
            return ageAuthResult.getResult().get();
        }
        throw ageAuthResult.getException();
    }

    public boolean requestWebviewAuth(Context context, Bundle bundle, ResultReceiver resultReceiver) {
        boolean isUsingWebviewTimer = KakaoSDK.getAdapter().getSessionConfig().isUsingWebviewTimer();
        Uri buildUri = Utility.buildUri(ServerProtocol.accountAuthority(), "ageauths/main.html", bundle);
        Logger.m56197d("AgeAuth request Url : ".concat(String.valueOf(buildUri)));
        Intent newIntent = KakaoWebViewActivity.newIntent(context);
        newIntent.putExtra("key.url", buildUri.toString());
        newIntent.putExtra("key.use.webview.timers", isUsingWebviewTimer);
        newIntent.putExtra("key.result.receiver", resultReceiver);
        m56166xdc7d63c8(context, newIntent);
        return true;
    }
}
