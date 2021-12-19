package com.p2082ss.android.agilelogger.p2119c;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import java.io.File;

/* renamed from: com.ss.android.agilelogger.c.a */
public final class C29720a {
    static {
        Covode.recordClassIndex(36117);
    }

    /* renamed from: a */
    public static File m59890a(Context context) {
        File file = new File(m59892c(context), "logs");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    /* renamed from: c */
    private static File m59892c(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    /* renamed from: b */
    public static String m59891b(Context context) {
        File c = m59892c(context);
        if (c == null) {
            return null;
        }
        File file = new File(c.getAbsolutePath(), "ALOG");
        if (!file.exists()) {
            file.mkdir();
        }
        return file.getAbsolutePath();
    }
}
