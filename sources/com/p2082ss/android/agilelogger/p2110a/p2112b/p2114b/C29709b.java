package com.p2082ss.android.agilelogger.p2110a.p2112b.p2114b;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.agilelogger.p2119c.C29723c;

/* renamed from: com.ss.android.agilelogger.a.b.b.b */
public final class C29709b implements AbstractC29710c<Intent> {
    static {
        Covode.recordClassIndex(36106);
    }

    @Override // com.p2082ss.android.agilelogger.p2110a.AbstractC29704b
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo51950a(Object obj) {
        return m59883a((Intent) obj);
    }

    /* renamed from: a */
    public static String m59883a(Intent intent) {
        if (intent == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("Intent { ");
        C29723c.m59903a(intent, sb);
        sb.append(" }");
        return sb.toString();
    }
}
