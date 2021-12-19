package com.bytedance.android.livesdk.p437ag.p440c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.ag.c.b */
public final class C6659b extends C6658a {
    static {
        Covode.recordClassIndex(7397);
    }

    @Override // com.bytedance.android.livesdk.p437ag.p440c.C6658a, com.bytedance.android.livesdk.p437ag.p440c.AbstractC6660c
    /* renamed from: a */
    public final boolean mo12806a() {
        return super.mo12806a();
    }

    @Override // com.bytedance.android.livesdk.p437ag.p440c.C6658a, com.bytedance.android.livesdk.p437ag.p440c.AbstractC6660c
    /* renamed from: a */
    public final Intent mo12805a(Context context) {
        Intent intent = new Intent();
        intent.putExtra("packageName", context.getPackageName());
        intent.setComponent(new ComponentName("com.android.packageinstaller", "com.android.packageinstaller.permission.ui.ManagePermissionsActivity"));
        return intent;
    }
}
