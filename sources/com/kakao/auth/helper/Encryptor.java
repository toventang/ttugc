package com.kakao.auth.helper;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.kakao.auth.KakaoSDK;
import com.kakao.auth.helper.AESEncryptor;
import com.kakao.util.helper.log.Logger;
import java.security.GeneralSecurityException;

public interface Encryptor {
    static {
        Covode.recordClassIndex(33895);
    }

    String decrypt(String str);

    String encrypt(String str);

    public static class Factory {
        private static Encryptor encryptor;

        static {
            Covode.recordClassIndex(33896);
        }

        public static Encryptor getInstnace() {
            byte[] bArr;
            Context applicationContext = KakaoSDK.getAdapter().getApplicationConfig().getApplicationContext();
            if (encryptor == null) {
                try {
                    bArr = AESEncryptor.AndroidIdUtils.generateAndroidId(applicationContext);
                } catch (Exception unused) {
                    bArr = ("xxxx" + Build.PRODUCT + "a23456789012345bcdefg").getBytes();
                }
                try {
                    encryptor = new AESEncryptor(applicationContext, bArr);
                } catch (GeneralSecurityException e) {
                    Logger.m56205e("Failed to generate encryptor for Access token...");
                    Logger.m56205e(e.toString());
                }
            }
            return encryptor;
        }
    }
}
