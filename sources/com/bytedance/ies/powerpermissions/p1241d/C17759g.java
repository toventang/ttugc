package com.bytedance.ies.powerpermissions.p1241d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpermissions.C17770j;
import com.bytedance.ies.powerpermissions.p1241d.AbstractC17752a;
import java.util.List;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerpermissions.d.g */
public final class C17759g implements AbstractC17752a {
    static {
        Covode.recordClassIndex(20323);
    }

    @Override // com.bytedance.ies.powerpermissions.p1241d.AbstractC17752a
    /* renamed from: a */
    public final String mo28234a() {
        return "android.permission.MANAGE_EXTERNAL_STORAGE";
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
        if (C17770j.m32953a()) {
            C89219l.m154719c(context, "");
            if (C17770j.m32953a()) {
                Intent intent = new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION");
                intent.setData(Uri.parse("package:" + context.getPackageName()));
                if (C17770j.m32956a(context, intent)) {
                    return intent;
                }
            }
            return C17770j.m32958b(context);
        }
        C89219l.m154719c(context, "");
        return null;
    }

    @Override // com.bytedance.ies.powerpermissions.p1241d.AbstractC17752a
    /* renamed from: a */
    public final boolean mo28235a(Activity activity) {
        C89219l.m154719c(activity, "");
        C89219l.m154719c(activity, "");
        if (C17770j.m32953a()) {
            return Environment.isExternalStorageManager();
        }
        List<String> i = C89064i.m154508i(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"});
        if (!C17770j.m32965e()) {
            return true;
        }
        for (String str : i) {
            if (!(str == null || C17770j.m32957a((Context) activity, str))) {
                return false;
            }
        }
        return true;
    }
}
