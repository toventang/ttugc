package com.google.p1998c.p2003e;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27245k;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.google.c.e.b */
public abstract class AbstractC27548b {
    static {
        Covode.recordClassIndex(33128);
    }

    /* renamed from: a */
    public abstract InputStream mo46112a();

    protected AbstractC27548b() {
    }

    /* renamed from: a */
    public final long mo46111a(AbstractC27547a aVar) {
        C27245k.m54229a(aVar);
        C27550d dVar = new C27550d(C27550d.f64916a);
        try {
            InputStream inputStream = (InputStream) dVar.mo46113a(mo46112a());
            OutputStream outputStream = (OutputStream) dVar.mo46113a(aVar.mo46110a());
            C27245k.m54229a(inputStream);
            C27245k.m54229a(outputStream);
            byte[] bArr = new byte[8192];
            long j = 0;
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                    j += (long) read;
                } else {
                    dVar.close();
                    return j;
                }
            }
        } catch (Throwable th) {
            dVar.close();
            throw th;
        }
    }
}
