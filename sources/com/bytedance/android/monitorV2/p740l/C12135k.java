package com.bytedance.android.monitorV2.p740l;

import android.net.Uri;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.monitorV2.l.k */
public final class C12135k {
    static {
        Covode.recordClassIndex(13864);
    }

    /* renamed from: a */
    public static String m21667a(String str) {
        try {
            return Uri.parse(str).getPath();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: b */
    public static String m21668b(String str) {
        try {
            return Uri.parse(str).getHost();
        } catch (Exception unused) {
            return "";
        }
    }
}
