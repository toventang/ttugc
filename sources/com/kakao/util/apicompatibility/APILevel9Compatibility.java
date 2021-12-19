package com.kakao.util.apicompatibility;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.gsm.SmsMessage;
import com.bytedance.covode.number.Covode;
import com.kakao.util.helper.log.Logger;

/* access modifiers changed from: package-private */
public class APILevel9Compatibility extends APICompatibility {
    static {
        Covode.recordClassIndex(34050);
    }

    APILevel9Compatibility() {
    }

    /* renamed from: com_kakao_util_apicompatibility_APILevel9Compatibility_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras */
    public static Bundle m56184x6a7fc7f6(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.kakao.util.apicompatibility.APICompatibility
    public String getSmsMessage(Intent intent) {
        Object[] objArr = (Object[]) m56183xe5ffbfb3(m56184x6a7fc7f6(intent), "pdus");
        int length = objArr.length;
        String str = null;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Object obj = objArr[i];
            Logger.m56197d("legacy SMS implementation (before KitKat)");
            SmsMessage createFromPdu = SmsMessage.createFromPdu((byte[]) obj);
            if (createFromPdu == null) {
                Logger.m56205e("SMS message is null -- ABORT");
                break;
            }
            str = createFromPdu.getDisplayMessageBody();
            i++;
        }
        return str;
    }

    /* renamed from: com_kakao_util_apicompatibility_APILevel9Compatibility_com_ss_android_ugc_aweme_lancet_IntentLancet_get */
    public static Object m56183xe5ffbfb3(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }
}
