package com.p2082ss.android.ugc.aweme.framework.p3008c;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.utils.C80422fe;

/* renamed from: com.ss.android.ugc.aweme.framework.c.a */
public final class C51426a {

    /* renamed from: a */
    public static C80422fe.EnumC80423a f118501a;

    /* renamed from: b */
    public static C80422fe.EnumC80423a f118502b;

    static {
        Covode.recordClassIndex(60649);
    }

    /* renamed from: a */
    public static boolean m95802a(Context context) {
        C80422fe.EnumC80423a aVar = f118501a;
        if (aVar == null || aVar == C80422fe.EnumC80423a.NONE) {
            f118501a = C80422fe.m139426b(context);
        }
        if (f118501a == C80422fe.EnumC80423a.WIFI) {
            return true;
        }
        return false;
    }
}
