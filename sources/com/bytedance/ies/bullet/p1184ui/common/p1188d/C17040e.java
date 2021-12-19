package com.bytedance.ies.bullet.p1184ui.common.p1188d;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.ies.bullet.ui.common.d.e */
public final class C17040e {

    /* renamed from: a */
    public static final C17040e f40581a = new C17040e();

    private C17040e() {
    }

    static {
        Covode.recordClassIndex(19489);
    }

    /* renamed from: a */
    public static Activity m31504a(Context context) {
        while (context != null) {
            if (!(context instanceof Activity)) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return (Activity) context;
            }
        }
        return null;
    }
}
