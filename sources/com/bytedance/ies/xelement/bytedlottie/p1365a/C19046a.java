package com.bytedance.ies.xelement.bytedlottie.p1365a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.ies.xelement.bytedlottie.a.a */
public final class C19046a {

    /* renamed from: a */
    public static final C19046a f45124a = new C19046a();

    private C19046a() {
    }

    static {
        Covode.recordClassIndex(21809);
    }

    /* renamed from: a */
    public static Bitmap m35390a(String str) {
        MethodCollector.m26663i(1239);
        Bitmap bitmap = null;
        if (str == null) {
            MethodCollector.m26664o(1239);
            return null;
        } else if (!C89361p.m154874b(str, "data:", false) || !C89361p.m154874b(str, "data:image/", false) || !C89361p.m154908a((CharSequence) str, (CharSequence) ";base64,", false)) {
            MethodCollector.m26664o(1239);
            return null;
        } else {
            try {
                byte[] decode = Base64.decode(C89361p.m154915b(str, new String[]{","}).get(1), 0);
                bitmap = BitmapFactory.decodeByteArray(decode, 0, decode.length);
            } catch (Exception unused) {
            }
            MethodCollector.m26664o(1239);
            return bitmap;
        }
    }
}
