package com.bytedance.android.live.design.p230a;

import android.content.Context;
import android.view.ContextThemeWrapper;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.design.a.a */
public final class C4054a {
    static {
        Covode.recordClassIndex(4595);
    }

    /* renamed from: a */
    public static Context m9853a(Context context) {
        return new ContextThemeWrapper(context, (int) R.style.ms);
    }

    /* renamed from: a */
    public static String m9854a(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        return str.replace((char) 65532, ' ');
    }
}
