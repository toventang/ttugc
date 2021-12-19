package com.p2082ss.android.ugc.aweme.inferenceengine;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2160ml.AbstractC30081h;

/* renamed from: com.ss.android.ugc.aweme.inferenceengine.d */
public final class C56601d implements AbstractC30081h {

    /* renamed from: a */
    public static boolean f129032a = false;

    static {
        Covode.recordClassIndex(66427);
    }

    @Override // com.p2082ss.android.p2160ml.AbstractC30081h
    /* renamed from: a */
    public final void mo53449a(Throwable th) {
        if (f129032a) {
            Log.getStackTraceString(th);
        }
    }
}
