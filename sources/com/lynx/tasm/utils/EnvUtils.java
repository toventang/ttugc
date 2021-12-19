package com.lynx.tasm.utils;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxEnv;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;

public class EnvUtils {
    static {
        Covode.recordClassIndex(35040);
    }

    public static String getCacheDir() {
        Application application = LynxEnv.m56706b().f66634a;
        if (C58016d.f132221b == null || !C58016d.f132224e) {
            C58016d.f132221b = application.getCacheDir();
        }
        return C58016d.f132221b.getAbsolutePath();
    }
}
