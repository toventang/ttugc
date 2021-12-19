package com.google.android.play.core.p1966e;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.google.android.play.core.p1963b.C26909b;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;
import java.io.File;

/* renamed from: com.google.android.play.core.e.b */
public final class C27017b {

    /* renamed from: a */
    public static final C26909b f63935a = new C26909b("SplitInstallHelper");

    static {
        Covode.recordClassIndex(32493);
    }

    /* renamed from: a */
    public static void m53684a(Context context, String str) {
        MethodCollector.m26663i(13348);
        synchronized (C27001ag.class) {
            try {
                long uptimeMillis = SystemClock.uptimeMillis();
                Librarian.m38964a(str, false, (Context) null);
                C58032m.m104852a(uptimeMillis, str);
            } catch (UnsatisfiedLinkError e) {
                String str2 = context.getApplicationInfo().nativeLibraryDir;
                String mapLibraryName = System.mapLibraryName(str);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(mapLibraryName).length());
                sb.append(str2);
                sb.append("/");
                sb.append(mapLibraryName);
                String sb2 = sb.toString();
                if (new File(sb2).exists()) {
                    long uptimeMillis2 = SystemClock.uptimeMillis();
                    System.load(sb2);
                    C58032m.m104852a(uptimeMillis2, sb2);
                } else {
                    MethodCollector.m26664o(13348);
                    throw e;
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(13348);
                throw th;
            }
        }
        MethodCollector.m26664o(13348);
    }
}
