package com.bytedance.android.livesdk.utils;

import android.os.Build;
import android.util.Base64;
import com.C1764a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.livesetting.other.EnableParsePushSlimroomSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Locale;
import java.util.zip.GZIPInputStream;

/* renamed from: com.bytedance.android.livesdk.utils.h */
public final class C11266h {
    static {
        Covode.recordClassIndex(12898);
    }

    /* renamed from: b */
    private static String m19969b(String str) {
        if (C3966y.m9672g()) {
            return "‏" + str + "‏";
        }
        return str;
    }

    /* renamed from: a */
    public static String m19967a(String str) {
        MethodCollector.m26663i(12178);
        if (!EnableParsePushSlimroomSetting.INSTANCE.getValue()) {
            MethodCollector.m26664o(12178);
            return "";
        }
        try {
            byte[] bArr = new byte[0];
            int i = Build.VERSION.SDK_INT;
            GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(Base64.decode(str, 0)), 32);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[32];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    String byteArrayOutputStream2 = byteArrayOutputStream.toString("UTF-8");
                    MethodCollector.m26664o(12178);
                    return byteArrayOutputStream2;
                }
            }
        } catch (Exception unused) {
            HashMap hashMap = new HashMap();
            hashMap.put("slim_room", str);
            C3868c.m9491a("ttlive_parse_slimroom_error", 1, hashMap);
            MethodCollector.m26664o(12178);
            return "";
        }
    }

    /* renamed from: a */
    public static String m19966a(int i) {
        if (i < 0) {
            return "";
        }
        if (i <= 999) {
            return String.valueOf(i);
        }
        if (i <= 999999) {
            if (i % 1000 < 100) {
                return m19969b(String.valueOf(i / 1000) + 'K');
            }
            return m19969b(m19968a("%.1f", Float.valueOf(((float) ((i / 100) * 100)) / 1000.0f)) + 'K');
        } else if (i % 1000000 < 100000) {
            return m19969b(String.valueOf(i / 1000000) + 'M');
        } else {
            return m19969b(m19968a("%.1f", Float.valueOf(((float) ((i / 100000) * 100000)) / 1000000.0f)) + 'M');
        }
    }

    /* renamed from: a */
    public static String m19968a(String str, Object... objArr) {
        return C1764a.m5929a(Locale.US, str, objArr);
    }
}
