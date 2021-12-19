package com.p2082ss.android.ugc.musicprovider;

import android.text.TextUtils;
import com.bytedance.common.utility.C13607d;
import com.bytedance.covode.number.Covode;
import java.io.File;

/* renamed from: com.ss.android.ugc.musicprovider.b */
public final class C84127b {

    /* renamed from: a */
    static final char[] f187742a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static {
        Covode.recordClassIndex(98026);
    }

    /* renamed from: a */
    public static File m144667a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        if (!file.exists()) {
            m144670d(file.getPath());
        }
        return file;
    }

    /* renamed from: b */
    public static boolean m144668b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    /* renamed from: c */
    public static String m144669c(String str) {
        return C13607d.m24442b(str) + ".mp3";
    }

    /* renamed from: d */
    private static void m144670d(String str) {
        try {
            File file = new File(str);
            if (file.getParentFile().exists()) {
                file.mkdir();
                return;
            }
            m144670d(file.getParent());
            file.mkdir();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
