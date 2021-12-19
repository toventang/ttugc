package com.bytedance.disk.p958c.p959a;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.disk.c.a.c */
public final class C14432c {

    /* renamed from: a */
    private static final byte[] f34908a = {66, 68};

    static {
        Covode.recordClassIndex(16510);
    }

    /* renamed from: a */
    public static String m26345a(String str) {
        C14431b b = m26346b(str);
        if (b != null) {
            return b.mo23257a();
        }
        return null;
    }

    /* renamed from: b */
    private static C14431b m26346b(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                C14430a aVar = new C14430a("path");
                byte[] a = aVar.mo23256a(Base64.decode(str, 0));
                aVar.mo23255a();
                if (a != null) {
                    str2 = new String(a);
                } else {
                    str2 = null;
                }
                int length = f34908a.length + 16;
                if (str2 != null && str2.length() > length) {
                    int i = 0;
                    while (true) {
                        byte[] bArr = f34908a;
                        if (i >= bArr.length) {
                            C14431b bVar = new C14431b(str2, length);
                            if (bVar.f34902a != -1 && bVar.f34906e != -1 && bVar.f34904c >= 0 && bVar.f34904c <= 7 && bVar.f34905d >= 0 && bVar.f34905d <= 2) {
                                if (!TextUtils.isEmpty(bVar.f34903b)) {
                                    return bVar;
                                }
                            }
                        } else if (str2.charAt(i + 16) != bArr[i]) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
