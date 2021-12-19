package com.bytedance.android.livesdk.p437ag.p440c;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.ag.c.d */
public final class C6661d extends C6658a {
    static {
        Covode.recordClassIndex(7399);
    }

    @Override // com.bytedance.android.livesdk.p437ag.p440c.C6658a, com.bytedance.android.livesdk.p437ag.p440c.AbstractC6660c
    /* renamed from: a */
    public final boolean mo12806a() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.p437ag.p440c.C6658a, com.bytedance.android.livesdk.p437ag.p440c.AbstractC6660c
    /* renamed from: a */
    public final Intent mo12805a(Context context) {
        Intent intent = new Intent("com.meizu.safe.security.SHOW_APPSEC");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.putExtra("packageName", context.getPackageName());
        return intent;
    }
}
