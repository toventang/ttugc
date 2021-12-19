package com.facebook.p1902j.p1903a;

import android.os.StrictMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.NoSuchElementException;

/* renamed from: com.facebook.j.a.g */
final class C24809g {

    /* renamed from: a */
    public static C24809g f58867a;

    /* renamed from: b */
    private static final ThreadLocal<byte[]> f58868b = new ThreadLocal<byte[]>() {
        /* class com.facebook.p1902j.p1903a.C24809g.C248101 */

        static {
            Covode.recordClassIndex(28963);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.lang.ThreadLocal
        public final /* bridge */ /* synthetic */ byte[] initialValue() {
            return new byte[512];
        }
    };

    /* renamed from: c */
    private static long f58869c = -1;

    /* renamed from: d */
    private static C24808f f58870d = new C24808f();

    /* renamed from: e */
    private static C24800a f58871e = new C24800a();

    /* renamed from: f */
    private String f58872f;

    static {
        Covode.recordClassIndex(28962);
    }

    /* renamed from: a */
    public static synchronized C24809g m47526a() {
        C24809g gVar;
        synchronized (C24809g.class) {
            MethodCollector.m26663i(412);
            if (f58867a == null) {
                f58867a = new C24809g("/proc/net/xt_qtaguid/stats");
            }
            gVar = f58867a;
            MethodCollector.m26664o(412);
        }
        return gVar;
    }

    private C24809g(String str) {
        this.f58872f = str;
    }

    /* renamed from: a */
    public final long mo40622a(int i) {
        MethodCollector.m26663i(454);
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        long j = 0;
        try {
            FileInputStream fileInputStream = new FileInputStream(this.f58872f);
            C24808f fVar = f58870d;
            fVar.f58863a = fileInputStream;
            fVar.f58865c = 0;
            fVar.f58864b = 0;
            byte[] bArr = f58868b.get();
            try {
                f58870d.mo40621a();
                while (true) {
                    int a = f58870d.mo40620a(bArr);
                    if (a == -1) {
                        break;
                    }
                    try {
                        C24800a aVar = f58871e;
                        aVar.f58839a = bArr;
                        aVar.f58840b = 0;
                        aVar.f58841c = a;
                        aVar.f58843e = false;
                        C24800a aVar2 = f58871e;
                        aVar2.mo40610a();
                        aVar2.f58842d = ' ';
                        aVar2.f58843e = true;
                        f58871e.mo40613c();
                        if (!f58871e.mo40611a("lo")) {
                            f58871e.mo40613c();
                            if (f58871e.mo40612b() == i) {
                                f58871e.mo40613c();
                                j += (long) f58871e.mo40612b();
                            }
                        }
                    } catch (NumberFormatException | NoSuchElementException unused) {
                    }
                }
                fileInputStream.close();
                long j2 = f58869c;
                if (j2 == -1) {
                    f58869c = j;
                    return -1;
                }
                long j3 = j - j2;
                f58869c = j;
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                MethodCollector.m26664o(454);
                return j3;
            } catch (Throwable th) {
                fileInputStream.close();
                MethodCollector.m26664o(454);
                throw th;
            }
        } catch (IOException unused2) {
            return -1;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            MethodCollector.m26664o(454);
        }
    }
}
