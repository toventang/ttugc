package com.facebook.common.p1831c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.facebook.common.c.c */
public final class C24077c {
    static {
        Covode.recordClassIndex(28204);
    }

    /* renamed from: com.facebook.common.c.c$a */
    public static class C24078a extends IOException {
        static {
            Covode.recordClassIndex(28205);
        }

        public C24078a(String str) {
            super(str);
        }

        public C24078a(String str, Throwable th) {
            super(str);
            initCause(th);
        }
    }

    /* renamed from: com.facebook.common.c.c$b */
    public static class C24079b extends IOException {
        static {
            Covode.recordClassIndex(28206);
        }

        public C24079b(String str) {
            super(str);
        }
    }

    /* renamed from: com.facebook.common.c.c$c */
    public static class C24080c extends FileNotFoundException {
        static {
            Covode.recordClassIndex(28207);
        }

        public C24080c(String str) {
            super(str);
        }
    }

    /* renamed from: com.facebook.common.c.c$d */
    public static class C24081d extends IOException {
        static {
            Covode.recordClassIndex(28208);
        }

        public C24081d(String str) {
            super(str);
        }

        public C24081d(String str, Throwable th) {
            super(str);
            initCause(th);
        }
    }

    /* renamed from: a */
    public static void m45595a(File file) {
        if (file.exists()) {
            if (!file.isDirectory()) {
                if (!m45596b(file)) {
                    throw new C24078a(file.getAbsolutePath(), new C24079b(file.getAbsolutePath()));
                }
            } else {
                return;
            }
        }
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new C24078a(file.getAbsolutePath());
        }
    }

    /* renamed from: b */
    public static boolean m45596b(File file) {
        MethodCollector.m26663i(13375);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(13375);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(13375);
        return delete;
    }
}
