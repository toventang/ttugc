package com.bytedance.ies.xbridge.p1317i.p1321d;

import com.bytedance.covode.number.Covode;
import java.security.MessageDigest;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89338d;

/* renamed from: com.bytedance.ies.xbridge.i.d.d */
public final class C18628d {

    /* renamed from: a */
    public static final C18628d f44366a = new C18628d();

    /* renamed from: b */
    private static final char[] f44367b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    private C18628d() {
    }

    static {
        Covode.recordClassIndex(21322);
    }

    /* renamed from: a */
    public static String m34598a(String str) {
        C89219l.m154719c(str, "");
        try {
            byte[] bytes = str.getBytes(C89338d.f202990a);
            C89219l.m154709a((Object) bytes, "");
            return m34599a(bytes);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    private static String m34599a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            byte[] digest = instance.digest();
            C89219l.m154709a((Object) digest, "");
            char[] cArr = new char[32];
            int i = 0;
            for (int i2 = 0; i2 < 16; i2++) {
                byte b = digest[i2];
                int i3 = i + 1;
                char[] cArr2 = f44367b;
                cArr[i] = cArr2[(b >>> 4) & 15];
                i = i3 + 1;
                cArr[i3] = cArr2[b & 15];
            }
            return cArr.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
