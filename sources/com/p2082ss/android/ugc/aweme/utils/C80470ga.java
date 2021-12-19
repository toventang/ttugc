package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.utils.ga */
public final /* synthetic */ class C80470ga implements InvocationHandler {

    /* renamed from: a */
    private final Object f180046a;

    static {
        Covode.recordClassIndex(93738);
    }

    C80470ga(Object obj) {
        this.f180046a = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        return PreventServerSideCrashes.m138963a(this.f180046a, method, objArr);
    }
}
