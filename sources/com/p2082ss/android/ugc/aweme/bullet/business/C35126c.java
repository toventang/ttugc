package com.p2082ss.android.ugc.aweme.bullet.business;

import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.google.gson.C28022o;
import java.nio.charset.Charset;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89338d;

/* renamed from: com.ss.android.ugc.aweme.bullet.business.c */
public final class C35126c {

    /* renamed from: a */
    public static volatile AtomicInteger f82917a = new AtomicInteger(0);

    /* renamed from: b */
    public static final C35126c f82918b = new C35126c();

    private C35126c() {
    }

    static {
        Covode.recordClassIndex(42281);
    }

    /* renamed from: a */
    public static String m71866a(C28022o oVar, String str) {
        boolean z;
        C89219l.m154721d(oVar, "");
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            byte[] a = m71867a(oVar.toString(), "UTF-8");
            if (a == null) {
                return null;
            }
            Charset charset = C89338d.f202990a;
            if (str != null) {
                byte[] bytes = str.getBytes(charset);
                C89219l.m154716b(bytes, "");
                C89219l.m154721d(bytes, "");
                C89219l.m154721d(a, "");
                SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "AES");
                Cipher instance = Cipher.getInstance("AES/ECB/PKCS7Padding");
                instance.init(1, secretKeySpec);
                byte[] doFinal = instance.doFinal(a);
                if (doFinal == null) {
                    return null;
                }
                return Base64.encodeToString(doFinal, 0);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x005c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] m71867a(java.lang.String r6, java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.bullet.business.C35126c.m71867a(java.lang.String, java.lang.String):byte[]");
    }
}
