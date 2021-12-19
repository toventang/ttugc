package com.bytedance.geckox.p1021h;

import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.bytedance.geckox.h.b */
public final class C14954b {

    /* renamed from: a */
    private static final Map<String, Lock> f36534a = new HashMap();

    /* renamed from: b */
    private static ReentrantLock f36535b = new ReentrantLock();

    /* renamed from: c */
    private String f36536c;

    /* renamed from: d */
    private FileLock f36537d;

    static {
        Covode.recordClassIndex(17067);
    }

    /* renamed from: a */
    public final void mo24076a() {
        try {
            this.f36537d.mo24325a();
            this.f36537d.mo24326b();
            Lock lock = f36534a.get(this.f36536c);
            if (lock != null) {
                lock.unlock();
            }
        } finally {
            f36535b.unlock();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.geckox.p1021h.C14954b m27539a(java.lang.String r4) {
        /*
            java.util.concurrent.locks.ReentrantLock r0 = com.bytedance.geckox.p1021h.C14954b.f36535b
            r0.lock()
            r3 = 0
            com.bytedance.geckox.utils.FileLock r2 = com.bytedance.geckox.utils.FileLock.m27695a(r4)     // Catch:{ all -> 0x002b }
            java.util.Map<java.lang.String, java.util.concurrent.locks.Lock> r1 = com.bytedance.geckox.p1021h.C14954b.f36534a     // Catch:{ all -> 0x002e }
            java.lang.Object r0 = r1.get(r4)     // Catch:{ all -> 0x002e }
            java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x001d
            java.util.concurrent.locks.ReentrantLock r3 = new java.util.concurrent.locks.ReentrantLock     // Catch:{ all -> 0x001a }
            r3.<init>()     // Catch:{ all -> 0x001a }
            goto L_0x001f
        L_0x001a:
            r1 = move-exception
            r3 = r0
            goto L_0x002f
        L_0x001d:
            r3 = r0
            goto L_0x0022
        L_0x001f:
            r1.put(r4, r3)
        L_0x0022:
            r3.lock()
            com.bytedance.geckox.h.b r0 = new com.bytedance.geckox.h.b
            r0.<init>(r4, r2)
            return r0
        L_0x002b:
            r1 = move-exception
            r2 = r3
            goto L_0x002f
        L_0x002e:
            r1 = move-exception
        L_0x002f:
            java.util.concurrent.locks.ReentrantLock r0 = com.bytedance.geckox.p1021h.C14954b.f36535b
            r0.unlock()
            if (r3 == 0) goto L_0x0039
            r3.unlock()
        L_0x0039:
            if (r2 == 0) goto L_0x0041
            r2.mo24325a()
            r2.mo24326b()
        L_0x0041:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.geckox.p1021h.C14954b.m27539a(java.lang.String):com.bytedance.geckox.h.b");
    }

    private C14954b(String str, FileLock fileLock) {
        this.f36536c = str;
        this.f36537d = fileLock;
    }
}
