package com.bytedance.android.ecommerce.p165k;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bytedance.android.ecommerce.k.a */
public final class C2825a {
    static {
        Covode.recordClassIndex(3251);
    }

    /* renamed from: a */
    public static String m8095a(Context context, String str) {
        MethodCollector.m26663i(3758);
        InputStream inputStream = null;
        try {
            InputStream open = context.getAssets().open(str);
            byte[] bArr = new byte[1024];
            StringBuilder sb = new StringBuilder("");
            while (true) {
                int read = open.read(bArr);
                if (read <= 0) {
                    break;
                }
                sb.append(new String(bArr, 0, read));
            }
            String sb2 = sb.toString();
            try {
                open.close();
            } catch (Throwable unused) {
            }
            MethodCollector.m26664o(3758);
            return sb2;
        } catch (IOException e) {
            e.printStackTrace();
            if (0 != 0) {
                inputStream.close();
            }
        } catch (Throwable unused2) {
        }
        MethodCollector.m26664o(3758);
        return "";
    }
}
