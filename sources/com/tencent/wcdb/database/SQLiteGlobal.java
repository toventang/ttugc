package com.tencent.wcdb.database;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;

public final class SQLiteGlobal {

    /* renamed from: a */
    public static final int f197662a;

    public static void loadLib() {
    }

    private static native int nativeReleaseMemory();

    private static native void nativeSetDefaultPageSize(int i);

    private SQLiteGlobal() {
    }

    static {
        int i;
        MethodCollector.m26663i(6199);
        Covode.recordClassIndex(103126);
        if (!WCDBInitializationProbe.libLoaded) {
            long uptimeMillis = SystemClock.uptimeMillis();
            Librarian.m38964a("wcdb", false, (Context) null);
            C58032m.m104852a(uptimeMillis, "wcdb");
        }
        try {
            i = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getBlockSize();
        } catch (RuntimeException unused) {
            i = 4096;
        }
        f197662a = i;
        nativeSetDefaultPageSize(i);
        MethodCollector.m26664o(6199);
    }
}
