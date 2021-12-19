package com.squareup.p2075a.p2076a;

import com.C1764a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.squareup.a.a.f */
public abstract class AbstractRunnableC29198f implements Runnable {

    /* renamed from: a */
    protected final String f69154a;

    static {
        Covode.recordClassIndex(35547);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo50790a();

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f69154a);
        try {
            mo50790a();
        } finally {
            Thread.currentThread().setName(name);
        }
    }

    public AbstractRunnableC29198f(String str, Object... objArr) {
        this.f69154a = C1764a.m5928a(str, objArr);
    }
}
