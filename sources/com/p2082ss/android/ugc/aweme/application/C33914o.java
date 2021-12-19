package com.p2082ss.android.ugc.aweme.application;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.p4601a.C89070n;

/* renamed from: com.ss.android.ugc.aweme.application.o */
public final class C33914o {

    /* renamed from: a */
    static final List<String> f80219a = C89070n.m154524c("keva", "godzilla-sysopt", "sscronet", "ttffmpeg", "bytertc", "npth", "ttquic", "bytevc1enc", "bytehook", "storagehandlerlib", "fileprotect", "monitorcollector-lib", "stackmanager", "ttcrypto", "vcn", "avmdl", "wcdb", "vctfo", "vcnverify", "avmdlttnet", "metasec_ov", "tensorflowlite_jni", "jato", "tracer");

    /* renamed from: b */
    public static ConcurrentHashMap<String, Boolean> f80220b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public static final C33914o f80221c = new C33914o();

    private C33914o() {
    }

    /* renamed from: a */
    public static ConcurrentHashMap<String, Boolean> m69445a() {
        return f80220b;
    }

    /* renamed from: com.ss.android.ugc.aweme.application.o$a */
    static final class RunnableC33915a implements Runnable {

        /* renamed from: a */
        public static final RunnableC33915a f80222a = new RunnableC33915a();

        static {
            Covode.recordClassIndex(40833);
        }

        RunnableC33915a() {
        }

        public final void run() {
            for (T t : C33914o.f80219a) {
                try {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    Librarian.m38962a(t);
                    C58032m.m104852a(uptimeMillis, t);
                    C33914o.f80220b.put(t, true);
                } catch (Throwable th) {
                    th.getStackTrace();
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(40832);
    }
}
