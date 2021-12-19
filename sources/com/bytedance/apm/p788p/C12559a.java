package com.bytedance.apm.p788p;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;

/* renamed from: com.bytedance.apm.p.a */
public final class C12559a {

    /* renamed from: a */
    public static volatile Handler f30553a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private static HashSet<HandlerThread> f30554b = new HashSet<>();

    static {
        Covode.recordClassIndex(14376);
    }
}
