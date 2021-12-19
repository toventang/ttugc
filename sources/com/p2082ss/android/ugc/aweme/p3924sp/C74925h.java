package com.p2082ss.android.ugc.aweme.p3924sp;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.sp.h */
public class C74925h extends ContextWrapper {
    static {
        Covode.recordClassIndex(87790);
    }

    public C74925h(Context context) {
        super(context);
    }

    public SharedPreferences getSharedPreferences(String str, int i) {
        return SharedPreferencesManager.getInstance().getSharedPreferences(this, str);
    }
}
