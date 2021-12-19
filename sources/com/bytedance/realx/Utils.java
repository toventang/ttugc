package com.bytedance.realx;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.realx.base.RXLogging;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import dalvik.system.PathClassLoader;
import java.io.File;
import org.webrtc.ContextUtils;

public class Utils {
    private static Context mContext;

    static {
        Covode.recordClassIndex(25637);
    }

    /* renamed from: com_bytedance_realx_Utils_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m41309x1509c16f(String str, String str2) {
        return 0;
    }

    public static String getAppPath() {
        RXLogging.enableLogToDebugOutput(RXLogging.Severity.LS_INFO);
        RXLogging.m41313i("Utils", "this is jni logging test");
        if (mContext == null) {
            mContext = ContextUtils.getApplicationContext();
        }
        return m41308xe77c3e2c(mContext, "").toString();
    }

    public static void SetContext(Context context) {
        mContext = context;
    }

    public static String getAppLibPath(String str) {
        if (mContext == null) {
            mContext = ContextUtils.getApplicationContext();
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String findLibrary = ((PathClassLoader) mContext.getClassLoader()).findLibrary(str);
            if (findLibrary == null) {
                return "";
            }
            return findLibrary;
        } catch (Exception e) {
            RXLogging.m41311e("realx Utils", "getAppLibPath Exception : " + e.getMessage());
            m41309x1509c16f("realx Utils", "getAppLibPath Exception : " + e.getMessage());
            throw e;
        }
    }

    /* renamed from: com_bytedance_realx_Utils_com_ss_android_ugc_aweme_lancet_ContextLancet_getExternalFilesDir */
    public static File m41308xe77c3e2c(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            return context.getExternalFilesDir(str);
        }
        if (C58016d.f132223d != null && C58016d.f132224e) {
            return C58016d.f132223d;
        }
        File externalFilesDir = context.getExternalFilesDir(str);
        C58016d.f132223d = externalFilesDir;
        return externalFilesDir;
    }
}
