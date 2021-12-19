package com.google.android.play.core.p1961a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.io.File;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.a.u */
public final class C26759u {

    /* renamed from: a */
    final Context f63391a;

    static {
        Covode.recordClassIndex(32231);
    }

    C26759u(Context context) {
        this.f63391a = context;
    }

    /* renamed from: a */
    static long m53136a(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        long j = 0;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                j += m53136a(file2);
            }
        }
        return j;
    }
}
