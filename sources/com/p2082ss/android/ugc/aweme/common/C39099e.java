package com.p2082ss.android.ugc.aweme.common;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.common.e */
public final class C39099e {
    static {
        Covode.recordClassIndex(46715);
    }

    /* renamed from: a */
    public static final int m79372a(Context context) {
        ContentResolver contentResolver;
        if (context != null) {
            try {
                contentResolver = context.getContentResolver();
            } catch (Exception unused) {
                return -1;
            }
        } else {
            contentResolver = null;
        }
        return Settings.System.getInt(contentResolver, "screen_brightness");
    }
}
