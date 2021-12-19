package com.bytedance.crash.runtime;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13819b;
import com.bytedance.crash.C13934n;
import com.bytedance.crash.CrashType;
import java.io.File;
import java.util.Iterator;

/* renamed from: com.bytedance.crash.runtime.f */
public final class C14006f {
    static {
        Covode.recordClassIndex(16071);
    }

    /* renamed from: a */
    public static void m25387a(File file, CrashType crashType) {
        if (C13994b.m25329a("custom_event_settings", "npth_simple_setting", "disable_crash_with_custom_files") != 1) {
            try {
                if (crashType == CrashType.ANR || !new File(file, "external_files").exists()) {
                    Iterator<C13819b> it = C13934n.f33960f.f34132b.getList(crashType).iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
