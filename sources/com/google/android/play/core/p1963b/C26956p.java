package com.google.android.play.core.p1963b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.play.core.p1965d.C26978d;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.android.play.core.b.p */
public final class C26956p {

    /* renamed from: a */
    final C26978d f63846a;

    /* renamed from: b */
    private final Context f63847b;

    /* renamed from: c */
    private final C26958r f63848c;

    static {
        Covode.recordClassIndex(32431);
    }

    public C26956p(Context context, C26978d dVar, C26958r rVar) {
        this.f63846a = dVar;
        this.f63848c = rVar;
        this.f63847b = context;
    }

    /* renamed from: a */
    private static X509Certificate m53557a(Signature signature) {
        MethodCollector.m26663i(12995);
        try {
            X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
            MethodCollector.m26664o(12995);
            return x509Certificate;
        } catch (CertificateException unused) {
            MethodCollector.m26664o(12995);
            return null;
        }
    }

    /* renamed from: a */
    public static String m53556a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final boolean mo44657a() {
        MethodCollector.m26663i(12994);
        try {
            File b = this.f63846a.mo44681b();
            try {
                Signature[] signatureArr = this.f63847b.getPackageManager().getPackageInfo(this.f63847b.getPackageName(), 64).signatures;
                if (signatureArr != null) {
                    ArrayList<X509Certificate> arrayList = new ArrayList();
                    for (Signature signature : signatureArr) {
                        X509Certificate a = m53557a(signature);
                        if (a != null) {
                            arrayList.add(a);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        File[] listFiles = b.listFiles();
                        Arrays.sort(listFiles);
                        int length = listFiles.length;
                        loop1:
                        while (true) {
                            length--;
                            if (length >= 0) {
                                File file = listFiles[length];
                                try {
                                    String absolutePath = file.getAbsolutePath();
                                    try {
                                        X509Certificate[][] a2 = C26926bq.m53487a(absolutePath);
                                        if (a2 == null || a2.length == 0 || a2[0].length == 0) {
                                            String.valueOf(absolutePath).length();
                                        } else if (arrayList.isEmpty()) {
                                            break;
                                        } else {
                                            for (X509Certificate x509Certificate : arrayList) {
                                                int length2 = a2.length;
                                                int i = 0;
                                                while (true) {
                                                    if (i >= length2) {
                                                        break loop1;
                                                    } else if (!a2[i][0].equals(x509Certificate)) {
                                                        i++;
                                                    }
                                                }
                                            }
                                            try {
                                                file.renameTo(C26978d.m53601a(this.f63846a.mo44683c(), file.getName()));
                                            } catch (IOException unused) {
                                                MethodCollector.m26664o(12994);
                                                return false;
                                            }
                                        }
                                    } catch (Exception unused2) {
                                        String.valueOf(absolutePath).length();
                                    }
                                } catch (Exception unused3) {
                                    MethodCollector.m26664o(12994);
                                    return false;
                                }
                            } else {
                                MethodCollector.m26664o(12994);
                                return true;
                            }
                        }
                        MethodCollector.m26664o(12994);
                        return false;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused4) {
            }
            MethodCollector.m26664o(12994);
            return false;
        } catch (IOException unused5) {
            MethodCollector.m26664o(12994);
            return false;
        }
    }
}
