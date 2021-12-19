package com.bytedance.ies.powerpermissions.p1241d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerpermissions.d.a */
public interface AbstractC17752a {
    static {
        Covode.recordClassIndex(20316);
    }

    /* renamed from: a */
    Intent mo28233a(Context context);

    /* renamed from: a */
    String mo28234a();

    /* renamed from: a */
    boolean mo28235a(Activity activity);

    /* renamed from: b */
    boolean mo28236b(Activity activity);

    /* renamed from: com.bytedance.ies.powerpermissions.d.a$a */
    public static final class C17753a {
        static {
            Covode.recordClassIndex(20317);
        }

        /* renamed from: a */
        public static boolean m32903a(AbstractC17752a aVar, Activity activity) {
            C89219l.m154719c(activity, "");
            if (activity.checkSelfPermission(aVar.mo28234a()) != -1 || activity.shouldShowRequestPermissionRationale(aVar.mo28234a())) {
                return false;
            }
            return true;
        }
    }
}
