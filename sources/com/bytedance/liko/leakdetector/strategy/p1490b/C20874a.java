package com.bytedance.liko.leakdetector.strategy.p1490b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Debug;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.liko.leakdetector.p1487a.C20852a;
import com.bytedance.liko.leakdetector.p1487a.C20854c;
import com.bytedance.liko.memoryexplorer.MemoryConfig;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.io.File;
import java.io.FileWriter;
import java.lang.Thread;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.liko.leakdetector.strategy.b.a */
public final class C20874a implements Thread.UncaughtExceptionHandler {

    /* renamed from: b */
    private static Thread.UncaughtExceptionHandler f49359b;

    /* renamed from: a */
    private Context f49360a;

    static {
        Covode.recordClassIndex(24453);
    }

    private C20874a(Context context) {
        this.f49360a = context;
    }

    /* renamed from: a */
    public static void m39235a(Context context) {
        f49359b = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new C20874a(context));
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        Long l;
        boolean z;
        SharedPreferences a;
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putLong;
        SharedPreferences a2;
        MethodCollector.m26663i(12820);
        Context context = this.f49360a;
        if (context == null || (a2 = C34822d.m71158a(context, "LeakDetectorSp", 0)) == null) {
            l = null;
        } else {
            l = Long.valueOf(a2.getLong("ld_oom_dump_time", -1));
        }
        if (System.currentTimeMillis() - l.longValue() < 3600000) {
            z = true;
        } else {
            z = false;
        }
        if ((th instanceof OutOfMemoryError) && !z) {
            try {
                File a3 = C20852a.m39200a(MemoryConfig.getMemoryConfig().oversea, this.f49360a);
                if (a3 != null) {
                    a3.getAbsolutePath();
                    Debug.dumpHprofData(a3.getAbsolutePath());
                    File parentFile = a3.getParentFile();
                    StackTraceElement[] stackTrace = thread.getStackTrace();
                    C89219l.m154719c(".stacks", "");
                    C89219l.m154719c(stackTrace, "");
                    String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Long.valueOf(System.currentTimeMillis()));
                    C89219l.m154709a((Object) format, "");
                    ArrayList arrayList = new ArrayList();
                    FileWriter fileWriter = new FileWriter(new File(parentFile, ".stacks"));
                    arrayList.add("OOM Time:".concat(String.valueOf(format)));
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        arrayList.add(String.valueOf(stackTraceElement.getLineNumber()) + " className = " + stackTraceElement.getClassName() + ", methodName = " + stackTraceElement.getMethodName());
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        fileWriter.write(((String) it.next()) + '\n');
                    }
                    fileWriter.close();
                    Context context2 = this.f49360a;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!(context2 == null || (a = C34822d.m71158a(context2, "LeakDetectorSp", 0)) == null || (edit = a.edit()) == null || (putLong = edit.putLong("ld_oom_dump_time", currentTimeMillis)) == null)) {
                        putLong.commit();
                    }
                    C20854c.m39207b(this.f49360a, a3.getAbsolutePath());
                }
            } catch (Throwable unused) {
            }
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = f49359b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
        MethodCollector.m26664o(12820);
    }
}
