package com.p2082ss.android.ugc.playerkit.p4324d;

import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.playerkit.d.b */
public final class C84187b {
    static {
        Covode.recordClassIndex(98089);
    }

    /* renamed from: a */
    public static long m144768a() {
        long j;
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            int i = Build.VERSION.SDK_INT;
            j = statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        } catch (IllegalArgumentException unused) {
            j = 0;
        }
        return (j / 1024) / 1024;
    }
}
