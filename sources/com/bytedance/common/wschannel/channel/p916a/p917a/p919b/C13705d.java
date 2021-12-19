package com.bytedance.common.wschannel.channel.p916a.p917a.p919b;

import com.bytedance.covode.number.Covode;
import p4632k.C89420f;

/* renamed from: com.bytedance.common.wschannel.channel.a.a.b.d */
public final class C13705d {
    static {
        Covode.recordClassIndex(15739);
    }

    /* renamed from: b */
    static void m24689b(int i) {
        String a = m24687a(i);
        if (a != null) {
            throw new IllegalArgumentException(a);
        }
    }

    /* renamed from: a */
    static String m24687a(int i) {
        if (i < 1000 || i >= 5000) {
            return "Code must be in range [1000,5000): ".concat(String.valueOf(i));
        }
        if ((i < 1004 || i > 1006) && (i < 1012 || i > 2999)) {
            return null;
        }
        return "Code " + i + " is reserved and may not be used.";
    }

    /* renamed from: a */
    static void m24688a(C89420f.C89422b bVar, byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = bVar.f203095d;
            int i2 = bVar.f203096e;
            int i3 = bVar.f203097f;
            while (i2 < i3) {
                int i4 = i % length;
                bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                i2++;
                i = i4 + 1;
            }
        } while (bVar.mo143858a() != -1);
    }
}
