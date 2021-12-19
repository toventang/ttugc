package com.p2082ss.android.ugc.aweme.i18n;

import android.os.Looper;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import java.lang.Thread;

/* renamed from: com.ss.android.ugc.aweme.i18n.a */
public final class C53433a implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public Thread.UncaughtExceptionHandler f122647a;

    /* renamed from: b */
    private long f122648b = Looper.getMainLooper().getThread().getId();

    static {
        Covode.recordClassIndex(63002);
    }

    /* renamed from: a */
    public static void m98609a() {
        Thread.setDefaultUncaughtExceptionHandler(new C53433a(Thread.getDefaultUncaughtExceptionHandler()));
    }

    private C53433a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f122647a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        System.err.println("uncaughtException=" + Log.getStackTraceString(th));
        if (!(th instanceof IllegalStateException) || thread == null || thread.getId() == this.f122648b || th.getMessage() == null || !"Results have already been set".equals(th.getMessage().trim())) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f122647a;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
                return;
            }
            return;
        }
        C34611o.m70668a("gms_crash_results_have_already_been_set", null);
    }
}
