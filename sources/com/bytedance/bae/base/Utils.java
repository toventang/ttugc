package com.bytedance.bae.base;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.bae.base.BaeLogging;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import java.io.File;

public class Utils {
    private static Context mContext;

    static {
        Covode.recordClassIndex(15027);
    }

    public static String getAppPath() {
        BaeLogging.enableLogToDebugOutput(BaeLogging.Severity.LS_INFO);
        BaeLogging.m23628i("Utils", "this is jni logging test");
        if (mContext == null) {
            mContext = ContextUtils.getApplicationContext();
        }
        return m23640xa17ca0e0(mContext, "").toString();
    }

    public static void SetContext(Context context) {
        mContext = context;
    }

    /* renamed from: com_bytedance_bae_base_Utils_com_ss_android_ugc_aweme_lancet_ContextLancet_getExternalFilesDir */
    public static File m23640xa17ca0e0(Context context, String str) {
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
