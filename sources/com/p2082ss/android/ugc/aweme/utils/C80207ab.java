package com.p2082ss.android.ugc.aweme.utils;

import android.content.res.Resources;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.platform.godzilla.p1574a.C21689g;
import com.bytedance.platform.godzilla.p1585c.AbstractC21721e;

/* renamed from: com.ss.android.ugc.aweme.utils.ab */
public final class C80207ab extends AbstractC21721e {
    static {
        Covode.recordClassIndex(93475);
    }

    @Override // com.bytedance.platform.godzilla.p1585c.AbstractC21717a
    /* renamed from: b */
    public final String mo35351b() {
        return "BadTokenAndResourceNotFoundCrashPlugin";
    }

    @Override // com.bytedance.platform.godzilla.p1585c.AbstractC21721e
    /* renamed from: c */
    public final boolean mo35373c() {
        return true;
    }

    @Override // com.bytedance.platform.godzilla.p1574a.AbstractC21692h
    /* renamed from: a */
    public final boolean mo35345a(Thread thread, Throwable th) {
        if (th instanceof WindowManager.BadTokenException) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            for (StackTraceElement stackTraceElement : stackTrace) {
                if ("android.view.ViewRootImpl".equals(stackTraceElement.getClassName()) && "setView".equals(stackTraceElement.getMethodName())) {
                    C21689g.m40635a(C21689g.EnumC21691a.ERROR);
                    return true;
                }
            }
        }
        if (th instanceof Resources.NotFoundException) {
            StackTraceElement[] stackTrace2 = th.getStackTrace();
            for (StackTraceElement stackTraceElement2 : stackTrace2) {
                if ("org.chromium.ui.base.DeviceFormFactor".equals(stackTraceElement2.getClassName()) && "isTablet".equals(stackTraceElement2.getMethodName())) {
                    C21689g.m40635a(C21689g.EnumC21691a.ERROR);
                    return true;
                }
            }
        }
        return false;
    }
}
