package com.facebook.p1814a.p1821f;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.facebook.C24872m;
import com.facebook.internal.C24699ae;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import java.io.File;
import java.nio.charset.Charset;

/* renamed from: com.facebook.a.f.e */
public class C23963e {
    static {
        Covode.recordClassIndex(28084);
    }

    /* renamed from: a */
    public static File m45314a() {
        if (C24677a.m47209a(C23963e.class)) {
            return null;
        }
        try {
            C24699ae.m47299a();
            Context context = C24872m.f59047g;
            if (C58016d.f132222c == null || !C58016d.f132224e) {
                C58016d.f132222c = context.getFilesDir();
            }
            File file = new File(C58016d.f132222c, "facebook_ml/");
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return null;
                }
            }
            return file;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23963e.class);
            return null;
        }
    }

    /* renamed from: b */
    private static String m45316b(String str) {
        if (C24677a.m47209a(C23963e.class)) {
            return null;
        }
        try {
            return TextUtils.join(" ", str.trim().split("\\s+"));
        } catch (Throwable th) {
            C24677a.m47208a(th, C23963e.class);
            return null;
        }
    }

    /* renamed from: a */
    static int[] m45315a(String str) {
        if (C24677a.m47209a(C23963e.class)) {
            return null;
        }
        try {
            int[] iArr = new int[128];
            byte[] bytes = m45316b(str).getBytes(Charset.forName("UTF-8"));
            for (int i = 0; i < 128; i++) {
                if (i < bytes.length) {
                    iArr[i] = bytes[i] & 255;
                } else {
                    iArr[i] = 0;
                }
            }
            return iArr;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23963e.class);
            return null;
        }
    }
}
