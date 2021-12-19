package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.internal.C25571t;

/* renamed from: com.google.android.gms.measurement.internal.ho */
public final class C26444ho {
    static {
        Covode.recordClassIndex(31866);
    }

    /* renamed from: a */
    public static String m52081a(Context context, String str) {
        try {
            return new C25571t(context).mo41831a(str);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m52082a(String str, String[] strArr, String[] strArr2) {
        C25565r.m49314a(strArr);
        C25565r.m49314a(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < min; i++) {
            String str2 = strArr[i];
            if (str == null) {
                if (str2 != null) {
                }
            } else if (!str.equals(str2)) {
            }
            return strArr2[i];
        }
        return null;
    }
}
