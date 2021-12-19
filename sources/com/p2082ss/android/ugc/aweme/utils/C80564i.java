package com.p2082ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.utils.i */
public final class C80564i {
    static {
        Covode.recordClassIndex(93837);
    }

    /* renamed from: a */
    public static Activity m139647a(Context context) {
        while (context != null && !(context instanceof Application)) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
