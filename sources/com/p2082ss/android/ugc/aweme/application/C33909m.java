package com.p2082ss.android.ugc.aweme.application;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;

/* renamed from: com.ss.android.ugc.aweme.application.m */
public final class C33909m {

    /* renamed from: a */
    public static final C33909m f80209a = new C33909m();

    /* renamed from: b */
    private static final String f80210b = "LauncherResPreload";

    private C33909m() {
    }

    /* renamed from: com.ss.android.ugc.aweme.application.m$a */
    static final class RunnableC33910a implements Runnable {

        /* renamed from: a */
        public static final RunnableC33910a f80211a = new RunnableC33910a();

        static {
            Covode.recordClassIndex(40828);
        }

        RunnableC33910a() {
        }

        public final void run() {
            try {
                long uptimeMillis = SystemClock.uptimeMillis();
                Librarian.m38962a("godzilla-sysopt");
                C58032m.m104852a(uptimeMillis, "godzilla-sysopt");
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.application.m$b */
    static final class RunnableC33911b implements Runnable {

        /* renamed from: a */
        public static final RunnableC33911b f80212a = new RunnableC33911b();

        static {
            Covode.recordClassIndex(40829);
        }

        RunnableC33911b() {
        }

        public final void run() {
            try {
                long uptimeMillis = SystemClock.uptimeMillis();
                Librarian.m38962a("fileprotect");
                C58032m.m104852a(uptimeMillis, "fileprotect");
            } catch (Throwable unused) {
            }
        }
    }

    static {
        Covode.recordClassIndex(40827);
    }
}
