package com.bytedance.android.livesdk.p437ag.p440c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.ag.c.f */
public class C6664f extends C6658a {
    static {
        Covode.recordClassIndex(7402);
    }

    @Override // com.bytedance.android.livesdk.p437ag.p440c.C6658a, com.bytedance.android.livesdk.p437ag.p440c.AbstractC6660c
    /* renamed from: a */
    public final boolean mo12806a() {
        if (Build.VERSION.SDK_INT == 23) {
            return true;
        }
        return super.mo12806a();
    }

    @Override // com.bytedance.android.livesdk.p437ag.p440c.C6658a, com.bytedance.android.livesdk.p437ag.p440c.AbstractC6660c
    /* renamed from: a */
    public final Intent mo12805a(Context context) {
        String string;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.coloros.safecenter", "com.coloros.safecenter.permission.PermissionManagerActivity"));
        intent.putExtra("pkg_name", context.getPackageName());
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i = applicationInfo.labelRes;
        if (i == 0) {
            string = applicationInfo.nonLocalizedLabel.toString();
        } else {
            string = context.getString(i);
        }
        intent.putExtra("app_name", string);
        intent.putExtra("class_name", C6664f.class.getSimpleName());
        return intent;
    }
}
