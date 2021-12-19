package com.facebook.p1814a;

import android.preference.PreferenceManager;
import com.bytedance.covode.number.Covode;
import com.facebook.C24872m;
import com.facebook.internal.C24699ae;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.facebook.a.b */
public class C23874b {

    /* renamed from: a */
    public static ReentrantReadWriteLock f56509a = new ReentrantReadWriteLock();

    /* renamed from: b */
    public static String f56510b;

    /* renamed from: c */
    public static volatile boolean f56511c = false;

    /* renamed from: d */
    private static final String f56512d = C23874b.class.getSimpleName();

    C23874b() {
    }

    static {
        Covode.recordClassIndex(27995);
    }

    /* renamed from: a */
    public static String m45140a() {
        if (!f56511c) {
            m45141b();
        }
        f56509a.readLock().lock();
        try {
            return f56510b;
        } finally {
            f56509a.readLock().unlock();
        }
    }

    /* renamed from: b */
    public static void m45141b() {
        if (!f56511c) {
            f56509a.writeLock().lock();
            try {
                if (!f56511c) {
                    C24699ae.m47299a();
                    f56510b = PreferenceManager.getDefaultSharedPreferences(C24872m.f59047g).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
                    f56511c = true;
                }
            } finally {
                f56509a.writeLock().unlock();
            }
        }
    }
}
