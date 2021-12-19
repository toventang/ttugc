package com.bytedance.lobby.p1493b;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.lobby.b.a */
public final class C20890a {

    /* renamed from: a */
    private Bundle f49394a;

    static {
        Covode.recordClassIndex(24478);
    }

    /* renamed from: b */
    public final Bundle mo34331b() {
        return mo34329a();
    }

    /* renamed from: a */
    public final synchronized Bundle mo34329a() {
        Bundle bundle;
        MethodCollector.m26663i(6503);
        if (this.f49394a == null) {
            this.f49394a = new Bundle();
        }
        bundle = this.f49394a;
        MethodCollector.m26664o(6503);
        return bundle;
    }

    /* renamed from: a */
    public final C20890a mo34330a(String str, String str2) {
        mo34329a().putString(str, str2);
        return this;
    }
}
