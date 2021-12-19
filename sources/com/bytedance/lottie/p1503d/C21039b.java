package com.bytedance.lottie.p1503d;

import android.content.Context;
import androidx.core.p036g.C0692e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.lottie.d.b */
public final class C21039b {

    /* renamed from: a */
    final Context f49921a;

    /* renamed from: b */
    final String f49922b;

    static {
        Covode.recordClassIndex(24655);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C0692e<EnumC21038a, InputStream> mo34517a() {
        EnumC21038a aVar;
        MethodCollector.m26663i(10382);
        try {
            String str = this.f49922b;
            File file = new File(m39614a(this.f49921a), m39615a(str, EnumC21038a.Json, false));
            if (!file.exists()) {
                file = new File(m39614a(this.f49921a), m39615a(str, EnumC21038a.Zip, false));
                if (!file.exists()) {
                    file = null;
                }
            }
            if (file == null) {
                MethodCollector.m26664o(10382);
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                if (file.getAbsolutePath().endsWith(".zip")) {
                    aVar = EnumC21038a.Zip;
                } else {
                    aVar = EnumC21038a.Json;
                }
                file.getAbsolutePath();
                C0692e<EnumC21038a, InputStream> eVar = new C0692e<>(aVar, fileInputStream);
                MethodCollector.m26664o(10382);
                return eVar;
            } catch (FileNotFoundException unused) {
                MethodCollector.m26664o(10382);
                return null;
            }
        } catch (FileNotFoundException unused2) {
            MethodCollector.m26664o(10382);
            return null;
        }
    }

    /* renamed from: a */
    public static File m39614a(Context context) {
        if (C58016d.f132221b != null && C58016d.f132224e) {
            return C58016d.f132221b;
        }
        File cacheDir = context.getCacheDir();
        C58016d.f132221b = cacheDir;
        return cacheDir;
    }

    C21039b(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f49921a = applicationContext;
        this.f49922b = str;
    }

    /* renamed from: a */
    public static String m39615a(String str, EnumC21038a aVar, boolean z) {
        String tempExtension;
        StringBuilder append = new StringBuilder("lottie_cache_").append(str.replaceAll("\\W+", ""));
        if (z) {
            tempExtension = aVar.extension;
        } else {
            tempExtension = aVar.tempExtension();
        }
        return append.append(tempExtension).toString();
    }
}
