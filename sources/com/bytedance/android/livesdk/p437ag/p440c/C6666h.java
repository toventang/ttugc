package com.bytedance.android.livesdk.p437ag.p440c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.ag.c.h */
public final class C6666h extends C6658a {
    static {
        Covode.recordClassIndex(7404);
    }

    @Override // com.bytedance.android.livesdk.p437ag.p440c.C6658a, com.bytedance.android.livesdk.p437ag.p440c.AbstractC6660c
    /* renamed from: a */
    public final boolean mo12806a() {
        return super.mo12806a();
    }

    @Override // com.bytedance.android.livesdk.p437ag.p440c.C6658a, com.bytedance.android.livesdk.p437ag.p440c.AbstractC6660c
    /* renamed from: a */
    public final Intent mo12805a(Context context) {
        Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
        intent.setComponent(new ComponentName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity"));
        intent.putExtra("extra_pkgname", context.getPackageName());
        return intent;
    }
}
