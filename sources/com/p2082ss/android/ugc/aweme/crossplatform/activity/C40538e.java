package com.p2082ss.android.ugc.aweme.crossplatform.activity;

import com.bytedance.covode.number.Covode;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.e */
public final class C40538e {

    /* renamed from: a */
    static final LinkedList<C40545l> f94857a = new LinkedList<>();

    /* renamed from: b */
    public static final C40538e f94858b = new C40538e();

    /* renamed from: c */
    private static final ReentrantReadWriteLock f94859c = new ReentrantReadWriteLock();

    private C40538e() {
    }

    static {
        Covode.recordClassIndex(48359);
    }

    /*  JADX ERROR: StackOverflowError in pass: MarkFinallyVisitor
        java.lang.StackOverflowError
        	at jadx.core.dex.visitors.MarkFinallyVisitor.sameInsns(MarkFinallyVisitor.java:451)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.compareBlocks(MarkFinallyVisitor.java:436)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:408)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:411)
        */
    /* renamed from: a */
    public static final void m81839a() {
        /*
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = com.p2082ss.android.ugc.aweme.crossplatform.activity.C40538e.f94859c
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001a
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0012:
            if (r0 >= r2) goto L_0x001b
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0012
        L_0x001a:
            r2 = 0
        L_0x001b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r1.writeLock()
            r1.lock()
            java.util.LinkedList<com.ss.android.ugc.aweme.crossplatform.activity.l> r0 = com.p2082ss.android.ugc.aweme.crossplatform.activity.C40538e.f94857a     // Catch:{ all -> 0x0033 }
            r0.clear()     // Catch:{ all -> 0x0033 }
        L_0x0027:
            if (r3 >= r2) goto L_0x002f
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0027
        L_0x002f:
            r1.unlock()
            return
        L_0x0033:
            r0 = move-exception
        L_0x0034:
            if (r3 >= r2) goto L_0x003c
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0034
        L_0x003c:
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.crossplatform.activity.C40538e.m81839a():void");
    }

    /*  JADX ERROR: StackOverflowError in pass: MarkFinallyVisitor
        java.lang.StackOverflowError
        	at jadx.core.dex.visitors.MarkFinallyVisitor.sameInsns(MarkFinallyVisitor.java:451)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.compareBlocks(MarkFinallyVisitor.java:436)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:408)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:411)
        */
    /* renamed from: a */
    public static final void m81840a(com.p2082ss.android.ugc.aweme.crossplatform.activity.C40545l r7) {
        /*
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = com.p2082ss.android.ugc.aweme.crossplatform.activity.C40538e.f94859c
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r6 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r5 = 0
            if (r0 != 0) goto L_0x001a
            int r4 = r1.getReadHoldCount()
            r0 = 0
        L_0x0012:
            if (r0 >= r4) goto L_0x001b
            r6.unlock()
            int r0 = r0 + 1
            goto L_0x0012
        L_0x001a:
            r4 = 0
        L_0x001b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r3 = r1.writeLock()
            r3.lock()
            java.util.LinkedList<com.ss.android.ugc.aweme.crossplatform.activity.l> r0 = com.p2082ss.android.ugc.aweme.crossplatform.activity.C40538e.f94857a     // Catch:{ all -> 0x0041 }
            r0.add(r7)     // Catch:{ all -> 0x0041 }
        L_0x0027:
            java.util.LinkedList<com.ss.android.ugc.aweme.crossplatform.activity.l> r2 = com.p2082ss.android.ugc.aweme.crossplatform.activity.C40538e.f94857a     // Catch:{ all -> 0x0041 }
            int r1 = r2.size()     // Catch:{ all -> 0x0041 }
            r0 = 10
            if (r1 <= r0) goto L_0x0035
            r2.removeFirst()     // Catch:{ all -> 0x0041 }
            goto L_0x0027
        L_0x0035:
            if (r5 >= r4) goto L_0x003d
            r6.lock()
            int r5 = r5 + 1
            goto L_0x0035
        L_0x003d:
            r3.unlock()
            return
        L_0x0041:
            r0 = move-exception
        L_0x0042:
            if (r5 >= r4) goto L_0x004a
            r6.lock()
            int r5 = r5 + 1
            goto L_0x0042
        L_0x004a:
            r3.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.crossplatform.activity.C40538e.m81840a(com.ss.android.ugc.aweme.crossplatform.activity.l):void");
    }
}
