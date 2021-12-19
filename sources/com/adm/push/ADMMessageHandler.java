package com.adm.push;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.amazon.device.messaging.ADMMessageHandlerBase;
import com.amazon.device.messaging.ADMMessageReceiver;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.C21798f;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import org.json.JSONObject;

public class ADMMessageHandler extends ADMMessageHandlerBase {
    private static long sLastSendTokenTimeStamp;
    private static String sLastToken;
    public static boolean sSupportJobIntent = true;
    private Handler mHandler;

    /* access modifiers changed from: protected */
    public void onUnregistered(String str) {
    }

    public ADMMessageHandler() {
        super("ADMMessageHandler");
    }

    public static class Receiver extends ADMMessageReceiver {
        static {
            Covode.recordClassIndex(2050);
        }

        public Receiver() {
            super(ADMMessageHandler.class);
            if (ADMMessageHandler.sSupportJobIntent) {
                registerJobServiceClass(ADMMessageHandlerJob.class, 1);
            }
        }
    }

    static {
        Covode.recordClassIndex(2049);
        try {
            Class.forName("com.amazon.device.messaging.ADMMessageHandlerJobBase");
        } catch (Throwable unused) {
        }
    }

    private Handler getHandler() {
        if (this.mHandler == null) {
            this.mHandler = new HandlerC1879a(getApplicationContext());
        }
        return this.mHandler;
    }

    /* renamed from: com_adm_push_ADMMessageHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras */
    public static Bundle m6058x24eafb22(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public void onRegistrationError(String str) {
        getHandler().obtainMessage(2, str).sendToTarget();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.adm.push.ADMMessageHandler$a */
    public static class HandlerC1879a extends Handler {

        /* renamed from: a */
        private final Context f5700a;

        static {
            Covode.recordClassIndex(2051);
        }

        HandlerC1879a(Context context) {
            super(Looper.getMainLooper());
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            this.f5700a = applicationContext;
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 1) {
                try {
                    String str = (String) message.obj;
                    if (!TextUtils.isEmpty(str)) {
                        C21798f.m40814b().mo35458a(this.f5700a, AdmPushAdapter.getAdmPush(), str);
                    } else {
                        C21798f.m40816d().mo35422a(AdmPushAdapter.getAdmPush(), 102, "0", "token is empty");
                    }
                } catch (Throwable th) {
                    if (C21798f.m40813a().mo35477a()) {
                        th.getMessage();
                    }
                }
            } else if (i == 2) {
                try {
                    String str2 = (String) message.obj;
                    C21798f.m40814b();
                    AdmPushAdapter.getAdmPush();
                    C21798f.m40816d().mo35422a(AdmPushAdapter.getAdmPush(), 102, (String) message.obj, "ADMMessageHandler.AdmHandler return ERROR when register");
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("label", "onRegistrationError");
                        jSONObject.put(StringSet.type, AdmPushAdapter.getAdmPush());
                        jSONObject.put("errorId", str2);
                        C21798f.m40814b();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onRegistered(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - sLastSendTokenTimeStamp >= InteractFirstFrameTimeOutDurationSetting.DEFAULT || !C13627m.m24499a(str, sLastToken)) {
            sLastSendTokenTimeStamp = currentTimeMillis;
            sLastToken = str;
            sendToken(str);
        }
    }

    private void sendToken(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                C21798f.m40816d().mo35422a(AdmPushAdapter.getAdmPush(), 102, "0", "ADMMessageHandler token is empty");
            } else {
                getHandler().obtainMessage(1, str).sendToTarget();
            }
        } catch (Throwable th) {
            if (C21798f.m40813a().mo35477a()) {
                Log.getStackTraceString(th);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMessage(Intent intent) {
        Bundle com_adm_push_ADMMessageHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras;
        if (intent != null && (com_adm_push_ADMMessageHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = m6058x24eafb22(intent)) != null) {
            try {
                C21798f.m40815c().mo35434a(com_adm_push_ADMMessageHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras.getString("payload"), AdmPushAdapter.getAdmPush());
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    public void onStart(Intent intent, int i) {
        if (intent == null) {
            intent = new Intent();
            intent.setAction("");
        }
        ADMMessageHandler.super.onStart(intent, i);
    }
}
