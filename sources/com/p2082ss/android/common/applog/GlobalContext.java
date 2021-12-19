package com.p2082ss.android.common.applog;

import android.content.Context;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.common.applog.GlobalContext */
public class GlobalContext {
    private static Context mContext;

    static {
        Covode.recordClassIndex(36168);
    }

    public static Context getContext() {
        return mContext;
    }

    public static void setContext(Context context) {
        mContext = context;
    }
}
