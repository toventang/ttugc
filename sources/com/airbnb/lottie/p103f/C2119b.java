package com.airbnb.lottie.p103f;

import android.content.Context;
import androidx.core.p036g.C0692e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;

/* access modifiers changed from: package-private */
/* renamed from: com.airbnb.lottie.f.b */
public final class C2119b {

    /* renamed from: a */
    final Context f6381a;

    /* renamed from: b */
    final String f6382b;

    static {
        Covode.recordClassIndex(2314);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C0692e<EnumC2118a, InputStream> mo5999a() {
        EnumC2118a aVar;
        MethodCollector.m26663i(13245);
        try {
            String str = this.f6382b;
            File file = new File(m6604a(this.f6381a), m6605a(str, EnumC2118a.Json, false));
            if (!file.exists()) {
                file = new File(m6604a(this.f6381a), m6605a(str, EnumC2118a.Zip, false));
                if (!file.exists()) {
                    file = null;
                }
            }
            if (file == null) {
                MethodCollector.m26664o(13245);
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                if (file.getAbsolutePath().endsWith(".zip")) {
                    aVar = EnumC2118a.Zip;
                } else {
                    aVar = EnumC2118a.Json;
                }
                file.getAbsolutePath();
                C0692e<EnumC2118a, InputStream> eVar = new C0692e<>(aVar, fileInputStream);
                MethodCollector.m26664o(13245);
                return eVar;
            } catch (FileNotFoundException unused) {
                MethodCollector.m26664o(13245);
                return null;
            }
        } catch (FileNotFoundException unused2) {
            MethodCollector.m26664o(13245);
            return null;
        }
    }

    /* renamed from: a */
    public static File m6604a(Context context) {
        if (C58016d.f132221b != null && C58016d.f132224e) {
            return C58016d.f132221b;
        }
        File cacheDir = context.getCacheDir();
        C58016d.f132221b = cacheDir;
        return cacheDir;
    }

    C2119b(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f6381a = applicationContext;
        this.f6382b = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final File mo6000a(InputStream inputStream, EnumC2118a aVar) {
        MethodCollector.m26663i(13309);
        File file = new File(m6604a(this.f6381a), m6605a(this.f6382b, aVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file;
                    }
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                MethodCollector.m26664o(13309);
                throw th;
            }
        } finally {
            inputStream.close();
            MethodCollector.m26664o(13309);
        }
    }

    /* renamed from: a */
    static String m6605a(String str, EnumC2118a aVar, boolean z) {
        String str2;
        StringBuilder append = new StringBuilder("lottie_cache_").append(str.replaceAll("\\W+", ""));
        if (z) {
            str2 = aVar.tempExtension();
        } else {
            str2 = aVar.extension;
        }
        return append.append(str2).toString();
    }
}
