package com.p2082ss.android.ugc.aweme.profile.p3575f;

import android.util.Base64;
import com.bytedance.covode.number.Covode;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89338d;

/* renamed from: com.ss.android.ugc.aweme.profile.f.m */
public final class C63784m {

    /* renamed from: a */
    public static final C63784m f144578a = new C63784m();

    private C63784m() {
    }

    static {
        Covode.recordClassIndex(75112);
    }

    /* renamed from: a */
    public static final String m115344a(String str, String str2, String str3, String str4) {
        byte[] decode;
        Object obj;
        String str5;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        byte[] bytes = str.getBytes(C89338d.f202990a);
        C89219l.m154716b(bytes, "");
        byte[] bytes2 = str2.getBytes(C89338d.f202990a);
        C89219l.m154716b(bytes2, "");
        byte[] bytes3 = str4.getBytes(C89338d.f202990a);
        C89219l.m154716b(bytes3, "");
        String str6 = null;
        if (bytes == null) {
            decode = null;
        } else {
            decode = Base64.decode(bytes, 2);
        }
        byte[] a = m115345a(decode, bytes2, "AES", str3, bytes3);
        if (a != null) {
            try {
                str5 = new String(a, C89338d.f202990a);
            } catch (Throwable th) {
                obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
        } else {
            str5 = null;
        }
        obj = C89379q.m157068constructorimpl(str5);
        if (!C89379q.m157073isFailureimpl(obj)) {
            str6 = obj;
        }
        String str7 = str6;
        if (str7 == null) {
            return "";
        }
        return str7;
    }

    /* renamed from: a */
    private static byte[] m115345a(byte[] bArr, byte[] bArr2, String str, String str2, byte[] bArr3) {
        if (bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length == 0 || str2 == null) {
            return null;
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, str);
            Cipher instance = Cipher.getInstance(str2);
            C89219l.m154716b(instance, "");
            if (bArr3 == null || bArr3.length == 0) {
                instance.init(2, secretKeySpec);
            } else {
                instance.init(2, secretKeySpec, new IvParameterSpec(bArr3));
            }
            return instance.doFinal(bArr);
        } catch (Throwable unused) {
            return null;
        }
    }
}
