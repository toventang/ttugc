package com.bytedance.p967e.p968a;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.bytedance.e.a.a */
public final class C14485a {

    /* renamed from: a */
    private static volatile boolean f35027a;

    /* renamed from: b */
    private static volatile boolean f35028b;

    /* renamed from: c */
    private static volatile AbstractC14486b f35029c;

    /* renamed from: d */
    private static volatile String f35030d = "ttboringssl";

    /* renamed from: e */
    private static volatile String f35031e = "ttcrypto";

    /* renamed from: f */
    private static Lock f35032f = new ReentrantLock();

    static {
        Covode.recordClassIndex(16567);
    }

    /* renamed from: a */
    public static boolean m26491a() {
        try {
            f35032f.lock();
            if (f35029c != null) {
                boolean a = f35029c.mo23329a();
                f35032f.unlock();
                return a;
            }
            if (!f35028b) {
                m26490a(f35031e);
                f35028b = true;
            }
            if (!f35027a) {
                m26490a(f35030d);
                f35027a = true;
            }
            f35032f.unlock();
            if (!f35027a || !f35028b) {
                return false;
            }
            return true;
        } catch (Error unused) {
        } catch (Throwable th) {
            f35032f.unlock();
            throw th;
        }
    }

    /* renamed from: a */
    private static void m26490a(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38964a(str, false, (Context) null);
        C58032m.m104852a(uptimeMillis, str);
    }
}
