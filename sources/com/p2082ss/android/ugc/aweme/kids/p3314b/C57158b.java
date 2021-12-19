package com.p2082ss.android.ugc.aweme.kids.p3314b;

import android.text.TextUtils;
import com.bytedance.common.utility.C13607d;
import com.bytedance.covode.number.Covode;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.kids.b.b */
public final class C57158b {

    /* renamed from: a */
    static final char[] f130117a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static {
        Covode.recordClassIndex(67058);
    }

    /* renamed from: a */
    public static File m103573a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        if (!file.exists()) {
            m103576d(file.getPath());
        }
        return file;
    }

    /* renamed from: b */
    public static boolean m103574b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    /* renamed from: c */
    public static String m103575c(String str) {
        return C13607d.m24442b(str) + ".mp3";
    }

    /* renamed from: d */
    private static void m103576d(String str) {
        try {
            File file = new File(str);
            if (file.getParentFile().exists()) {
                file.mkdir();
                return;
            }
            m103576d(file.getParent());
            file.mkdir();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
