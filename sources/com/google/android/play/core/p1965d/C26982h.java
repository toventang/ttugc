package com.google.android.play.core.p1965d;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.play.core.p1963b.C26915bf;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Set;
import java.util.zip.ZipFile;

/* renamed from: com.google.android.play.core.d.h */
final class C26982h implements AbstractC26984j {

    /* renamed from: a */
    final /* synthetic */ Set f63876a;

    /* renamed from: b */
    final /* synthetic */ C26992r f63877b;

    /* renamed from: c */
    final /* synthetic */ ZipFile f63878c;

    static {
        Covode.recordClassIndex(32458);
    }

    C26982h(Set set, C26992r rVar, ZipFile zipFile) {
        this.f63876a = set;
        this.f63877b = rVar;
        this.f63878c = zipFile;
    }

    @Override // com.google.android.play.core.p1965d.AbstractC26984j
    /* renamed from: a */
    public final void mo44689a(C26985k kVar, File file, boolean z) {
        MethodCollector.m26663i(13434);
        this.f63876a.add(file);
        if (!z) {
            C1764a.m5928a("NativeLibraryExtractor: split '%s' has native library '%s' that does not exist; extracting from '%s!%s' to '%s'", new Object[]{this.f63877b.f63890b, kVar.f63879a, this.f63877b.f63889a.getAbsolutePath(), kVar.f63880b.getName(), file.getAbsolutePath()});
            byte[] bArr = new byte[4096];
            InputStream inputStream = this.f63878c.getInputStream(kVar.f63880b);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read > 0) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            fileOutputStream.close();
                            inputStream.close();
                            MethodCollector.m26664o(13434);
                            return;
                        }
                    } catch (Throwable th) {
                        C26915bf.m53466a(th, th);
                    }
                }
            } catch (Throwable th2) {
                C26915bf.m53466a(th, th2);
            }
        } else {
            MethodCollector.m26664o(13434);
            return;
        }
        MethodCollector.m26664o(13434);
        throw th;
        MethodCollector.m26664o(13434);
        throw th;
    }
}
