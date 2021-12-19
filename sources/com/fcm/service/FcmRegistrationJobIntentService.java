package com.fcm.service;

import android.content.Context;
import android.content.Intent;
import androidx.core.app.AbstractServiceC0582e;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.bytedance.push.C21798f;
import com.fcm.FcmPushAdapter;
import com.fcm.p1909a.C25036a;
import com.kakao.usermgmt.StringSet;
import org.json.JSONObject;

public class FcmRegistrationJobIntentService extends AbstractServiceC0582e {
    static {
        Covode.recordClassIndex(30399);
    }

    @Override // androidx.core.app.AbstractServiceC0583f
    public int onStartCommand(Intent intent, int i, int i2) {
        ServiceLifecycle.onStartCommand(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }

    @Override // androidx.core.app.AbstractServiceC0583f
    public void onHandleWork(Intent intent) {
        String com_fcm_service_FcmRegistrationJobIntentService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = m48008x60234c13(intent, "key_token");
        try {
            C25036a.m48006a(this, com_fcm_service_FcmRegistrationJobIntentService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("label", "get_token");
            jSONObject.put(StringSet.type, FcmPushAdapter.getFcmPush());
            jSONObject.put("token", com_fcm_service_FcmRegistrationJobIntentService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra);
            C21798f.m40814b();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* renamed from: com_fcm_service_FcmRegistrationJobIntentService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra */
    public static String m48008x60234c13(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void enqueueWork(Context context, Intent intent) {
        enqueueWork(context, FcmRegistrationJobIntentService.class, 101, intent);
    }
}
