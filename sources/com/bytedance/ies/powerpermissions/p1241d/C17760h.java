package com.bytedance.ies.powerpermissions.p1241d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpermissions.C17770j;
import com.bytedance.ies.powerpermissions.p1241d.AbstractC17752a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerpermissions.d.h */
public final class C17760h implements AbstractC17752a {
    static {
        Covode.recordClassIndex(20324);
    }

    @Override // com.bytedance.ies.powerpermissions.p1241d.AbstractC17752a
    /* renamed from: a */
    public final String mo28234a() {
        return "android.permission.READ_PHONE_NUMBERS";
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
        if (!C17770j.m32964d()) {
            if (activity.checkSelfPermission("android.permission.READ_PHONE_STATE") != -1 || activity.shouldShowRequestPermissionRationale("android.permission.READ_PHONE_NUMBERS")) {
                return false;
            }
            return true;
        } else if (C0643b.m2367a(activity, "android.permission.READ_PHONE_NUMBERS") == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override // com.bytedance.ies.powerpermissions.p1241d.AbstractC17752a
    /* renamed from: b */
    public final boolean mo28236b(Activity activity) {
        C89219l.m154719c(activity, "");
        if (C17770j.m32964d()) {
            return AbstractC17752a.C17753a.m32903a(this, activity);
        }
        if (activity.checkSelfPermission("android.permission.READ_PHONE_STATE") != -1 || activity.shouldShowRequestPermissionRationale("android.permission.READ_PHONE_NUMBERS")) {
            return false;
        }
        return true;
    }
}
