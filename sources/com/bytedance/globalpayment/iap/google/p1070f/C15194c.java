package com.bytedance.globalpayment.iap.google.p1070f;

import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.payment.common.lib.p1078h.C15253a;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.X509EncodedKeySpec;

/* renamed from: com.bytedance.globalpayment.iap.google.f.c */
public final class C15194c {
    static {
        Covode.recordClassIndex(17374);
    }

    /* renamed from: a */
    public static PublicKey m27999a(String str) {
        C15253a.m28071a().mo24705e();
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
        } catch (Throwable th) {
            C15253a.m28071a().mo24705e();
            throw new RuntimeException(th);
        }
    }

    /* renamed from: a */
    public static boolean m28000a(PublicKey publicKey, String str, String str2) {
        C15253a.m28071a().mo24705e();
        new StringBuilder("Security: try verify , publicKey is ").append(publicKey).append(" signedData is ").append(str).append(" signature is ").append(str2);
        try {
            byte[] decode = Base64.decode(str2, 0);
            try {
                Signature instance = Signature.getInstance("SHA1withRSA");
                instance.initVerify(publicKey);
                instance.update(str.getBytes());
                if (instance.verify(decode)) {
                    return true;
                }
                C15253a.m28071a().mo24705e();
                return false;
            } catch (NoSuchAlgorithmException unused) {
                C15253a.m28071a().mo24705e();
                return false;
            } catch (InvalidKeyException unused2) {
                C15253a.m28071a().mo24705e();
                return false;
            } catch (SignatureException unused3) {
                C15253a.m28071a().mo24705e();
                return false;
            }
        } catch (IllegalArgumentException unused4) {
            C15253a.m28071a().mo24705e();
            return false;
        }
    }
}
