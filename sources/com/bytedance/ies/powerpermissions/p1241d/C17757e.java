package com.bytedance.ies.powerpermissions.p1241d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpermissions.C17770j;
import com.bytedance.ies.powerpermissions.p1241d.AbstractC17752a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerpermissions.d.e */
public final class C17757e implements AbstractC17752a {
    static {
        Covode.recordClassIndex(20321);
    }

    @Override // com.bytedance.ies.powerpermissions.p1241d.AbstractC17752a
    /* renamed from: a */
    public final String mo28234a() {
        return "android.permission.ACTIVITY_RECOGNITION";
    }

    @Override // com.bytedance.ies.powerpermissions.p1241d.AbstractC17752a
    /* renamed from: a */
    public final Intent mo28233a(Context context) {
        C89219l.m154719c(context, "");
        C89219l.m154719c(context, "");
        return null;
    }

    @Override // com.bytedance.ies.powerpermissions.p1241d.AbstractC17752a
    /* renamed from: a */
    public final boolean mo28235a(Activity activity) {
        C89219l.m154719c(activity, "");
        if (!C17770j.m32961b()) {
            if (activity.checkSelfPermission("android.permission.BODY_SENSORS") == 0) {
                return true;
            }
            return false;
        } else if (C0643b.m2367a(activity, "android.permission.ACTIVITY_RECOGNITION") == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override // com.bytedance.ies.powerpermissions.p1241d.AbstractC17752a
    /* renamed from: b */
    public final boolean mo28236b(Activity activity) {
        C89219l.m154719c(activity, "");
        if (C17770j.m32961b()) {
            return AbstractC17752a.C17753a.m32903a(this, activity);
        }
        if (activity.checkSelfPermission("android.permission.BODY_SENSORS") != -1 || activity.shouldShowRequestPermissionRationale("android.permission.ACTIVITY_RECOGNITION")) {
            return false;
        }
        return true;
    }
}
