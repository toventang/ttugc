package com.bytedance.geckox.utils;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;

/* renamed from: com.bytedance.geckox.utils.h */
public final class C15057h {

    /* renamed from: a */
    private static Context f36780a;

    static {
        Covode.recordClassIndex(17225);
    }

    /* renamed from: a */
    public static void m27721a(Context context) {
        if (context != null) {
            f36780a = context;
        }
    }

    /* renamed from: a */
    public static void m27722a(String str) {
        Context context = f36780a;
        if (context == null) {
            m27723b(str);
        } else {
            Librarian.m38964a(str, true, context);
        }
    }

    /* renamed from: b */
    private static void m27723b(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38964a(str, false, (Context) null);
        C58032m.m104852a(uptimeMillis, str);
    }
}
