package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.StrictMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.bn */
public final class C25844bn {
    static {
        Covode.recordClassIndex(31259);
    }

    /* renamed from: a */
    static AbstractC25867cj<File> m50039a(Context context) {
        AbstractC25867cj<File> cjVar;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            try {
                File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                if (file.exists()) {
                    cjVar = AbstractC25867cj.zza(file);
                } else {
                    cjVar = AbstractC25867cj.zzc();
                }
                return cjVar;
            } catch (RuntimeException unused) {
                AbstractC25867cj<File> zzc = AbstractC25867cj.zzc();
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return zzc;
            }
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* renamed from: a */
    static C25841bk m50038a(File file) {
        MethodCollector.m26663i(7355);
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                HashMap hashMap = new HashMap();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        String[] split = readLine.split(" ", 3);
                        if (split.length != 3) {
                            String valueOf = String.valueOf(readLine);
                            if (valueOf.length() != 0) {
                                "Invalid: ".concat(valueOf);
                            } else {
                                new String("Invalid: ");
                            }
                        } else {
                            String str = split[0];
                            String decode = Uri.decode(split[1]);
                            String decode2 = Uri.decode(split[2]);
                            if (!hashMap.containsKey(str)) {
                                hashMap.put(str, new HashMap());
                            }
                            ((Map) hashMap.get(str)).put(decode, decode2);
                        }
                    } else {
                        String.valueOf(String.valueOf(file)).length();
                        C25841bk bkVar = new C25841bk(hashMap);
                        bufferedReader.close();
                        MethodCollector.m26664o(7355);
                        return bkVar;
                    }
                }
            } catch (Throwable th) {
                C25924em.f61076a.mo42349a(th, th);
            }
            MethodCollector.m26664o(7355);
            throw th;
        } catch (IOException e) {
            RuntimeException runtimeException = new RuntimeException(e);
            MethodCollector.m26664o(7355);
            throw runtimeException;
        }
    }
}
