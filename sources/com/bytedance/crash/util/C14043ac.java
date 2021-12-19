package com.bytedance.crash.util;

import android.content.Context;
import android.os.Build;
import android.os.StatFs;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13933m;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import java.io.File;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.util.ac */
public final class C14043ac {
    static {
        Covode.recordClassIndex(16110);
    }

    /* renamed from: a */
    public static JSONObject m25507a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("inner_free_real", m25508b(m25506a(C13933m.f33936a)));
            jSONObject.put("inner_total_real", m25505a(m25506a(C13933m.f33936a)));
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static long m25505a(File file) {
        try {
            StatFs statFs = new StatFs(file.getPath());
            int i = Build.VERSION.SDK_INT;
            return statFs.getTotalBytes();
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: b */
    private static long m25508b(File file) {
        try {
            StatFs statFs = new StatFs(file.getPath());
            int i = Build.VERSION.SDK_INT;
            return statFs.getFreeBytes();
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: a */
    private static File m25506a(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }
}
