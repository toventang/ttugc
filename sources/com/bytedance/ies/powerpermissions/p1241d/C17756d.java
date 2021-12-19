package com.bytedance.ies.powerpermissions.p1241d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpermissions.C17770j;
import com.bytedance.ies.powerpermissions.p1241d.AbstractC17752a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerpermissions.d.d */
public final class C17756d implements AbstractC17752a {
    static {
        Covode.recordClassIndex(20320);
    }

    @Override // com.bytedance.ies.powerpermissions.p1241d.AbstractC17752a
    /* renamed from: a */
    public final String mo28234a() {
        return "android.permission.ACCESS_NOTIFICATION_POLICY";
    }

    @Override // com.bytedance.ies.powerpermissions.p1241d.AbstractC17752a
    /* renamed from: a */
    public final boolean mo28235a(Activity activity) {
        C89219l.m154719c(activity, "");
        return C17770j.m32955a(activity);
    }

    @Override // com.bytedance.ies.powerpermissions.p1241d.AbstractC17752a
    /* renamed from: b */
    public final boolean mo28236b(Activity activity) {
        C89219l.m154719c(activity, "");
        return AbstractC17752a.C17753a.m32903a(this, activity);
    }

    @Override // com.bytedance.ies.powerpermissions.p1241d.AbstractC17752a
    /* renamed from: a */
    public final Intent mo28233a(Context context) {
        C89219l.m154719c(context, "");
        C89219l.m154719c(context, "");
        if (C17770j.m32964d()) {
            Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
            if (C17770j.m32956a(context, intent)) {
                return intent;
            }
        }
        return C17770j.m32958b(context);
    }
}
