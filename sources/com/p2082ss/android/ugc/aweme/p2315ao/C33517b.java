package com.p2082ss.android.ugc.aweme.p2315ao;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ao.b */
public final class C33517b {
    static {
        Covode.recordClassIndex(40380);
    }

    /* renamed from: a */
    public static final boolean m68681a(Context context, Intent intent) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(intent, "");
        try {
            if (context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            C89379q.m157068constructorimpl(C89382r.m154941a(th));
            return false;
        }
    }
}
