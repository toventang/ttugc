package com.bytedance.android.livesdk.chatroom.p492g;

import android.os.SystemClock;
import android.util.LruCache;
import com.bytedance.android.livesdk.livesetting.comment.LiveCommentSubOnlyAnimationInterval;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.chatroom.g.p */
public final class C7598p {

    /* renamed from: a */
    public static final C7598p f18838a = new C7598p();

    /* renamed from: b */
    private static final LruCache<Long, Long> f18839b = new LruCache<>(100);

    /* renamed from: c */
    private static final long f18840c = (((long) LiveCommentSubOnlyAnimationInterval.INSTANCE.getValue()) * 1000);

    private C7598p() {
    }

    static {
        Covode.recordClassIndex(8371);
    }

    /* renamed from: b */
    public static void m15614b(long j) {
        f18839b.put(Long.valueOf(j), Long.valueOf(SystemClock.uptimeMillis()));
    }

    /* renamed from: a */
    public static boolean m15613a(long j) {
        Long l = f18839b.get(Long.valueOf(j));
        if (l == null) {
            return true;
        }
        long longValue = l.longValue();
        if (longValue == 0 || SystemClock.uptimeMillis() - longValue > f18840c) {
            return true;
        }
        return false;
    }
}
