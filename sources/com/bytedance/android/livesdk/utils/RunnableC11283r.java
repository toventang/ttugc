package com.bytedance.android.livesdk.utils;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1606r.p1607a.p1608a.AbstractC21959b;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.utils.r */
public final /* synthetic */ class RunnableC11283r implements Runnable {

    /* renamed from: a */
    private final EnumC11229b f26987a;

    /* renamed from: b */
    private final boolean f26988b;

    /* renamed from: c */
    private final Context f26989c;

    /* renamed from: d */
    private final AbstractC21959b f26990d;

    static {
        Covode.recordClassIndex(12915);
    }

    RunnableC11283r(EnumC11229b bVar, boolean z, Context context, AbstractC21959b bVar2) {
        this.f26987a = bVar;
        this.f26988b = z;
        this.f26989c = context;
        this.f26990d = bVar2;
    }

    public final void run() {
        LiveAppBundleUtils.lambda$tryLoadAppBundlePlugin$7$LiveAppBundleUtils(this.f26987a, this.f26988b, this.f26989c, this.f26990d);
    }
}
