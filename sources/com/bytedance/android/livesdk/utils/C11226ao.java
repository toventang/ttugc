package com.bytedance.android.livesdk.utils;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;

/* renamed from: com.bytedance.android.livesdk.utils.ao */
public final class C11226ao {

    /* renamed from: a */
    public static int f26873a;

    static {
        Covode.recordClassIndex(12854);
    }

    /* renamed from: a */
    public static void m19884a(String str) {
        m19883a(C3966y.m9669e(), str, 0);
    }

    /* renamed from: a */
    public static void m19881a(Activity activity, CharSequence charSequence) {
        new C23144b(activity).mo37636b(2131234609).mo37635a(charSequence).mo37637b();
    }

    /* renamed from: a */
    public static void m19882a(Context context, int i) {
        if (context != null || (context = C3966y.m9669e()) != null) {
            m19883a(context, context.getString(i), 0);
        }
    }

    /* renamed from: a */
    public static void m19883a(Context context, String str, long j) {
        if ((context == null && (context = C3966y.m9669e()) == null) || TextUtils.isEmpty(str)) {
            return;
        }
        if (j > 0) {
            new C79459a(context).mo123052a(str).mo123051a(j).mo123053a();
        } else {
            new C79459a(context).mo123052a(str).mo123053a();
        }
    }
}
