package com.p4501vk.api.sdk.p4507f;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.vk.api.sdk.f.h */
public final class C87894h {

    /* renamed from: a */
    public static final C87894h f199629a = new C87894h();

    /* renamed from: b */
    private static final ReentrantLock f199630b;

    /* renamed from: c */
    private static final Condition f199631c;

    private C87894h() {
    }

    static {
        Covode.recordClassIndex(103904);
        ReentrantLock reentrantLock = new ReentrantLock();
        f199630b = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        C89219l.m154709a((Object) newCondition, "");
        f199631c = newCondition;
    }

    /* renamed from: a */
    public static void m152899a() {
        try {
            ReentrantLock reentrantLock = f199630b;
            reentrantLock.lock();
            try {
                f199631c.await();
            } finally {
                reentrantLock.unlock();
            }
        } catch (InterruptedException unused) {
        }
    }

    /* renamed from: b */
    public static void m152900b() {
        ReentrantLock reentrantLock = f199630b;
        reentrantLock.lock();
        try {
            f199631c.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }
}
