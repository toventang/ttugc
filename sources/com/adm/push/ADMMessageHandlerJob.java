package com.adm.push;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.amazon.device.messaging.ADMMessageHandlerJobBase;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.C21798f;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import org.json.JSONObject;

public class ADMMessageHandlerJob extends ADMMessageHandlerJobBase {
    private static long sLastSendTokenTimeStamp;
    private static String sLastToken;
    private Handler mHandler;

    static {
        Covode.recordClassIndex(2052);
    }

    /* access modifiers changed from: protected */
    public void onUnregistered(Context context, String str) {
    }

    /* renamed from: com_adm_push_ADMMessageHandlerJob_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras */
    public static Bundle m6059xa28a27fb(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: com_adm_push_ADMMessageHandlerJob_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext */
    public static Context m6060xd4c742ae(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.adm.push.ADMMessageHandlerJob$a */
    public static class HandlerC1880a extends Handler {

        /* renamed from: a */
        private final Context f5701a;

        static {
            Covode.recordClassIndex(2053);
        }

        HandlerC1880a(Context context) {
            super(Looper.getMainLooper());
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            this.f5701a = applicationContext;
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 1) {
                try {
                    String str = (String) message.obj;
                    if (!TextUtils.isEmpty(str)) {
                        C21798f.m40814b().mo35458a(this.f5701a, AdmPushAdapter.getAdmPush(), str);
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
                    C21798f.m40816d().mo35422a(AdmPushAdapter.getAdmPush(), 102, (String) message.obj, "ADMMessageHandlerJob.AdmHandler return ERROR when register");
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

    private Handler getHandler(Context context) {
        if (this.mHandler == null) {
            this.mHandler = new HandlerC1880a(m6060xd4c742ae(context));
        }
        return this.mHandler;
    }

    /* access modifiers changed from: protected */
    public void onRegistrationError(Context context, String str) {
        getHandler(context).obtainMessage(2, str).sendToTarget();
    }

    /* access modifiers changed from: protected */
    public void onRegistered(Context context, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - sLastSendTokenTimeStamp >= InteractFirstFrameTimeOutDurationSetting.DEFAULT || !C13627m.m24499a(str, sLastToken)) {
            sLastSendTokenTimeStamp = currentTimeMillis;
            sLastToken = str;
            sendToken(context, str);
        }
    }

    private void sendToken(Context context, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                C21798f.m40816d().mo35422a(AdmPushAdapter.getAdmPush(), 102, "0", "ADMMessageHandlerJob token is empty");
            } else {
                getHandler(context).obtainMessage(1, str).sendToTarget();
            }
        } catch (Throwable th) {
            if (C21798f.m40813a().mo35477a()) {
                Log.getStackTraceString(th);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMessage(Context context, Intent intent) {
        Bundle com_adm_push_ADMMessageHandlerJob_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras;
        if (intent != null && (com_adm_push_ADMMessageHandlerJob_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = m6059xa28a27fb(intent)) != null) {
            try {
                C21798f.m40815c().mo35434a(com_adm_push_ADMMessageHandlerJob_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras.getString("payload"), AdmPushAdapter.getAdmPush());
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }
}
