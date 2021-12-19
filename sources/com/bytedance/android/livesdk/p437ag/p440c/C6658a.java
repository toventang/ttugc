package com.bytedance.android.livesdk.p437ag.p440c;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.ag.c.a */
public class C6658a implements AbstractC6660c {
    static {
        Covode.recordClassIndex(7396);
    }

    @Override // com.bytedance.android.livesdk.p437ag.p440c.AbstractC6660c
    /* renamed from: a */
    public boolean mo12806a() {
        return false;
    }

    @Override // com.bytedance.android.livesdk.p437ag.p440c.AbstractC6660c
    /* renamed from: b */
    public boolean mo12807b() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.p437ag.p440c.AbstractC6660c
    /* renamed from: a */
    public Intent mo12805a(Context context) {
        return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + context.getPackageName()));
    }
}
