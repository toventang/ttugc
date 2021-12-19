package com.linecorp.p2025a.p2026a.p2027a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.linecorp.a.a.a.b */
public final class C28135b {

    /* renamed from: a */
    private final Object f65834a = new Object();

    /* renamed from: b */
    private final String f65835b;

    /* renamed from: c */
    private final int f65836c;

    /* renamed from: d */
    private final SecureRandom f65837d;

    /* renamed from: e */
    private final SecretKeyFactory f65838e;

    /* renamed from: f */
    private final Cipher f65839f;

    /* renamed from: g */
    private final Mac f65840g;

    /* renamed from: h */
    private C28136a f65841h;

    static {
        Covode.recordClassIndex(34072);
    }

    /* renamed from: a */
    public final void mo48095a(Context context) {
        MethodCollector.m26663i(5258);
        synchronized (this.f65834a) {
            try {
                if (this.f65841h == null) {
                    this.f65841h = m56238b(context);
                }
            } finally {
                MethodCollector.m26664o(5258);
            }
        }
    }

    public C28135b(String str) {
        this.f65835b = str;
        this.f65836c = 5000;
        try {
            this.f65837d = new SecureRandom();
            this.f65838e = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            this.f65839f = Cipher.getInstance("AES/CBC/PKCS5Padding");
            this.f65840g = Mac.getInstance("HmacSHA256");
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private C28136a m56238b(Context context) {
        byte[] bArr;
        String str = Build.MODEL + Build.MANUFACTURER + Settings.Secure.getString(context.getContentResolver(), "android_id") + context.getPackageName();
        SharedPreferences a = C34822d.m71158a(context, this.f65835b, 0);
        String string = a.getString("salt", null);
        if (!TextUtils.isEmpty(string)) {
            bArr = Base64.decode(string, 0);
        } else {
            bArr = new byte[16];
            this.f65837d.nextBytes(bArr);
            a.edit().putString("salt", Base64.encodeToString(bArr, 0)).apply();
        }
        try {
            byte[] encoded = this.f65838e.generateSecret(new PBEKeySpec(str.toCharArray(), bArr, this.f65836c, 512)).getEncoded();
            return new C28136a(new SecretKeySpec(Arrays.copyOfRange(encoded, 0, 32), "AES"), new SecretKeySpec(Arrays.copyOfRange(encoded, 32, encoded.length), "HmacSHA256"));
        } catch (InvalidKeySpecException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.linecorp.a.a.a.b$a */
    public static class C28136a {

        /* renamed from: a */
        final SecretKey f65842a;

        /* renamed from: b */
        final SecretKey f65843b;

        static {
            Covode.recordClassIndex(34073);
        }

        C28136a(SecretKey secretKey, SecretKey secretKey2) {
            this.f65842a = secretKey;
            this.f65843b = secretKey2;
        }
    }

    /* renamed from: a */
    public final String mo48094a(Context context, String str) {
        String encodeToString;
        MethodCollector.m26663i(5262);
        synchronized (this.f65834a) {
            try {
                mo48095a(context);
                try {
                    int blockSize = this.f65839f.getBlockSize();
                    byte[] bArr = new byte[blockSize];
                    this.f65837d.nextBytes(bArr);
                    this.f65839f.init(1, this.f65841h.f65842a, new IvParameterSpec(bArr));
                    byte[] doFinal = this.f65839f.doFinal(str.getBytes("UTF-8"));
                    byte[] bArr2 = new byte[(doFinal.length + blockSize + 32)];
                    System.arraycopy(bArr, 0, bArr2, 0, blockSize);
                    int i = blockSize + 0;
                    System.arraycopy(doFinal, 0, bArr2, i, doFinal.length);
                    this.f65840g.init(this.f65841h.f65843b);
                    this.f65840g.update(bArr2, 0, blockSize + doFinal.length);
                    byte[] doFinal2 = this.f65840g.doFinal();
                    System.arraycopy(doFinal2, 0, bArr2, i + doFinal.length, doFinal2.length);
                    encodeToString = Base64.encodeToString(bArr2, 0);
                } catch (BadPaddingException e) {
                    C28134a aVar = new C28134a(e);
                    MethodCollector.m26664o(5262);
                    throw aVar;
                } catch (UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | IllegalBlockSizeException e2) {
                    RuntimeException runtimeException = new RuntimeException(e2);
                    MethodCollector.m26664o(5262);
                    throw runtimeException;
                }
            } finally {
                MethodCollector.m26664o(5262);
            }
        }
        return encodeToString;
    }
}
