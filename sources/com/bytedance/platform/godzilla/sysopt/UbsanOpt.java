package com.bytedance.platform.godzilla.sysopt;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;

public final class UbsanOpt {
    public static native void end();

    public static native void start();

    private UbsanOpt() {
    }

    static {
        Covode.recordClassIndex(25372);
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38964a("godzilla-sysopt", false, (Context) null);
        C58032m.m104852a(uptimeMillis, "godzilla-sysopt");
    }
}
