package com.bytedance.geckox.p1021h;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.utils.C15051d;
import com.bytedance.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.bytedance.geckox.h.a */
public final class C14953a {

    /* renamed from: a */
    private static final Map<String, Lock> f36531a = new HashMap();

    /* renamed from: b */
    private FileLock f36532b;

    /* renamed from: c */
    private String f36533c;

    static {
        Covode.recordClassIndex(17066);
    }

    /* renamed from: a */
    public final void mo24075a() {
        MethodCollector.m26663i(4716);
        Map<String, Lock> map = f36531a;
        synchronized (map) {
            try {
                this.f36532b.mo24325a();
                this.f36532b.mo24326b();
                try {
                    map.get(this.f36533c).unlock();
                } finally {
                    MethodCollector.m26664o(4716);
                }
            } catch (Throwable th) {
                f36531a.get(this.f36533c).unlock();
                MethodCollector.m26664o(4716);
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static C14953a m27537a(String str) {
        MethodCollector.m26663i(4711);
        Map<String, Lock> map = f36531a;
        synchronized (map) {
            try {
                Lock lock = map.get(str);
                if (lock == null) {
                    lock = new ReentrantLock();
                    map.put(str, lock);
                }
                if (!lock.tryLock()) {
                    return null;
                }
                try {
                    FileLock c = FileLock.m27698c(str);
                    if (c == null) {
                        lock.unlock();
                        MethodCollector.m26664o(4711);
                        return null;
                    }
                    C14953a aVar = new C14953a(str, c);
                    MethodCollector.m26664o(4711);
                    return aVar;
                } catch (Exception e) {
                    lock.unlock();
                    C15051d.m27710a(new RuntimeException(e));
                    MethodCollector.m26664o(4711);
                    return null;
                }
            } finally {
                MethodCollector.m26664o(4711);
            }
        }
    }

    private C14953a(String str, FileLock fileLock) {
        this.f36533c = str;
        this.f36532b = fileLock;
    }
}
