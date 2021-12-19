package com.kakao.util.apicompatibility;

import android.content.Intent;
import android.provider.Telephony;
import android.telephony.SmsMessage;
import com.bytedance.covode.number.Covode;
import com.kakao.util.helper.log.Logger;

class APILevel19Compatibility extends APILevel9Compatibility {
    static {
        Covode.recordClassIndex(34048);
    }

    APILevel19Compatibility() {
    }

    @Override // com.kakao.util.apicompatibility.APILevel9Compatibility, com.kakao.util.apicompatibility.APICompatibility
    public String getSmsMessage(Intent intent) {
        SmsMessage[] messagesFromIntent = Telephony.Sms.Intents.getMessagesFromIntent(intent);
        int length = messagesFromIntent.length;
        String str = null;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            SmsMessage smsMessage = messagesFromIntent[i];
            Logger.m56197d("KitKat or newer");
            if (smsMessage == null) {
                Logger.m56205e("SMS message is null -- ABORT");
                break;
            }
            str = smsMessage.getDisplayMessageBody();
            i++;
        }
        return str;
    }
}
