package com.bytedance.android.monitor.p714l;

import android.net.Uri;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.monitor.l.j */
public final class C11956j {
    static {
        Covode.recordClassIndex(13682);
    }

    /* renamed from: a */
    public static String m21115a(String str) {
        try {
            return Uri.parse(str).getPath();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: b */
    public static String m21116b(String str) {
        try {
            return Uri.parse(str).getHost();
        } catch (Exception unused) {
            return "";
        }
    }
}
