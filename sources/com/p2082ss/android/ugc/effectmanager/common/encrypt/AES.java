package com.p2082ss.android.ugc.effectmanager.common.encrypt;

import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.effectmanager.common.logger.EPLog;
import com.p2082ss.android.ugc.effectmanager.common.utils.CollectionUtil;
import com.p2082ss.android.ugc.effectmanager.common.utils.EPUtils;
import com.p2082ss.android.ugc.effectmanager.common.utils.MD5Utils;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89338d;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.effectmanager.common.encrypt.AES */
public final class AES {
    public static final AES INSTANCE = new AES();
    private static boolean hasInitialized;
    private static IvParameterSpec ivParameterSpec;
    private static SecretKeySpec secretKeySpec;

    private AES() {
    }

    static {
        Covode.recordClassIndex(95467);
    }

    private final synchronized boolean checkIfInitialized() {
        boolean z;
        byte[] generateSecretKey;
        MethodCollector.m26663i(6296);
        if (!hasInitialized && (generateSecretKey = generateSecretKey()) != null) {
            AES aes = INSTANCE;
            secretKeySpec = aes.initSecretKeySpec(generateSecretKey);
            ivParameterSpec = aes.initIvParameterSpec(generateSecretKey);
            hasInitialized = true;
        }
        z = hasInitialized;
        MethodCollector.m26664o(6296);
        return z;
    }

    private final byte[] generateSecretKey() {
        String platformSDKVersion = EPUtils.getPlatformSDKVersion();
        if (platformSDKVersion != null) {
            try {
                String mD5String16Bit = MD5Utils.getMD5String16Bit(platformSDKVersion + ":android");
                C89219l.m154709a((Object) mD5String16Bit, "");
                Charset forName = Charset.forName("UTF-8");
                C89219l.m154709a((Object) forName, "");
                if (mD5String16Bit != null) {
                    byte[] bytes = mD5String16Bit.getBytes(forName);
                    C89219l.m154709a((Object) bytes, "");
                    return bytes;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } catch (Exception e) {
                EPLog.m141899e("AES_TAG", "generateSecretKey error, " + e.getMessage());
            }
        }
        return null;
    }

    private final IvParameterSpec initIvParameterSpec(byte[] bArr) {
        return new IvParameterSpec(bArr);
    }

    private final SecretKeySpec initSecretKeySpec(byte[] bArr) {
        return new SecretKeySpec(bArr, "AES");
    }

    public static final String decrypt(String str) {
        AES aes = INSTANCE;
        if (!aes.checkIfInitialized() || str == null || C89361p.m154870a((CharSequence) str)) {
            return "";
        }
        return aes.decryptInternal(str);
    }

    public static final List<String> decryptArray(List<String> list) {
        if (!INSTANCE.checkIfInitialized() || CollectionUtil.isListEmpty(list)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            C89219l.m154707a();
        }
        for (String str : list) {
            String decrypt = decrypt(str);
            if (decrypt != null) {
                arrayList.add(decrypt);
            }
        }
        return arrayList;
    }

    private final String decryptInternal(String str) {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(2, secretKeySpec, ivParameterSpec);
            byte[] doFinal = instance.doFinal(Base64.decode(str, 0));
            C89219l.m154709a((Object) doFinal, "");
            return new String(doFinal, C89338d.f202990a);
        } catch (Exception e) {
            EPLog.m141898d("AES_TAG", "Error while decrypting " + str + ", exception: " + e);
            return "";
        }
    }

    public static final String encrypt(String str) {
        boolean z;
        if (INSTANCE.checkIfInitialized()) {
            if (str == null || C89361p.m154870a((CharSequence) str)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                try {
                    Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
                    instance.init(1, secretKeySpec, ivParameterSpec);
                    Charset forName = Charset.forName("UTF-8");
                    C89219l.m154709a((Object) forName, "");
                    if (str != null) {
                        byte[] bytes = str.getBytes(forName);
                        C89219l.m154709a((Object) bytes, "");
                        return Base64.encodeToString(instance.doFinal(bytes), 0);
                    }
                    throw new C89388w("null cannot be cast to non-null type");
                } catch (Exception e) {
                    System.out.println((Object) "Error while encrypting: ".concat(String.valueOf(e)));
                }
            }
        }
        return "";
    }
}
