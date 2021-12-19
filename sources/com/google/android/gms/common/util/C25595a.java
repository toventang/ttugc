package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.p1938c.C25500c;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.gms.common.util.a */
public final class C25595a {

    /* renamed from: a */
    private static volatile int f60703a = -1;

    static {
        Covode.recordClassIndex(31005);
    }

    /* renamed from: a */
    public static MessageDigest m49401a(String str) {
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                if (instance != null) {
                    return instance;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static byte[] m49402a(Context context, String str) {
        MessageDigest a;
        PackageInfo b = C25500c.f60481a.mo41741a(context).mo41740b(str, 64);
        if (b.signatures == null || b.signatures.length != 1 || (a = m49401a("SHA1")) == null) {
            return null;
        }
        return a.digest(b.signatures[0].toByteArray());
    }
}
