package com.bytedance.ies.powerpermissions.p1241d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpermissions.C17770j;
import com.bytedance.ies.powerpermissions.p1241d.AbstractC17752a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerpermissions.d.c */
public final class C17755c implements AbstractC17752a {

    /* renamed from: a */
    private final String f42428a;

    static {
        Covode.recordClassIndex(20319);
    }

    @Override // com.bytedance.ies.powerpermissions.p1241d.AbstractC17752a
    /* renamed from: a */
    public final String mo28234a() {
        return this.f42428a;
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
        if (!C17770j.m32961b() || C0643b.m2367a(activity, this.f42428a) != 0) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.powerpermissions.p1241d.AbstractC17752a
    /* renamed from: b */
    public final boolean mo28236b(Activity activity) {
        C89219l.m154719c(activity, "");
        if (!C17770j.m32961b()) {
            return false;
        }
        return AbstractC17752a.C17753a.m32903a(this, activity);
    }

    public C17755c(String str) {
        C89219l.m154719c(str, "");
        this.f42428a = str;
        if ((!C89219l.m154714a((Object) str, (Object) "android.permission.ACCESS_MEDIA_LOCATION")) && (!C89219l.m154714a((Object) str, (Object) "android.permission.ACCESS_BACKGROUND_LOCATION"))) {
            throw new RuntimeException("PermissionAccessLocation only accept android.permission.ACCESS_MEDIA_LOCATION or android.permission.ACCESS_BACKGROUND_LOCATION");
        }
    }
}
