package com.kakao.util.helper;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public final class ConstantFuture<T> implements Future<T> {

    /* renamed from: v */
    private final T f65827v;

    static {
        Covode.recordClassIndex(34056);
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }

    @Override // java.util.concurrent.Future
    public final T get() {
        return this.f65827v;
    }

    public ConstantFuture(T t) {
        this.f65827v = t;
    }

    @Override // java.util.concurrent.Future
    public final T get(long j, TimeUnit timeUnit) {
        return this.f65827v;
    }
}
