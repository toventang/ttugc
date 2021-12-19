package com.p2082ss.avframework.utils;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;
import java.io.File;

/* renamed from: com.ss.avframework.utils.LibraryLoader */
public class LibraryLoader {
    private static Loader sLoader;

    /* renamed from: com.ss.avframework.utils.LibraryLoader$Loader */
    public interface Loader {
        static {
            Covode.recordClassIndex(100732);
        }

        boolean loadLibrary(String str);

        boolean loadLibraryFromPath(String str);
    }

    static {
        Covode.recordClassIndex(100731);
    }

    /* renamed from: com_ss_avframework_utils_LibraryLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary */
    public static void m147812x117d59f6(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38964a(str, false, (Context) null);
        C58032m.m104852a(uptimeMillis, str);
    }

    /* renamed from: com_ss_avframework_utils_LibraryLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_load */
    public static void m147811x7673e305(String str) {
        MethodCollector.m26663i(750);
        long uptimeMillis = SystemClock.uptimeMillis();
        System.load(str);
        C58032m.m104852a(uptimeMillis, str);
        MethodCollector.m26664o(750);
    }

    public static void setupLibraryLoader(Loader loader) {
        sLoader = loader;
        EarlyAVLog.println(5, "setupLibraryLoader", "loader ".concat(String.valueOf(loader)), null);
    }

    public static boolean loadLibrary(String str) {
        Loader loader = sLoader;
        if (TextUtils.isEmpty(str)) {
            throw new Exception("Invalid library name.");
        } else if (loader != null) {
            EarlyAVLog.println(5, "LibraryLoader", "Loading [" + str + "] with external loader " + loader, null);
            return loader.loadLibrary(str);
        } else {
            m147812x117d59f6(str);
            return true;
        }
    }

    public static void loadLibraryFromPath(String str) {
        Loader loader = sLoader;
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (!file.exists()) {
                throw new Exception("Not found library '" + str + "' file.");
            } else if (loader != null) {
                EarlyAVLog.println(5, "LibraryLoader", "Loading [" + file.getAbsolutePath() + "] with external loader " + loader, null);
                loader.loadLibraryFromPath(file.getAbsolutePath());
            } else {
                m147811x7673e305(file.getAbsolutePath());
            }
        } else {
            throw new Exception("Invalid library name.");
        }
    }
}
