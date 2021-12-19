package com.p2082ss.android.ugc.aweme.push.downgrade;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.push.downgrade.d */
public final class C65713d {

    /* renamed from: a */
    public static volatile AbstractC65710a f148064a;

    /* renamed from: b */
    public static volatile Boolean f148065b = false;

    static {
        Covode.recordClassIndex(77211);
    }

    /* renamed from: a */
    public static boolean m117625a(Context context, Intent intent) {
        if (f148064a != null) {
            return f148064a.mo104854a(context, intent);
        }
        return false;
    }
}
