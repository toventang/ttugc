package com.android.billingclient.api;

import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.android.billingclient.api.x */
public final class CallableC2261x implements Callable<Void> {

    /* renamed from: a */
    final /* synthetic */ AbstractC2250m f6787a;

    /* renamed from: b */
    private final /* synthetic */ String f6788b;

    /* renamed from: c */
    private final /* synthetic */ List f6789c;

    /* renamed from: d */
    private final /* synthetic */ String f6790d;

    /* renamed from: e */
    private final /* synthetic */ C2237e f6791e;

    static {
        Covode.recordClassIndex(2466);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Void call() {
        this.f6791e.mo6200a(new RunnableC2263z(this, this.f6791e.mo6198a(this.f6788b, this.f6789c, this.f6790d)));
        return null;
    }

    CallableC2261x(C2237e eVar, String str, List list, String str2, AbstractC2250m mVar) {
        this.f6791e = eVar;
        this.f6788b = str;
        this.f6789c = list;
        this.f6790d = str2;
        this.f6787a = mVar;
    }
}
