package com.bytedance.p1697t.p1698a.p1699a;

import android.os.Message;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.t.a.a.a */
public final class C22723a {

    /* renamed from: a */
    private static Map<Message, Object> f53680a = new ConcurrentHashMap();

    /* renamed from: b */
    private static ThreadLocal<StackTraceElement[]> f53681b = new ThreadLocal<>();

    /* access modifiers changed from: protected */
    public final void finalize() {
        super.finalize();
    }

    /* renamed from: a */
    public static StackTraceElement[] m42867a() {
        StackTraceElement[] stackTraceElementArr = f53681b.get();
        f53681b.set(null);
        return stackTraceElementArr;
    }

    static {
        Covode.recordClassIndex(26611);
    }
}
