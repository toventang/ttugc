package com.p2082ss.android.ugc.aweme.favorites.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.favorites.api.UserFavoritesApi;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.favorites.model.h */
final /* synthetic */ class CallableC47479h implements Callable {

    /* renamed from: a */
    private final int f110297a;

    /* renamed from: b */
    private final int f110298b;

    static {
        Covode.recordClassIndex(56093);
    }

    CallableC47479h(int i, int i2) {
        this.f110297a = i;
        this.f110298b = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return UserFavoritesApi.m90369d(this.f110297a, this.f110298b);
    }
}
