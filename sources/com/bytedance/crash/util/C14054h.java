package com.bytedance.crash.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13933m;
import com.bytedance.crash.runtime.C14013j;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.crash.util.h */
public final class C14054h {
    static {
        Covode.recordClassIndex(16121);
    }

    /* renamed from: a */
    public static void m25542a() {
        File g = C14069r.m25638g(C13933m.f33936a);
        g.mkdirs();
        m25543a(g);
    }

    /* renamed from: c */
    private static void m25545c(File file) {
        File file2 = new File(file, "malloc.txt");
        if (!file2.exists()) {
            file2.getParentFile().mkdirs();
            NativeTools.m25458a().mo22560a(file2.getAbsolutePath());
        }
    }

    /* renamed from: d */
    private static void m25546d(File file) {
        File file2 = new File(file, "pthreads.txt");
        if (!file2.exists()) {
            File file3 = new File(file, "rountines.txt");
            file2.getParentFile().mkdirs();
            NativeTools.m25458a().mo22566b(file2.getAbsolutePath(), file3.getAbsolutePath());
        }
    }

    /* renamed from: b */
    public static void m25544b(File file) {
        MethodCollector.m26663i(1340);
        FileOutputStream fileOutputStream = null;
        try {
            Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
            Object invoke = cls.getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            Method declaredMethod = cls.getDeclaredMethod("dumpGfxInfo", FileDescriptor.class, String[].class);
            declaredMethod.setAccessible(true);
            FileOutputStream fileOutputStream2 = new FileOutputStream(new File(file, "gfxinfo.txt"));
            try {
                declaredMethod.invoke(invoke, fileOutputStream2.getFD(), new String[0]);
                C14061m.m25588a(fileOutputStream2);
            } catch (Throwable unused) {
                fileOutputStream = fileOutputStream2;
                C14061m.m25588a(fileOutputStream);
                MethodCollector.m26664o(1340);
            }
        } catch (Throwable unused2) {
            C14061m.m25588a(fileOutputStream);
            MethodCollector.m26664o(1340);
        }
        MethodCollector.m26664o(1340);
    }

    /* renamed from: a */
    public static void m25543a(File file) {
        String str;
        String str2;
        String str3;
        String str4;
        try {
            File file2 = new File(file, "maps.txt");
            String str5 = null;
            if (!file2.exists()) {
                str = file2.getAbsolutePath();
            } else {
                str = null;
            }
            File file3 = new File(file, "smaps.txt");
            if (!file3.exists()) {
                str2 = file3.getAbsolutePath();
            } else {
                str2 = null;
            }
            File file4 = new File(file, "meminfo.txt");
            if (!file4.exists()) {
                str3 = file4.getAbsolutePath();
            } else {
                str3 = null;
            }
            File file5 = new File(file, "fds.txt");
            if (!file5.exists()) {
                str4 = file5.getAbsolutePath();
            } else {
                str4 = null;
            }
            File file6 = new File(file, "threads.txt");
            if (!file6.exists()) {
                str5 = file6.getAbsolutePath();
            }
            m25541a(new File(file, "logcat.txt"), new File(file, "logerr.txt"), false);
            NativeTools.m25458a();
            NativeTools.m25459a(str4, str, str2, str5, str3);
            m25546d(file);
            m25545c(file);
            m25544b(file);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static File m25541a(File file, File file2, boolean z) {
        if (file.exists() && file.length() > 0) {
            return file;
        }
        file.getParentFile().mkdirs();
        C14013j.m25407a(file.getAbsolutePath(), file2.getAbsolutePath(), z);
        return file;
    }
}
